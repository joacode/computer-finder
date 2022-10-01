CREATE TABLE computers (
    id SERIAL PRIMARY KEY,
    model_name VARCHAR(255) NOT NULL,
    brand VARCHAR(255) NOT NULL,
    display_resolution VARCHAR(255),
    display_size VARCHAR(255),
    cpu VARCHAR(255),
    gpu VARCHAR(255),
    ram VARCHAR(255),
    expandable_ram boolean DEFAULT FALSE,
    base_storage VARCHAR(255),
    expandable_storage boolean DEFAULT FALSE,
    is_ssd boolean DEFAULT FALSE
)