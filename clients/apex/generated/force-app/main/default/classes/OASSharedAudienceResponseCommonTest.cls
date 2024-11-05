@isTest
private class OASSharedAudienceResponseCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon1 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon2 = sharedAudienceResponseCommon1;
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon3 = new OASSharedAudienceResponseCommon();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon4 = sharedAudienceResponseCommon3;

        System.assert(sharedAudienceResponseCommon1.equals(sharedAudienceResponseCommon2));
        System.assert(sharedAudienceResponseCommon2.equals(sharedAudienceResponseCommon1));
        System.assert(sharedAudienceResponseCommon1.equals(sharedAudienceResponseCommon1));
        System.assert(sharedAudienceResponseCommon3.equals(sharedAudienceResponseCommon4));
        System.assert(sharedAudienceResponseCommon4.equals(sharedAudienceResponseCommon3));
        System.assert(sharedAudienceResponseCommon3.equals(sharedAudienceResponseCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon1 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon2 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon3 = new OASSharedAudienceResponseCommon();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon4 = new OASSharedAudienceResponseCommon();

        System.assert(sharedAudienceResponseCommon1.equals(sharedAudienceResponseCommon2));
        System.assert(sharedAudienceResponseCommon2.equals(sharedAudienceResponseCommon1));
        System.assert(sharedAudienceResponseCommon3.equals(sharedAudienceResponseCommon4));
        System.assert(sharedAudienceResponseCommon4.equals(sharedAudienceResponseCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon1 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon2 = new OASSharedAudienceResponseCommon();

        System.assertEquals(false, sharedAudienceResponseCommon1.equals('foo'));
        System.assertEquals(false, sharedAudienceResponseCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon1 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon2 = new OASSharedAudienceResponseCommon();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon3;

        System.assertEquals(false, sharedAudienceResponseCommon1.equals(sharedAudienceResponseCommon3));
        System.assertEquals(false, sharedAudienceResponseCommon2.equals(sharedAudienceResponseCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon1 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon2 = new OASSharedAudienceResponseCommon();

        System.assertEquals(sharedAudienceResponseCommon1.hashCode(), sharedAudienceResponseCommon1.hashCode());
        System.assertEquals(sharedAudienceResponseCommon2.hashCode(), sharedAudienceResponseCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon1 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon2 = OASSharedAudienceResponseCommon.getExample();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon3 = new OASSharedAudienceResponseCommon();
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon4 = new OASSharedAudienceResponseCommon();

        System.assert(sharedAudienceResponseCommon1.equals(sharedAudienceResponseCommon2));
        System.assert(sharedAudienceResponseCommon3.equals(sharedAudienceResponseCommon4));
        System.assertEquals(sharedAudienceResponseCommon1.hashCode(), sharedAudienceResponseCommon2.hashCode());
        System.assertEquals(sharedAudienceResponseCommon3.hashCode(), sharedAudienceResponseCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon = new OASSharedAudienceResponseCommon();
        Map<String, String> x-property-mappings = sharedAudienceResponseCommon.getx-property-mappings();
        System.assertEquals('audienceId', x-property-mappings.get('audience_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSharedAudienceResponseCommon sharedAudienceResponseCommon = new OASSharedAudienceResponseCommon();
        System.assertEquals(new List<OASRole>(), sharedAudienceResponseCommon.permissions);
        System.assertEquals(null, sharedAudienceResponseCommon.audienceId);
    }
}
