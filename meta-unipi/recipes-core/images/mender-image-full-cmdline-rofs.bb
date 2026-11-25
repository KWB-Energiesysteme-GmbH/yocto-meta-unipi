# Read-only rootfs variant of core-image-full-cmdline.
# meta-mender provided this image in meta-mender-core up to scarthgap and moved
# it to meta-mender-demo on wrynose. meta-mender-demo is not used because its
# bbappends add demo settings (server certificate, poll intervals, packages).
require recipes-extended/images/core-image-full-cmdline.bb

IMAGE_FEATURES:append = " read-only-rootfs"
