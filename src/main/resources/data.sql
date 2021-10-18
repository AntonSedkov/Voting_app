INSERT INTO users (email, first_name, last_name, password)
VALUES ('user@app.ze', 'Alex_1', 'Great_1', 'pass'),
       ('admin@app.ze', 'George_2', 'esp_2', 'pass');

INSERT INTO user_role (user_id, role)
VALUES (1,'USER'),
       (2,'ADMIN'),
       (2,'USER');
