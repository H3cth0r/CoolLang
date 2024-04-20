# Cool Lang

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
java org.antlr.v4.gui.TestRig Cl program --tree ../tests/test_1.cl  -gui
java org.antlr.v4.gui.TestRig Cl program --tree ../tests/test_1.cl
```

