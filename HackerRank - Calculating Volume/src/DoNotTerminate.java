import java.security.Permission;

class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {}

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
} //end of Do_Not_Terminate
