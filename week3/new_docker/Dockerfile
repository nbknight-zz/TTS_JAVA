FROM ubuntu:16.04
LABEL maintainer=matthew@test.com
RUN apt-get update && apt-get install -y nginx
RUN echo ‘New webserver’ > /var/www/html/index.html
EXPOSE 80
