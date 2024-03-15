@isTest
private class OASIntegrationRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationRequest integrationRequest1 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest2 = integrationRequest1;
        OASIntegrationRequest integrationRequest3 = new OASIntegrationRequest();
        OASIntegrationRequest integrationRequest4 = integrationRequest3;

        System.assert(integrationRequest1.equals(integrationRequest2));
        System.assert(integrationRequest2.equals(integrationRequest1));
        System.assert(integrationRequest1.equals(integrationRequest1));
        System.assert(integrationRequest3.equals(integrationRequest4));
        System.assert(integrationRequest4.equals(integrationRequest3));
        System.assert(integrationRequest3.equals(integrationRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationRequest integrationRequest1 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest2 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest3 = new OASIntegrationRequest();
        OASIntegrationRequest integrationRequest4 = new OASIntegrationRequest();

        System.assert(integrationRequest1.equals(integrationRequest2));
        System.assert(integrationRequest2.equals(integrationRequest1));
        System.assert(integrationRequest3.equals(integrationRequest4));
        System.assert(integrationRequest4.equals(integrationRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationRequest integrationRequest1 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest2 = new OASIntegrationRequest();

        System.assertEquals(false, integrationRequest1.equals('foo'));
        System.assertEquals(false, integrationRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationRequest integrationRequest1 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest2 = new OASIntegrationRequest();
        OASIntegrationRequest integrationRequest3;

        System.assertEquals(false, integrationRequest1.equals(integrationRequest3));
        System.assertEquals(false, integrationRequest2.equals(integrationRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationRequest integrationRequest1 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest2 = new OASIntegrationRequest();

        System.assertEquals(integrationRequest1.hashCode(), integrationRequest1.hashCode());
        System.assertEquals(integrationRequest2.hashCode(), integrationRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationRequest integrationRequest1 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest2 = OASIntegrationRequest.getExample();
        OASIntegrationRequest integrationRequest3 = new OASIntegrationRequest();
        OASIntegrationRequest integrationRequest4 = new OASIntegrationRequest();

        System.assert(integrationRequest1.equals(integrationRequest2));
        System.assert(integrationRequest3.equals(integrationRequest4));
        System.assertEquals(integrationRequest1.hashCode(), integrationRequest2.hashCode());
        System.assertEquals(integrationRequest3.hashCode(), integrationRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationRequest integrationRequest = new OASIntegrationRequest();
        Map<String, String> x-property-mappings = integrationRequest.getx-property-mappings();
        System.assertEquals('externalBusinessId', x-property-mappings.get('external_business_id'));
        System.assertEquals('connectedMerchantId', x-property-mappings.get('connected_merchant_id'));
        System.assertEquals('connectedAdvertiserId', x-property-mappings.get('connected_advertiser_id'));
        System.assertEquals('connectedLbaId', x-property-mappings.get('connected_lba_id'));
        System.assertEquals('connectedTagId', x-property-mappings.get('connected_tag_id'));
        System.assertEquals('partnerAccessToken', x-property-mappings.get('partner_access_token'));
        System.assertEquals('partnerRefreshToken', x-property-mappings.get('partner_refresh_token'));
        System.assertEquals('partnerPrimaryEmail', x-property-mappings.get('partner_primary_email'));
        System.assertEquals('partnerAccessTokenExpiry', x-property-mappings.get('partner_access_token_expiry'));
        System.assertEquals('partnerRefreshTokenExpiry', x-property-mappings.get('partner_refresh_token_expiry'));
        System.assertEquals('additionalId1', x-property-mappings.get('additional_id_1'));
        System.assertEquals('partnerMetadata', x-property-mappings.get('partner_metadata'));
    }
}
