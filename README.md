# files-renamer
Simple way to rename files in a directory


### Example.

With the jar file inside the target directory.

list of files before:
abc.1-xxx.txt
abc.2-xxx.txt
abc.3-xxx.txt

Run the comman:
```bash
java -jar FilesRenamer.jar "^abc.*" "-xxx." "."
```

list of files after:
abc.1.txt
abc.2.txt
abc.3.txt
