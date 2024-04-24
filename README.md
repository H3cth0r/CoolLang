# Cool Lang

![example tree](https://github.com/H3cth0r/CoolLang/blob/main/resources/test_2_tree.png?raw=true)


## Commands
**Generate Nix Environment**
```sh
nix-shell
```

**Generate Python files from g4**
```sh
cd ./antlr_files/
antlr4 -Dlanguage=Python3 *.g4 -visitor -o ../walkers/
```

### If you want to see the tree using Command Line
You need to create the Java files out of .g4.
```sh
antlr4 *.g4
javac *.java
```

**Command to generate UI Tree**
```sh
cd ./antlr_files
java org.antlr.v4.gui.TestRig CLang program --tree ../tests/test_1.cl  -gui
java org.antlr.v4.gui.TestRig Cl program --tree ../tests/test_1.cl
```
