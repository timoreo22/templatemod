package fr.timoreo.test;

public class Reference {
	
	public static final String MOD_ID = "tm";
	public static final String NAME = "Test mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10, 1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "fr.timoreo.test.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "fr.timoreo.test.proxy.ServerProxy";

    public static enum TestItems{
    	TEST("test1","test2");
       private String unlocalizedName;
       private String registeryName;
      TestItems(String unlocalizedName, String registryName){   
          this.unlocalizedName = unlocalizedName;
          this.registeryName = registryName;
      }
      public String getUnlocalizedName() {
		return unlocalizedName;
	}
      
      public String getRegisteryName() {
		return registeryName;
	}
      
}
  public static enum TestBlocks{
	  TESTB("testb1","testb2");
	  private String unlocalizedName;
	  private String registeryName;
	  TestBlocks(String unlocalizedName, String registeryName){
		  this.unlocalizedName = unlocalizedName;
		  this.registeryName = registeryName;
	  }
	   public String getUnlocalizedName() {
			return unlocalizedName;
		}
	      
	      public String getRegisteryName() {
			return registeryName;
		}
	       
  
  }

}
