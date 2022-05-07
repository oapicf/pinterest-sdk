@isTest
private class OASCustomLabel1FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomLabel1Filter customLabel1Filter1 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter2 = customLabel1Filter1;
        OASCustomLabel1Filter customLabel1Filter3 = new OASCustomLabel1Filter();
        OASCustomLabel1Filter customLabel1Filter4 = customLabel1Filter3;

        System.assert(customLabel1Filter1.equals(customLabel1Filter2));
        System.assert(customLabel1Filter2.equals(customLabel1Filter1));
        System.assert(customLabel1Filter1.equals(customLabel1Filter1));
        System.assert(customLabel1Filter3.equals(customLabel1Filter4));
        System.assert(customLabel1Filter4.equals(customLabel1Filter3));
        System.assert(customLabel1Filter3.equals(customLabel1Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomLabel1Filter customLabel1Filter1 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter2 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter3 = new OASCustomLabel1Filter();
        OASCustomLabel1Filter customLabel1Filter4 = new OASCustomLabel1Filter();

        System.assert(customLabel1Filter1.equals(customLabel1Filter2));
        System.assert(customLabel1Filter2.equals(customLabel1Filter1));
        System.assert(customLabel1Filter3.equals(customLabel1Filter4));
        System.assert(customLabel1Filter4.equals(customLabel1Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomLabel1Filter customLabel1Filter1 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter2 = new OASCustomLabel1Filter();

        System.assertEquals(false, customLabel1Filter1.equals('foo'));
        System.assertEquals(false, customLabel1Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomLabel1Filter customLabel1Filter1 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter2 = new OASCustomLabel1Filter();
        OASCustomLabel1Filter customLabel1Filter3;

        System.assertEquals(false, customLabel1Filter1.equals(customLabel1Filter3));
        System.assertEquals(false, customLabel1Filter2.equals(customLabel1Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomLabel1Filter customLabel1Filter1 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter2 = new OASCustomLabel1Filter();

        System.assertEquals(customLabel1Filter1.hashCode(), customLabel1Filter1.hashCode());
        System.assertEquals(customLabel1Filter2.hashCode(), customLabel1Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomLabel1Filter customLabel1Filter1 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter2 = OASCustomLabel1Filter.getExample();
        OASCustomLabel1Filter customLabel1Filter3 = new OASCustomLabel1Filter();
        OASCustomLabel1Filter customLabel1Filter4 = new OASCustomLabel1Filter();

        System.assert(customLabel1Filter1.equals(customLabel1Filter2));
        System.assert(customLabel1Filter3.equals(customLabel1Filter4));
        System.assertEquals(customLabel1Filter1.hashCode(), customLabel1Filter2.hashCode());
        System.assertEquals(customLabel1Filter3.hashCode(), customLabel1Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomLabel1Filter customLabel1Filter = new OASCustomLabel1Filter();
        Map<String, String> x-property-mappings = customLabel1Filter.getx-property-mappings();
        System.assertEquals('cuSTOMLABEL1', x-property-mappings.get('CUSTOM_LABEL_1'));
    }
}
