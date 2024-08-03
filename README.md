# files-renamer
Simple way to rename files in a directory


### Example.

With the jar file inside the target directory.

List of files before:  
  - abc.1-xxx.txt  
  - abc.2-xxx.txt  
  - abc.3-xxx.txt  

Run the command:
```bash
java -jar FilesRenamer.jar "^abc.*" "-xxx." "."
```

List of files after:  
- abc.1.txt  
- abc.2.txt  
- abc.3.txt  
