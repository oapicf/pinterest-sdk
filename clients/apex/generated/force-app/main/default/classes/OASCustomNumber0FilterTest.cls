@isTest
private class OASCustomNumber0FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomNumber0Filter customNumber0Filter1 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter2 = customNumber0Filter1;
        OASCustomNumber0Filter customNumber0Filter3 = new OASCustomNumber0Filter();
        OASCustomNumber0Filter customNumber0Filter4 = customNumber0Filter3;

        System.assert(customNumber0Filter1.equals(customNumber0Filter2));
        System.assert(customNumber0Filter2.equals(customNumber0Filter1));
        System.assert(customNumber0Filter1.equals(customNumber0Filter1));
        System.assert(customNumber0Filter3.equals(customNumber0Filter4));
        System.assert(customNumber0Filter4.equals(customNumber0Filter3));
        System.assert(customNumber0Filter3.equals(customNumber0Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomNumber0Filter customNumber0Filter1 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter2 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter3 = new OASCustomNumber0Filter();
        OASCustomNumber0Filter customNumber0Filter4 = new OASCustomNumber0Filter();

        System.assert(customNumber0Filter1.equals(customNumber0Filter2));
        System.assert(customNumber0Filter2.equals(customNumber0Filter1));
        System.assert(customNumber0Filter3.equals(customNumber0Filter4));
        System.assert(customNumber0Filter4.equals(customNumber0Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomNumber0Filter customNumber0Filter1 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter2 = new OASCustomNumber0Filter();

        System.assertEquals(false, customNumber0Filter1.equals('foo'));
        System.assertEquals(false, customNumber0Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomNumber0Filter customNumber0Filter1 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter2 = new OASCustomNumber0Filter();
        OASCustomNumber0Filter customNumber0Filter3;

        System.assertEquals(false, customNumber0Filter1.equals(customNumber0Filter3));
        System.assertEquals(false, customNumber0Filter2.equals(customNumber0Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomNumber0Filter customNumber0Filter1 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter2 = new OASCustomNumber0Filter();

        System.assertEquals(customNumber0Filter1.hashCode(), customNumber0Filter1.hashCode());
        System.assertEquals(customNumber0Filter2.hashCode(), customNumber0Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomNumber0Filter customNumber0Filter1 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter2 = OASCustomNumber0Filter.getExample();
        OASCustomNumber0Filter customNumber0Filter3 = new OASCustomNumber0Filter();
        OASCustomNumber0Filter customNumber0Filter4 = new OASCustomNumber0Filter();

        System.assert(customNumber0Filter1.equals(customNumber0Filter2));
        System.assert(customNumber0Filter3.equals(customNumber0Filter4));
        System.assertEquals(customNumber0Filter1.hashCode(), customNumber0Filter2.hashCode());
        System.assertEquals(customNumber0Filter3.hashCode(), customNumber0Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomNumber0Filter customNumber0Filter = new OASCustomNumber0Filter();
        Map<String, String> x-property-mappings = customNumber0Filter.getx-property-mappings();
        System.assertEquals('cuSTOMNUMBER0', x-property-mappings.get('CUSTOM_NUMBER_0'));
    }
}
