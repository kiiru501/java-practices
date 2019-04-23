
     ,-----.,--.                  ,--. ,---.   ,--.,------.  ,------.
    '  .--./|  | ,---. ,--.,--. ,-|  || o   \  |  ||  .-.  \ |  .---'
    |  |    |  || .-. ||  ||  |' .-. |`..'  |  |  ||  |  \  :|  `--, 
    '  '--'\|  |' '-' ''  ''  '\ `-' | .'  /   |  ||  '--'  /|  `---.
     `-----'`--' `---'  `----'  `---'  `--'    `--'`-------' `------'
    ----------------------------------------------------------------- 


Hi there! Welcome to Cloud9 IDE!

To get you started, create some files, play with the terminal,
or visit http://docs.c9.io for our documentation.
If you want, you can also go watch some training videos at
http://www.youtube.com/user/c9ide.

Happy coding!
The Cloud9 IDE team

## check java version 

java -version 

## java on C9
sudo apt-get update
sud apt-get install default-jdk


## Updated version 

# Install Java.
sudo echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
sudo add-apt-repository -y ppa:webupd8team/java
sudo apt-get update -y
sudo apt-get install -y oracle-java8-installer
sudo rm -rf /var/lib/apt/lists/*
sudo rm -rf /var/cache/oracle-jdk8-installer

# Define commonly used JAVA_HOME variable and update PATH
echo 'export JAVA_HOME=/usr/lib/jvm/java-8-oracle' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc 

source ~/.bashrc