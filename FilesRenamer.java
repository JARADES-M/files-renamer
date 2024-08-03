import java.io.File;

public class FilesRenamer {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("""
            The three arguments are required:
            Name Pattern
            Replace Pattern
            Replace Value
                """);
            return;
        }

        String namePattern = args[0];
        String replacePattern = args[1];
        String replaceValue = args[2];
                
        File dir = new File(".");
        File[] filesList = dir.listFiles((d, n) -> n.matches(namePattern));
        
        if (filesList != null) {
            for (File file : filesList) {
                String originalName = file.getName();
                
                String newName = originalName.replaceAll(replacePattern, replaceValue);
                
                File newFile = new File(dir, newName);
                if (file.renameTo(newFile)) {
                    System.out.println("Renamed: " + originalName + " -> " + newName);
                } else {
                    System.out.println("Failed to rename: " + originalName);
                }
            }
        } else {
            System.out.println("Directory is invalid or contains no matching files.");
        }
    }
}
