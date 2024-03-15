@isTest
private class OASConversionTagCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTagCreate conversionTagCreate1 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate2 = conversionTagCreate1;
        OASConversionTagCreate conversionTagCreate3 = new OASConversionTagCreate();
        OASConversionTagCreate conversionTagCreate4 = conversionTagCreate3;

        System.assert(conversionTagCreate1.equals(conversionTagCreate2));
        System.assert(conversionTagCreate2.equals(conversionTagCreate1));
        System.assert(conversionTagCreate1.equals(conversionTagCreate1));
        System.assert(conversionTagCreate3.equals(conversionTagCreate4));
        System.assert(conversionTagCreate4.equals(conversionTagCreate3));
        System.assert(conversionTagCreate3.equals(conversionTagCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTagCreate conversionTagCreate1 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate2 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate3 = new OASConversionTagCreate();
        OASConversionTagCreate conversionTagCreate4 = new OASConversionTagCreate();

        System.assert(conversionTagCreate1.equals(conversionTagCreate2));
        System.assert(conversionTagCreate2.equals(conversionTagCreate1));
        System.assert(conversionTagCreate3.equals(conversionTagCreate4));
        System.assert(conversionTagCreate4.equals(conversionTagCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTagCreate conversionTagCreate1 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate2 = new OASConversionTagCreate();

        System.assertEquals(false, conversionTagCreate1.equals('foo'));
        System.assertEquals(false, conversionTagCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTagCreate conversionTagCreate1 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate2 = new OASConversionTagCreate();
        OASConversionTagCreate conversionTagCreate3;

        System.assertEquals(false, conversionTagCreate1.equals(conversionTagCreate3));
        System.assertEquals(false, conversionTagCreate2.equals(conversionTagCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTagCreate conversionTagCreate1 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate2 = new OASConversionTagCreate();

        System.assertEquals(conversionTagCreate1.hashCode(), conversionTagCreate1.hashCode());
        System.assertEquals(conversionTagCreate2.hashCode(), conversionTagCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTagCreate conversionTagCreate1 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate2 = OASConversionTagCreate.getExample();
        OASConversionTagCreate conversionTagCreate3 = new OASConversionTagCreate();
        OASConversionTagCreate conversionTagCreate4 = new OASConversionTagCreate();

        System.assert(conversionTagCreate1.equals(conversionTagCreate2));
        System.assert(conversionTagCreate3.equals(conversionTagCreate4));
        System.assertEquals(conversionTagCreate1.hashCode(), conversionTagCreate2.hashCode());
        System.assertEquals(conversionTagCreate3.hashCode(), conversionTagCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionTagCreate conversionTagCreate = new OASConversionTagCreate();
        Map<String, String> x-property-mappings = conversionTagCreate.getx-property-mappings();
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
        OASConversionTagCreate conversionTagCreate = new OASConversionTagCreate();
        System.assertEquals(false, conversionTagCreate.aemEnabled);
        System.assertEquals(1, conversionTagCreate.mdFrequency);
        System.assertEquals(false, conversionTagCreate.aemFnlnEnabled);
        System.assertEquals(false, conversionTagCreate.aemPhEnabled);
        System.assertEquals(false, conversionTagCreate.aemGeEnabled);
        System.assertEquals(false, conversionTagCreate.aemDbEnabled);
        System.assertEquals(false, conversionTagCreate.aemLocEnabled);
        System.assertEquals(null, conversionTagCreate.name);
    }
}
