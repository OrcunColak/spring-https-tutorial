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