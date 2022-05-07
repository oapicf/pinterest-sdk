@isTest
private class OASCustomLabel4FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomLabel4Filter customLabel4Filter1 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter2 = customLabel4Filter1;
        OASCustomLabel4Filter customLabel4Filter3 = new OASCustomLabel4Filter();
        OASCustomLabel4Filter customLabel4Filter4 = customLabel4Filter3;

        System.assert(customLabel4Filter1.equals(customLabel4Filter2));
        System.assert(customLabel4Filter2.equals(customLabel4Filter1));
        System.assert(customLabel4Filter1.equals(customLabel4Filter1));
        System.assert(customLabel4Filter3.equals(customLabel4Filter4));
        System.assert(customLabel4Filter4.equals(customLabel4Filter3));
        System.assert(customLabel4Filter3.equals(customLabel4Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomLabel4Filter customLabel4Filter1 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter2 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter3 = new OASCustomLabel4Filter();
        OASCustomLabel4Filter customLabel4Filter4 = new OASCustomLabel4Filter();

        System.assert(customLabel4Filter1.equals(customLabel4Filter2));
        System.assert(customLabel4Filter2.equals(customLabel4Filter1));
        System.assert(customLabel4Filter3.equals(customLabel4Filter4));
        System.assert(customLabel4Filter4.equals(customLabel4Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomLabel4Filter customLabel4Filter1 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter2 = new OASCustomLabel4Filter();

        System.assertEquals(false, customLabel4Filter1.equals('foo'));
        System.assertEquals(false, customLabel4Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomLabel4Filter customLabel4Filter1 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter2 = new OASCustomLabel4Filter();
        OASCustomLabel4Filter customLabel4Filter3;

        System.assertEquals(false, customLabel4Filter1.equals(customLabel4Filter3));
        System.assertEquals(false, customLabel4Filter2.equals(customLabel4Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomLabel4Filter customLabel4Filter1 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter2 = new OASCustomLabel4Filter();

        System.assertEquals(customLabel4Filter1.hashCode(), customLabel4Filter1.hashCode());
        System.assertEquals(customLabel4Filter2.hashCode(), customLabel4Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomLabel4Filter customLabel4Filter1 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter2 = OASCustomLabel4Filter.getExample();
        OASCustomLabel4Filter customLabel4Filter3 = new OASCustomLabel4Filter();
        OASCustomLabel4Filter customLabel4Filter4 = new OASCustomLabel4Filter();

        System.assert(customLabel4Filter1.equals(customLabel4Filter2));
        System.assert(customLabel4Filter3.equals(customLabel4Filter4));
        System.assertEquals(customLabel4Filter1.hashCode(), customLabel4Filter2.hashCode());
        System.assertEquals(customLabel4Filter3.hashCode(), customLabel4Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomLabel4Filter customLabel4Filter = new OASCustomLabel4Filter();
        Map<String, String> x-property-mappings = customLabel4Filter.getx-property-mappings();
        System.assertEquals('cuSTOMLABEL4', x-property-mappings.get('CUSTOM_LABEL_4'));
    }
}
