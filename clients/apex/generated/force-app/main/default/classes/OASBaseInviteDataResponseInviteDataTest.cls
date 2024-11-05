@isTest
private class OASBaseInviteDataResponseInviteDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData1 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData2 = baseInviteDataResponseInviteData1;
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData3 = new OASBaseInviteDataResponseInviteData();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData4 = baseInviteDataResponseInviteData3;

        System.assert(baseInviteDataResponseInviteData1.equals(baseInviteDataResponseInviteData2));
        System.assert(baseInviteDataResponseInviteData2.equals(baseInviteDataResponseInviteData1));
        System.assert(baseInviteDataResponseInviteData1.equals(baseInviteDataResponseInviteData1));
        System.assert(baseInviteDataResponseInviteData3.equals(baseInviteDataResponseInviteData4));
        System.assert(baseInviteDataResponseInviteData4.equals(baseInviteDataResponseInviteData3));
        System.assert(baseInviteDataResponseInviteData3.equals(baseInviteDataResponseInviteData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData1 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData2 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData3 = new OASBaseInviteDataResponseInviteData();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData4 = new OASBaseInviteDataResponseInviteData();

        System.assert(baseInviteDataResponseInviteData1.equals(baseInviteDataResponseInviteData2));
        System.assert(baseInviteDataResponseInviteData2.equals(baseInviteDataResponseInviteData1));
        System.assert(baseInviteDataResponseInviteData3.equals(baseInviteDataResponseInviteData4));
        System.assert(baseInviteDataResponseInviteData4.equals(baseInviteDataResponseInviteData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData1 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData2 = new OASBaseInviteDataResponseInviteData();

        System.assertEquals(false, baseInviteDataResponseInviteData1.equals('foo'));
        System.assertEquals(false, baseInviteDataResponseInviteData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData1 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData2 = new OASBaseInviteDataResponseInviteData();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData3;

        System.assertEquals(false, baseInviteDataResponseInviteData1.equals(baseInviteDataResponseInviteData3));
        System.assertEquals(false, baseInviteDataResponseInviteData2.equals(baseInviteDataResponseInviteData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData1 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData2 = new OASBaseInviteDataResponseInviteData();

        System.assertEquals(baseInviteDataResponseInviteData1.hashCode(), baseInviteDataResponseInviteData1.hashCode());
        System.assertEquals(baseInviteDataResponseInviteData2.hashCode(), baseInviteDataResponseInviteData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData1 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData2 = OASBaseInviteDataResponseInviteData.getExample();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData3 = new OASBaseInviteDataResponseInviteData();
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData4 = new OASBaseInviteDataResponseInviteData();

        System.assert(baseInviteDataResponseInviteData1.equals(baseInviteDataResponseInviteData2));
        System.assert(baseInviteDataResponseInviteData3.equals(baseInviteDataResponseInviteData4));
        System.assertEquals(baseInviteDataResponseInviteData1.hashCode(), baseInviteDataResponseInviteData2.hashCode());
        System.assertEquals(baseInviteDataResponseInviteData3.hashCode(), baseInviteDataResponseInviteData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBaseInviteDataResponseInviteData baseInviteDataResponseInviteData = new OASBaseInviteDataResponseInviteData();
        Map<String, String> x-property-mappings = baseInviteDataResponseInviteData.getx-property-mappings();
        System.assertEquals('inviteExpiration', x-property-mappings.get('invite_expiration'));
        System.assertEquals('inviteStatus', x-property-mappings.get('invite_status'));
        System.assertEquals('inviteType', x-property-mappings.get('invite_type'));
        System.assertEquals('lastUpdatedTime', x-property-mappings.get('last_updated_time'));
        System.assertEquals('sentAt', x-property-mappings.get('sent_at'));
    }
}
