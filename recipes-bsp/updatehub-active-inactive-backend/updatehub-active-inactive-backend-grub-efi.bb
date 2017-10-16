SUMMARY = "updatehub - Active/Inactive GRUB EFI backend"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://updatehub-grubenv.default"

S = "${WORKDIR}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install () {
    install -Dm 0644 updatehub-grubenv.default ${D}${sysconfdir}/default/updatehub-grubenv
}

RDEPENDS_${PN} += "grub-efi-editenv updatehub-active-inactive-backend-grub-tools"

PACKAGE_ARCH = "${MACHINE_ARCH}"
