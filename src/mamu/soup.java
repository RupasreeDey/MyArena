
package mamu;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class soup {
    
    public static String codechef_schedule() {
        org.jsoup.nodes.Document document;
        
        String str="";
        String ret="";
        
        try {
            //Get Document object after parsing the html from given url.
            //String user="rupasreedey5";
            String u = "https://www.codechef.com/contests";
            //String m = u+user;
            //System.out.println(m);
            
            document = Jsoup.connect(u).get();

            //Get description from document object.
            org.jsoup.nodes.Element link = document.select("a").first();

            String text = document.body().text(); // "An example link"
            //String linkHref = link.attr("href"); // "http://example.com/"
            String linkText = link.text(); // "example""
            System.out.println(text);
            
            str="";
            
            for(int i=0; i<text.length(); i++)
            {
                char[] ara = text.toCharArray();
                
                 if(ara[i]=='F' && ara[i+1]=='u' && ara[i+2]=='t' && ara[i+3]=='u' && ara[i+4]=='r' && ara[i+5]=='e' && ara[i+6]==' ' && ara[i+7]=='C' && ara[i+8]=='o' && ara[i+9]=='n' && ara[i+10]=='t' && ara[i+11]=='e' && ara[i+12]=='s' && ara[i+13]=='t' && ara[i+14]=='s')
                 {
                     
                     for(int j=i+36; ; j++)
                     {
                         if(ara[j]=='P' && ara[j+1]=='a' && ara[j+2]=='s' && ara[j+3]=='t')
                         {
                             break;
                         }
                         
                         str+=ara[j];
                     }
                                 
                 }
            }
            
            //System.out.println(str);
            

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int cnt=0;
        ret="";
        
        for(int i=0; i<str.length(); i++)
        {
            ret+=str.charAt(i);
            
            if(str.charAt(i)==':')
            {
                cnt++;
            }
            
            if(cnt==4)
            {
                ret += '\n';
                cnt=0;
                i+=3;
            }
        }
        
        return ret;
    }
    
    public static String toph() {
        Document document;
        
        String rat="";
        String tim="";
        
        try {
            //Get Document object after parsing the html from given url.
            //String user="rupasreedey5";
            String u = "https://toph.co/contests";
            //String m = u+user;
            //System.out.println(m);
            
            document = Jsoup.connect(u).get();

            //Get description from document object.
            Element link = document.select("a").first();

            String text = document.body().text(); // "An example link"
            String linkHref = link.attr("href"); // "http://example.com/"
            String linkText = link.text(); // "example""
            System.out.println(text);
            
            char c[]=text.toCharArray();
            rat="";
            for(int i=0; i<c.length; i++)
            {
                int f=1;
                if(c[i]=='S'&&c[i+1]=='u'&&c[i+2]=='b'&&c[i+3]=='m'&&c[i+4]=='i'&&c[i+5]=='s'&&c[i+6]=='s'&&c[i+7]=='i'&&c[i+8]=='o'&&c[i+9]=='n'&& c[i+10]=='s')
                {
                    for(int j=i+21; ; j++)
                    {
                        if(c[j]=='.')
                        {
                            f=0;
                            break;
                        }
                        else 
                        {
                            rat+=c[j];
                        }
                    }
                    if(f==0)break;
                }
            }
            
            tim="";
            for(int i=0; i<c.length; i++)
            {
                int f=1;
                if(c[i]=='S' && c[i+1]=='t' && c[i+2]=='a' && c[i+3]=='r'&&c[i+4]=='t' && c[i+5]=='s' &&c[i+6]==' ' && c[i+7]=='a'&&c[i+8]=='t')
                {
                    for(int j=i+10; ; j++)
                    {
                        if(c[j]=='L')
                        {
                            f=0;
                            break;
                        }
                        else 
                        {
                            tim+=c[j];
                        }
                    }
                    if(f==0)break;
                }
            }
            
            System.out.println(rat);
            System.out.println(tim);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        String ret = rat+"\nStarts at "+tim;
        return ret;
    }
    
    public static String codemarshal() {
        Document document;
        int f=0;
        String tim="";
        try {
            //Get Document object after parsing the html from given url.
            //String user="rupasreedey5";
            String u = "https://algo.codemarshal.org/contests";
            //String m = u+user;
            //System.out.println(m);
            
            document = Jsoup.connect(u).get();

            //Get description from document object.
            Element link = document.select("a").first();

            String text = document.body().text(); // "An example link"
            String linkHref = link.attr("href"); // "http://example.com/"
            String linkText = link.text(); // "example""
            //System.out.println(text);
            
            char c[]=text.toCharArray();
            String rat="";
            f=0;
            for(int i=0; i<c.length; i++)
            {
                int tag=1;
                if(c[i]=='S'&&c[i+1]=='t'&&c[i+2]=='a'&&c[i+3]=='r'&&c[i+4]=='t'&&c[i+5]=='s'&&c[i+6]==' '&&c[i+7]=='i'&&c[i+8]=='n')
                {
                    f=1;
                    for(int j=i-1; ; j--)
                    {
                        if(c[j-8]=='C'&&c[j-7]=='o'&&c[j-6]=='n'&&c[j-5]=='t'&&c[j-4]=='e'&&c[j-3]=='s'&&c[j-2]=='t'&&c[j-1]=='s')
                        {
                            tag=0;
                            break;
                        }
                        else 
                        {
                            rat+=c[j];
                        }
                    }
                    if(tag==0)break;
                }
            }
                   
            tim="";
            //System.out.println(rat);
            for(int i=rat.length()-1; i>=0; i--)
            {
                tim+=rat.charAt(i);
            }
           // System.out.println(tim);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if(f==0) tim = "No upcoming contests !";
        //System.out.println(tim);
        return tim;
    }
    
}
