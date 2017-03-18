package mamu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class kaji {
    
       public static String codeforces(String user) throws Exception {
        //String user = "tourist";
        String uc = "http://codeforces.com/profile/";
        String m = uc + user;
        URL u = new URL(m);
        URLConnection yc = u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String s = br.readLine();

        int x = 0;
        int cnt = 0;
        String lev_show = "";
        String pnt = "";
        while (s != null) {
            s = br.readLine();
           // System.out.println(s);

            char c[] = s.toCharArray();

            if (c.length >= 60 && c[0] == '<' && c[1] == 'a') {
                int f = 1;
                String ss = "";
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == 't' && c[i + 1] == 'i' && c[i + 2] == 't' && c[i + 3] == 'l' && c[i + 4] == 'e' && c[i + 5] == '=') {
                        for (int j = i + 7;; j++) {
                            if (c[j] == '"') {
                                f = 0;
                                break;
                            } else {
                                ss += c[j];
                            }
                        }
                    }
                    if (f == 0) {
                        break;
                    }
                }

                int i;
                char c1[] = ss.toCharArray();
                int space = 0;
                for (i = 0; i < c1.length; i++) {
                    if (c1[i] == ' ') {
                        space++;
                    }
                }

                if (space == 1) {
                    String lev = "";

                    for (i = 0;; i++) {
                        if (c1[i] == ' ') {
                            break;

                        } else {
                            lev += c1[i];
                        }
                    }

                    // System.out.println(lev);
                    String user_name = "";

                    for (int j = i + 1; j < c1.length; j++) {
                        user_name += c1[j];
                    }

                    //System.out.println(user_name);

                    if (user_name.equals(user)) {
                        //System.out.println(lev);
                        lev_show = lev;
                    }
                    
                } 
                
                else if (space == 2) {
                    String lev = "";
                    
                    int sp=0;

                    for (i = 0; ; i++) {
                        if (c1[i] == ' ') {
                            sp++;
                            if(sp==2)break;

                        } else {
                            lev += c1[i];
                        }
                    }

                    // System.out.println(lev);
                    String user_name = "";

                    for (int j = i + 1; j < c1.length; j++) {
                        user_name += c1[j];
                    }

                   // System.out.println(user_name);

                    if (user_name.equals(user)) {
                        //System.out.println(lev);
                        lev_show = lev;
                    }
                }
            }

            if (c.length >= 100 && c[24] == '<' && c[25] == 's' && c[26] == 'p' && c[27] == 'a' && c[28] == 'n') {
                int f = 1;
                for (int i = 0; i < c.length; i++) {
                    //System.out.println(c[i]);
                    if (c[i] == '>') {
                        for (int j = i + 1;; j++) {
                            if (c[j] == '<') {
                                f = 0;
                                break;
                            } else if (c[j] >= '0' && c[j] <= '9') {
                                // System.out.println(c[i]);
                                pnt += c[j];
                            }
                        }
                    }
                    if (f == 0) {
                        break;
                    }
                }

                break;
            }

            cnt++;
        }
        String ret = lev_show +"  "+ pnt;
        return ret;
        //System.out.println(lev_show +" "+pnt);
    }

     
         public static String vjudge(String user) throws Exception {
        
        String uc = "https://vjudge.net/user/";
        String m = uc + user;
        URL u = new URL(m);
        URLConnection yc = u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String s = br.readLine();

        int x = 0;
        int cnt = 0;
        String pnt_show = "";
        String pnt = "";
        String attemp_show = "";
        String attemp = "";
        
        while (s != null) {
            s = br.readLine();
            //System.out.println(cnt+" "+s);
            char c[] = s.toCharArray();
            if (c.length >= 71 && c[27] == 't' && c[28] == 'i' && c[29] == 't' && c[30] == 'l' && c[31] == 'e' && c[42] == 's' && c[43] == 'o' && c[44] == 'l' && c[45] == 'v' && c[46] == 'e' && c[47] == 'd') {
                int f = 1;
                for (int i = 0; i < c.length; i++) {

                    if (c[i] == '>') {
                        for (int j = i + 1; ; j++) {
                            if (c[j] == '<') {
                                f = 0;
                                break;
                            } else if (c[j] >= '0' && c[j] <= '9') {
                                //System.out.println(c[i]);
                                pnt += c[j];
                            }
                        }
                        
                    }
                    if(f==0)break;
                }
            }
            
             if (c.length >= 71 && c[27] == 't' && c[28] == 'i' && c[29] == 't' && c[30] == 'l' && c[31] == 'e' && c[42] == 'a' && c[43] == 't' && c[44] == 't' && c[45] == 'e' && c[46] == 'm' && c[47] == 'p') {
                int f = 1;
                for (int i = 0; i < c.length; i++) {

                    if (c[i] == '>') {
                        for (int j = i + 1; ; j++) {
                            if (c[j] == '<') {
                                f = 0;
                                break;
                            } else if (c[j] >= '0' && c[j] <= '9') {
                                //System.out.println(c[i]);
                                attemp += c[j];
                            }
                        }
                        
                    }
                    if(f==0)break;
                }
                break;
            }
             
            cnt++;
        }
        
        //String total="Solved problems "+pnt+","+ ", Attempted problems "+attemp;
        String total="     "+pnt+"  "+attemp;
        return total;
    }
         
          public static String codechef(String user) throws Exception {
        //String user = "tourist";
        String uc = "https://www.codechef.com/users/";
        String m = uc + user;
        
        URL u = new URL(m);
        URLConnection yc = u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String s = br.readLine();

        int x = 0;
        int cnt = 0;
        //String success = "Problems successfully solved ";
        String success = "     ";
        String partial = "";
        
        int paisi = 0;
        int f=1;

        while (s != null) {
            s = br.readLine();
            //System.out.println(cnt + s);

            char c[] = s.toCharArray();

            if (c.length >= 18 && c[8] == '<' && c[9] == 't' && c[10] == 'd' && c[11] == '>' && (c[12] >= '0' && c[12] <= '9')) {
                
                String ss = "";
                for (int i = 12; ; i++) {

                    if (c[i] == '<') {
                        f = 0;
                        break;
                    } else if (c[i] >= '0' && c[i] <= '9') {
                        
                            success += c[i];
                        
                    }
                }
                
               if(paisi<1) success+="  ";
                paisi++;
                
               if (paisi == 2) {
                   
                    break;
               }
            }
            
            cnt++;
        }
        
        //System.out.println(success); 
        return success;
    }
          
          public static String codeforces_schedule() throws Exception {
       // String user = "tourist";
        //String uc = "http://codeforces.com/profile/";
        //String m = uc + user;
        String m = "http://codeforces.com/contests";
        URL u = new URL(m);
        URLConnection yc = u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String s = br.readLine();

        int x = 0;
        int cnt = 0;
        String times = "Countdown ";

        int i, j;

        while (s != null) {
            s = br.readLine();
            // System.out.println(cnt + s);

            char c[] = s.toCharArray();
            //System.out.println(cnt + " " + c.length + s);
            int f = 0;

            if (c.length >=120) {

                String ss = "";
                
                for (i = 0; i < c.length; i++) {

                    if (c[i] == 'B' && c[i + 1] == 'e' && c[i + 2] == 'f' && c[i + 3] == 'o' && c[i + 4] == 'r' && c[i + 5] == 'e' && c[i + 6] == ' ' && c[i + 7] == 's' && c[i + 8] == 't' && c[i + 9] == 'a' && c[i + 10] == 'r' && c[i + 11] == 't') {
                        f = 1;
                         break;
                    }
                }

                if (f == 1) {
                    for (i = 0; i < c.length; i++) {
                        if (c[i] == '>') {
                            for (j = i + 1; j<c.length ; j++) {
                                if (c[j] == '<') {
                                    break;
                                } else {

                                    times += c[j];

                                }
                            }
                        }
                    }
                }
                
            }
            
            if(f==1)
            {
                // System.out.println(times);
                break;
            }

            cnt++;
        }

       // System.out.println(times);
        return times;
    }
    
}
