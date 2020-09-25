SELECT * FROM users AS u WHERE
  (u.first_name IS NULL OR u.first_name = '11111') AND 
  (u.first_name IS NULL OR u.login = NULL) IS NOT NULL 
;


SELECT u.first_name, u.login, u.password, u.second_name FROM users AS u;