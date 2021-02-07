package Dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    HashMap<String, String> dictionary = new HashMap();

    public Dictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public Dictionary() {
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void EntryDataDictionary(HashMap<String, String> dictionary, String dataEng, String dataEsp)
    {
        System.out.println("Enter English word for dictionary ->");
        Scanner in1 = new Scanner(System.in);
        dataEng = in1.nextLine();

        System.out.println("Enter Spanish word for dictionary ->");
        Scanner in2 = new Scanner(System.in);
        dataEsp = in2.nextLine();

        dictionary.put(dataEng,dataEsp);
    }

    public void SearchWord(HashMap<String, String> dictionary, String EngWord)
    {
        System.out.println("Search English word for dictionary ->");
        Scanner in = new Scanner(System.in);
        EngWord = in.nextLine();

        String searchWord = dictionary.get(EngWord);
        System.out.println(searchWord);
    }

    public  void CRUDSpanishWord(HashMap<String, String> dictionary, String EngWord,String EspWord)
    {
        System.out.println("To add  word press 1");
        System.out.println("To update  word press 2");
        System.out.println("To delete  word press 3");
        Scanner in1 = new Scanner(System.in);
        int choice;
        choice = in1.nextInt();

        if(choice == 1)
        {
            EntryDataDictionary(dictionary,EngWord,EspWord);
        }
        else if(choice == 2)
        {
            System.out.println("Enter word to update:");
            Scanner in = new Scanner(System.in);
            String word;
            word = in.nextLine();

            for(int i=0; i<=dictionary.size(); i++)
            {
                //
            }
        }
        else if(choice == 3)
        {
            System.out.println("Enter word to delete:");
            Scanner in = new Scanner(System.in);
            String word;
            word = in.nextLine();

            dictionary.remove(word);
        }
    }


}
