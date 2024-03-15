@isTest
private class OASAdAccountCreateSubscriptionRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest2 = adAccountCreateSubscriptionRequest1;
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest3 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest4 = adAccountCreateSubscriptionRequest3;

        System.assert(adAccountCreateSubscriptionRequest1.equals(adAccountCreateSubscriptionRequest2));
        System.assert(adAccountCreateSubscriptionRequest2.equals(adAccountCreateSubscriptionRequest1));
        System.assert(adAccountCreateSubscriptionRequest1.equals(adAccountCreateSubscriptionRequest1));
        System.assert(adAccountCreateSubscriptionRequest3.equals(adAccountCreateSubscriptionRequest4));
        System.assert(adAccountCreateSubscriptionRequest4.equals(adAccountCreateSubscriptionRequest3));
        System.assert(adAccountCreateSubscriptionRequest3.equals(adAccountCreateSubscriptionRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest2 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest3 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest4 = new OASAdAccountCreateSubscriptionReques();

        System.assert(adAccountCreateSubscriptionRequest1.equals(adAccountCreateSubscriptionRequest2));
        System.assert(adAccountCreateSubscriptionRequest2.equals(adAccountCreateSubscriptionRequest1));
        System.assert(adAccountCreateSubscriptionRequest3.equals(adAccountCreateSubscriptionRequest4));
        System.assert(adAccountCreateSubscriptionRequest4.equals(adAccountCreateSubscriptionRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest2 = new OASAdAccountCreateSubscriptionReques();

        System.assertEquals(false, adAccountCreateSubscriptionRequest1.equals('foo'));
        System.assertEquals(false, adAccountCreateSubscriptionRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest2 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest3;

        System.assertEquals(false, adAccountCreateSubscriptionRequest1.equals(adAccountCreateSubscriptionRequest3));
        System.assertEquals(false, adAccountCreateSubscriptionRequest2.equals(adAccountCreateSubscriptionRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest2 = new OASAdAccountCreateSubscriptionReques();

        System.assertEquals(adAccountCreateSubscriptionRequest1.hashCode(), adAccountCreateSubscriptionRequest1.hashCode());
        System.assertEquals(adAccountCreateSubscriptionRequest2.hashCode(), adAccountCreateSubscriptionRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest2 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest3 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest4 = new OASAdAccountCreateSubscriptionReques();

        System.assert(adAccountCreateSubscriptionRequest1.equals(adAccountCreateSubscriptionRequest2));
        System.assert(adAccountCreateSubscriptionRequest3.equals(adAccountCreateSubscriptionRequest4));
        System.assertEquals(adAccountCreateSubscriptionRequest1.hashCode(), adAccountCreateSubscriptionRequest2.hashCode());
        System.assertEquals(adAccountCreateSubscriptionRequest3.hashCode(), adAccountCreateSubscriptionRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequest = new OASAdAccountCreateSubscriptionReques();
        Map<String, String> x-property-mappings = adAccountCreateSubscriptionRequest.getx-property-mappings();
        System.assertEquals('webhookUrl', x-property-mappings.get('webhook_url'));
        System.assertEquals('leadFormId', x-property-mappings.get('lead_form_id'));
        System.assertEquals('partnerAccessToken', x-property-mappings.get('partner_access_token'));
        System.assertEquals('partnerRefreshToken', x-property-mappings.get('partner_refresh_token'));
    }
}
