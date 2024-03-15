@isTest
private class OASSingleInterestTargetingOptionRespTest {
    @isTest
    private static void equalsSameInstance() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse1 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse2 = singleInterestTargetingOptionResponse1;
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse3 = new OASSingleInterestTargetingOptionResp();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse4 = singleInterestTargetingOptionResponse3;

        System.assert(singleInterestTargetingOptionResponse1.equals(singleInterestTargetingOptionResponse2));
        System.assert(singleInterestTargetingOptionResponse2.equals(singleInterestTargetingOptionResponse1));
        System.assert(singleInterestTargetingOptionResponse1.equals(singleInterestTargetingOptionResponse1));
        System.assert(singleInterestTargetingOptionResponse3.equals(singleInterestTargetingOptionResponse4));
        System.assert(singleInterestTargetingOptionResponse4.equals(singleInterestTargetingOptionResponse3));
        System.assert(singleInterestTargetingOptionResponse3.equals(singleInterestTargetingOptionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse1 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse2 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse3 = new OASSingleInterestTargetingOptionResp();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse4 = new OASSingleInterestTargetingOptionResp();

        System.assert(singleInterestTargetingOptionResponse1.equals(singleInterestTargetingOptionResponse2));
        System.assert(singleInterestTargetingOptionResponse2.equals(singleInterestTargetingOptionResponse1));
        System.assert(singleInterestTargetingOptionResponse3.equals(singleInterestTargetingOptionResponse4));
        System.assert(singleInterestTargetingOptionResponse4.equals(singleInterestTargetingOptionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse1 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse2 = new OASSingleInterestTargetingOptionResp();

        System.assertEquals(false, singleInterestTargetingOptionResponse1.equals('foo'));
        System.assertEquals(false, singleInterestTargetingOptionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse1 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse2 = new OASSingleInterestTargetingOptionResp();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse3;

        System.assertEquals(false, singleInterestTargetingOptionResponse1.equals(singleInterestTargetingOptionResponse3));
        System.assertEquals(false, singleInterestTargetingOptionResponse2.equals(singleInterestTargetingOptionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse1 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse2 = new OASSingleInterestTargetingOptionResp();

        System.assertEquals(singleInterestTargetingOptionResponse1.hashCode(), singleInterestTargetingOptionResponse1.hashCode());
        System.assertEquals(singleInterestTargetingOptionResponse2.hashCode(), singleInterestTargetingOptionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse1 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse2 = OASSingleInterestTargetingOptionResp.getExample();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse3 = new OASSingleInterestTargetingOptionResp();
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse4 = new OASSingleInterestTargetingOptionResp();

        System.assert(singleInterestTargetingOptionResponse1.equals(singleInterestTargetingOptionResponse2));
        System.assert(singleInterestTargetingOptionResponse3.equals(singleInterestTargetingOptionResponse4));
        System.assertEquals(singleInterestTargetingOptionResponse1.hashCode(), singleInterestTargetingOptionResponse2.hashCode());
        System.assertEquals(singleInterestTargetingOptionResponse3.hashCode(), singleInterestTargetingOptionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse = new OASSingleInterestTargetingOptionResp();
        Map<String, String> x-property-mappings = singleInterestTargetingOptionResponse.getx-property-mappings();
        System.assertEquals('childInterests', x-property-mappings.get('child_interests'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSingleInterestTargetingOptionResp singleInterestTargetingOptionResponse = new OASSingleInterestTargetingOptionResp();
        System.assertEquals(new List<String>(), singleInterestTargetingOptionResponse.childInterests);
        System.assertEquals(null, singleInterestTargetingOptionResponse.id);
        System.assertEquals(null, singleInterestTargetingOptionResponse.name);
        System.assertEquals(null, singleInterestTargetingOptionResponse.level);
    }
}
