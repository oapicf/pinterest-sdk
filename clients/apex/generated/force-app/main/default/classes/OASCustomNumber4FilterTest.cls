@isTest
private class OASCustomNumber4FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomNumber4Filter customNumber4Filter1 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter2 = customNumber4Filter1;
        OASCustomNumber4Filter customNumber4Filter3 = new OASCustomNumber4Filter();
        OASCustomNumber4Filter customNumber4Filter4 = customNumber4Filter3;

        System.assert(customNumber4Filter1.equals(customNumber4Filter2));
        System.assert(customNumber4Filter2.equals(customNumber4Filter1));
        System.assert(customNumber4Filter1.equals(customNumber4Filter1));
        System.assert(customNumber4Filter3.equals(customNumber4Filter4));
        System.assert(customNumber4Filter4.equals(customNumber4Filter3));
        System.assert(customNumber4Filter3.equals(customNumber4Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomNumber4Filter customNumber4Filter1 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter2 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter3 = new OASCustomNumber4Filter();
        OASCustomNumber4Filter customNumber4Filter4 = new OASCustomNumber4Filter();

        System.assert(customNumber4Filter1.equals(customNumber4Filter2));
        System.assert(customNumber4Filter2.equals(customNumber4Filter1));
        System.assert(customNumber4Filter3.equals(customNumber4Filter4));
        System.assert(customNumber4Filter4.equals(customNumber4Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomNumber4Filter customNumber4Filter1 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter2 = new OASCustomNumber4Filter();

        System.assertEquals(false, customNumber4Filter1.equals('foo'));
        System.assertEquals(false, customNumber4Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomNumber4Filter customNumber4Filter1 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter2 = new OASCustomNumber4Filter();
        OASCustomNumber4Filter customNumber4Filter3;

        System.assertEquals(false, customNumber4Filter1.equals(customNumber4Filter3));
        System.assertEquals(false, customNumber4Filter2.equals(customNumber4Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomNumber4Filter customNumber4Filter1 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter2 = new OASCustomNumber4Filter();

        System.assertEquals(customNumber4Filter1.hashCode(), customNumber4Filter1.hashCode());
        System.assertEquals(customNumber4Filter2.hashCode(), customNumber4Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomNumber4Filter customNumber4Filter1 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter2 = OASCustomNumber4Filter.getExample();
        OASCustomNumber4Filter customNumber4Filter3 = new OASCustomNumber4Filter();
        OASCustomNumber4Filter customNumber4Filter4 = new OASCustomNumber4Filter();

        System.assert(customNumber4Filter1.equals(customNumber4Filter2));
        System.assert(customNumber4Filter3.equals(customNumber4Filter4));
        System.assertEquals(customNumber4Filter1.hashCode(), customNumber4Filter2.hashCode());
        System.assertEquals(customNumber4Filter3.hashCode(), customNumber4Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomNumber4Filter customNumber4Filter = new OASCustomNumber4Filter();
        Map<String, String> x-property-mappings = customNumber4Filter.getx-property-mappings();
        System.assertEquals('cuSTOMNUMBER4', x-property-mappings.get('CUSTOM_NUMBER_4'));
    }
}
