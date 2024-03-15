@isTest
private class OASLeadFormTestRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormTestRequest leadFormTestRequest1 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest2 = leadFormTestRequest1;
        OASLeadFormTestRequest leadFormTestRequest3 = new OASLeadFormTestRequest();
        OASLeadFormTestRequest leadFormTestRequest4 = leadFormTestRequest3;

        System.assert(leadFormTestRequest1.equals(leadFormTestRequest2));
        System.assert(leadFormTestRequest2.equals(leadFormTestRequest1));
        System.assert(leadFormTestRequest1.equals(leadFormTestRequest1));
        System.assert(leadFormTestRequest3.equals(leadFormTestRequest4));
        System.assert(leadFormTestRequest4.equals(leadFormTestRequest3));
        System.assert(leadFormTestRequest3.equals(leadFormTestRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormTestRequest leadFormTestRequest1 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest2 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest3 = new OASLeadFormTestRequest();
        OASLeadFormTestRequest leadFormTestRequest4 = new OASLeadFormTestRequest();

        System.assert(leadFormTestRequest1.equals(leadFormTestRequest2));
        System.assert(leadFormTestRequest2.equals(leadFormTestRequest1));
        System.assert(leadFormTestRequest3.equals(leadFormTestRequest4));
        System.assert(leadFormTestRequest4.equals(leadFormTestRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormTestRequest leadFormTestRequest1 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest2 = new OASLeadFormTestRequest();

        System.assertEquals(false, leadFormTestRequest1.equals('foo'));
        System.assertEquals(false, leadFormTestRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormTestRequest leadFormTestRequest1 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest2 = new OASLeadFormTestRequest();
        OASLeadFormTestRequest leadFormTestRequest3;

        System.assertEquals(false, leadFormTestRequest1.equals(leadFormTestRequest3));
        System.assertEquals(false, leadFormTestRequest2.equals(leadFormTestRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormTestRequest leadFormTestRequest1 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest2 = new OASLeadFormTestRequest();

        System.assertEquals(leadFormTestRequest1.hashCode(), leadFormTestRequest1.hashCode());
        System.assertEquals(leadFormTestRequest2.hashCode(), leadFormTestRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormTestRequest leadFormTestRequest1 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest2 = OASLeadFormTestRequest.getExample();
        OASLeadFormTestRequest leadFormTestRequest3 = new OASLeadFormTestRequest();
        OASLeadFormTestRequest leadFormTestRequest4 = new OASLeadFormTestRequest();

        System.assert(leadFormTestRequest1.equals(leadFormTestRequest2));
        System.assert(leadFormTestRequest3.equals(leadFormTestRequest4));
        System.assertEquals(leadFormTestRequest1.hashCode(), leadFormTestRequest2.hashCode());
        System.assertEquals(leadFormTestRequest3.hashCode(), leadFormTestRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormTestRequest leadFormTestRequest = new OASLeadFormTestRequest();
        System.assertEquals(new List<String>(), leadFormTestRequest.answers);
    }
}
