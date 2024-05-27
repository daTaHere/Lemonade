# Lemonade
Intro to Jetpack Compose

    Requirement 	         Minimum 	                             Recommended
    OS 	                 Any 64-bit Linux distribution               Latest 64-bit version of Linux
                             that supports Gnome, KDE, or Unity DE; 
                             GNU C Library (glibc) 2.31 or later.

    RAM 	                 8 GB RAM 	                             16 GB RAM or more

    CPU 	                 x86_64 CPU architecture; 	             Latest Intel Core processor
                             2nd generation Intel Core or newer,
                             or AMD processor with support for 
                             AMD Virtualization (AMD-V) and SSSE3.

    Disk space 	         8 GB (IDE and Android SDK and Emulator)     Solid state drive with 16 GB or more

    Screen resolution 	 1280 x 800 	                             1920 x 1080

# Install Andriod Studio

<a href="https://redirector.gvt1.com/edgedl/android/studio/ide-zips/2023.3.1.19/android-studio-2023.3.1.19-linux.tar.gz">DOWNLOAD</a> latest version of Android Studio for Ubuntu.

Unpack the .zip file you downloaded to an appropriate location for your applications, such as within /usr/local/ for your user profile or /opt/ for shared users.

For a 64-bit version of Linux
       
       $ sudo apt-get install libc6:i386 libncurses5:i386 libstdc++6:i386 lib32z1 libbz2-1.0:i386

To launch Android Studio, open a terminal, navigate to the android-studio/bin/ directory.

Execute cmd :
     
    android-studio/bin$ ./studio.sh

Click "OK" and complete the Android Studio Setup Wizard.

Select "New Project" then "Empty Activity" and in the name field 

    Name: LemonadeApp

For App images <a href= "https://github.com/google-developer-training/basic-android-kotlin-compose-training-lemonade/raw/main/lemonade_images.zip">Download Lemonade Image</a>. 
Create a Folder named Lemonade_Drawables move the file there and then extract here. In Android Studio navigate to "Resource Manager". At the top left click on the "+" icon and select
 "Import Drawables". Find the "lemonade_images" folder inside the "LemonadeDrawables" folder and import all 4 .xml files.

For detailed instructions go to <a href= "https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-2">Android Basic with Compose -> Building APP UI -> ADD A Button</a>

HAPPY CODING!!!!

