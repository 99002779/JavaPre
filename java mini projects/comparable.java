public class User implements Comparable<User>
{
     int id;
     String name;
public User(int id,String name){
    this.id=id;
    this.name=name;
}
public int getId(){
    return id;
}

public void setId(int id){
    this.id=id;
}
public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}
public String toString(){
    return id+":"+name;
}

@Override
public int compareTo(User user){
    return id - user.getId();
}
}
////////////////////////////////////////////
import java.util.ArrayList;
public class ComparableExample{
    public static void public static void main (String[] args) {
      List<User> users=new ArrayList<User>();
      User user1=new User(3,"siri");
      User user2=new User(2,"ram");
      User user3=new User(4,"lahari");
      User user4=new User(1,"siri");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      
      Collections.sort(users);
      for (User user: users){
          System.out.println(user);
      } 
      
      
    }
}



