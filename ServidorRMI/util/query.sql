create table rockstarradio;
use rockstarradio;

CREATE TABLE musica (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, idAlbum INT NOT NULL,
numeroDaFaixa INT NOT NULL, nomeDaFaixa VARCHAR(255), letra VARCHAR(1000) NOT NULL);
	
CREATE TABLE album (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nomeDoAlbum VARCHAR(255) NOT NULL
nomeDoCantor VARCHAR(255) NOT NULL);

INSERT INTO musica (idAlbum, numeroDaFaixa, nomeDaFaixa, letra) values (1,1,"Hey Mama", 
"Hey mama, I want to scream so loud for you
'Cause I'm so proud of you, let me tell you what I'm about to do (hey mama)
I know I act a fool, but I promise you I'm going back to school
I appreciate that you alive for me, I just want you to be proud of me (hey mama)
I want to tell the whole world about a friend of mine
This little light of mine, I'm feelin' let it shine
I'm feelin' take y'all back to them better times
I'm feelin' talk about my momma if y'all don't mind (hey mama)
I was 3 years old when you and I move to the chi
Late december, harsh winter gave me a cold
You fix me up something that was good for my soul
Famous homemade chicken soup, can I have another bowl (hey mama)
You work late nights just to keep on the lights
Mommy got me training wheels so I can keep on my bike
And you would give me anything in this world
Michael jackson leather and the glove, but didn't give me a curl (hey mama)
And you never put no man over me, and I love you for that mommy can't you see
Seven years old, caught you with tears in your eyes
Cause a nigga cheat and telling you lies, then I started to cry (hey mama)
As we knelt on the kitchen floor, I said mommy I'm a love you 'till you don't hurt no more
And when I'm older, you ain't got to work no more
And I'm a get you that mansion that we couldn't afford (hey mama)
See your unbreakable, unmistakable, highly capable, lady that's making loot
A living legend too, just look at what heaven do, send us an angel, and I thank you"),
(1,2,"Touch the Sky", 
"I gotta testify, come up in the spot looking extra Fly... For the
Day i die, I'ma touch the Sky...
Gotta testify, come up in the spot looking extra Fly... For the
Day i die, I'ma touch the Sky
Back when they thought pink Colors'll hurt the R.O.C
Before Cam got the shit to pop
The doors is closed
I felt like Bad Boy's Street Team
I couldn't work the L.O.X
Now lets go...
Take em back to the plan
Me and my momma hopped in that UHaul Van
Any pessimist I aint talk to them
Plus I aint have no Phone in my apart- a-ment(apartment)
Let's take em back to the club
Least about an Hour I stand on Line
I just wanted to dance
I went to Jacob an hour after I got my advance
I just wanted to shine"),
(1,3,"Gold Digger", 
"She take my money when I'm in need
Yeah, she's a triflin' friend indeed
Oh, she's a gold digger way over town
That digs on me");

INSERT INTO album (idAlbum, nomeDoAlbum, nomeDoCantor) values (1, "Late Registration", "Kanye West");
