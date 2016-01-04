# gegram

Gegram is library which helps you to integrate Georgian grammar utilities in Java. It's originally created to throw barbarismes out of input.

#Usage

Just clone repository with 

```
git clone https://github.com/getsadzeg/gegram-class.git
```
Now copy package named 'src' to your project and access it's classes via:

```java
import src.*;
```

After that you can create Gegram object and parse input(it must be array):

```java
Gegram gram = new Parse(input);
System.out.println(gram.parseBarbarism());
```

#Feel free to fork

You can fork, modify and change the code under MIT license. The project contains LICENSE file to see full license description.