require recipes-fsl/images/fsl-image-qt5.bb

SUMMARY =  "This is a generic image for TQ SOM with qt5."

IMAGE_LINGUAS += " en-us "

LICENSE = "MIT"

inherit distro_features_check

IMAGE_INSTALL += "\
    packagegroup-hwutils \
    packagegroup-fsutils \
    packagegroup-netutils \
    packagegroup-sysutils \
"