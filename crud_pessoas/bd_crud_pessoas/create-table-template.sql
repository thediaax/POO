-- Active: 1715363650733@@pg-30853102-gabrieldias.f.aivencloud.com@25145@defaultdb@public
CREATE TABLE table_name(  
    id int NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    create_time DATE,
    name VARCHAR(255)
);
COMMENT ON TABLE table_name IS '';
COMMENT ON COLUMN table_name.name IS '';