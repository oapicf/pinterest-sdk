@isTest
private class OASTargetingTemplateUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest1 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest2 = targetingTemplateUpdateRequest1;
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest3 = new OASTargetingTemplateUpdateRequest();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest4 = targetingTemplateUpdateRequest3;

        System.assert(targetingTemplateUpdateRequest1.equals(targetingTemplateUpdateRequest2));
        System.assert(targetingTemplateUpdateRequest2.equals(targetingTemplateUpdateRequest1));
        System.assert(targetingTemplateUpdateRequest1.equals(targetingTemplateUpdateRequest1));
        System.assert(targetingTemplateUpdateRequest3.equals(targetingTemplateUpdateRequest4));
        System.assert(targetingTemplateUpdateRequest4.equals(targetingTemplateUpdateRequest3));
        System.assert(targetingTemplateUpdateRequest3.equals(targetingTemplateUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest1 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest2 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest3 = new OASTargetingTemplateUpdateRequest();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest4 = new OASTargetingTemplateUpdateRequest();

        System.assert(targetingTemplateUpdateRequest1.equals(targetingTemplateUpdateRequest2));
        System.assert(targetingTemplateUpdateRequest2.equals(targetingTemplateUpdateRequest1));
        System.assert(targetingTemplateUpdateRequest3.equals(targetingTemplateUpdateRequest4));
        System.assert(targetingTemplateUpdateRequest4.equals(targetingTemplateUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest1 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest2 = new OASTargetingTemplateUpdateRequest();

        System.assertEquals(false, targetingTemplateUpdateRequest1.equals('foo'));
        System.assertEquals(false, targetingTemplateUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest1 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest2 = new OASTargetingTemplateUpdateRequest();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest3;

        System.assertEquals(false, targetingTemplateUpdateRequest1.equals(targetingTemplateUpdateRequest3));
        System.assertEquals(false, targetingTemplateUpdateRequest2.equals(targetingTemplateUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest1 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest2 = new OASTargetingTemplateUpdateRequest();

        System.assertEquals(targetingTemplateUpdateRequest1.hashCode(), targetingTemplateUpdateRequest1.hashCode());
        System.assertEquals(targetingTemplateUpdateRequest2.hashCode(), targetingTemplateUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest1 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest2 = OASTargetingTemplateUpdateRequest.getExample();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest3 = new OASTargetingTemplateUpdateRequest();
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest4 = new OASTargetingTemplateUpdateRequest();

        System.assert(targetingTemplateUpdateRequest1.equals(targetingTemplateUpdateRequest2));
        System.assert(targetingTemplateUpdateRequest3.equals(targetingTemplateUpdateRequest4));
        System.assertEquals(targetingTemplateUpdateRequest1.hashCode(), targetingTemplateUpdateRequest2.hashCode());
        System.assertEquals(targetingTemplateUpdateRequest3.hashCode(), targetingTemplateUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateUpdateRequest targetingTemplateUpdateRequest = new OASTargetingTemplateUpdateRequest();
        Map<String, String> x-property-mappings = targetingTemplateUpdateRequest.getx-property-mappings();
        System.assertEquals('operationType', x-property-mappings.get('operation_type'));
    }
}
