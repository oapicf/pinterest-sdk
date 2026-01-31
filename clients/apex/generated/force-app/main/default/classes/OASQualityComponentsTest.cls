@isTest
private class OASQualityComponentsTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityComponents qualityComponents1 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents2 = qualityComponents1;
        OASQualityComponents qualityComponents3 = new OASQualityComponents();
        OASQualityComponents qualityComponents4 = qualityComponents3;

        System.assert(qualityComponents1.equals(qualityComponents2));
        System.assert(qualityComponents2.equals(qualityComponents1));
        System.assert(qualityComponents1.equals(qualityComponents1));
        System.assert(qualityComponents3.equals(qualityComponents4));
        System.assert(qualityComponents4.equals(qualityComponents3));
        System.assert(qualityComponents3.equals(qualityComponents3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityComponents qualityComponents1 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents2 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents3 = new OASQualityComponents();
        OASQualityComponents qualityComponents4 = new OASQualityComponents();

        System.assert(qualityComponents1.equals(qualityComponents2));
        System.assert(qualityComponents2.equals(qualityComponents1));
        System.assert(qualityComponents3.equals(qualityComponents4));
        System.assert(qualityComponents4.equals(qualityComponents3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityComponents qualityComponents1 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents2 = new OASQualityComponents();

        System.assertEquals(false, qualityComponents1.equals('foo'));
        System.assertEquals(false, qualityComponents2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityComponents qualityComponents1 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents2 = new OASQualityComponents();
        OASQualityComponents qualityComponents3;

        System.assertEquals(false, qualityComponents1.equals(qualityComponents3));
        System.assertEquals(false, qualityComponents2.equals(qualityComponents3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityComponents qualityComponents1 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents2 = new OASQualityComponents();

        System.assertEquals(qualityComponents1.hashCode(), qualityComponents1.hashCode());
        System.assertEquals(qualityComponents2.hashCode(), qualityComponents2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityComponents qualityComponents1 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents2 = OASQualityComponents.getExample();
        OASQualityComponents qualityComponents3 = new OASQualityComponents();
        OASQualityComponents qualityComponents4 = new OASQualityComponents();

        System.assert(qualityComponents1.equals(qualityComponents2));
        System.assert(qualityComponents3.equals(qualityComponents4));
        System.assertEquals(qualityComponents1.hashCode(), qualityComponents2.hashCode());
        System.assertEquals(qualityComponents3.hashCode(), qualityComponents4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASQualityComponents qualityComponents = new OASQualityComponents();
        Map<String, String> x-property-mappings = qualityComponents.getx-property-mappings();
        System.assertEquals('advertiserExternalId', x-property-mappings.get('advertiser_external_id'));
        System.assertEquals('clickIdEpik', x-property-mappings.get('click_id_epik'));
        System.assertEquals('externalEventId', x-property-mappings.get('external_event_id'));
        System.assertEquals('hashedEmail', x-property-mappings.get('hashed_email'));
        System.assertEquals('hashedMaid', x-property-mappings.get('hashed_maid'));
        System.assertEquals('ipAddress', x-property-mappings.get('ip_address'));
        System.assertEquals('orderId', x-property-mappings.get('order_id'));
        System.assertEquals('orderValue', x-property-mappings.get('order_value'));
        System.assertEquals('productId', x-property-mappings.get('product_id'));
        System.assertEquals('sourceUrl', x-property-mappings.get('source_url'));
        System.assertEquals('userAgent', x-property-mappings.get('user_agent'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQualityComponents qualityComponents = new OASQualityComponents();
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.advertiserExternalId);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.clickIdEpik);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.externalEventId);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.hashedEmail);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.hashedMaid);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.ipAddress);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.orderId);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.orderValue);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.productId);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.sourceUrl);
        System.assertEquals(new Map<String, OASQualityComponentDetails>(), qualityComponents.userAgent);
    }
}
