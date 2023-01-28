INSERT INTO ROTA (id, nome) values (1, 'Rota 1 - A1 -> A2');
INSERT INTO ROTA (id, nome) values (2, 'Rota 2 - A1 -> A2 - alternativo');
INSERT INTO ROTA (id, nome) values (3, 'Rota 3 - A1 -> A3');
INSERT INTO ROTA (id, nome) values (4, 'Rota 4 - A1 -> A3 - alternativo');
INSERT INTO ROTA (id, nome) values (5, 'Rota 5 - A1 -> A4');
INSERT INTO ROTA (id, nome) values (6, 'Rota 6 - A1 -> A4 - alternativo');
INSERT INTO ROTA (id, nome) values (7, 'Rota 7 - A2 -> A1');
INSERT INTO ROTA (id, nome) values (8, 'Rota 8 - A2 -> A1 - alternativo');
INSERT INTO ROTA (id, nome) values (9, 'Rota 9 - A2 -> A3');
INSERT INTO ROTA (id, nome) values (10, 'Rota 10 - A2 -> A3 - alternativo');
INSERT INTO ROTA (id, nome) values (11, 'Rota 11 - A2 -> A4');
INSERT INTO ROTA (id, nome) values (12, 'Rota 12 - A2 -> A4 - alternativo');
INSERT INTO ROTA (id, nome) values (13, 'Rota 13 - A3 -> A1');
INSERT INTO ROTA (id, nome) values (14, 'Rota 14 - A3 -> A1 - alternativo');
INSERT INTO ROTA (id, nome) values (15, 'Rota 15 - A3 -> A2');
INSERT INTO ROTA (id, nome) values (16, 'Rota 16 - A3 -> A2 - alternativo');
INSERT INTO ROTA (id, nome) values (17, 'Rota 17 - A3 -> A4');
INSERT INTO ROTA (id, nome) values (18, 'Rota 18 - A3 -> A4 - alternativo');
INSERT INTO ROTA (id, nome) values (19, 'Rota 19 - A4 -> A1');
INSERT INTO ROTA (id, nome) values (20, 'Rota 20 - A4 -> A1 - alternativo');
INSERT INTO ROTA (id, nome) values (21, 'Rota 21 - A4 -> A2');
INSERT INTO ROTA (id, nome) values (22, 'Rota 22 - A4 -> A2 - alternativo');
INSERT INTO ROTA (id, nome) values (23, 'Rota 23 - A4 -> A3');
INSERT INTO ROTA (id, nome) values (24, 'Rota 24 - A4 -> A3 - alternativo');


INSERT INTO Ref(id, nome, latitude, longitude) values (1,'A1 - Congonhas', -23.627521173610145, -46.65656274552138);
INSERT INTO Ref(id, nome, latitude, longitude) values (2,'A2 - Salgado Filho', -29.993222296080706, -51.17480174582633);
INSERT INTO Ref(id, nome, latitude, longitude) values (3,'A3 - Santos Dumont', -22.912980232858345, -43.166916384159514);
INSERT INTO Ref(id, nome, latitude, longitude) values (4,'A4 - Confins', -19.633876675814765, -43.96496684984587);
INSERT INTO Ref(id, nome, latitude, longitude) values (5,'P1 - Londrina-SP', -23.312701527677795, -51.164063972872704);

INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (1, 'Aerovia 1 - A1 -> A2', 5,1,2 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (2, 'Aerovia 2 - A2 -> A1', 5,2,1 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (3, 'Aerovia 3 - A3 -> A2', 5,3,2 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (4, 'Aerovia 4 - A1 -> P1', 5,1,5 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (5, 'Aerovia 5 - A4 -> A1', 5,4,1 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (6, 'Aerovia 6 - P1 -> A4', 5,5,4 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (7, 'Aerovia 7 - P1 -> A3', 5,5,3 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (8, 'Aerovia 8 - A4 -> A3', 5,4,3 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (9, 'Aerovia 9 - A3 -> A4', 5,3,4 );
INSERT INTO AEROVIA (id, nome, distancia, fk_id_origem_Ref_Geo, fk_id_destino_Ref_Geo ) values (10, 'Aerovia 10 - A2 -> P1', 5,2,5 );



--completar mais chato- olhar word do relatorio e seguir o exemplo - tabela de rotas
--olhar a rota e aerovias que entende oque esta acontecendo aqui
--rota 1
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (1,1);
--rota 2
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (2,4);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (2,7);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (2,3);
--rota 3
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (3,4);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (3,7);
--rota 4
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (4,4);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (4,6);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (4,8);
--rota 5
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (5,4);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (5,6);
--rota 6
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (6,4);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (6,7);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (6,9);
-- continuar ate a rota 24 que trabalheira
--rota 7
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (7,2);
--rota 8
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (8,10);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (8,6);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (8,5);
--rota 9
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (9,10);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (9,7);
--rota 10
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (10,10);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (10,6);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (10,8);
--rota 11
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (11,10);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (11,6);
--rota 12
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (12,10);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (12,7);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (12,9);
--rota 13
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (13,9);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (13,5);
--rota 14
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (14,3);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (14,2);
--rota 15
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (15,3);
--rota 16
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (16,9);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (16,5);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (16,1);
--rota 17
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (17,9);
--rota 18 
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (18,3);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (18,10);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (18,6);
--rota 19
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (19,5);
--rota 20
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (20,8);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (20,3);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (20,2);
--rota 21
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (21,5);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (21,1);
--rota 22
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (22,3);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (22,8);
--rota 23
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (23,8);
--rota 24
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (24,5);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (24,4);
INSERT INTO ROTA_AEROVIAS (rota_id, aerovias_id) values (24,7);


INSERT INTO PLANO_DE_VOO (id_voo, data, altitude, vel_cruzeiro, fk_id_rota) values (1, CURRENT_TIMESTAMP, 30000, 123.4, 1);
INSERT INTO PLANO_DE_VOO (id_voo, data, altitude, vel_cruzeiro, fk_id_rota) values (2, CURRENT_TIMESTAMP, 15000, 531.1, 2);

-- como funciona tu bota a data e depois o formato dela,pro formato tem o link no txt entendimento
--plano de vooo id 1
--INSERT INTO OCUPACAO_AEROVIA ( altitude, data, fk_id_aerovia) values ( 17500.0,TO_TIMESTAMP('2022-08-11 22:-3', 'YYYY-DD-MM HH24:TZH'),1);
--INSERT INTO OCUPACAO_AEROVIA ( altitude, data,  fk_id_aerovia) values ( 27500.0, CURRENT_TIMESTAMP,1);
--INSERT INTO OCUPACAO_AEROVIA ( altitude, data, fk_id_aerovia) values ( 37500.0, CURRENT_TIMESTAMP,1);
--INSERT INTO OCUPACAO_AEROVIA ( altitude, data,  fk_id_aerovia) values ( 47500.0, CURRENT_TIMESTAMP,1);




