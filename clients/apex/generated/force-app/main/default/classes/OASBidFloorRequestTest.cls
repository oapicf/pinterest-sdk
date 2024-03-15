@isTest
private class OASBidFloorRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASBidFloorRequest bidFloorRequest1 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest2 = bidFloorRequest1;
        OASBidFloorRequest bidFloorRequest3 = new OASBidFloorRequest();
        OASBidFloorRequest bidFloorRequest4 = bidFloorRequest3;

        System.assert(bidFloorRequest1.equals(bidFloorRequest2));
        System.assert(bidFloorRequest2.equals(bidFloorRequest1));
        System.assert(bidFloorRequest1.equals(bidFloorRequest1));
        System.assert(bidFloorRequest3.equals(bidFloorRequest4));
        System.assert(bidFloorRequest4.equals(bidFloorRequest3));
        System.assert(bidFloorRequest3.equals(bidFloorRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBidFloorRequest bidFloorRequest1 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest2 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest3 = new OASBidFloorRequest();
        OASBidFloorRequest bidFloorRequest4 = new OASBidFloorRequest();

        System.assert(bidFloorRequest1.equals(bidFloorRequest2));
        System.assert(bidFloorRequest2.equals(bidFloorRequest1));
        System.assert(bidFloorRequest3.equals(bidFloorRequest4));
        System.assert(bidFloorRequest4.equals(bidFloorRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBidFloorRequest bidFloorRequest1 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest2 = new OASBidFloorRequest();

        System.assertEquals(false, bidFloorRequest1.equals('foo'));
        System.assertEquals(false, bidFloorRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBidFloorRequest bidFloorRequest1 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest2 = new OASBidFloorRequest();
        OASBidFloorRequest bidFloorRequest3;

        System.assertEquals(false, bidFloorRequest1.equals(bidFloorRequest3));
        System.assertEquals(false, bidFloorRequest2.equals(bidFloorRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBidFloorRequest bidFloorRequest1 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest2 = new OASBidFloorRequest();

        System.assertEquals(bidFloorRequest1.hashCode(), bidFloorRequest1.hashCode());
        System.assertEquals(bidFloorRequest2.hashCode(), bidFloorRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBidFloorRequest bidFloorRequest1 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest2 = OASBidFloorRequest.getExample();
        OASBidFloorRequest bidFloorRequest3 = new OASBidFloorRequest();
        OASBidFloorRequest bidFloorRequest4 = new OASBidFloorRequest();

        System.assert(bidFloorRequest1.equals(bidFloorRequest2));
        System.assert(bidFloorRequest3.equals(bidFloorRequest4));
        System.assertEquals(bidFloorRequest1.hashCode(), bidFloorRequest2.hashCode());
        System.assertEquals(bidFloorRequest3.hashCode(), bidFloorRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBidFloorRequest bidFloorRequest = new OASBidFloorRequest();
        Map<String, String> x-property-mappings = bidFloorRequest.getx-property-mappings();
        System.assertEquals('bidFloorSpecs', x-property-mappings.get('bid_floor_specs'));
        System.assertEquals('targetingSpec', x-property-mappings.get('targeting_spec'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBidFloorRequest bidFloorRequest = new OASBidFloorRequest();
        System.assertEquals(new List<OASBidFloorSpec>(), bidFloorRequest.bidFloorSpecs);
        System.assertEquals(null, bidFloorRequest.targetingSpec);
    }
}
