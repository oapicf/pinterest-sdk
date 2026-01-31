@isTest
private class OASLeadSubscriptionPostParamsCreateATest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata1 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata2 = leadSubscriptionPostParamsCreateAllOfPartnerMetadata1;
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata3 = new OASLeadSubscriptionPostParamsCreateA();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata4 = leadSubscriptionPostParamsCreateAllOfPartnerMetadata3;

        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata2));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata4));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata4.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata1 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata2 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata3 = new OASLeadSubscriptionPostParamsCreateA();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata4 = new OASLeadSubscriptionPostParamsCreateA();

        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata2));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata4));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata4.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata1 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata2 = new OASLeadSubscriptionPostParamsCreateA();

        System.assertEquals(false, leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.equals('foo'));
        System.assertEquals(false, leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata1 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata2 = new OASLeadSubscriptionPostParamsCreateA();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata3;

        System.assertEquals(false, leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3));
        System.assertEquals(false, leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata1 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata2 = new OASLeadSubscriptionPostParamsCreateA();

        System.assertEquals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.hashCode(), leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.hashCode());
        System.assertEquals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.hashCode(), leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata1 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata2 = OASLeadSubscriptionPostParamsCreateA.getExample();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata3 = new OASLeadSubscriptionPostParamsCreateA();
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata4 = new OASLeadSubscriptionPostParamsCreateA();

        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata2));
        System.assert(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3.equals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata4));
        System.assertEquals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata1.hashCode(), leadSubscriptionPostParamsCreateAllOfPartnerMetadata2.hashCode());
        System.assertEquals(leadSubscriptionPostParamsCreateAllOfPartnerMetadata3.hashCode(), leadSubscriptionPostParamsCreateAllOfPartnerMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadSubscriptionPostParamsCreateA leadSubscriptionPostParamsCreateAllOfPartnerMetadata = new OASLeadSubscriptionPostParamsCreateA();
        Map<String, String> x-property-mappings = leadSubscriptionPostParamsCreateAllOfPartnerMetadata.getx-property-mappings();
        System.assertEquals('subscriberKey', x-property-mappings.get('subscriber_key'));
    }
}
