@isTest
private class OASCustomLabel2FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomLabel2Filter customLabel2Filter1 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter2 = customLabel2Filter1;
        OASCustomLabel2Filter customLabel2Filter3 = new OASCustomLabel2Filter();
        OASCustomLabel2Filter customLabel2Filter4 = customLabel2Filter3;

        System.assert(customLabel2Filter1.equals(customLabel2Filter2));
        System.assert(customLabel2Filter2.equals(customLabel2Filter1));
        System.assert(customLabel2Filter1.equals(customLabel2Filter1));
        System.assert(customLabel2Filter3.equals(customLabel2Filter4));
        System.assert(customLabel2Filter4.equals(customLabel2Filter3));
        System.assert(customLabel2Filter3.equals(customLabel2Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomLabel2Filter customLabel2Filter1 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter2 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter3 = new OASCustomLabel2Filter();
        OASCustomLabel2Filter customLabel2Filter4 = new OASCustomLabel2Filter();

        System.assert(customLabel2Filter1.equals(customLabel2Filter2));
        System.assert(customLabel2Filter2.equals(customLabel2Filter1));
        System.assert(customLabel2Filter3.equals(customLabel2Filter4));
        System.assert(customLabel2Filter4.equals(customLabel2Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomLabel2Filter customLabel2Filter1 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter2 = new OASCustomLabel2Filter();

        System.assertEquals(false, customLabel2Filter1.equals('foo'));
        System.assertEquals(false, customLabel2Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomLabel2Filter customLabel2Filter1 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter2 = new OASCustomLabel2Filter();
        OASCustomLabel2Filter customLabel2Filter3;

        System.assertEquals(false, customLabel2Filter1.equals(customLabel2Filter3));
        System.assertEquals(false, customLabel2Filter2.equals(customLabel2Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomLabel2Filter customLabel2Filter1 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter2 = new OASCustomLabel2Filter();

        System.assertEquals(customLabel2Filter1.hashCode(), customLabel2Filter1.hashCode());
        System.assertEquals(customLabel2Filter2.hashCode(), customLabel2Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomLabel2Filter customLabel2Filter1 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter2 = OASCustomLabel2Filter.getExample();
        OASCustomLabel2Filter customLabel2Filter3 = new OASCustomLabel2Filter();
        OASCustomLabel2Filter customLabel2Filter4 = new OASCustomLabel2Filter();

        System.assert(customLabel2Filter1.equals(customLabel2Filter2));
        System.assert(customLabel2Filter3.equals(customLabel2Filter4));
        System.assertEquals(customLabel2Filter1.hashCode(), customLabel2Filter2.hashCode());
        System.assertEquals(customLabel2Filter3.hashCode(), customLabel2Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomLabel2Filter customLabel2Filter = new OASCustomLabel2Filter();
        Map<String, String> x-property-mappings = customLabel2Filter.getx-property-mappings();
        System.assertEquals('cuSTOMLABEL2', x-property-mappings.get('CUSTOM_LABEL_2'));
    }
}
