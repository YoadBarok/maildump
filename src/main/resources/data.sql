--CREATE USERS--

INSERT INTO PEOPLE (ID, NAME, EMAIL, PASSWORD) VALUES (1, 'Yoad', 'yoadmail@mail.com', 'Aa123456')
INSERT INTO PEOPLE (ID, NAME, EMAIL, PASSWORD) VALUES (2, 'David', 'davidmail@mail.com', 'Aa123456')
INSERT INTO PEOPLE (ID, NAME, EMAIL, PASSWORD) VALUES (3, 'Moshe', 'moshemail@mail.com', 'Aa123456')

--CREATE MAILBOXES--
INSERT INTO MAILBOX (ID, ADDRESS, NAME, PASSWORD, USER_ID) VALUES (1, 'yoad1@mail.com', 'yoad1', 'Aa123123', 1)
INSERT INTO MAILBOX (ID, ADDRESS, NAME, PASSWORD, USER_ID) VALUES (2, 'yoad2@mail.com', 'yoad2', 'Aa123123', 1)
INSERT INTO MAILBOX (ID, ADDRESS, NAME, PASSWORD, USER_ID) VALUES (3, 'david1@mail.com', 'david1', 'Aa123123', 2)
INSERT INTO MAILBOX (ID, ADDRESS, NAME, PASSWORD, USER_ID) VALUES (4, 'david2@mail.com', 'david2', 'Aa123123', 2)
INSERT INTO MAILBOX (ID, ADDRESS, NAME, PASSWORD, USER_ID) VALUES (5, 'moshe1@mail.com', 'moshe1', 'Aa123123', 3)
INSERT INTO MAILBOX (ID, ADDRESS, NAME, PASSWORD, USER_ID) VALUES (6, 'moshe2@mail.com', 'moshe2', 'Aa123123', 3)

--CREATE FILTERS--
INSERT INTO FILTER (ID, NAME, SENDERS, TIME_PERIOD, USER_ID) VALUES (1, 'yoadfilter1', 'grandma@mail.com, boss@mail.com', 54321, 1)
INSERT INTO FILTER (ID, NAME, TIME_PERIOD, USER_ID) VALUES (2, 'yoadfilter2', 54321, 1)
INSERT INTO FILTER (ID, NAME, SENDERS,  USER_ID) VALUES (3, 'davidfilter1', 'lidl@mail.com', 2)
INSERT INTO FILTER (ID, NAME, TIME_PERIOD, USER_ID) VALUES (4, 'davidfilter2', 987654321, 2)
INSERT INTO FILTER (ID, NAME, SENDERS, TIME_PERIOD, USER_ID) VALUES (5, 'moshefilter1', 'yoadmail@mail.com, davidmail@mail.com', 54321231, 3)
INSERT INTO FILTER (ID, NAME, SENDERS, USER_ID) VALUES (6, 'yoadfilter2', 'mydog@mail.com', 3)