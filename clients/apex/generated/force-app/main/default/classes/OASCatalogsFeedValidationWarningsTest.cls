@isTest
private class OASCatalogsFeedValidationWarningsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = catalogsFeedValidationWarnings1;
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = catalogsFeedValidationWarnings3;

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assert(catalogsFeedValidationWarnings4.equals(catalogsFeedValidationWarnings3));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = new OASCatalogsFeedValidationWarnings();

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assert(catalogsFeedValidationWarnings4.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();

        System.assertEquals(false, catalogsFeedValidationWarnings1.equals('foo'));
        System.assertEquals(false, catalogsFeedValidationWarnings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3;

        System.assertEquals(false, catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings3));
        System.assertEquals(false, catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();

        System.assertEquals(catalogsFeedValidationWarnings1.hashCode(), catalogsFeedValidationWarnings1.hashCode());
        System.assertEquals(catalogsFeedValidationWarnings2.hashCode(), catalogsFeedValidationWarnings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = new OASCatalogsFeedValidationWarnings();

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assertEquals(catalogsFeedValidationWarnings1.hashCode(), catalogsFeedValidationWarnings2.hashCode());
        System.assertEquals(catalogsFeedValidationWarnings3.hashCode(), catalogsFeedValidationWarnings4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings = new OASCatalogsFeedValidationWarnings();
        Map<String, String> x-property-mappings = catalogsFeedValidationWarnings.getx-property-mappings();
        System.assertEquals('adIMAGE0LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_0_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE0LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_0_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE0LINKREQUIRED', x-property-mappings.get('AD_IMAGE_0_LINK_REQUIRED'));
        System.assertEquals('adIMAGE0LINKWARNING', x-property-mappings.get('AD_IMAGE_0_LINK_WARNING'));
        System.assertEquals('adIMAGE0TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_0_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE0TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_0_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE0TAGREQUIRED', x-property-mappings.get('AD_IMAGE_0_TAG_REQUIRED'));
        System.assertEquals('adIMAGE10LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_10_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE10LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_10_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE10LINKREQUIRED', x-property-mappings.get('AD_IMAGE_10_LINK_REQUIRED'));
        System.assertEquals('adIMAGE10LINKWARNING', x-property-mappings.get('AD_IMAGE_10_LINK_WARNING'));
        System.assertEquals('adIMAGE10TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_10_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE10TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_10_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE10TAGREQUIRED', x-property-mappings.get('AD_IMAGE_10_TAG_REQUIRED'));
        System.assertEquals('adIMAGE11LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_11_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE11LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_11_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE11LINKREQUIRED', x-property-mappings.get('AD_IMAGE_11_LINK_REQUIRED'));
        System.assertEquals('adIMAGE11LINKWARNING', x-property-mappings.get('AD_IMAGE_11_LINK_WARNING'));
        System.assertEquals('adIMAGE11TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_11_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE11TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_11_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE11TAGREQUIRED', x-property-mappings.get('AD_IMAGE_11_TAG_REQUIRED'));
        System.assertEquals('adIMAGE12LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_12_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE12LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_12_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE12LINKREQUIRED', x-property-mappings.get('AD_IMAGE_12_LINK_REQUIRED'));
        System.assertEquals('adIMAGE12LINKWARNING', x-property-mappings.get('AD_IMAGE_12_LINK_WARNING'));
        System.assertEquals('adIMAGE12TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_12_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE12TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_12_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE12TAGREQUIRED', x-property-mappings.get('AD_IMAGE_12_TAG_REQUIRED'));
        System.assertEquals('adIMAGE13LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_13_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE13LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_13_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE13LINKREQUIRED', x-property-mappings.get('AD_IMAGE_13_LINK_REQUIRED'));
        System.assertEquals('adIMAGE13LINKWARNING', x-property-mappings.get('AD_IMAGE_13_LINK_WARNING'));
        System.assertEquals('adIMAGE13TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_13_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE13TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_13_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE13TAGREQUIRED', x-property-mappings.get('AD_IMAGE_13_TAG_REQUIRED'));
        System.assertEquals('adIMAGE14LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_14_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE14LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_14_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE14LINKREQUIRED', x-property-mappings.get('AD_IMAGE_14_LINK_REQUIRED'));
        System.assertEquals('adIMAGE14LINKWARNING', x-property-mappings.get('AD_IMAGE_14_LINK_WARNING'));
        System.assertEquals('adIMAGE14TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_14_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE14TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_14_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE14TAGREQUIRED', x-property-mappings.get('AD_IMAGE_14_TAG_REQUIRED'));
        System.assertEquals('adIMAGE15LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_15_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE15LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_15_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE15LINKREQUIRED', x-property-mappings.get('AD_IMAGE_15_LINK_REQUIRED'));
        System.assertEquals('adIMAGE15LINKWARNING', x-property-mappings.get('AD_IMAGE_15_LINK_WARNING'));
        System.assertEquals('adIMAGE15TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_15_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE15TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_15_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE15TAGREQUIRED', x-property-mappings.get('AD_IMAGE_15_TAG_REQUIRED'));
        System.assertEquals('adIMAGE16LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_16_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE16LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_16_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE16LINKREQUIRED', x-property-mappings.get('AD_IMAGE_16_LINK_REQUIRED'));
        System.assertEquals('adIMAGE16LINKWARNING', x-property-mappings.get('AD_IMAGE_16_LINK_WARNING'));
        System.assertEquals('adIMAGE16TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_16_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE16TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_16_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE16TAGREQUIRED', x-property-mappings.get('AD_IMAGE_16_TAG_REQUIRED'));
        System.assertEquals('adIMAGE17LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_17_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE17LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_17_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE17LINKREQUIRED', x-property-mappings.get('AD_IMAGE_17_LINK_REQUIRED'));
        System.assertEquals('adIMAGE17LINKWARNING', x-property-mappings.get('AD_IMAGE_17_LINK_WARNING'));
        System.assertEquals('adIMAGE17TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_17_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE17TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_17_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE17TAGREQUIRED', x-property-mappings.get('AD_IMAGE_17_TAG_REQUIRED'));
        System.assertEquals('adIMAGE18LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_18_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE18LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_18_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE18LINKREQUIRED', x-property-mappings.get('AD_IMAGE_18_LINK_REQUIRED'));
        System.assertEquals('adIMAGE18LINKWARNING', x-property-mappings.get('AD_IMAGE_18_LINK_WARNING'));
        System.assertEquals('adIMAGE18TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_18_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE18TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_18_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE18TAGREQUIRED', x-property-mappings.get('AD_IMAGE_18_TAG_REQUIRED'));
        System.assertEquals('adIMAGE19LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_19_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE19LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_19_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE19LINKREQUIRED', x-property-mappings.get('AD_IMAGE_19_LINK_REQUIRED'));
        System.assertEquals('adIMAGE19LINKWARNING', x-property-mappings.get('AD_IMAGE_19_LINK_WARNING'));
        System.assertEquals('adIMAGE19TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_19_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE19TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_19_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE19TAGREQUIRED', x-property-mappings.get('AD_IMAGE_19_TAG_REQUIRED'));
        System.assertEquals('adIMAGE1LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_1_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE1LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_1_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE1LINKREQUIRED', x-property-mappings.get('AD_IMAGE_1_LINK_REQUIRED'));
        System.assertEquals('adIMAGE1LINKWARNING', x-property-mappings.get('AD_IMAGE_1_LINK_WARNING'));
        System.assertEquals('adIMAGE1TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_1_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE1TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_1_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE1TAGREQUIRED', x-property-mappings.get('AD_IMAGE_1_TAG_REQUIRED'));
        System.assertEquals('adIMAGE2LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_2_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE2LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_2_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE2LINKREQUIRED', x-property-mappings.get('AD_IMAGE_2_LINK_REQUIRED'));
        System.assertEquals('adIMAGE2LINKWARNING', x-property-mappings.get('AD_IMAGE_2_LINK_WARNING'));
        System.assertEquals('adIMAGE2TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_2_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE2TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_2_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE2TAGREQUIRED', x-property-mappings.get('AD_IMAGE_2_TAG_REQUIRED'));
        System.assertEquals('adIMAGE3LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_3_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE3LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_3_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE3LINKREQUIRED', x-property-mappings.get('AD_IMAGE_3_LINK_REQUIRED'));
        System.assertEquals('adIMAGE3LINKWARNING', x-property-mappings.get('AD_IMAGE_3_LINK_WARNING'));
        System.assertEquals('adIMAGE3TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_3_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE3TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_3_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE3TAGREQUIRED', x-property-mappings.get('AD_IMAGE_3_TAG_REQUIRED'));
        System.assertEquals('adIMAGE4LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_4_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE4LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_4_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE4LINKREQUIRED', x-property-mappings.get('AD_IMAGE_4_LINK_REQUIRED'));
        System.assertEquals('adIMAGE4LINKWARNING', x-property-mappings.get('AD_IMAGE_4_LINK_WARNING'));
        System.assertEquals('adIMAGE4TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_4_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE4TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_4_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE4TAGREQUIRED', x-property-mappings.get('AD_IMAGE_4_TAG_REQUIRED'));
        System.assertEquals('adIMAGE5LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_5_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE5LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_5_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE5LINKREQUIRED', x-property-mappings.get('AD_IMAGE_5_LINK_REQUIRED'));
        System.assertEquals('adIMAGE5LINKWARNING', x-property-mappings.get('AD_IMAGE_5_LINK_WARNING'));
        System.assertEquals('adIMAGE5TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_5_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE5TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_5_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE5TAGREQUIRED', x-property-mappings.get('AD_IMAGE_5_TAG_REQUIRED'));
        System.assertEquals('adIMAGE6LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_6_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE6LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_6_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE6LINKREQUIRED', x-property-mappings.get('AD_IMAGE_6_LINK_REQUIRED'));
        System.assertEquals('adIMAGE6LINKWARNING', x-property-mappings.get('AD_IMAGE_6_LINK_WARNING'));
        System.assertEquals('adIMAGE6TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_6_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE6TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_6_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE6TAGREQUIRED', x-property-mappings.get('AD_IMAGE_6_TAG_REQUIRED'));
        System.assertEquals('adIMAGE7LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_7_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE7LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_7_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE7LINKREQUIRED', x-property-mappings.get('AD_IMAGE_7_LINK_REQUIRED'));
        System.assertEquals('adIMAGE7LINKWARNING', x-property-mappings.get('AD_IMAGE_7_LINK_WARNING'));
        System.assertEquals('adIMAGE7TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_7_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE7TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_7_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE7TAGREQUIRED', x-property-mappings.get('AD_IMAGE_7_TAG_REQUIRED'));
        System.assertEquals('adIMAGE8LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_8_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE8LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_8_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE8LINKREQUIRED', x-property-mappings.get('AD_IMAGE_8_LINK_REQUIRED'));
        System.assertEquals('adIMAGE8LINKWARNING', x-property-mappings.get('AD_IMAGE_8_LINK_WARNING'));
        System.assertEquals('adIMAGE8TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_8_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE8TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_8_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE8TAGREQUIRED', x-property-mappings.get('AD_IMAGE_8_TAG_REQUIRED'));
        System.assertEquals('adIMAGE9LINKDUPLICATED', x-property-mappings.get('AD_IMAGE_9_LINK_DUPLICATED'));
        System.assertEquals('adIMAGE9LINKLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_9_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE9LINKREQUIRED', x-property-mappings.get('AD_IMAGE_9_LINK_REQUIRED'));
        System.assertEquals('adIMAGE9LINKWARNING', x-property-mappings.get('AD_IMAGE_9_LINK_WARNING'));
        System.assertEquals('adIMAGE9TAGDUPLICATED', x-property-mappings.get('AD_IMAGE_9_TAG_DUPLICATED'));
        System.assertEquals('adIMAGE9TAGLENGTHTOOLONG', x-property-mappings.get('AD_IMAGE_9_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adIMAGE9TAGREQUIRED', x-property-mappings.get('AD_IMAGE_9_TAG_REQUIRED'));
        System.assertEquals('adVIDEO0LINKDUPLICATED', x-property-mappings.get('AD_VIDEO_0_LINK_DUPLICATED'));
        System.assertEquals('adVIDEO0LINKLENGTHTOOLONG', x-property-mappings.get('AD_VIDEO_0_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adVIDEO0LINKREQUIRED', x-property-mappings.get('AD_VIDEO_0_LINK_REQUIRED'));
        System.assertEquals('adVIDEO0LINKWARNING', x-property-mappings.get('AD_VIDEO_0_LINK_WARNING'));
        System.assertEquals('adVIDEO0TAGDUPLICATED', x-property-mappings.get('AD_VIDEO_0_TAG_DUPLICATED'));
        System.assertEquals('adVIDEO0TAGLENGTHTOOLONG', x-property-mappings.get('AD_VIDEO_0_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adVIDEO0TAGREQUIRED', x-property-mappings.get('AD_VIDEO_0_TAG_REQUIRED'));
        System.assertEquals('adVIDEO1LINKDUPLICATED', x-property-mappings.get('AD_VIDEO_1_LINK_DUPLICATED'));
        System.assertEquals('adVIDEO1LINKLENGTHTOOLONG', x-property-mappings.get('AD_VIDEO_1_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adVIDEO1LINKREQUIRED', x-property-mappings.get('AD_VIDEO_1_LINK_REQUIRED'));
        System.assertEquals('adVIDEO1LINKWARNING', x-property-mappings.get('AD_VIDEO_1_LINK_WARNING'));
        System.assertEquals('adVIDEO1TAGDUPLICATED', x-property-mappings.get('AD_VIDEO_1_TAG_DUPLICATED'));
        System.assertEquals('adVIDEO1TAGLENGTHTOOLONG', x-property-mappings.get('AD_VIDEO_1_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adVIDEO1TAGREQUIRED', x-property-mappings.get('AD_VIDEO_1_TAG_REQUIRED'));
        System.assertEquals('adVIDEO2LINKDUPLICATED', x-property-mappings.get('AD_VIDEO_2_LINK_DUPLICATED'));
        System.assertEquals('adVIDEO2LINKLENGTHTOOLONG', x-property-mappings.get('AD_VIDEO_2_LINK_LENGTH_TOO_LONG'));
        System.assertEquals('adVIDEO2LINKREQUIRED', x-property-mappings.get('AD_VIDEO_2_LINK_REQUIRED'));
        System.assertEquals('adVIDEO2LINKWARNING', x-property-mappings.get('AD_VIDEO_2_LINK_WARNING'));
        System.assertEquals('adVIDEO2TAGDUPLICATED', x-property-mappings.get('AD_VIDEO_2_TAG_DUPLICATED'));
        System.assertEquals('adVIDEO2TAGLENGTHTOOLONG', x-property-mappings.get('AD_VIDEO_2_TAG_LENGTH_TOO_LONG'));
        System.assertEquals('adVIDEO2TAGREQUIRED', x-property-mappings.get('AD_VIDEO_2_TAG_REQUIRED'));
    }
}
