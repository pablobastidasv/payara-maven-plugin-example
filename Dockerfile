FROM airhacks/payara

ENV APP_NAME="Demo App"

COPY target/demo.war ${DEPLOYMENT_DIR}