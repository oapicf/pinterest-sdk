@isTest
private class OASSharedAudienceTest {
    @isTest
    private static void equalsSameInstance() {
        OASSharedAudience sharedAudience1 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience2 = sharedAudience1;
        OASSharedAudience sharedAudience3 = new OASSharedAudience();
        OASSharedAudience sharedAudience4 = sharedAudience3;

        System.assert(sharedAudience1.equals(sharedAudience2));
        System.assert(sharedAudience2.equals(sharedAudience1));
        System.assert(sharedAudience1.equals(sharedAudience1));
        System.assert(sharedAudience3.equals(sharedAudience4));
        System.assert(sharedAudience4.equals(sharedAudience3));
        System.assert(sharedAudience3.equals(sharedAudience3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSharedAudience sharedAudience1 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience2 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience3 = new OASSharedAudience();
        OASSharedAudience sharedAudience4 = new OASSharedAudience();

        System.assert(sharedAudience1.equals(sharedAudience2));
        System.assert(sharedAudience2.equals(sharedAudience1));
        System.assert(sharedAudience3.equals(sharedAudience4));
        System.assert(sharedAudience4.equals(sharedAudience3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSharedAudience sharedAudience1 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience2 = new OASSharedAudience();

        System.assertEquals(false, sharedAudience1.equals('foo'));
        System.assertEquals(false, sharedAudience2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSharedAudience sharedAudience1 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience2 = new OASSharedAudience();
        OASSharedAudience sharedAudience3;

        System.assertEquals(false, sharedAudience1.equals(sharedAudience3));
        System.assertEquals(false, sharedAudience2.equals(sharedAudience3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSharedAudience sharedAudience1 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience2 = new OASSharedAudience();

        System.assertEquals(sharedAudience1.hashCode(), sharedAudience1.hashCode());
        System.assertEquals(sharedAudience2.hashCode(), sharedAudience2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSharedAudience sharedAudience1 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience2 = OASSharedAudience.getExample();
        OASSharedAudience sharedAudience3 = new OASSharedAudience();
        OASSharedAudience sharedAudience4 = new OASSharedAudience();

        System.assert(sharedAudience1.equals(sharedAudience2));
        System.assert(sharedAudience3.equals(sharedAudience4));
        System.assertEquals(sharedAudience1.hashCode(), sharedAudience2.hashCode());
        System.assertEquals(sharedAudience3.hashCode(), sharedAudience4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSharedAudience sharedAudience = new OASSharedAudience();
        Map<String, String> x-property-mappings = sharedAudience.getx-property-mappings();
        System.assertEquals('audienceId', x-property-mappings.get('audience_id'));
        System.assertEquals('operationType', x-property-mappings.get('operation_type'));
        System.assertEquals('recipientAccountIds', x-property-mappings.get('recipient_account_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSharedAudience sharedAudience = new OASSharedAudience();
        System.assertEquals(new List<String>(), sharedAudience.recipientAccountIds);
        System.assertEquals(null, sharedAudience.audienceId);
        System.assertEquals(null, sharedAudience.operationType);
    }
}
