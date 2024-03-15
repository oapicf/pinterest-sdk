@isTest
private class OASAdGroupAudienceSizingRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest1 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest2 = adGroupAudienceSizingRequest1;
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest3 = new OASAdGroupAudienceSizingRequest();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest4 = adGroupAudienceSizingRequest3;

        System.assert(adGroupAudienceSizingRequest1.equals(adGroupAudienceSizingRequest2));
        System.assert(adGroupAudienceSizingRequest2.equals(adGroupAudienceSizingRequest1));
        System.assert(adGroupAudienceSizingRequest1.equals(adGroupAudienceSizingRequest1));
        System.assert(adGroupAudienceSizingRequest3.equals(adGroupAudienceSizingRequest4));
        System.assert(adGroupAudienceSizingRequest4.equals(adGroupAudienceSizingRequest3));
        System.assert(adGroupAudienceSizingRequest3.equals(adGroupAudienceSizingRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest1 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest2 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest3 = new OASAdGroupAudienceSizingRequest();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest4 = new OASAdGroupAudienceSizingRequest();

        System.assert(adGroupAudienceSizingRequest1.equals(adGroupAudienceSizingRequest2));
        System.assert(adGroupAudienceSizingRequest2.equals(adGroupAudienceSizingRequest1));
        System.assert(adGroupAudienceSizingRequest3.equals(adGroupAudienceSizingRequest4));
        System.assert(adGroupAudienceSizingRequest4.equals(adGroupAudienceSizingRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest1 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest2 = new OASAdGroupAudienceSizingRequest();

        System.assertEquals(false, adGroupAudienceSizingRequest1.equals('foo'));
        System.assertEquals(false, adGroupAudienceSizingRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest1 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest2 = new OASAdGroupAudienceSizingRequest();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest3;

        System.assertEquals(false, adGroupAudienceSizingRequest1.equals(adGroupAudienceSizingRequest3));
        System.assertEquals(false, adGroupAudienceSizingRequest2.equals(adGroupAudienceSizingRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest1 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest2 = new OASAdGroupAudienceSizingRequest();

        System.assertEquals(adGroupAudienceSizingRequest1.hashCode(), adGroupAudienceSizingRequest1.hashCode());
        System.assertEquals(adGroupAudienceSizingRequest2.hashCode(), adGroupAudienceSizingRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest1 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest2 = OASAdGroupAudienceSizingRequest.getExample();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest3 = new OASAdGroupAudienceSizingRequest();
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest4 = new OASAdGroupAudienceSizingRequest();

        System.assert(adGroupAudienceSizingRequest1.equals(adGroupAudienceSizingRequest2));
        System.assert(adGroupAudienceSizingRequest3.equals(adGroupAudienceSizingRequest4));
        System.assertEquals(adGroupAudienceSizingRequest1.hashCode(), adGroupAudienceSizingRequest2.hashCode());
        System.assertEquals(adGroupAudienceSizingRequest3.hashCode(), adGroupAudienceSizingRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest = new OASAdGroupAudienceSizingRequest();
        Map<String, String> x-property-mappings = adGroupAudienceSizingRequest.getx-property-mappings();
        System.assertEquals('autoTargetingEnabled', x-property-mappings.get('auto_targeting_enabled'));
        System.assertEquals('placementGroup', x-property-mappings.get('placement_group'));
        System.assertEquals('creativeTypes', x-property-mappings.get('creative_types'));
        System.assertEquals('targetingSpec', x-property-mappings.get('targeting_spec'));
        System.assertEquals('productGroupIds', x-property-mappings.get('product_group_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupAudienceSizingRequest adGroupAudienceSizingRequest = new OASAdGroupAudienceSizingRequest();
        System.assertEquals(true, adGroupAudienceSizingRequest.autoTargetingEnabled);
        System.assertEquals('ALL', adGroupAudienceSizingRequest.placementGroup);
        System.assertEquals(new List<String>(), adGroupAudienceSizingRequest.creativeTypes);
        System.assertEquals(new List<String>(), adGroupAudienceSizingRequest.productGroupIds);
        System.assertEquals(new List<OASAdGroupAudienceSizingRequestKeywo>(), adGroupAudienceSizingRequest.keywords);
        System.assertEquals(null, adGroupAudienceSizingRequest.targetingSpec);
    }
}
