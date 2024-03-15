@isTest
private class OASLeadFormTestResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormTestResponse leadFormTestResponse1 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse2 = leadFormTestResponse1;
        OASLeadFormTestResponse leadFormTestResponse3 = new OASLeadFormTestResponse();
        OASLeadFormTestResponse leadFormTestResponse4 = leadFormTestResponse3;

        System.assert(leadFormTestResponse1.equals(leadFormTestResponse2));
        System.assert(leadFormTestResponse2.equals(leadFormTestResponse1));
        System.assert(leadFormTestResponse1.equals(leadFormTestResponse1));
        System.assert(leadFormTestResponse3.equals(leadFormTestResponse4));
        System.assert(leadFormTestResponse4.equals(leadFormTestResponse3));
        System.assert(leadFormTestResponse3.equals(leadFormTestResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormTestResponse leadFormTestResponse1 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse2 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse3 = new OASLeadFormTestResponse();
        OASLeadFormTestResponse leadFormTestResponse4 = new OASLeadFormTestResponse();

        System.assert(leadFormTestResponse1.equals(leadFormTestResponse2));
        System.assert(leadFormTestResponse2.equals(leadFormTestResponse1));
        System.assert(leadFormTestResponse3.equals(leadFormTestResponse4));
        System.assert(leadFormTestResponse4.equals(leadFormTestResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormTestResponse leadFormTestResponse1 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse2 = new OASLeadFormTestResponse();

        System.assertEquals(false, leadFormTestResponse1.equals('foo'));
        System.assertEquals(false, leadFormTestResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormTestResponse leadFormTestResponse1 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse2 = new OASLeadFormTestResponse();
        OASLeadFormTestResponse leadFormTestResponse3;

        System.assertEquals(false, leadFormTestResponse1.equals(leadFormTestResponse3));
        System.assertEquals(false, leadFormTestResponse2.equals(leadFormTestResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormTestResponse leadFormTestResponse1 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse2 = new OASLeadFormTestResponse();

        System.assertEquals(leadFormTestResponse1.hashCode(), leadFormTestResponse1.hashCode());
        System.assertEquals(leadFormTestResponse2.hashCode(), leadFormTestResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormTestResponse leadFormTestResponse1 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse2 = OASLeadFormTestResponse.getExample();
        OASLeadFormTestResponse leadFormTestResponse3 = new OASLeadFormTestResponse();
        OASLeadFormTestResponse leadFormTestResponse4 = new OASLeadFormTestResponse();

        System.assert(leadFormTestResponse1.equals(leadFormTestResponse2));
        System.assert(leadFormTestResponse3.equals(leadFormTestResponse4));
        System.assertEquals(leadFormTestResponse1.hashCode(), leadFormTestResponse2.hashCode());
        System.assertEquals(leadFormTestResponse3.hashCode(), leadFormTestResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadFormTestResponse leadFormTestResponse = new OASLeadFormTestResponse();
        Map<String, String> x-property-mappings = leadFormTestResponse.getx-property-mappings();
        System.assertEquals('subscriptionId', x-property-mappings.get('subscription_id'));
    }
}
