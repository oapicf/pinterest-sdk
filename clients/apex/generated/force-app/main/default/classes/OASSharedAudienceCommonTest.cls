@isTest
private class OASSharedAudienceCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASSharedAudienceCommon sharedAudienceCommon1 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon2 = sharedAudienceCommon1;
        OASSharedAudienceCommon sharedAudienceCommon3 = new OASSharedAudienceCommon();
        OASSharedAudienceCommon sharedAudienceCommon4 = sharedAudienceCommon3;

        System.assert(sharedAudienceCommon1.equals(sharedAudienceCommon2));
        System.assert(sharedAudienceCommon2.equals(sharedAudienceCommon1));
        System.assert(sharedAudienceCommon1.equals(sharedAudienceCommon1));
        System.assert(sharedAudienceCommon3.equals(sharedAudienceCommon4));
        System.assert(sharedAudienceCommon4.equals(sharedAudienceCommon3));
        System.assert(sharedAudienceCommon3.equals(sharedAudienceCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSharedAudienceCommon sharedAudienceCommon1 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon2 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon3 = new OASSharedAudienceCommon();
        OASSharedAudienceCommon sharedAudienceCommon4 = new OASSharedAudienceCommon();

        System.assert(sharedAudienceCommon1.equals(sharedAudienceCommon2));
        System.assert(sharedAudienceCommon2.equals(sharedAudienceCommon1));
        System.assert(sharedAudienceCommon3.equals(sharedAudienceCommon4));
        System.assert(sharedAudienceCommon4.equals(sharedAudienceCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSharedAudienceCommon sharedAudienceCommon1 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon2 = new OASSharedAudienceCommon();

        System.assertEquals(false, sharedAudienceCommon1.equals('foo'));
        System.assertEquals(false, sharedAudienceCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSharedAudienceCommon sharedAudienceCommon1 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon2 = new OASSharedAudienceCommon();
        OASSharedAudienceCommon sharedAudienceCommon3;

        System.assertEquals(false, sharedAudienceCommon1.equals(sharedAudienceCommon3));
        System.assertEquals(false, sharedAudienceCommon2.equals(sharedAudienceCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSharedAudienceCommon sharedAudienceCommon1 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon2 = new OASSharedAudienceCommon();

        System.assertEquals(sharedAudienceCommon1.hashCode(), sharedAudienceCommon1.hashCode());
        System.assertEquals(sharedAudienceCommon2.hashCode(), sharedAudienceCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSharedAudienceCommon sharedAudienceCommon1 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon2 = OASSharedAudienceCommon.getExample();
        OASSharedAudienceCommon sharedAudienceCommon3 = new OASSharedAudienceCommon();
        OASSharedAudienceCommon sharedAudienceCommon4 = new OASSharedAudienceCommon();

        System.assert(sharedAudienceCommon1.equals(sharedAudienceCommon2));
        System.assert(sharedAudienceCommon3.equals(sharedAudienceCommon4));
        System.assertEquals(sharedAudienceCommon1.hashCode(), sharedAudienceCommon2.hashCode());
        System.assertEquals(sharedAudienceCommon3.hashCode(), sharedAudienceCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSharedAudienceCommon sharedAudienceCommon = new OASSharedAudienceCommon();
        Map<String, String> x-property-mappings = sharedAudienceCommon.getx-property-mappings();
        System.assertEquals('audienceId', x-property-mappings.get('audience_id'));
        System.assertEquals('operationType', x-property-mappings.get('operation_type'));
    }
}
