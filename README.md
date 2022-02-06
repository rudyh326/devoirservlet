# devoirservlet
# I first download apache-tomcat-9.0.58 as a zip file from "https://tomcat.apache.org/download-90.cgi" then extracted it.
# The reason I downloaded this version of Tomcat is because I have the jdk 1.8 version on my laptop.
# Then I added the in the classpath in environment variables the directory of the jar file servlet-api.jar.
# After that I ran the batch file "startup" in "./bin" .
# I than created the java file "IdendityExample" in "./webapps/examples/WEB-INF/classes" and implemented it.
# I compiled the code in cmd in the same directory.
# Last but not least I created the html file "Bonjour" in "./webapps/examples" and imlemented it.
# I ran the code with the localhost of Tomcat 8080 on the browser but it didn't work because I had other servers running on 8080 so I changed the port number in the "server"
# XML file in "./conf" to 8081 and it worked.
