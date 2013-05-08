package hack;



import java.util.ArrayList;
public class WordMatcher {

  // matches() function takes two string inputs and checks if both the strings has the same letters
	public boolean matches(String word1, String word)
	{
		int counter=0;
		if(word1.length() == word.length())
		{
			for(int i=0;i<word1.length();i++){
				for(int j=0;j<word.length();j++){
					char a = word1.charAt(i);
					char b = word.charAt(j);
					if(a == b)
					{	
						if(word.length()==1)
						{
							counter++;
							break;
						}
						if(j==0 && word.length()!=1){
							word = word.substring(1);
						}
						if((j==word.length()-1) && j>1){
							word = word.substring(0, j);
						}
						if(j>0 && j<word.length()-1)
							word = word.substring(0, j) + word.substring(j+1);
						counter++;
						break;
					}
				}
			}
		}
		if(counter==word1.length()){
			return true; }
		else
			return false; 
	}
	
	
	// arrayMatch() function gets two arraylist object as input and picks every string from them and  
	// calls matches() function and at the end, prints the words which are matched.
	public void arrayMatch(ArrayList<String> wordlist,ArrayList<String> words)
	{
		ArrayList<String> word1 = new ArrayList<String> ();
		for(int i =0;i<words.size();i++){
			for(int j=0;j<wordlist.size();j++){
				if(matches(words.get(i),wordlist.get(j)))
					word1.add(wordlist.get(j));
			}
		}
		System.out.println(word1);
	}
}
