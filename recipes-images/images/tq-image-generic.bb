require recipes-core/images/core-image-minimal.bb

SUMMARY =  "This is a generic image for TQ SOM with no special features."

IMAGE_LINGUAS = " en-us "

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
    packagegroup-sysutils \
"
