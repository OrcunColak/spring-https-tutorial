# HTTPS
The original idea is from  
https://medium.com/@bubu.tripathy/securing-spring-boot-application-with-https-2ea75a86e4c7

# SSL Bundle
The original idea is from  
https://medium.com/viascom/enabling-https-in-spring-boot-3-c94095389842

Generate self-signed certificate with
```
keytool \
  -genkey \
  -alias mycertificate \ 
  -storetype PKCS12 \ 
  -keyalg RSA \ 
  -keysize 2048 \ 
  -keystore keystore.p12 \
   -ext "SAN:c=DNS:localhost,IP:127.0.0.1" \
  -validity 3650
```

# SSL Bundle Reloading
The original idea is from  
https://webcache.googleusercontent.com/search?q=cache:https://medium.com/@vikas.taank_40391/spring-boot-3-2x-latest-enhancements-a10762ae97b0

SSL bundles can now automatically reload upon trust material changes, enhancing security by 
ensuring the latest certificates are always in use without needing a full application restart

Consumers that support reloading are:

Netty web server
Tomcat web server

```
spring:
  ssl:
    bundle:
      pem:
        mybundle:
          reload-on-update: true
          keystore:
            certificate: "file:/some/directory/application.crt"
            private-key: "file:/some/directory/application.key"
```