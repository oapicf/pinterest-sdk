@isTest
private class OASKeywordErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordError keywordError1 = OASKeywordError.getExample();
        OASKeywordError keywordError2 = keywordError1;
        OASKeywordError keywordError3 = new OASKeywordError();
        OASKeywordError keywordError4 = keywordError3;

        System.assert(keywordError1.equals(keywordError2));
        System.assert(keywordError2.equals(keywordError1));
        System.assert(keywordError1.equals(keywordError1));
        System.assert(keywordError3.equals(keywordError4));
        System.assert(keywordError4.equals(keywordError3));
        System.assert(keywordError3.equals(keywordError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordError keywordError1 = OASKeywordError.getExample();
        OASKeywordError keywordError2 = OASKeywordError.getExample();
        OASKeywordError keywordError3 = new OASKeywordError();
        OASKeywordError keywordError4 = new OASKeywordError();

        System.assert(keywordError1.equals(keywordError2));
        System.assert(keywordError2.equals(keywordError1));
        System.assert(keywordError3.equals(keywordError4));
        System.assert(keywordError4.equals(keywordError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordError keywordError1 = OASKeywordError.getExample();
        OASKeywordError keywordError2 = new OASKeywordError();

        System.assertEquals(false, keywordError1.equals('foo'));
        System.assertEquals(false, keywordError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordError keywordError1 = OASKeywordError.getExample();
        OASKeywordError keywordError2 = new OASKeywordError();
        OASKeywordError keywordError3;

        System.assertEquals(false, keywordError1.equals(keywordError3));
        System.assertEquals(false, keywordError2.equals(keywordError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordError keywordError1 = OASKeywordError.getExample();
        OASKeywordError keywordError2 = new OASKeywordError();

        System.assertEquals(keywordError1.hashCode(), keywordError1.hashCode());
        System.assertEquals(keywordError2.hashCode(), keywordError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordError keywordError1 = OASKeywordError.getExample();
        OASKeywordError keywordError2 = OASKeywordError.getExample();
        OASKeywordError keywordError3 = new OASKeywordError();
        OASKeywordError keywordError4 = new OASKeywordError();

        System.assert(keywordError1.equals(keywordError2));
        System.assert(keywordError3.equals(keywordError4));
        System.assertEquals(keywordError1.hashCode(), keywordError2.hashCode());
        System.assertEquals(keywordError3.hashCode(), keywordError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASKeywordError keywordError = new OASKeywordError();
        Map<String, String> x-property-mappings = keywordError.getx-property-mappings();
        System.assertEquals('errorMessages', x-property-mappings.get('error_messages'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeywordError keywordError = new OASKeywordError();
        System.assertEquals(new List<String>(), keywordError.errorMessages);
        System.assertEquals(null, keywordError.data);
    }
}
