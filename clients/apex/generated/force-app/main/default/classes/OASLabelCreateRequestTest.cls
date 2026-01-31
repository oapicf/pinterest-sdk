@isTest
private class OASLabelCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelCreateRequest labelCreateRequest1 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest2 = labelCreateRequest1;
        OASLabelCreateRequest labelCreateRequest3 = new OASLabelCreateRequest();
        OASLabelCreateRequest labelCreateRequest4 = labelCreateRequest3;

        System.assert(labelCreateRequest1.equals(labelCreateRequest2));
        System.assert(labelCreateRequest2.equals(labelCreateRequest1));
        System.assert(labelCreateRequest1.equals(labelCreateRequest1));
        System.assert(labelCreateRequest3.equals(labelCreateRequest4));
        System.assert(labelCreateRequest4.equals(labelCreateRequest3));
        System.assert(labelCreateRequest3.equals(labelCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelCreateRequest labelCreateRequest1 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest2 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest3 = new OASLabelCreateRequest();
        OASLabelCreateRequest labelCreateRequest4 = new OASLabelCreateRequest();

        System.assert(labelCreateRequest1.equals(labelCreateRequest2));
        System.assert(labelCreateRequest2.equals(labelCreateRequest1));
        System.assert(labelCreateRequest3.equals(labelCreateRequest4));
        System.assert(labelCreateRequest4.equals(labelCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelCreateRequest labelCreateRequest1 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest2 = new OASLabelCreateRequest();

        System.assertEquals(false, labelCreateRequest1.equals('foo'));
        System.assertEquals(false, labelCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelCreateRequest labelCreateRequest1 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest2 = new OASLabelCreateRequest();
        OASLabelCreateRequest labelCreateRequest3;

        System.assertEquals(false, labelCreateRequest1.equals(labelCreateRequest3));
        System.assertEquals(false, labelCreateRequest2.equals(labelCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelCreateRequest labelCreateRequest1 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest2 = new OASLabelCreateRequest();

        System.assertEquals(labelCreateRequest1.hashCode(), labelCreateRequest1.hashCode());
        System.assertEquals(labelCreateRequest2.hashCode(), labelCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelCreateRequest labelCreateRequest1 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest2 = OASLabelCreateRequest.getExample();
        OASLabelCreateRequest labelCreateRequest3 = new OASLabelCreateRequest();
        OASLabelCreateRequest labelCreateRequest4 = new OASLabelCreateRequest();

        System.assert(labelCreateRequest1.equals(labelCreateRequest2));
        System.assert(labelCreateRequest3.equals(labelCreateRequest4));
        System.assertEquals(labelCreateRequest1.hashCode(), labelCreateRequest2.hashCode());
        System.assertEquals(labelCreateRequest3.hashCode(), labelCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLabelCreateRequest labelCreateRequest = new OASLabelCreateRequest();
        Map<String, String> x-property-mappings = labelCreateRequest.getx-property-mappings();
        System.assertEquals('parentId', x-property-mappings.get('parent_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLabelCreateRequest labelCreateRequest = new OASLabelCreateRequest();
        System.assertEquals(new List<OASLabelCreateRequestLabelsInner>(), labelCreateRequest.labels);
        System.assertEquals(null, labelCreateRequest.parentId);
    }
}
