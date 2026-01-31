@isTest
private class OASLabelBulkUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelBulkUpdateRequest labelBulkUpdateRequest1 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest2 = labelBulkUpdateRequest1;
        OASLabelBulkUpdateRequest labelBulkUpdateRequest3 = new OASLabelBulkUpdateRequest();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest4 = labelBulkUpdateRequest3;

        System.assert(labelBulkUpdateRequest1.equals(labelBulkUpdateRequest2));
        System.assert(labelBulkUpdateRequest2.equals(labelBulkUpdateRequest1));
        System.assert(labelBulkUpdateRequest1.equals(labelBulkUpdateRequest1));
        System.assert(labelBulkUpdateRequest3.equals(labelBulkUpdateRequest4));
        System.assert(labelBulkUpdateRequest4.equals(labelBulkUpdateRequest3));
        System.assert(labelBulkUpdateRequest3.equals(labelBulkUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelBulkUpdateRequest labelBulkUpdateRequest1 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest2 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest3 = new OASLabelBulkUpdateRequest();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest4 = new OASLabelBulkUpdateRequest();

        System.assert(labelBulkUpdateRequest1.equals(labelBulkUpdateRequest2));
        System.assert(labelBulkUpdateRequest2.equals(labelBulkUpdateRequest1));
        System.assert(labelBulkUpdateRequest3.equals(labelBulkUpdateRequest4));
        System.assert(labelBulkUpdateRequest4.equals(labelBulkUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelBulkUpdateRequest labelBulkUpdateRequest1 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest2 = new OASLabelBulkUpdateRequest();

        System.assertEquals(false, labelBulkUpdateRequest1.equals('foo'));
        System.assertEquals(false, labelBulkUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelBulkUpdateRequest labelBulkUpdateRequest1 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest2 = new OASLabelBulkUpdateRequest();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest3;

        System.assertEquals(false, labelBulkUpdateRequest1.equals(labelBulkUpdateRequest3));
        System.assertEquals(false, labelBulkUpdateRequest2.equals(labelBulkUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelBulkUpdateRequest labelBulkUpdateRequest1 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest2 = new OASLabelBulkUpdateRequest();

        System.assertEquals(labelBulkUpdateRequest1.hashCode(), labelBulkUpdateRequest1.hashCode());
        System.assertEquals(labelBulkUpdateRequest2.hashCode(), labelBulkUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelBulkUpdateRequest labelBulkUpdateRequest1 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest2 = OASLabelBulkUpdateRequest.getExample();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest3 = new OASLabelBulkUpdateRequest();
        OASLabelBulkUpdateRequest labelBulkUpdateRequest4 = new OASLabelBulkUpdateRequest();

        System.assert(labelBulkUpdateRequest1.equals(labelBulkUpdateRequest2));
        System.assert(labelBulkUpdateRequest3.equals(labelBulkUpdateRequest4));
        System.assertEquals(labelBulkUpdateRequest1.hashCode(), labelBulkUpdateRequest2.hashCode());
        System.assertEquals(labelBulkUpdateRequest3.hashCode(), labelBulkUpdateRequest4.hashCode());
    }
}
