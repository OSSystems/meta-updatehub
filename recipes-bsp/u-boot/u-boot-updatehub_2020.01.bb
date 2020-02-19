# Copyright (C) 2012-2020 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-bsp/u-boot/u-boot.inc
require recipes-bsp/u-boot/u-boot-common.inc

DESCRIPTION = "U-Boot based fork for use with UpdateHub in \
order to provide support for some backported features and fixes, or because it \
was submitted for revision and it takes some time to become part of a stable \
version, or because it is not applicable for upstreaming."

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

SRC_URI = "git://github.com/updatehub/u-boot-updatehub;branch=${SRCBRANCH}"

SRCREV = "10e3ef516b3f81ac903c017ae6ae5890e4631d8c"
SRCBRANCH = "2020.01+updatehub"

PE = "1"
PV .= "+git${SRCPV}"

DEPENDS += "bc-native dtc-native"

PROVIDES += "u-boot"

PACKAGE_ARCH = "${MACHINE_ARCH}"
