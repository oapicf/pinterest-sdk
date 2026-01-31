@isTest
private class OASCustomNumber3FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomNumber3Filter customNumber3Filter1 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter2 = customNumber3Filter1;
        OASCustomNumber3Filter customNumber3Filter3 = new OASCustomNumber3Filter();
        OASCustomNumber3Filter customNumber3Filter4 = customNumber3Filter3;

        System.assert(customNumber3Filter1.equals(customNumber3Filter2));
        System.assert(customNumber3Filter2.equals(customNumber3Filter1));
        System.assert(customNumber3Filter1.equals(customNumber3Filter1));
        System.assert(customNumber3Filter3.equals(customNumber3Filter4));
        System.assert(customNumber3Filter4.equals(customNumber3Filter3));
        System.assert(customNumber3Filter3.equals(customNumber3Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomNumber3Filter customNumber3Filter1 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter2 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter3 = new OASCustomNumber3Filter();
        OASCustomNumber3Filter customNumber3Filter4 = new OASCustomNumber3Filter();

        System.assert(customNumber3Filter1.equals(customNumber3Filter2));
        System.assert(customNumber3Filter2.equals(customNumber3Filter1));
        System.assert(customNumber3Filter3.equals(customNumber3Filter4));
        System.assert(customNumber3Filter4.equals(customNumber3Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomNumber3Filter customNumber3Filter1 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter2 = new OASCustomNumber3Filter();

        System.assertEquals(false, customNumber3Filter1.equals('foo'));
        System.assertEquals(false, customNumber3Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomNumber3Filter customNumber3Filter1 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter2 = new OASCustomNumber3Filter();
        OASCustomNumber3Filter customNumber3Filter3;

        System.assertEquals(false, customNumber3Filter1.equals(customNumber3Filter3));
        System.assertEquals(false, customNumber3Filter2.equals(customNumber3Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomNumber3Filter customNumber3Filter1 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter2 = new OASCustomNumber3Filter();

        System.assertEquals(customNumber3Filter1.hashCode(), customNumber3Filter1.hashCode());
        System.assertEquals(customNumber3Filter2.hashCode(), customNumber3Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomNumber3Filter customNumber3Filter1 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter2 = OASCustomNumber3Filter.getExample();
        OASCustomNumber3Filter customNumber3Filter3 = new OASCustomNumber3Filter();
        OASCustomNumber3Filter customNumber3Filter4 = new OASCustomNumber3Filter();

        System.assert(customNumber3Filter1.equals(customNumber3Filter2));
        System.assert(customNumber3Filter3.equals(customNumber3Filter4));
        System.assertEquals(customNumber3Filter1.hashCode(), customNumber3Filter2.hashCode());
        System.assertEquals(customNumber3Filter3.hashCode(), customNumber3Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomNumber3Filter customNumber3Filter = new OASCustomNumber3Filter();
        Map<String, String> x-property-mappings = customNumber3Filter.getx-property-mappings();
        System.assertEquals('cuSTOMNUMBER3', x-property-mappings.get('CUSTOM_NUMBER_3'));
    }
}
