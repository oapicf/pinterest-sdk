@isTest
private class OASCustomNumber1FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomNumber1Filter customNumber1Filter1 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter2 = customNumber1Filter1;
        OASCustomNumber1Filter customNumber1Filter3 = new OASCustomNumber1Filter();
        OASCustomNumber1Filter customNumber1Filter4 = customNumber1Filter3;

        System.assert(customNumber1Filter1.equals(customNumber1Filter2));
        System.assert(customNumber1Filter2.equals(customNumber1Filter1));
        System.assert(customNumber1Filter1.equals(customNumber1Filter1));
        System.assert(customNumber1Filter3.equals(customNumber1Filter4));
        System.assert(customNumber1Filter4.equals(customNumber1Filter3));
        System.assert(customNumber1Filter3.equals(customNumber1Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomNumber1Filter customNumber1Filter1 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter2 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter3 = new OASCustomNumber1Filter();
        OASCustomNumber1Filter customNumber1Filter4 = new OASCustomNumber1Filter();

        System.assert(customNumber1Filter1.equals(customNumber1Filter2));
        System.assert(customNumber1Filter2.equals(customNumber1Filter1));
        System.assert(customNumber1Filter3.equals(customNumber1Filter4));
        System.assert(customNumber1Filter4.equals(customNumber1Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomNumber1Filter customNumber1Filter1 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter2 = new OASCustomNumber1Filter();

        System.assertEquals(false, customNumber1Filter1.equals('foo'));
        System.assertEquals(false, customNumber1Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomNumber1Filter customNumber1Filter1 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter2 = new OASCustomNumber1Filter();
        OASCustomNumber1Filter customNumber1Filter3;

        System.assertEquals(false, customNumber1Filter1.equals(customNumber1Filter3));
        System.assertEquals(false, customNumber1Filter2.equals(customNumber1Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomNumber1Filter customNumber1Filter1 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter2 = new OASCustomNumber1Filter();

        System.assertEquals(customNumber1Filter1.hashCode(), customNumber1Filter1.hashCode());
        System.assertEquals(customNumber1Filter2.hashCode(), customNumber1Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomNumber1Filter customNumber1Filter1 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter2 = OASCustomNumber1Filter.getExample();
        OASCustomNumber1Filter customNumber1Filter3 = new OASCustomNumber1Filter();
        OASCustomNumber1Filter customNumber1Filter4 = new OASCustomNumber1Filter();

        System.assert(customNumber1Filter1.equals(customNumber1Filter2));
        System.assert(customNumber1Filter3.equals(customNumber1Filter4));
        System.assertEquals(customNumber1Filter1.hashCode(), customNumber1Filter2.hashCode());
        System.assertEquals(customNumber1Filter3.hashCode(), customNumber1Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomNumber1Filter customNumber1Filter = new OASCustomNumber1Filter();
        Map<String, String> x-property-mappings = customNumber1Filter.getx-property-mappings();
        System.assertEquals('cuSTOMNUMBER1', x-property-mappings.get('CUSTOM_NUMBER_1'));
    }
}
