# project-documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://sde.ok.gov/sites/ok.gov.sde/files/studinfosyslogo1.gif" alt="Project logo"></a>
</p>

<h3 align="center">Fullstack Student Information System</h3>

<div align="center">
  
 Visit at:https://648bd35a2c8d361f700da9bd--jazzy-empanada-bdec22.netlify.app/
 

  [![Status](https://img.shields.io/badge/status-active-success.svg)]() 
  [![GitHub Issues](https://img.shields.io/github/issues/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/issues)
  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)](https://github.com/kylelobo/The-Documentation-Compendium/pulls)
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center">In this project,Student informations such as name and address are collected and stored inside a database using MySql database,SpringBoot,React.js and Postman API Platform.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [TODO](../TODO.md)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>
    Create Full stack student information system using Spring Boot and React. In this video we will use Spring Boot ( MVC, JPA, Hibernate) and Mysql Database to create the Backend application (Restful web service API) with and use React.js to create the frontend application with Material UI and React Hooks( useState, useEffect) with functional components. 

## 🏁 Getting Started <a name = "getting_started"></a>
Getting Started with Create React App
This project was bootstrapped with Create React App.

### Prerequisites
You need to install

  *Node.js
  
  *Java 20
  
  *MySql Database
  
  *Intellij IDEA
  
  *VS Code
  
  For testing API
  
  *POSTMAN
  
  For Design
  
  *Material UI


### Installing
You’ll need to have Node 14.0.0 or later version on your local development machine (but it’s not required on the server). We recommend using the latest LTS version. You can use nvm (macOS/Linux) or nvm-windows to switch Node versions between different projects.

To create a new app, you may choose one of the following methods:

npx
npx create-react-app my-app
(npx is a package runner tool that comes with npm 5.2+ and higher, see instructions for older npm versions)

npm
npm init react-app my-app
npm init <initializer> is available in npm 6+
Once the installation is done, you can open your project folder:

cd my-app
Inside the newly created project, you can run some built-in commands:

npm start or yarn start
Runs the app in development mode.
Open http://localhost:3000 to view it in the browser.

Code Splitting
This section has moved here: https://facebook.github.io/create-react-app/docs/code-splitting

Analyzing the Bundle Size
This section has moved here: https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size

Making a Progressive Web App
This section has moved here: https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app

Advanced Configuration
This section has moved here: https://facebook.github.io/create-react-app/docs/advanced-configuration

Deployment
This section has moved here: https://facebook.github.io/create-react-app/docs/deployment

npm run build fails to minify
This section has moved here: https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify

IntelliJ IDEA Community Edition:

These instructions will help you build IntelliJ IDEA Community Edition from source code, which is the basis for IntelliJ Platform development. The following conventions will be used to refer to directories on your machine:

<USER_HOME> is your home directory.

<IDEA_HOME> is the root directory for the IntelliJ source code.

Getting IntelliJ IDEA Community Edition Source Code

IntelliJ IDEA Community Edition source code is available from github.com/JetBrains/intellij-community by either cloning or downloading a zip file (based on a branch) into <IDEA_HOME>. The default is the master branch.

The master branch contains the source code which will be used to create the next major version of IntelliJ IDEA. The branch names and build numbers for older releases of IntelliJ IDEA can be found on the page of Build Number Ranges.

These Git operations can also be done through the IntelliJ IDEA user interface.

Speed Tip: If the complete repository history isn't needed then using a shallow clone (git clone --depth 1) will save significant time.

On Windows: Two git options are required to check out sources on Windows. Since it's a common source of Git issues on Windows anyway, those options could be set globally (execute those commands before cloning any of intellij-community/android repositories):

git config --global core.longpaths true
git config --global core.autocrlf input
IntelliJ IDEA Community Edition requires additional Android modules from separate Git repositories. To clone these repositories, run one of the getPlugins scripts located in the <IDEA_HOME> directory. These scripts clone their respective master branches. Make sure you are inside the <IDEA_HOME> directory when running those scripts, so the modules get cloned inside the <IDEA_HOME> directory.

getPlugins.sh for Linux or macOS.
getPlugins.bat for Windows.
Note: Always git checkout the intellij-community and android Git repositories to the same branches/tags.

Building IntelliJ Community Edition
Version 2023.1.1 or newer of IntelliJ IDEA Community Edition or IntelliJ IDEA Ultimate Edition is required to build and develop for the IntelliJ Platform.

Opening the IntelliJ Source Code for Build
Using IntelliJ IDEA File | Open, select the <IDEA_HOME> directory.

If IntelliJ IDEA displays an error about a missing or out of date required plugin (e.g. Kotlin), enable, upgrade, or install that plugin and restart IntelliJ IDEA.
IntelliJ Build Configuration
It's recommended to use JetBrains Runtime 17 to compile the project. When you invoke Build Project for the first time, IntelliJ IDEA should suggest downloading it automatically.
If the Maven plugin is disabled, add the path variable "MAVEN_REPOSITORY" pointing to <USER_HOME>/.m2/repository directory.
Make sure you have at least 8GB of RAM on your computer. With the bare minimum of RAM, disable "Compile independent modules in parallel" option in the compiler settings. With notably more memory available, increase "User-local build process heap size" to 3000 - that will greatly reduce compilation time.
Note that it is important to use the variant of JetBrains Runtime without JCEF. So, if for some reason jbr-17 SDK points to an installation of JetBrains Runtime with JCEF, you need to change it: ensure that IntelliJ IDEA is running in internal mode (by adding idea.is.internal=true to idea.properties file), navigate to jbr-17 item in Project Structure | SDKs, click on 'Browse' button, choose 'Download...' item and select version 17 and vendor 'JetBrains Runtime'.

Building the IntelliJ Application Source Code
To build IntelliJ IDEA Community Edition from source, choose Build | Build Project from the main menu.

To build installation packages, run the installers.cmd command in <IDEA_HOME> directory. installers.cmd will work on both Windows and Unix systems.

Options to build installers are passed as system properties to installers.cmd command. You may find the list of available properties in BuildOptions.kt

Examples (./ should be added only for Linux/macOS):

Build installers only for current operating system: ./installers.cmd -Dintellij.build.target.os=current
Build source code incrementally (do not build what was already built before): ./installers.cmd -Dintellij.build.incremental.compilation=true
installers.cmd is used just to run OpenSourceCommunityInstallersBuildTarget from the command line. You may call it directly from IDEA, see run configuration Build IDEA Community Installers (current OS) for an example.

Dockerized Build Environment
To build installation packages inside a Docker container with preinstalled dependencies and tools, run the following command in <IDEA_HOME> directory (on Windows, use PowerShell):
docker run --rm -it -v ${PWD}:/community $(docker build -q . --target build_env)

Running IntelliJ IDEA
To run the IntelliJ IDEA built from source, choose Run | Run from the main menu. This will use the preconfigured run configuration "IDEA".

To run tests on the build, apply these setting to the Run | Edit Configurations... | Templates | JUnit configuration tab:

Working dir: <IDEA_HOME>/bin
VM options:
-ea
You can find other helpful information at https://www.jetbrains.com/opensource/idea. The "Contribute Code" section of that site describes how you can contribute to IntelliJ IDEA.

Running IntelliJ IDEA on CI/CD environment
To run tests outside of IntelliJ IDEA, run the tests.cmd command in <IDEA_HOME> directory. tests.cmd will work on both Windows and Unix systems.

Options to run tests are passed as system properties to tests.cmd command. You may find the list of available properties in TestingOptions.kt

Examples (./ should be added only for Linux/macOS):

Build source code incrementally (do not build what was already built before): ./tests.cmd -Dintellij.build.incremental.compilation=true
Run a specific test: ./tests.cmd -Dintellij.build.test.patterns=com.intellij.util.ArrayUtilTest
tests.cmd is used just to run CommunityRunTestsBuildTarget from the command line. You may call it directly from IDEA, see run configuration tests in community for an example.



## 🔧 Running the tests <a name = "tests"></a>
The outputs at the frontend,database and backend parts are attached below.

### Break down into end to end tests
Front end:
![reactoutput1](https://github.com/paulselvi2022/FullStack-Student-Information-System/assets/120387943/683ae948-80bf-454e-ae93-d985599f09a4)
![reactoutput2](https://github.com/paulselvi2022/FullStack-Student-Information-System/assets/120387943/ac6c9085-c2cc-4595-9540-ae0c52a1f33f)

Backend:
![backendoutput](https://github.com/paulselvi2022/FullStack-Student-Information-System/assets/120387943/f703fe7f-0373-4ce7-a6e0-b61a0e59cd34)


Database:
![getstudentdetails](https://github.com/paulselvi2022/FullStack-Student-Information-System/assets/120387943/c0c6e27b-6de8-479a-a01d-a4ad9ff59224)
![addstudentdetails](https://github.com/paulselvi2022/FullStack-Student-Information-System/assets/120387943/3d13fee8-f9a4-40a8-8c3d-0d06e215cb4c)

### And coding style tests
During debugging,the output is shown below,
![coderun](https://github.com/paulselvi2022/FullStack-Student-Information-System/assets/120387943/ee010bda-54e9-4c41-b2eb-54481d572074)


## 🎈 Usage <a name="usage"></a>
This project is used to create Full stack student information system using Spring Boot and React. In this project, we will use Spring Boot ( MVC, JPA, Hibernate) and Mysql Database to create the Backend application (Restful web service API) with and use React.js to create the frontend application with Material UI and React Hooks( useState, useEffect) with functional components. 

## 🚀 Deployment <a name = "deployment"></a>

MyProject is deployed at : https://648bd35a2c8d361f700da9bd--jazzy-empanada-bdec22.netlify.app/

Output Video Link at LinkedIn : https://www.linkedin.com/posts/paul-selvi-3a9587207_fullstack-java-skill-activity-7075363122487705600-Mxim?utm_source=share&utm_medium=member_desktop

## ⛏️ Built Using <a name = "built_using"></a>
- [MySqlDB](https://www.phpmyadmin.net/) - Database
- [Intellij IDEA](https://www.jetbrains.com/idea/) - Server Framework
- [NodeJs](https://nodejs.org/en/) - Server Environment

## ✍️ Authors <a name = "authors"></a>

I want to express my deepest gratitude to the exceptional team of Skill-Lync [https://skill-lync.com/] who have poured their passion, expertise, and countless hours into guiding me in achieving this fleet.
Their dedication and commitment have been truly inspiring, and I would like to mention Mr.Bhupendra Parihar<bhupendraparihar@skill-lync.com> and our internship mentor Mr.R.Bheemesh Raghupathy <bheemesh.r@skill-lync.com> for their special support.

## 🎉 Acknowledgements <a name = "acknowledgement"></a>
Skill-Lync [https://skill-lync.com/]
