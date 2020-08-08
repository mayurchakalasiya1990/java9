package org.java9;

/*
Java version-string is a format that contains version specific information.
This version-string consists of major, minor, security and patch update releases.
$MAJOR.$MINOR.$SECURITY.$PATCH
$MAJOR:This version number shows a major change in Java version. i.e. java8 or java9

$MINOR:These updates can be bug fixes, revision to standard API etc i.e. java 9.1

$SECURITY: This version number represents security update and increase for each new security update. java 9.1.5

$PATCH:This version number increases for each security and high-priority customer fixes, which has been tested together. Java 9.1.5.1 (contains major, minor, security and patch release number).

 */

public class VersionInfoExample {

   public static void main(String[] args) {
        Runtime.Version version = Runtime.version();                 // Getting runtime version instance
        System.out.println("Current version is "+version);           // Getting current Java version
        System.out.println("Major version number "+version.major()); // Getting major version number
        System.out.println("Minor version number "+version.minor()); // Getting minor version number
        System.out.println("Security version number "+version.security());  // Getting security version number
        System.out.println("Pre-released information "+version.pre());      // Getting pre-release version information
        System.out.println("Build Number "+version.build());                // Getting Optional build number
    }
}
