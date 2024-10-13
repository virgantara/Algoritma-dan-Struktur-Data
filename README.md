# Java Installation on Windows
To set up Java on Windows, follow these steps:
## Download and Install Java Development Kit (JDK)
- Visit the official Oracle JDK download page: https://www.oracle.com/java/technologies/javase-downloads.html.
- Download the latest JDK version for Windows.
- Once downloaded, run the installer and follow the instructions to complete the installation.

## Set Up Environment Variables
After installation, you need to set the Java environment variables so the system recognizes Java commands from the command line.
### Open the Environment Variables:
- Right-click on "This PC" or "My Computer" on your desktop or in File Explorer and select "Properties."
- Click on "Advanced system settings."
- In the System Properties window, click the "Environment Variables" button.

### Add `JAVA_HOME`:
- In the Environment Variables window, click "New" under the "System variables" section.
- For the "Variable name," enter JAVA_HOME.
- For the "Variable value," enter the path where Java was installed. It is usually in C:\Program Files\Java\jdk-<version>.
- Click "OK" to close the window.

### Update the `Path` Variable:
- In the Environment Variables window, find the "Path" variable under "System variables," select it, and click "Edit."
- Click "New" and add the following path: %JAVA_HOME%\bin.
- Click "OK" to close the window.

## Verify the Installation
- Open Command Prompt (type `cmd` in the Start menu search bar).
- Type `java -version` to verify Java is installed and check the version.
- Type `javac -version` to verify that the Java compiler (javac) is available.

If everything is set up correctly, these commands should return the Java version you installed. You're now ready to develop Java applications on Windows.