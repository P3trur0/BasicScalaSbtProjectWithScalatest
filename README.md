A Basic Scala SBT Project With Scalatest Support
================================================

#### Gently forked from the [awesome repo](http://github.com/alvinj/BasicScalaSbtProjectWithScalatest.git) of **Alvin Alexander**

Updated with:

- Scala version: **2.11.7**
- ScalaTest version: **2.2.6**

----

This is a template for a basic Scala/SBT project that already has the needed dependency reference in build.sbt for Scalatest support. You can check this project out if you want a template/skeleton directory structure for a new project that has those things, i.e.:

* It uses a standard SBT directory strucure.
* The dependency line to use Scalatest is already included in build.sbt.
* It includes one source code file and two test files, so out of the box you can type 'sbt compile', 'sbt run', and 'sbt test', and (assuming you have SBT installed), all those things should work.
* These two test files come in different flavours:
    1. FlatSpec
    2. FunSuite

Checkout a Copy
---------------

You can checkout a read-only copy of this project with this command:

<pre>
git clone git://github.com/P3trur0/BasicScalaSbtProjectWithScalatest.git
</pre>

Setup a Scala IDE project of it
-------------------------------

If you like to import this basic project in Scala IDE you have to:

1. install the sbt-eclipse plugin for sbt. See [here](https://github.com/typesafehub/sbteclipse/wiki/Installing-sbteclipse)
2. run the sbt task `eclipse`

Notes
-----
Note: All the little ".gitignore" files are in the empty subdirectories so those directories would be checked into Git. (Git doesn't like empty directories, so you have to do something to get it to keep empty directories in the repo.)

[Alvin Alexander](http://devdaily.com) & U.P.




