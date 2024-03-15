@isTest
private class OASIntegrationRequestPatchTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationRequestPatch integrationRequestPatch1 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch2 = integrationRequestPatch1;
        OASIntegrationRequestPatch integrationRequestPatch3 = new OASIntegrationRequestPatch();
        OASIntegrationRequestPatch integrationRequestPatch4 = integrationRequestPatch3;

        System.assert(integrationRequestPatch1.equals(integrationRequestPatch2));
        System.assert(integrationRequestPatch2.equals(integrationRequestPatch1));
        System.assert(integrationRequestPatch1.equals(integrationRequestPatch1));
        System.assert(integrationRequestPatch3.equals(integrationRequestPatch4));
        System.assert(integrationRequestPatch4.equals(integrationRequestPatch3));
        System.assert(integrationRequestPatch3.equals(integrationRequestPatch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationRequestPatch integrationRequestPatch1 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch2 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch3 = new OASIntegrationRequestPatch();
        OASIntegrationRequestPatch integrationRequestPatch4 = new OASIntegrationRequestPatch();

        System.assert(integrationRequestPatch1.equals(integrationRequestPatch2));
        System.assert(integrationRequestPatch2.equals(integrationRequestPatch1));
        System.assert(integrationRequestPatch3.equals(integrationRequestPatch4));
        System.assert(integrationRequestPatch4.equals(integrationRequestPatch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationRequestPatch integrationRequestPatch1 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch2 = new OASIntegrationRequestPatch();

        System.assertEquals(false, integrationRequestPatch1.equals('foo'));
        System.assertEquals(false, integrationRequestPatch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationRequestPatch integrationRequestPatch1 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch2 = new OASIntegrationRequestPatch();
        OASIntegrationRequestPatch integrationRequestPatch3;

        System.assertEquals(false, integrationRequestPatch1.equals(integrationRequestPatch3));
        System.assertEquals(false, integrationRequestPatch2.equals(integrationRequestPatch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationRequestPatch integrationRequestPatch1 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch2 = new OASIntegrationRequestPatch();

        System.assertEquals(integrationRequestPatch1.hashCode(), integrationRequestPatch1.hashCode());
        System.assertEquals(integrationRequestPatch2.hashCode(), integrationRequestPatch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationRequestPatch integrationRequestPatch1 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch2 = OASIntegrationRequestPatch.getExample();
        OASIntegrationRequestPatch integrationRequestPatch3 = new OASIntegrationRequestPatch();
        OASIntegrationRequestPatch integrationRequestPatch4 = new OASIntegrationRequestPatch();

        System.assert(integrationRequestPatch1.equals(integrationRequestPatch2));
        System.assert(integrationRequestPatch3.equals(integrationRequestPatch4));
        System.assertEquals(integrationRequestPatch1.hashCode(), integrationRequestPatch2.hashCode());
        System.assertEquals(integrationRequestPatch3.hashCode(), integrationRequestPatch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationRequestPatch integrationRequestPatch = new OASIntegrationRequestPatch();
        Map<String, String> x-property-mappings = integrationRequestPatch.getx-property-mappings();
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
