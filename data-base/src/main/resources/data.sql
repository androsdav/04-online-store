-- #1 -----------------------------------------------------------------------------------------------------------------------
INSERT INTO laptop_general(product_name, brand, model_number, color, color_category) VALUES
(
 'Pavilion x360 2-in-1 14" Touch-Screen Laptop - Intel Core i5 - 8GB Memory - 256GB SSD',
 'HP',
 '14M-DW0023DX',
 'Luminous Gold',
 'Gold'
);
INSERT INTO laptop_display(screen_size, screen_resolution, touch_screen, display_type) VALUES
(
 14,
 '1920 x 1080',
 'Yes',
 'Full HD Widescreen LED'
);
INSERT INTO laptop_storage(storage_type, total_storage_capacity, solid_state_drive_capacity, solid_state_drive_interface) VALUES
(
 'SSD',
 '256',
 '256',
 'PCIe'
);
INSERT INTO laptop_memory(system_memory_RAM, type_of_memory_RAM, system_memory_RAM_speed) VALUES
(
 '8',
 'DDR4 SDRAM',
 '3200'
);
INSERT INTO laptop_processor(processor_brand, processor_speed_base, processor_model, processor_model_number, processor_cores) VALUES
(
 'Intel',
 '1',
 'Intel 10th Generation Core i5',
 'i5-1035G1',
 '4'
);
INSERT INTO laptop(general_id, display_id, storage_id, memory_id, processor_id) VALUES( '1', '1', '1', '1', '1');
-----------------------------------------------------------------------------------------------------------------------------

-- #2 -----------------------------------------------------------------------------------------------------------------------
INSERT INTO laptop_general(product_name, brand, model_number, color, color_category) VALUES
(
 'MacBook Air 13.3" Laptop with Touch ID - Intel Core i3 - 8GB Memory - 256GB Solid State Drive (Latest Model)',
 'Apple',
 'MWTK2LL/A',
 'Silver',
 'Silver'
);
INSERT INTO laptop_display(screen_size, screen_resolution, touch_screen, display_type) VALUES
(
 13.3,
 '2560 x 1600',
 'No',
 'LED'
);
INSERT INTO laptop_storage(storage_type, total_storage_capacity, solid_state_drive_capacity, solid_state_drive_interface) VALUES
(
 'SSD',
 '256',
 '256',
 'PCIe'
);
INSERT INTO laptop_memory(system_memory_RAM, type_of_memory_RAM, system_memory_RAM_speed) VALUES
(
 '8',
 'LPDDR4X',
 '3733'
);
INSERT INTO laptop_processor(processor_brand, processor_speed_base, processor_model, processor_model_number, processor_cores) VALUES
(
 'Intel',
 '1.1',
 'Intel 10th Generation Core i3',
 'Intel 10th Generation Core i3',
 '2'
);
INSERT INTO laptop(general_id, display_id, storage_id, memory_id, processor_id) VALUES( '2', '2', '2', '2', '2');
-----------------------------------------------------------------------------------------------------------------------------

-- #3 -----------------------------------------------------------------------------------------------------------------------
INSERT INTO laptop_general(product_name, brand, model_number, color, color_category) VALUES
(
 'M15.6" Touch-Screen Laptop - Intel Core i5 - 12GB Memory - 256GB SSD',
 'HP',
 '15-dy1043dx',
 'Natural Silver',
 'Silver'
);
INSERT INTO laptop_display(screen_size, screen_resolution, touch_screen, display_type) VALUES
(
 15.6,
 '1366 x 768',
 'Yes',
 'Touchscreen Widescreen LED'
);
INSERT INTO laptop_storage(storage_type, total_storage_capacity, solid_state_drive_capacity, solid_state_drive_interface) VALUES
(
 'SSD',
 '256',
 '256',
 'none'
);
INSERT INTO laptop_memory(system_memory_RAM, type_of_memory_RAM, system_memory_RAM_speed) VALUES
(
 '12',
 'DDR4 SDRAM',
 '3200'
);
INSERT INTO laptop_processor(processor_brand, processor_speed_base, processor_model, processor_model_number, processor_cores) VALUES
(
 'Intel',
 '1.0',
 'Intel 10th Generation Core i5',
 'i5-1035G1',
 '2'
);
INSERT INTO laptop(general_id, display_id, storage_id, memory_id, processor_id) VALUES( '3', '3', '3', '3', '3');
-----------------------------------------------------------------------------------------------------------------------------

-- #4 -----------------------------------------------------------------------------------------------------------------------
INSERT INTO laptop_general(product_name, brand, model_number, color, color_category) VALUES
(
 'ENVY x360 2-in-1 15.6" Touch-Screen Laptop - Intel Core i7 - 12GB Memory - 512GB SSD + 32GB Optane',
 'HP',
 '15-dy1043dx',
 'Natural Silver',
 'Silver'
);
INSERT INTO laptop_display(screen_size, screen_resolution, touch_screen, display_type) VALUES
(
 15.6,
 '1920 x 1080',
 'Yes',
 'Touchscreen Widescreen LED'
);
INSERT INTO laptop_storage(storage_type, total_storage_capacity, solid_state_drive_capacity, solid_state_drive_interface) VALUES
(
 'SSD',
 '512',
 '512',
 'PCIe'
);
INSERT INTO laptop_memory(system_memory_RAM, type_of_memory_RAM, system_memory_RAM_speed) VALUES
(
 '12',
 'DDR4 SDRAM',
 '3200'
);
INSERT INTO laptop_processor(processor_brand, processor_speed_base, processor_model, processor_model_number, processor_cores) VALUES
(
 'Intel',
 '1.3',
 'Intel 10th Generation Core i7',
 'i7-1065G7',
 '2'
);
INSERT INTO laptop(general_id, display_id, storage_id, memory_id, processor_id) VALUES( '4', '4', '4', '4', '4');
-----------------------------------------------------------------------------------------------------------------------------

-- #5 -----------------------------------------------------------------------------------------------------------------------
INSERT INTO laptop_general(product_name, brand, model_number, color, color_category) VALUES
(
 'Inspiron 13 7000 2-in-1 - 13.3" 4K Ultra HD Touch-Screen Laptop - Intel Core i7 - 16GB Memory - 512GB SSD + 32GB Optane',
 'Dell',
 'i7300-7319BLK-PUS',
 'Black',
 'Black'
);
INSERT INTO laptop_display(screen_size, screen_resolution, touch_screen, display_type) VALUES
(
 13.3,
 '3840 x 2160',
 'Yes',
 'Touchscreen Widescreen LCD'
);
INSERT INTO laptop_storage(storage_type, total_storage_capacity, solid_state_drive_capacity, solid_state_drive_interface) VALUES
(
 'SSD',
 '512',
 '512',
 'PCIe'
);
INSERT INTO laptop_memory(system_memory_RAM, type_of_memory_RAM, system_memory_RAM_speed) VALUES
(
 '16',
 'LPDDR3',
 '2133'
);
INSERT INTO laptop_processor(processor_brand, processor_speed_base, processor_model, processor_model_number, processor_cores) VALUES
(
 'Intel',
 '1.8',
 'Intel 10th Generation Core i7',
 '10th Generation Intel® Core™ i7-10510U',
 '2'
);
INSERT INTO laptop(general_id, display_id, storage_id, memory_id, processor_id) VALUES( '5', '5', '5', '5', '5');
-----------------------------------------------------------------------------------------------------------------------------


-- adds type transport to table type_transport
/*
INSERT INTO type_transport(name) VALUES('car');
INSERT INTO type_transport (name) VALUES ('motorcycle');

-- adds transport to table transport with type_transport = car;
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'BMV',
  '30000',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Mazda',
  '15000',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Maserati',
  '50000',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Audi',
  '25000',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Rover',
  '10000',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Porsche',
  '40000',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Volvo',
  '23000',
  CURRENT_DATE,
  '1'
);

-- adds transport to table transport with type_transport = motorcycle;
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Suzuki',
  '900',
  CURRENT_DATE,
  '1'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Honda',
  '850',
  CURRENT_DATE,
  '2'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Yamaha',
  '1200',
  CURRENT_DATE,
  '2'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Kawasaki',
  '600',
  CURRENT_DATE,
  '2'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'KTM',
  '8000',
  CURRENT_DATE,
  '2'
);

INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Harley Davidson',
  '10000',
  CURRENT_DATE,
  '2'
);
INSERT INTO transport (name, price, date_create, type_transport_id) VALUES (
  'Ducati',
  '20000',
  CURRENT_DATE,
  '2'
);

-- get all transport (console query SQL)
/*
SELECT T.ID, T.NAME, T.PRICE, T.DATE_CREATE, TT.NAME "TYPE TRANSPORT" FROM TRANSPORT  AS T
INNER JOIN TYPE_TRANSPORT AS TT ON T.TYPE_TRANSPORT_ID = TT.ID
*/

-- get all transport by type motorcycle and price motorcycle > 1000 (console query SQL)
/*
SELECT T.ID, T.NAME, T.PRICE, T.DATE_CREATE, TT.NAME "TYPE TRANSPORT" FROM TRANSPORT  AS T
INNER JOIN TYPE_TRANSPORT AS TT ON T.TYPE_TRANSPORT_ID = TT.ID
WHERE (TT.NAME = 'motorcycle' AND T.PRICE >1000)
*/