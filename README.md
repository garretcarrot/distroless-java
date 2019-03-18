# Distroless Java Stuff

See also: [distroless/examples/java/Dockerfile](https://github.com/GoogleContainerTools/distroless/blob/master/examples/java/Dockerfile)

#### Build the image

```bash
docker build . -t aoeu
```

#### Run the image you have just built

```bash
docker run aoeu -DLOCAL=local main.jar
```
