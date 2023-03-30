See [here](https://github.com/NetLogo/NetLogo-Libraries#netlogo-libraries) for iinstructions.

Fork the repository ihttps://github.com/NetLogo/NetLogo-Libraries in github.com. This is done by clicking the fork button in the right hand corner of the screen. Then clone this repository

```
git clone git@github.com:/DougSalt/NetLogo-Libraries
```
or if you have used this before then on the main page of github for that
project, switch to the 6.1 branch and pull to the state of the master.
You need to update your local version of NetLogo-libraries, locally:

```
git pull upstream 6.1
```

Make a new branch

```
cd NetLogo-Libraries
git checkout -b math
# I don't think you need to do this line.
git remote add upstream git@github.com:NetLogo/NetLogo-Libraries.git
```

copy the latest version of netlogo-math/zip/math.jar into the correct zip format
by using the command

```
cd ~/git/netlogo-math/zip
zip math-1.0.1.zip math.jar
cp math-1.0.1.zip  ~/git/NetLogo-Libraries/extensions
```

where `1.0.1` is the version number

Add this file to `NetLogo-Libraries/extensions` directory.

Add or update the following in the `NetLogo-Libraries/libraries.conf`

{
    name: "java.Math"
    codeName: "math"
    shortDescription: "Access Java math library from NetLogo"
    longDescription: """Java's Math library provides a number of mathematical functions that NetLogo doesn't, with guaranteed numerical properties. This extension provides access to them."""
    version: "1.0.1"
    homepage: "https://github.com/garypolhill/netlogo-math"
    downloadURL: "https://raw.githubusercontent.com/NetLogo/NetLogo-Libraries/6.1/extensions/math-1.0.1.zip"
}
then

```
git add extensions/math.jar
git commit -a -m "Updating the java.math extension."
git push
```

The go up to https://github.com/DougSalt/NetLogo and generate a pull request back to the original repository.

