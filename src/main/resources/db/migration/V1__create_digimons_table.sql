CREATE TABLE IF NOT EXISTS digimon (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    img VARCHAR(255) NOT NULL,
    level VARCHAR(50) NOT NULL
);

