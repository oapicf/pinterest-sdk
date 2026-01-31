@isTest
private class OASCustomNumber2FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomNumber2Filter customNumber2Filter1 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter2 = customNumber2Filter1;
        OASCustomNumber2Filter customNumber2Filter3 = new OASCustomNumber2Filter();
        OASCustomNumber2Filter customNumber2Filter4 = customNumber2Filter3;

        System.assert(customNumber2Filter1.equals(customNumber2Filter2));
        System.assert(customNumber2Filter2.equals(customNumber2Filter1));
        System.assert(customNumber2Filter1.equals(customNumber2Filter1));
        System.assert(customNumber2Filter3.equals(customNumber2Filter4));
        System.assert(customNumber2Filter4.equals(customNumber2Filter3));
        System.assert(customNumber2Filter3.equals(customNumber2Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomNumber2Filter customNumber2Filter1 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter2 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter3 = new OASCustomNumber2Filter();
        OASCustomNumber2Filter customNumber2Filter4 = new OASCustomNumber2Filter();

        System.assert(customNumber2Filter1.equals(customNumber2Filter2));
        System.assert(customNumber2Filter2.equals(customNumber2Filter1));
        System.assert(customNumber2Filter3.equals(customNumber2Filter4));
        System.assert(customNumber2Filter4.equals(customNumber2Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomNumber2Filter customNumber2Filter1 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter2 = new OASCustomNumber2Filter();

        System.assertEquals(false, customNumber2Filter1.equals('foo'));
        System.assertEquals(false, customNumber2Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomNumber2Filter customNumber2Filter1 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter2 = new OASCustomNumber2Filter();
        OASCustomNumber2Filter customNumber2Filter3;

        System.assertEquals(false, customNumber2Filter1.equals(customNumber2Filter3));
        System.assertEquals(false, customNumber2Filter2.equals(customNumber2Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomNumber2Filter customNumber2Filter1 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter2 = new OASCustomNumber2Filter();

        System.assertEquals(customNumber2Filter1.hashCode(), customNumber2Filter1.hashCode());
        System.assertEquals(customNumber2Filter2.hashCode(), customNumber2Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomNumber2Filter customNumber2Filter1 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter2 = OASCustomNumber2Filter.getExample();
        OASCustomNumber2Filter customNumber2Filter3 = new OASCustomNumber2Filter();
        OASCustomNumber2Filter customNumber2Filter4 = new OASCustomNumber2Filter();

        System.assert(customNumber2Filter1.equals(customNumber2Filter2));
        System.assert(customNumber2Filter3.equals(customNumber2Filter4));
        System.assertEquals(customNumber2Filter1.hashCode(), customNumber2Filter2.hashCode());
        System.assertEquals(customNumber2Filter3.hashCode(), customNumber2Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomNumber2Filter customNumber2Filter = new OASCustomNumber2Filter();
        Map<String, String> x-property-mappings = customNumber2Filter.getx-property-mappings();
        System.assertEquals('cuSTOMNUMBER2', x-property-mappings.get('CUSTOM_NUMBER_2'));
    }
}
