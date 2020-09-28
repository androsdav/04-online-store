SELECT * FROM users AS u WHERE
  (u.first_name IS NULL OR u.first_name = '11111') AND 
  (u.first_name IS NULL OR u.login = NULL) IS NOT NULL 
;


SELECT u.first_name, u.login, u.password, u.second_name FROM users AS u;

CREATE FUNCTION getAllUser() RETURNS integer AS
  $$
    DECLARE
      quantity integer := 10;
      result integer;
    BEGIN
      result = quantity + 12;
      RETURN result; 
    END;
  $$ 
  LANGUAGE plpgsql;


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