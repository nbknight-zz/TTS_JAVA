#Use the 'node' official image, with the alpine 6.x branch
# FROM node:6-alpine
FROM alpine:3.5 

#- Then it should use alpine package manager to install tini: apk add --update py2-pip
# Install python and pip
RUN apk add --update py2-pip

# install Python modules needed by the Python app
COPY requirements.txt /usr/src/app/
RUN pip install --no-cache-dir -r /usr/src/app/requirements.txt

#- Then it should create directory /usr/src/app for app files with 'mkdir -p /usr/src/app'
# RUN mkdir -p /mnt/c/testDockerDirectory/app/
# WORKDIR /mnt/c/TTS_JAVA/week3/flask-app/testDir
#- Then it needs to copy in all files from current directory
# COPY requirements.txt /mnt/c/testDockerDirectory/app/
COPY app.py /usr/src/app/
COPY templates/index.html /usr/src/app/templates/ 


#- This app listens on port 3000, but the container should launch on port 80. So it will
#respond to http://localhost:80 on your computer.
EXPOSE 80:3000

CMD ["python", "/usr/src/app/app.py"]