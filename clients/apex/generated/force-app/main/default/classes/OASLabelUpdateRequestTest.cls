@isTest
private class OASLabelUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelUpdateRequest labelUpdateRequest1 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest2 = labelUpdateRequest1;
        OASLabelUpdateRequest labelUpdateRequest3 = new OASLabelUpdateRequest();
        OASLabelUpdateRequest labelUpdateRequest4 = labelUpdateRequest3;

        System.assert(labelUpdateRequest1.equals(labelUpdateRequest2));
        System.assert(labelUpdateRequest2.equals(labelUpdateRequest1));
        System.assert(labelUpdateRequest1.equals(labelUpdateRequest1));
        System.assert(labelUpdateRequest3.equals(labelUpdateRequest4));
        System.assert(labelUpdateRequest4.equals(labelUpdateRequest3));
        System.assert(labelUpdateRequest3.equals(labelUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelUpdateRequest labelUpdateRequest1 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest2 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest3 = new OASLabelUpdateRequest();
        OASLabelUpdateRequest labelUpdateRequest4 = new OASLabelUpdateRequest();

        System.assert(labelUpdateRequest1.equals(labelUpdateRequest2));
        System.assert(labelUpdateRequest2.equals(labelUpdateRequest1));
        System.assert(labelUpdateRequest3.equals(labelUpdateRequest4));
        System.assert(labelUpdateRequest4.equals(labelUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelUpdateRequest labelUpdateRequest1 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest2 = new OASLabelUpdateRequest();

        System.assertEquals(false, labelUpdateRequest1.equals('foo'));
        System.assertEquals(false, labelUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelUpdateRequest labelUpdateRequest1 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest2 = new OASLabelUpdateRequest();
        OASLabelUpdateRequest labelUpdateRequest3;

        System.assertEquals(false, labelUpdateRequest1.equals(labelUpdateRequest3));
        System.assertEquals(false, labelUpdateRequest2.equals(labelUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelUpdateRequest labelUpdateRequest1 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest2 = new OASLabelUpdateRequest();

        System.assertEquals(labelUpdateRequest1.hashCode(), labelUpdateRequest1.hashCode());
        System.assertEquals(labelUpdateRequest2.hashCode(), labelUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelUpdateRequest labelUpdateRequest1 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest2 = OASLabelUpdateRequest.getExample();
        OASLabelUpdateRequest labelUpdateRequest3 = new OASLabelUpdateRequest();
        OASLabelUpdateRequest labelUpdateRequest4 = new OASLabelUpdateRequest();

        System.assert(labelUpdateRequest1.equals(labelUpdateRequest2));
        System.assert(labelUpdateRequest3.equals(labelUpdateRequest4));
        System.assertEquals(labelUpdateRequest1.hashCode(), labelUpdateRequest2.hashCode());
        System.assertEquals(labelUpdateRequest3.hashCode(), labelUpdateRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLabelUpdateRequest labelUpdateRequest = new OASLabelUpdateRequest();
        System.assertEquals(new List<OASLabelUpdateRequestLabelsInner>(), labelUpdateRequest.labels);
    }
}
