@isTest
private class OASConversionTagConfigsTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTagConfigs conversionTagConfigs1 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs2 = conversionTagConfigs1;
        OASConversionTagConfigs conversionTagConfigs3 = new OASConversionTagConfigs();
        OASConversionTagConfigs conversionTagConfigs4 = conversionTagConfigs3;

        System.assert(conversionTagConfigs1.equals(conversionTagConfigs2));
        System.assert(conversionTagConfigs2.equals(conversionTagConfigs1));
        System.assert(conversionTagConfigs1.equals(conversionTagConfigs1));
        System.assert(conversionTagConfigs3.equals(conversionTagConfigs4));
        System.assert(conversionTagConfigs4.equals(conversionTagConfigs3));
        System.assert(conversionTagConfigs3.equals(conversionTagConfigs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTagConfigs conversionTagConfigs1 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs2 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs3 = new OASConversionTagConfigs();
        OASConversionTagConfigs conversionTagConfigs4 = new OASConversionTagConfigs();

        System.assert(conversionTagConfigs1.equals(conversionTagConfigs2));
        System.assert(conversionTagConfigs2.equals(conversionTagConfigs1));
        System.assert(conversionTagConfigs3.equals(conversionTagConfigs4));
        System.assert(conversionTagConfigs4.equals(conversionTagConfigs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTagConfigs conversionTagConfigs1 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs2 = new OASConversionTagConfigs();

        System.assertEquals(false, conversionTagConfigs1.equals('foo'));
        System.assertEquals(false, conversionTagConfigs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTagConfigs conversionTagConfigs1 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs2 = new OASConversionTagConfigs();
        OASConversionTagConfigs conversionTagConfigs3;

        System.assertEquals(false, conversionTagConfigs1.equals(conversionTagConfigs3));
        System.assertEquals(false, conversionTagConfigs2.equals(conversionTagConfigs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTagConfigs conversionTagConfigs1 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs2 = new OASConversionTagConfigs();

        System.assertEquals(conversionTagConfigs1.hashCode(), conversionTagConfigs1.hashCode());
        System.assertEquals(conversionTagConfigs2.hashCode(), conversionTagConfigs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTagConfigs conversionTagConfigs1 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs2 = OASConversionTagConfigs.getExample();
        OASConversionTagConfigs conversionTagConfigs3 = new OASConversionTagConfigs();
        OASConversionTagConfigs conversionTagConfigs4 = new OASConversionTagConfigs();

        System.assert(conversionTagConfigs1.equals(conversionTagConfigs2));
        System.assert(conversionTagConfigs3.equals(conversionTagConfigs4));
        System.assertEquals(conversionTagConfigs1.hashCode(), conversionTagConfigs2.hashCode());
        System.assertEquals(conversionTagConfigs3.hashCode(), conversionTagConfigs4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionTagConfigs conversionTagConfigs = new OASConversionTagConfigs();
        Map<String, String> x-property-mappings = conversionTagConfigs.getx-property-mappings();
        System.assertEquals('aemEnabled', x-property-mappings.get('aem_enabled'));
        System.assertEquals('mdFrequency', x-property-mappings.get('md_frequency'));
        System.assertEquals('aemFnlnEnabled', x-property-mappings.get('aem_fnln_enabled'));
        System.assertEquals('aemPhEnabled', x-property-mappings.get('aem_ph_enabled'));
        System.assertEquals('aemGeEnabled', x-property-mappings.get('aem_ge_enabled'));
        System.assertEquals('aemDbEnabled', x-property-mappings.get('aem_db_enabled'));
        System.assertEquals('aemLocEnabled', x-property-mappings.get('aem_loc_enabled'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionTagConfigs conversionTagConfigs = new OASConversionTagConfigs();
        System.assertEquals(false, conversionTagConfigs.aemEnabled);
        System.assertEquals(1, conversionTagConfigs.mdFrequency);
        System.assertEquals(false, conversionTagConfigs.aemFnlnEnabled);
        System.assertEquals(false, conversionTagConfigs.aemPhEnabled);
        System.assertEquals(false, conversionTagConfigs.aemGeEnabled);
        System.assertEquals(false, conversionTagConfigs.aemDbEnabled);
        System.assertEquals(false, conversionTagConfigs.aemLocEnabled);
    }
}
