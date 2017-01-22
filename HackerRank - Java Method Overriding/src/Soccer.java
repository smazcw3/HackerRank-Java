
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    
    //overridden getNumberOfTeamMembers method code below
    
    @Override
    void getNumberOfTeamMembers(){
    	System.out.println( "Each team has 11 players in " + getName());
    }
        
    
} 
