
------ find_all_user_return_next - get all user return next (example used RETURN NEXT) ------
CREATE OR REPLACE FUNCTION find_all_user_return_next() RETURNS SETOF users AS
  $BODY$
    DECLARE
      row users%rowtype;
    BEGIN
      FOR row IN SELECT * FROM users
      LOOP
        RETURN NEXT row;
      END LOOP;
      RETURN;
    END;
  $BODY$
LANGUAGE plpgsql;
-- select and drop
SELECT * FROM find_all_user_return_next();
SELECT find_all_user_return_next();
DROP FUNCTION find_all_user_return_next();

------ find_all_user_return_query - get all user return query (example used RETURN QUERY) ------
CREATE OR REPLACE FUNCTION find_all_user_return_query() RETURNS SETOF users AS
  $BODY$
    BEGIN
      RETURN QUERY SELECT * FROM users;
    END;
  $BODY$
LANGUAGE plpgsql;
-- select and drop
SELECT * FROM find_all_user_return_query();
SELECT find_all_user_return_query();
DROP FUNCTION find_all_user_return_query();

------ find_all_user_return_query_integer - get all user return next (example used RETURN SETOF INTEGER) ------
CREATE OR REPLACE FUNCTION find_all_user_return_query_integer() RETURNS SETOF INTEGER AS
  $BODY$
  BEGIN
    RETURN QUERY SELECT users.id FROM users;
  END
  $BODY$
LANGUAGE plpgsql;
-- select and drop
SELECT * FROM find_all_user_return_query_integer();
SELECT find_all_user_return_query_integer();
DROP FUNCTION find_all_user_return_query_integer();

------ find_all_user_return_query_integer - get all user return next (example used RETURN SETOF VARCHAR) ------
CREATE OR REPLACE FUNCTION find_all_user_return_query_varchar() RETURNS SETOF VARCHAR AS
  $BODY$
    BEGIN
      RETURN QUERY SELECT users.first_name FROM users;
    END
  $BODY$
LANGUAGE plpgsql;
-- select and drop
SELECT * FROM find_all_user_return_query_varchar();
SELECT find_all_user_return_query_varchar();
DROP FUNCTION find_all_user_return_query_varchar();

------ find_all_user_by_first_name_and_login ------
CREATE OR REPLACE FUNCTION find_all_user_by_first_name_and_login(_first_name users.first_name%TYPE, _login users.login%TYPE) RETURNS SETOF users AS
  $BODY$
    BEGIN
      RETURN QUERY SELECT * FROM users WHERE
        users.first_name = _first_name AND
        users.login = _login;
    END;
  $BODY$
LANGUAGE plpgsql;

SELECT * FROM find_all_user_by_first_name_and_login('44444', '44444');
SELECT * FROM find_all_user_by_first_name_and_login('', 'rusin');
DROP FUNCTION find_all_user_by_first_name_and_login(first_name users.first_name%TYPE, login users.login%TYPE);
















SELECT * FROM users AS u WHERE
  (u.first_name IS NULL OR u.first_name = '11111') AND
  (u.first_name IS NULL OR u.login = NULL) IS NOT NULL
;



CREATE FUNCTION get_available_flightid(date) RETURNS SETOF integer AS
$BODY$
BEGIN
  RETURN QUERY SELECT flightid
               FROM flight
               WHERE flightdate >= $1
                 AND flightdate < ($1 + 1);

  -- Так как выполнение ещё не закончено, можно проверить, были ли возвращены строки,
  -- и если нет, выдать исключение.
  IF NOT FOUND THEN
    RAISE EXCEPTION 'Нет рейсов на дату: %.', $1;
  END IF;

  RETURN;
END
$BODY$
  LANGUAGE plpgsql;

-- Возвращает доступные рейсы либо вызывает исключение, если таковых нет.
SELECT * FROM get_available_flightid(CURRENT_DATE);




CREATE FUNCTION somefunc() RETURNS integer AS $$
<< outerblock >>
  DECLARE
  quantity integer := 30;
BEGIN
  RAISE NOTICE 'Сейчас quantity = %', quantity;  -- Выводится 30
  quantity := 50;
  --
  -- Вложенный блок
  --
  DECLARE
    quantity integer := 80;
  BEGIN
    RAISE NOTICE 'Сейчас quantity = %', quantity;  -- Выводится 80
    RAISE NOTICE 'Во внешнем блоке quantity = %', outerblock.quantity;  -- Выводится 50
  END;

  RAISE NOTICE 'Сейчас quantity = %', quantity;  -- Выводится 50

  RETURN quantity;
END;
$$ LANGUAGE plpgsql;


CREATE FUNCTION somefunc() RETURNS integer AS $$
<< outerblock >>
  DECLARE
  quantity integer := 30;
BEGIN
  RAISE NOTICE 'Сейчас quantity = %', quantity;  -- Выводится 30
  quantity := 50;
  --
  -- Вложенный блок
  --
  DECLARE
    quantity integer := 80;
  BEGIN
    RAISE NOTICE 'Сейчас quantity = %', quantity;  -- Выводится 80
    RAISE NOTICE 'Во внешнем блоке quantity = %', outerblock.quantity;  -- Выводится 50
  END;

  RAISE NOTICE 'Сейчас quantity = %', quantity;  -- Выводится 50

  RETURN quantity;
END;
$$ LANGUAGE plpgsql;