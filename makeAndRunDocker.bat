call gradlew distTar

docker build -t testar/decoder:latest .

docker run -d --mount type=bind,source="C:\Users\testar\TESTAR_dev",target=/mnt --mount type=bind,source="C:\testardock\settings",target=/testar/bin/settings --mount type=bind,source="c:\testardock\output",target=/testar/bin/output testar/decoder:latest