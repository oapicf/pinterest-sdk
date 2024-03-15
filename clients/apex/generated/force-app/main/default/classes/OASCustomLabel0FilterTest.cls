@isTest
private class OASCustomLabel0FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCustomLabel0Filter customLabel0Filter1 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter2 = customLabel0Filter1;
        OASCustomLabel0Filter customLabel0Filter3 = new OASCustomLabel0Filter();
        OASCustomLabel0Filter customLabel0Filter4 = customLabel0Filter3;

        System.assert(customLabel0Filter1.equals(customLabel0Filter2));
        System.assert(customLabel0Filter2.equals(customLabel0Filter1));
        System.assert(customLabel0Filter1.equals(customLabel0Filter1));
        System.assert(customLabel0Filter3.equals(customLabel0Filter4));
        System.assert(customLabel0Filter4.equals(customLabel0Filter3));
        System.assert(customLabel0Filter3.equals(customLabel0Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCustomLabel0Filter customLabel0Filter1 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter2 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter3 = new OASCustomLabel0Filter();
        OASCustomLabel0Filter customLabel0Filter4 = new OASCustomLabel0Filter();

        System.assert(customLabel0Filter1.equals(customLabel0Filter2));
        System.assert(customLabel0Filter2.equals(customLabel0Filter1));
        System.assert(customLabel0Filter3.equals(customLabel0Filter4));
        System.assert(customLabel0Filter4.equals(customLabel0Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCustomLabel0Filter customLabel0Filter1 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter2 = new OASCustomLabel0Filter();

        System.assertEquals(false, customLabel0Filter1.equals('foo'));
        System.assertEquals(false, customLabel0Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCustomLabel0Filter customLabel0Filter1 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter2 = new OASCustomLabel0Filter();
        OASCustomLabel0Filter customLabel0Filter3;

        System.assertEquals(false, customLabel0Filter1.equals(customLabel0Filter3));
        System.assertEquals(false, customLabel0Filter2.equals(customLabel0Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCustomLabel0Filter customLabel0Filter1 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter2 = new OASCustomLabel0Filter();

        System.assertEquals(customLabel0Filter1.hashCode(), customLabel0Filter1.hashCode());
        System.assertEquals(customLabel0Filter2.hashCode(), customLabel0Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCustomLabel0Filter customLabel0Filter1 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter2 = OASCustomLabel0Filter.getExample();
        OASCustomLabel0Filter customLabel0Filter3 = new OASCustomLabel0Filter();
        OASCustomLabel0Filter customLabel0Filter4 = new OASCustomLabel0Filter();

        System.assert(customLabel0Filter1.equals(customLabel0Filter2));
        System.assert(customLabel0Filter3.equals(customLabel0Filter4));
        System.assertEquals(customLabel0Filter1.hashCode(), customLabel0Filter2.hashCode());
        System.assertEquals(customLabel0Filter3.hashCode(), customLabel0Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCustomLabel0Filter customLabel0Filter = new OASCustomLabel0Filter();
        Map<String, String> x-property-mappings = customLabel0Filter.getx-property-mappings();
        System.assertEquals('cuSTOMLABEL0', x-property-mappings.get('CUSTOM_LABEL_0'));
    }
}
