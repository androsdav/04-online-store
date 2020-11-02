-- create table laptop_general
CREATE TABLE laptop_general (
  general_id SERIAL PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  brand VARCHAR(50) NOT NULL,
  model_number VARCHAR(50) NOT NULL,
  color VARCHAR(50) NOT NULL,
  color_category VARCHAR(50) NOT NULL
);

-- create table laptop_display
CREATE TABLE laptop_display(
  display_id SERIAL PRIMARY KEY ,
  screen_size FLOAT NOT NULL,
  screen_resolution VARCHAR(50) NOT NULL,
  touch_screen VARCHAR(50) NOT NULL,
  display_type VARCHAR(50)
);

-- create table laptop_storage
CREATE TABLE laptop_storage(
  storage_id SERIAL PRIMARY KEY,
  storage_type VARCHAR(50) NOT NULL,
  total_storage_capacity INTEGER NOT NULL,
  solid_state_drive_capacity INTEGER NOT NULL,
  solid_state_drive_interface VARCHAR(50) NOT NULL
);

-- create table laptop_memory
CREATE TABLE laptop_memory(
  memory_id SERIAL PRIMARY KEY,
  system_memory_RAM INTEGER NOT NULL,
  type_of_memory_RAM VARCHAR(50) NOT NULL,
  system_memory_RAM_speed INTEGER
);

-- create table laptop_processor
CREATE TABLE laptop_processor(
  processor_id SERIAL PRIMARY KEY,
  processor_brand VARCHAR(50) NOT NULL,
  processor_speed_base FLOAT NOT NULL,
  processor_model VARCHAR(50) NOT NULL,
  processor_model_number  VARCHAR(50) NOT NULL,
  processor_cores INTEGER NOT NULL
);

-- create table laptop_processor
CREATE TABLE laptop(
  laptop_id SERIAL PRIMARY KEY,
  general_id INTEGER REFERENCES laptop_general(general_id) ON DELETE SET NULL,
  display_id INTEGER REFERENCES laptop_display(display_id) ON DELETE SET NULL,
  storage_id INTEGER REFERENCES laptop_storage (storage_id) ON DELETE  SET NULL,
  memory_id INTEGER REFERENCES laptop_memory(memory_id) ON DELETE SET NULL,
  processor_id INTEGER REFERENCES laptop_processor(processor_id) ON DELETE SET NULL
);