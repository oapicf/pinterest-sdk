@isTest
private class OASConversionEventAppInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventAppInfo conversionEventAppInfo1 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo2 = conversionEventAppInfo1;
        OASConversionEventAppInfo conversionEventAppInfo3 = new OASConversionEventAppInfo();
        OASConversionEventAppInfo conversionEventAppInfo4 = conversionEventAppInfo3;

        System.assert(conversionEventAppInfo1.equals(conversionEventAppInfo2));
        System.assert(conversionEventAppInfo2.equals(conversionEventAppInfo1));
        System.assert(conversionEventAppInfo1.equals(conversionEventAppInfo1));
        System.assert(conversionEventAppInfo3.equals(conversionEventAppInfo4));
        System.assert(conversionEventAppInfo4.equals(conversionEventAppInfo3));
        System.assert(conversionEventAppInfo3.equals(conversionEventAppInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventAppInfo conversionEventAppInfo1 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo2 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo3 = new OASConversionEventAppInfo();
        OASConversionEventAppInfo conversionEventAppInfo4 = new OASConversionEventAppInfo();

        System.assert(conversionEventAppInfo1.equals(conversionEventAppInfo2));
        System.assert(conversionEventAppInfo2.equals(conversionEventAppInfo1));
        System.assert(conversionEventAppInfo3.equals(conversionEventAppInfo4));
        System.assert(conversionEventAppInfo4.equals(conversionEventAppInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventAppInfo conversionEventAppInfo1 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo2 = new OASConversionEventAppInfo();

        System.assertEquals(false, conversionEventAppInfo1.equals('foo'));
        System.assertEquals(false, conversionEventAppInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventAppInfo conversionEventAppInfo1 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo2 = new OASConversionEventAppInfo();
        OASConversionEventAppInfo conversionEventAppInfo3;

        System.assertEquals(false, conversionEventAppInfo1.equals(conversionEventAppInfo3));
        System.assertEquals(false, conversionEventAppInfo2.equals(conversionEventAppInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventAppInfo conversionEventAppInfo1 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo2 = new OASConversionEventAppInfo();

        System.assertEquals(conversionEventAppInfo1.hashCode(), conversionEventAppInfo1.hashCode());
        System.assertEquals(conversionEventAppInfo2.hashCode(), conversionEventAppInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventAppInfo conversionEventAppInfo1 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo2 = OASConversionEventAppInfo.getExample();
        OASConversionEventAppInfo conversionEventAppInfo3 = new OASConversionEventAppInfo();
        OASConversionEventAppInfo conversionEventAppInfo4 = new OASConversionEventAppInfo();

        System.assert(conversionEventAppInfo1.equals(conversionEventAppInfo2));
        System.assert(conversionEventAppInfo3.equals(conversionEventAppInfo4));
        System.assertEquals(conversionEventAppInfo1.hashCode(), conversionEventAppInfo2.hashCode());
        System.assertEquals(conversionEventAppInfo3.hashCode(), conversionEventAppInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventAppInfo conversionEventAppInfo = new OASConversionEventAppInfo();
        Map<String, String> x-property-mappings = conversionEventAppInfo.getx-property-mappings();
        System.assertEquals('appId', x-property-mappings.get('app_id'));
        System.assertEquals('appName', x-property-mappings.get('app_name'));
        System.assertEquals('appPackageName', x-property-mappings.get('app_package_name'));
        System.assertEquals('appStore', x-property-mappings.get('app_store'));
        System.assertEquals('appVersion', x-property-mappings.get('app_version'));
        System.assertEquals('installTime', x-property-mappings.get('install_time'));
        System.assertEquals('userAgent', x-property-mappings.get('user_agent'));
        System.assertEquals('windowHeight', x-property-mappings.get('window_height'));
        System.assertEquals('windowWidth', x-property-mappings.get('window_width'));
    }
}
