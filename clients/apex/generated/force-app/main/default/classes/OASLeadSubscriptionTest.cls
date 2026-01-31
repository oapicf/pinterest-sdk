@isTest
private class OASLeadSubscriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadSubscription leadSubscription1 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription2 = leadSubscription1;
        OASLeadSubscription leadSubscription3 = new OASLeadSubscription();
        OASLeadSubscription leadSubscription4 = leadSubscription3;

        System.assert(leadSubscription1.equals(leadSubscription2));
        System.assert(leadSubscription2.equals(leadSubscription1));
        System.assert(leadSubscription1.equals(leadSubscription1));
        System.assert(leadSubscription3.equals(leadSubscription4));
        System.assert(leadSubscription4.equals(leadSubscription3));
        System.assert(leadSubscription3.equals(leadSubscription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadSubscription leadSubscription1 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription2 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription3 = new OASLeadSubscription();
        OASLeadSubscription leadSubscription4 = new OASLeadSubscription();

        System.assert(leadSubscription1.equals(leadSubscription2));
        System.assert(leadSubscription2.equals(leadSubscription1));
        System.assert(leadSubscription3.equals(leadSubscription4));
        System.assert(leadSubscription4.equals(leadSubscription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadSubscription leadSubscription1 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription2 = new OASLeadSubscription();

        System.assertEquals(false, leadSubscription1.equals('foo'));
        System.assertEquals(false, leadSubscription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadSubscription leadSubscription1 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription2 = new OASLeadSubscription();
        OASLeadSubscription leadSubscription3;

        System.assertEquals(false, leadSubscription1.equals(leadSubscription3));
        System.assertEquals(false, leadSubscription2.equals(leadSubscription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadSubscription leadSubscription1 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription2 = new OASLeadSubscription();

        System.assertEquals(leadSubscription1.hashCode(), leadSubscription1.hashCode());
        System.assertEquals(leadSubscription2.hashCode(), leadSubscription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadSubscription leadSubscription1 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription2 = OASLeadSubscription.getExample();
        OASLeadSubscription leadSubscription3 = new OASLeadSubscription();
        OASLeadSubscription leadSubscription4 = new OASLeadSubscription();

        System.assert(leadSubscription1.equals(leadSubscription2));
        System.assert(leadSubscription3.equals(leadSubscription4));
        System.assertEquals(leadSubscription1.hashCode(), leadSubscription2.hashCode());
        System.assertEquals(leadSubscription3.hashCode(), leadSubscription4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadSubscription leadSubscription = new OASLeadSubscription();
        Map<String, String> x-property-mappings = leadSubscription.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('apiVersion', x-property-mappings.get('api_version'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('cryptographicAlgorithm', x-property-mappings.get('cryptographic_algorithm'));
        System.assertEquals('cryptographicKey', x-property-mappings.get('cryptographic_key'));
        System.assertEquals('leadFormId', x-property-mappings.get('lead_form_id'));
        System.assertEquals('userAccountId', x-property-mappings.get('user_account_id'));
        System.assertEquals('webhookUrl', x-property-mappings.get('webhook_url'));
    }
}
