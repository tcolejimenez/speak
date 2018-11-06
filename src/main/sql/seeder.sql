USE speak_db;

TRUNCATE TABLE posts;

INSERT INTO posts (id, title, body) VALUES
(1, 'my day today', 'tres bien mon amie. so glad I got out of bed today'),
(2, 'what a joke', 'I thought I was nailing it. wasnt nailing it. that really sucked.'),
(3, 'on my mind', 'alot has been swirling around in this head of mine. some good. some bad. glad Im still here to sort it out.'),
(4, 'youd never know...', 'youd never know whos having a good day or a bad day if you never ask. someone might really be going through it but they still got a smile on their face');