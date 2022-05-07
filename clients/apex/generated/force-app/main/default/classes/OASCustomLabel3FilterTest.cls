@isTest
private class OASCustomLabel3FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomLabel3Filter customLabel3Filter1 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter2 = customLabel3Filter1;
        OASCustomLabel3Filter customLabel3Filter3 = new OASCustomLabel3Filter();
        OASCustomLabel3Filter customLabel3Filter4 = customLabel3Filter3;

        System.assert(customLabel3Filter1.equals(customLabel3Filter2));
        System.assert(customLabel3Filter2.equals(customLabel3Filter1));
        System.assert(customLabel3Filter1.equals(customLabel3Filter1));
        System.assert(customLabel3Filter3.equals(customLabel3Filter4));
        System.assert(customLabel3Filter4.equals(customLabel3Filter3));
        System.assert(customLabel3Filter3.equals(customLabel3Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomLabel3Filter customLabel3Filter1 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter2 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter3 = new OASCustomLabel3Filter();
        OASCustomLabel3Filter customLabel3Filter4 = new OASCustomLabel3Filter();

        System.assert(customLabel3Filter1.equals(customLabel3Filter2));
        System.assert(customLabel3Filter2.equals(customLabel3Filter1));
        System.assert(customLabel3Filter3.equals(customLabel3Filter4));
        System.assert(customLabel3Filter4.equals(customLabel3Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomLabel3Filter customLabel3Filter1 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter2 = new OASCustomLabel3Filter();

        System.assertEquals(false, customLabel3Filter1.equals('foo'));
        System.assertEquals(false, customLabel3Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomLabel3Filter customLabel3Filter1 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter2 = new OASCustomLabel3Filter();
        OASCustomLabel3Filter customLabel3Filter3;

        System.assertEquals(false, customLabel3Filter1.equals(customLabel3Filter3));
        System.assertEquals(false, customLabel3Filter2.equals(customLabel3Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomLabel3Filter customLabel3Filter1 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter2 = new OASCustomLabel3Filter();

        System.assertEquals(customLabel3Filter1.hashCode(), customLabel3Filter1.hashCode());
        System.assertEquals(customLabel3Filter2.hashCode(), customLabel3Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomLabel3Filter customLabel3Filter1 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter2 = OASCustomLabel3Filter.getExample();
        OASCustomLabel3Filter customLabel3Filter3 = new OASCustomLabel3Filter();
        OASCustomLabel3Filter customLabel3Filter4 = new OASCustomLabel3Filter();

        System.assert(customLabel3Filter1.equals(customLabel3Filter2));
        System.assert(customLabel3Filter3.equals(customLabel3Filter4));
        System.assertEquals(customLabel3Filter1.hashCode(), customLabel3Filter2.hashCode());
        System.assertEquals(customLabel3Filter3.hashCode(), customLabel3Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomLabel3Filter customLabel3Filter = new OASCustomLabel3Filter();
        Map<String, String> x-property-mappings = customLabel3Filter.getx-property-mappings();
        System.assertEquals('cuSTOMLABEL3', x-property-mappings.get('CUSTOM_LABEL_3'));
    }
}
