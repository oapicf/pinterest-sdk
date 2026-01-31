@isTest
private class OASLabelsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelsResponse labelsResponse1 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse2 = labelsResponse1;
        OASLabelsResponse labelsResponse3 = new OASLabelsResponse();
        OASLabelsResponse labelsResponse4 = labelsResponse3;

        System.assert(labelsResponse1.equals(labelsResponse2));
        System.assert(labelsResponse2.equals(labelsResponse1));
        System.assert(labelsResponse1.equals(labelsResponse1));
        System.assert(labelsResponse3.equals(labelsResponse4));
        System.assert(labelsResponse4.equals(labelsResponse3));
        System.assert(labelsResponse3.equals(labelsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelsResponse labelsResponse1 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse2 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse3 = new OASLabelsResponse();
        OASLabelsResponse labelsResponse4 = new OASLabelsResponse();

        System.assert(labelsResponse1.equals(labelsResponse2));
        System.assert(labelsResponse2.equals(labelsResponse1));
        System.assert(labelsResponse3.equals(labelsResponse4));
        System.assert(labelsResponse4.equals(labelsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelsResponse labelsResponse1 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse2 = new OASLabelsResponse();

        System.assertEquals(false, labelsResponse1.equals('foo'));
        System.assertEquals(false, labelsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelsResponse labelsResponse1 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse2 = new OASLabelsResponse();
        OASLabelsResponse labelsResponse3;

        System.assertEquals(false, labelsResponse1.equals(labelsResponse3));
        System.assertEquals(false, labelsResponse2.equals(labelsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelsResponse labelsResponse1 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse2 = new OASLabelsResponse();

        System.assertEquals(labelsResponse1.hashCode(), labelsResponse1.hashCode());
        System.assertEquals(labelsResponse2.hashCode(), labelsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelsResponse labelsResponse1 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse2 = OASLabelsResponse.getExample();
        OASLabelsResponse labelsResponse3 = new OASLabelsResponse();
        OASLabelsResponse labelsResponse4 = new OASLabelsResponse();

        System.assert(labelsResponse1.equals(labelsResponse2));
        System.assert(labelsResponse3.equals(labelsResponse4));
        System.assertEquals(labelsResponse1.hashCode(), labelsResponse2.hashCode());
        System.assertEquals(labelsResponse3.hashCode(), labelsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLabelsResponse labelsResponse = new OASLabelsResponse();
        System.assertEquals(new List<OASLabelError>(), labelsResponse.errors);
        System.assertEquals(new List<OASLabel>(), labelsResponse.labels);
    }
}
