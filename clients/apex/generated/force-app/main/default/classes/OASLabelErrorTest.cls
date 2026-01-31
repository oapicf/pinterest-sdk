@isTest
private class OASLabelErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelError labelError1 = OASLabelError.getExample();
        OASLabelError labelError2 = labelError1;
        OASLabelError labelError3 = new OASLabelError();
        OASLabelError labelError4 = labelError3;

        System.assert(labelError1.equals(labelError2));
        System.assert(labelError2.equals(labelError1));
        System.assert(labelError1.equals(labelError1));
        System.assert(labelError3.equals(labelError4));
        System.assert(labelError4.equals(labelError3));
        System.assert(labelError3.equals(labelError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelError labelError1 = OASLabelError.getExample();
        OASLabelError labelError2 = OASLabelError.getExample();
        OASLabelError labelError3 = new OASLabelError();
        OASLabelError labelError4 = new OASLabelError();

        System.assert(labelError1.equals(labelError2));
        System.assert(labelError2.equals(labelError1));
        System.assert(labelError3.equals(labelError4));
        System.assert(labelError4.equals(labelError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelError labelError1 = OASLabelError.getExample();
        OASLabelError labelError2 = new OASLabelError();

        System.assertEquals(false, labelError1.equals('foo'));
        System.assertEquals(false, labelError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelError labelError1 = OASLabelError.getExample();
        OASLabelError labelError2 = new OASLabelError();
        OASLabelError labelError3;

        System.assertEquals(false, labelError1.equals(labelError3));
        System.assertEquals(false, labelError2.equals(labelError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelError labelError1 = OASLabelError.getExample();
        OASLabelError labelError2 = new OASLabelError();

        System.assertEquals(labelError1.hashCode(), labelError1.hashCode());
        System.assertEquals(labelError2.hashCode(), labelError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelError labelError1 = OASLabelError.getExample();
        OASLabelError labelError2 = OASLabelError.getExample();
        OASLabelError labelError3 = new OASLabelError();
        OASLabelError labelError4 = new OASLabelError();

        System.assert(labelError1.equals(labelError2));
        System.assert(labelError3.equals(labelError4));
        System.assertEquals(labelError1.hashCode(), labelError2.hashCode());
        System.assertEquals(labelError3.hashCode(), labelError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLabelError labelError = new OASLabelError();
        Map<String, String> x-property-mappings = labelError.getx-property-mappings();
        System.assertEquals('errorMessages', x-property-mappings.get('error_messages'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLabelError labelError = new OASLabelError();
        System.assertEquals(new List<String>(), labelError.errorMessages);
        System.assertEquals(null, labelError.data);
    }
}
