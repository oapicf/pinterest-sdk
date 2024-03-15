@isTest
private class OASIntegrationMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationMetadata integrationMetadata1 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata2 = integrationMetadata1;
        OASIntegrationMetadata integrationMetadata3 = new OASIntegrationMetadata();
        OASIntegrationMetadata integrationMetadata4 = integrationMetadata3;

        System.assert(integrationMetadata1.equals(integrationMetadata2));
        System.assert(integrationMetadata2.equals(integrationMetadata1));
        System.assert(integrationMetadata1.equals(integrationMetadata1));
        System.assert(integrationMetadata3.equals(integrationMetadata4));
        System.assert(integrationMetadata4.equals(integrationMetadata3));
        System.assert(integrationMetadata3.equals(integrationMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationMetadata integrationMetadata1 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata2 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata3 = new OASIntegrationMetadata();
        OASIntegrationMetadata integrationMetadata4 = new OASIntegrationMetadata();

        System.assert(integrationMetadata1.equals(integrationMetadata2));
        System.assert(integrationMetadata2.equals(integrationMetadata1));
        System.assert(integrationMetadata3.equals(integrationMetadata4));
        System.assert(integrationMetadata4.equals(integrationMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationMetadata integrationMetadata1 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata2 = new OASIntegrationMetadata();

        System.assertEquals(false, integrationMetadata1.equals('foo'));
        System.assertEquals(false, integrationMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationMetadata integrationMetadata1 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata2 = new OASIntegrationMetadata();
        OASIntegrationMetadata integrationMetadata3;

        System.assertEquals(false, integrationMetadata1.equals(integrationMetadata3));
        System.assertEquals(false, integrationMetadata2.equals(integrationMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationMetadata integrationMetadata1 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata2 = new OASIntegrationMetadata();

        System.assertEquals(integrationMetadata1.hashCode(), integrationMetadata1.hashCode());
        System.assertEquals(integrationMetadata2.hashCode(), integrationMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationMetadata integrationMetadata1 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata2 = OASIntegrationMetadata.getExample();
        OASIntegrationMetadata integrationMetadata3 = new OASIntegrationMetadata();
        OASIntegrationMetadata integrationMetadata4 = new OASIntegrationMetadata();

        System.assert(integrationMetadata1.equals(integrationMetadata2));
        System.assert(integrationMetadata3.equals(integrationMetadata4));
        System.assertEquals(integrationMetadata1.hashCode(), integrationMetadata2.hashCode());
        System.assertEquals(integrationMetadata3.hashCode(), integrationMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationMetadata integrationMetadata = new OASIntegrationMetadata();
        Map<String, String> x-property-mappings = integrationMetadata.getx-property-mappings();
        System.assertEquals('externalBusinessId', x-property-mappings.get('external_business_id'));
        System.assertEquals('connectedMerchantId', x-property-mappings.get('connected_merchant_id'));
        System.assertEquals('connectedUserId', x-property-mappings.get('connected_user_id'));
        System.assertEquals('connectedAdvertiserId', x-property-mappings.get('connected_advertiser_id'));
        System.assertEquals('connectedLbaId', x-property-mappings.get('connected_lba_id'));
        System.assertEquals('connectedTagId', x-property-mappings.get('connected_tag_id'));
        System.assertEquals('partnerAccessTokenExpiry', x-property-mappings.get('partner_access_token_expiry'));
        System.assertEquals('partnerRefreshTokenExpiry', x-property-mappings.get('partner_refresh_token_expiry'));
        System.assertEquals('createdTimestamp', x-property-mappings.get('created_timestamp'));
        System.assertEquals('updatedTimestamp', x-property-mappings.get('updated_timestamp'));
        System.assertEquals('additionalId1', x-property-mappings.get('additional_id_1'));
        System.assertEquals('partnerMetadata', x-property-mappings.get('partner_metadata'));
    }
}
