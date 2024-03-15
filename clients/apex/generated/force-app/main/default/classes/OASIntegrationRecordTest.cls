@isTest
private class OASIntegrationRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationRecord integrationRecord1 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord2 = integrationRecord1;
        OASIntegrationRecord integrationRecord3 = new OASIntegrationRecord();
        OASIntegrationRecord integrationRecord4 = integrationRecord3;

        System.assert(integrationRecord1.equals(integrationRecord2));
        System.assert(integrationRecord2.equals(integrationRecord1));
        System.assert(integrationRecord1.equals(integrationRecord1));
        System.assert(integrationRecord3.equals(integrationRecord4));
        System.assert(integrationRecord4.equals(integrationRecord3));
        System.assert(integrationRecord3.equals(integrationRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationRecord integrationRecord1 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord2 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord3 = new OASIntegrationRecord();
        OASIntegrationRecord integrationRecord4 = new OASIntegrationRecord();

        System.assert(integrationRecord1.equals(integrationRecord2));
        System.assert(integrationRecord2.equals(integrationRecord1));
        System.assert(integrationRecord3.equals(integrationRecord4));
        System.assert(integrationRecord4.equals(integrationRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationRecord integrationRecord1 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord2 = new OASIntegrationRecord();

        System.assertEquals(false, integrationRecord1.equals('foo'));
        System.assertEquals(false, integrationRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationRecord integrationRecord1 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord2 = new OASIntegrationRecord();
        OASIntegrationRecord integrationRecord3;

        System.assertEquals(false, integrationRecord1.equals(integrationRecord3));
        System.assertEquals(false, integrationRecord2.equals(integrationRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationRecord integrationRecord1 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord2 = new OASIntegrationRecord();

        System.assertEquals(integrationRecord1.hashCode(), integrationRecord1.hashCode());
        System.assertEquals(integrationRecord2.hashCode(), integrationRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationRecord integrationRecord1 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord2 = OASIntegrationRecord.getExample();
        OASIntegrationRecord integrationRecord3 = new OASIntegrationRecord();
        OASIntegrationRecord integrationRecord4 = new OASIntegrationRecord();

        System.assert(integrationRecord1.equals(integrationRecord2));
        System.assert(integrationRecord3.equals(integrationRecord4));
        System.assertEquals(integrationRecord1.hashCode(), integrationRecord2.hashCode());
        System.assertEquals(integrationRecord3.hashCode(), integrationRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationRecord integrationRecord = new OASIntegrationRecord();
        Map<String, String> x-property-mappings = integrationRecord.getx-property-mappings();
        System.assertEquals('externalBusinessId', x-property-mappings.get('external_business_id'));
        System.assertEquals('connectedMerchantId', x-property-mappings.get('connected_merchant_id'));
        System.assertEquals('connectedUserId', x-property-mappings.get('connected_user_id'));
        System.assertEquals('connectedAdvertiserId', x-property-mappings.get('connected_advertiser_id'));
        System.assertEquals('connectedLbaId', x-property-mappings.get('connected_lba_id'));
        System.assertEquals('connectedTagId', x-property-mappings.get('connected_tag_id'));
        System.assertEquals('partnerAccessToken', x-property-mappings.get('partner_access_token'));
        System.assertEquals('partnerRefreshToken', x-property-mappings.get('partner_refresh_token'));
        System.assertEquals('partnerPrimaryEmail', x-property-mappings.get('partner_primary_email'));
        System.assertEquals('partnerAccessTokenExpiry', x-property-mappings.get('partner_access_token_expiry'));
        System.assertEquals('partnerRefreshTokenExpiry', x-property-mappings.get('partner_refresh_token_expiry'));
        System.assertEquals('partnerMetadata', x-property-mappings.get('partner_metadata'));
        System.assertEquals('additionalId1', x-property-mappings.get('additional_id_1'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }
}
