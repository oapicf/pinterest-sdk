@isTest
private class OASAdAccountGetSubscriptionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse1 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse2 = adAccountGetSubscriptionResponse1;
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse3 = new OASAdAccountGetSubscriptionResponse();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse4 = adAccountGetSubscriptionResponse3;

        System.assert(adAccountGetSubscriptionResponse1.equals(adAccountGetSubscriptionResponse2));
        System.assert(adAccountGetSubscriptionResponse2.equals(adAccountGetSubscriptionResponse1));
        System.assert(adAccountGetSubscriptionResponse1.equals(adAccountGetSubscriptionResponse1));
        System.assert(adAccountGetSubscriptionResponse3.equals(adAccountGetSubscriptionResponse4));
        System.assert(adAccountGetSubscriptionResponse4.equals(adAccountGetSubscriptionResponse3));
        System.assert(adAccountGetSubscriptionResponse3.equals(adAccountGetSubscriptionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse1 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse2 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse3 = new OASAdAccountGetSubscriptionResponse();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse4 = new OASAdAccountGetSubscriptionResponse();

        System.assert(adAccountGetSubscriptionResponse1.equals(adAccountGetSubscriptionResponse2));
        System.assert(adAccountGetSubscriptionResponse2.equals(adAccountGetSubscriptionResponse1));
        System.assert(adAccountGetSubscriptionResponse3.equals(adAccountGetSubscriptionResponse4));
        System.assert(adAccountGetSubscriptionResponse4.equals(adAccountGetSubscriptionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse1 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse2 = new OASAdAccountGetSubscriptionResponse();

        System.assertEquals(false, adAccountGetSubscriptionResponse1.equals('foo'));
        System.assertEquals(false, adAccountGetSubscriptionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse1 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse2 = new OASAdAccountGetSubscriptionResponse();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse3;

        System.assertEquals(false, adAccountGetSubscriptionResponse1.equals(adAccountGetSubscriptionResponse3));
        System.assertEquals(false, adAccountGetSubscriptionResponse2.equals(adAccountGetSubscriptionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse1 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse2 = new OASAdAccountGetSubscriptionResponse();

        System.assertEquals(adAccountGetSubscriptionResponse1.hashCode(), adAccountGetSubscriptionResponse1.hashCode());
        System.assertEquals(adAccountGetSubscriptionResponse2.hashCode(), adAccountGetSubscriptionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse1 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse2 = OASAdAccountGetSubscriptionResponse.getExample();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse3 = new OASAdAccountGetSubscriptionResponse();
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse4 = new OASAdAccountGetSubscriptionResponse();

        System.assert(adAccountGetSubscriptionResponse1.equals(adAccountGetSubscriptionResponse2));
        System.assert(adAccountGetSubscriptionResponse3.equals(adAccountGetSubscriptionResponse4));
        System.assertEquals(adAccountGetSubscriptionResponse1.hashCode(), adAccountGetSubscriptionResponse2.hashCode());
        System.assertEquals(adAccountGetSubscriptionResponse3.hashCode(), adAccountGetSubscriptionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountGetSubscriptionResponse adAccountGetSubscriptionResponse = new OASAdAccountGetSubscriptionResponse();
        Map<String, String> x-property-mappings = adAccountGetSubscriptionResponse.getx-property-mappings();
        System.assertEquals('leadFormId', x-property-mappings.get('lead_form_id'));
        System.assertEquals('webhookUrl', x-property-mappings.get('webhook_url'));
        System.assertEquals('userAccountId', x-property-mappings.get('user_account_id'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('apiVersion', x-property-mappings.get('api_version'));
        System.assertEquals('cryptographicKey', x-property-mappings.get('cryptographic_key'));
        System.assertEquals('cryptographicAlgorithm', x-property-mappings.get('cryptographic_algorithm'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
    }
}
