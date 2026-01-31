@isTest
private class OASConversionEventDeviceInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo1 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo2 = conversionEventDeviceInfo1;
        OASConversionEventDeviceInfo conversionEventDeviceInfo3 = new OASConversionEventDeviceInfo();
        OASConversionEventDeviceInfo conversionEventDeviceInfo4 = conversionEventDeviceInfo3;

        System.assert(conversionEventDeviceInfo1.equals(conversionEventDeviceInfo2));
        System.assert(conversionEventDeviceInfo2.equals(conversionEventDeviceInfo1));
        System.assert(conversionEventDeviceInfo1.equals(conversionEventDeviceInfo1));
        System.assert(conversionEventDeviceInfo3.equals(conversionEventDeviceInfo4));
        System.assert(conversionEventDeviceInfo4.equals(conversionEventDeviceInfo3));
        System.assert(conversionEventDeviceInfo3.equals(conversionEventDeviceInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo1 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo2 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo3 = new OASConversionEventDeviceInfo();
        OASConversionEventDeviceInfo conversionEventDeviceInfo4 = new OASConversionEventDeviceInfo();

        System.assert(conversionEventDeviceInfo1.equals(conversionEventDeviceInfo2));
        System.assert(conversionEventDeviceInfo2.equals(conversionEventDeviceInfo1));
        System.assert(conversionEventDeviceInfo3.equals(conversionEventDeviceInfo4));
        System.assert(conversionEventDeviceInfo4.equals(conversionEventDeviceInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo1 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo2 = new OASConversionEventDeviceInfo();

        System.assertEquals(false, conversionEventDeviceInfo1.equals('foo'));
        System.assertEquals(false, conversionEventDeviceInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo1 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo2 = new OASConversionEventDeviceInfo();
        OASConversionEventDeviceInfo conversionEventDeviceInfo3;

        System.assertEquals(false, conversionEventDeviceInfo1.equals(conversionEventDeviceInfo3));
        System.assertEquals(false, conversionEventDeviceInfo2.equals(conversionEventDeviceInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo1 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo2 = new OASConversionEventDeviceInfo();

        System.assertEquals(conversionEventDeviceInfo1.hashCode(), conversionEventDeviceInfo1.hashCode());
        System.assertEquals(conversionEventDeviceInfo2.hashCode(), conversionEventDeviceInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo1 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo2 = OASConversionEventDeviceInfo.getExample();
        OASConversionEventDeviceInfo conversionEventDeviceInfo3 = new OASConversionEventDeviceInfo();
        OASConversionEventDeviceInfo conversionEventDeviceInfo4 = new OASConversionEventDeviceInfo();

        System.assert(conversionEventDeviceInfo1.equals(conversionEventDeviceInfo2));
        System.assert(conversionEventDeviceInfo3.equals(conversionEventDeviceInfo4));
        System.assertEquals(conversionEventDeviceInfo1.hashCode(), conversionEventDeviceInfo2.hashCode());
        System.assertEquals(conversionEventDeviceInfo3.hashCode(), conversionEventDeviceInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo = new OASConversionEventDeviceInfo();
        Map<String, String> x-property-mappings = conversionEventDeviceInfo.getx-property-mappings();
        System.assertEquals('batteryLevel', x-property-mappings.get('battery_level'));
        System.assertEquals('cpuCores', x-property-mappings.get('cpu_cores'));
        System.assertEquals('externalStorageFreeSpace', x-property-mappings.get('external_storage_free_space'));
        System.assertEquals('externalStorageSize', x-property-mappings.get('external_storage_size'));
        System.assertEquals('formFactor', x-property-mappings.get('form_factor'));
        System.assertEquals('kernelVersion', x-property-mappings.get('kernel_version'));
        System.assertEquals('networkType', x-property-mappings.get('network_type'));
        System.assertEquals('osFamily', x-property-mappings.get('os_family'));
        System.assertEquals('osName', x-property-mappings.get('os_name'));
        System.assertEquals('osReleaseName', x-property-mappings.get('os_release_name'));
        System.assertEquals('osVersion', x-property-mappings.get('os_version'));
        System.assertEquals('screenDensity', x-property-mappings.get('screen_density'));
        System.assertEquals('screenHeight', x-property-mappings.get('screen_height'));
        System.assertEquals('screenWidth', x-property-mappings.get('screen_width'));
        System.assertEquals('storageFreeSpace', x-property-mappings.get('storage_free_space'));
        System.assertEquals('storageSize', x-property-mappings.get('storage_size'));
        System.assertEquals('timezoneAbbr', x-property-mappings.get('timezone_abbr'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventDeviceInfo conversionEventDeviceInfo = new OASConversionEventDeviceInfo();
        System.assertEquals(new List<String>(), conversionEventDeviceInfo.languages);
        System.assertEquals(null, conversionEventDeviceInfo.batteryLevel);
        System.assertEquals(null, conversionEventDeviceInfo.brand);
        System.assertEquals(null, conversionEventDeviceInfo.carrier);
        System.assertEquals(null, conversionEventDeviceInfo.cpuCores);
        System.assertEquals(null, conversionEventDeviceInfo.externalStorageFreeSpace);
        System.assertEquals(null, conversionEventDeviceInfo.externalStorageSize);
        System.assertEquals(null, conversionEventDeviceInfo.formFactor);
        System.assertEquals(null, conversionEventDeviceInfo.kernelVersion);
        System.assertEquals(null, conversionEventDeviceInfo.locale);
        System.assertEquals(null, conversionEventDeviceInfo.model);
        System.assertEquals(null, conversionEventDeviceInfo.networkType);
        System.assertEquals(null, conversionEventDeviceInfo.osFamily);
        System.assertEquals(null, conversionEventDeviceInfo.osName);
        System.assertEquals(null, conversionEventDeviceInfo.osReleaseName);
        System.assertEquals(null, conversionEventDeviceInfo.osVersion);
        System.assertEquals(null, conversionEventDeviceInfo.screenDensity);
        System.assertEquals(null, conversionEventDeviceInfo.screenHeight);
        System.assertEquals(null, conversionEventDeviceInfo.screenWidth);
        System.assertEquals(null, conversionEventDeviceInfo.storageFreeSpace);
        System.assertEquals(null, conversionEventDeviceInfo.storageSize);
        System.assertEquals(null, conversionEventDeviceInfo.timezone);
        System.assertEquals(null, conversionEventDeviceInfo.timezoneAbbr);
        System.assertEquals(null, conversionEventDeviceInfo.type);
    }
}
