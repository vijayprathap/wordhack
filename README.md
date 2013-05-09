wordhack

This is a programming mission from the website 'www.hackthissite.org'. In this mission, we are given 10 jumbled words 
from a word file containing 1000 words. This program takes the jumbled words as input and searches the database for the
correct word. My program must be efficient such that I have to enter the correct words in the website within 30 seconds. 
Unless I enter the words in 30 seconds, I wont be able to pass the mission.

To solve this problem, first I create two arraylists one contains the entire wordlist and another has the jumbled words. 
Then I create a boolean function which checks if two strings contains the same characters. I did this by first checking 
if the strings has the same length, if not it returns false. This made my code very efficient. If this condition satisfies
then I take each character and traverse through the other string to find if I have the same character. I encountered 
lot of troubles here as I need to check every condition like what if there is two same characters. I used a flag to notify
that case. 

Then I created another function which traverses through the arraylist and calls the previous function with passing each 
strings into that function.
========
