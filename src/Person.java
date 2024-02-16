public class Person {
    private String name;
    private String age;
    private String gender;
   // ArrayList<String>interests = new ArrayList<String>();
    private String[] interests;
    public Person(String name, String age, String gender, String[] interests){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String[] getInterests() {
        return interests;
    }

    public String getGender() {
        return gender;
    }

    public String hello(){
        String interestsString = String.join(", ", interests);
        String s = "Hello my namne is " + getName() + ",my gender is " + getGender() + "and I am " + getAge() + " years old.My interests are  " + interestsString+".";
        String str = "";
        /*for(int i = 0;i < interests.length;i++){
            System.out.print(str + interests[i] + ",");
        }
        System.out.println();*/
        return  s;
    }
}
