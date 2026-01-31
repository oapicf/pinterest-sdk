@isTest
private class OASLeadSubscriptionPostParamsCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate1 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate2 = leadSubscriptionPostParamsCreate1;
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate3 = new OASLeadSubscriptionPostParamsCreate();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate4 = leadSubscriptionPostParamsCreate3;

        System.assert(leadSubscriptionPostParamsCreate1.equals(leadSubscriptionPostParamsCreate2));
        System.assert(leadSubscriptionPostParamsCreate2.equals(leadSubscriptionPostParamsCreate1));
        System.assert(leadSubscriptionPostParamsCreate1.equals(leadSubscriptionPostParamsCreate1));
        System.assert(leadSubscriptionPostParamsCreate3.equals(leadSubscriptionPostParamsCreate4));
        System.assert(leadSubscriptionPostParamsCreate4.equals(leadSubscriptionPostParamsCreate3));
        System.assert(leadSubscriptionPostParamsCreate3.equals(leadSubscriptionPostParamsCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate1 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate2 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate3 = new OASLeadSubscriptionPostParamsCreate();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate4 = new OASLeadSubscriptionPostParamsCreate();

        System.assert(leadSubscriptionPostParamsCreate1.equals(leadSubscriptionPostParamsCreate2));
        System.assert(leadSubscriptionPostParamsCreate2.equals(leadSubscriptionPostParamsCreate1));
        System.assert(leadSubscriptionPostParamsCreate3.equals(leadSubscriptionPostParamsCreate4));
        System.assert(leadSubscriptionPostParamsCreate4.equals(leadSubscriptionPostParamsCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate1 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate2 = new OASLeadSubscriptionPostParamsCreate();

        System.assertEquals(false, leadSubscriptionPostParamsCreate1.equals('foo'));
        System.assertEquals(false, leadSubscriptionPostParamsCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate1 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate2 = new OASLeadSubscriptionPostParamsCreate();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate3;

        System.assertEquals(false, leadSubscriptionPostParamsCreate1.equals(leadSubscriptionPostParamsCreate3));
        System.assertEquals(false, leadSubscriptionPostParamsCreate2.equals(leadSubscriptionPostParamsCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate1 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate2 = new OASLeadSubscriptionPostParamsCreate();

        System.assertEquals(leadSubscriptionPostParamsCreate1.hashCode(), leadSubscriptionPostParamsCreate1.hashCode());
        System.assertEquals(leadSubscriptionPostParamsCreate2.hashCode(), leadSubscriptionPostParamsCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate1 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate2 = OASLeadSubscriptionPostParamsCreate.getExample();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate3 = new OASLeadSubscriptionPostParamsCreate();
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate4 = new OASLeadSubscriptionPostParamsCreate();

        System.assert(leadSubscriptionPostParamsCreate1.equals(leadSubscriptionPostParamsCreate2));
        System.assert(leadSubscriptionPostParamsCreate3.equals(leadSubscriptionPostParamsCreate4));
        System.assertEquals(leadSubscriptionPostParamsCreate1.hashCode(), leadSubscriptionPostParamsCreate2.hashCode());
        System.assertEquals(leadSubscriptionPostParamsCreate3.hashCode(), leadSubscriptionPostParamsCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate = new OASLeadSubscriptionPostParamsCreate();
        Map<String, String> x-property-mappings = leadSubscriptionPostParamsCreate.getx-property-mappings();
        System.assertEquals('leadFormId', x-property-mappings.get('lead_form_id'));
        System.assertEquals('webhookUrl', x-property-mappings.get('webhook_url'));
        System.assertEquals('partnerAccessToken', x-property-mappings.get('partner_access_token'));
        System.assertEquals('partnerMetadata', x-property-mappings.get('partner_metadata'));
        System.assertEquals('partnerRefreshToken', x-property-mappings.get('partner_refresh_token'));
    }
}
