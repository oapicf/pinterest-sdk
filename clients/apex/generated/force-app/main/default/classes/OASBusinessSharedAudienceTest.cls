@isTest
private class OASBusinessSharedAudienceTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessSharedAudience businessSharedAudience1 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience2 = businessSharedAudience1;
        OASBusinessSharedAudience businessSharedAudience3 = new OASBusinessSharedAudience();
        OASBusinessSharedAudience businessSharedAudience4 = businessSharedAudience3;

        System.assert(businessSharedAudience1.equals(businessSharedAudience2));
        System.assert(businessSharedAudience2.equals(businessSharedAudience1));
        System.assert(businessSharedAudience1.equals(businessSharedAudience1));
        System.assert(businessSharedAudience3.equals(businessSharedAudience4));
        System.assert(businessSharedAudience4.equals(businessSharedAudience3));
        System.assert(businessSharedAudience3.equals(businessSharedAudience3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessSharedAudience businessSharedAudience1 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience2 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience3 = new OASBusinessSharedAudience();
        OASBusinessSharedAudience businessSharedAudience4 = new OASBusinessSharedAudience();

        System.assert(businessSharedAudience1.equals(businessSharedAudience2));
        System.assert(businessSharedAudience2.equals(businessSharedAudience1));
        System.assert(businessSharedAudience3.equals(businessSharedAudience4));
        System.assert(businessSharedAudience4.equals(businessSharedAudience3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessSharedAudience businessSharedAudience1 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience2 = new OASBusinessSharedAudience();

        System.assertEquals(false, businessSharedAudience1.equals('foo'));
        System.assertEquals(false, businessSharedAudience2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessSharedAudience businessSharedAudience1 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience2 = new OASBusinessSharedAudience();
        OASBusinessSharedAudience businessSharedAudience3;

        System.assertEquals(false, businessSharedAudience1.equals(businessSharedAudience3));
        System.assertEquals(false, businessSharedAudience2.equals(businessSharedAudience3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessSharedAudience businessSharedAudience1 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience2 = new OASBusinessSharedAudience();

        System.assertEquals(businessSharedAudience1.hashCode(), businessSharedAudience1.hashCode());
        System.assertEquals(businessSharedAudience2.hashCode(), businessSharedAudience2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessSharedAudience businessSharedAudience1 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience2 = OASBusinessSharedAudience.getExample();
        OASBusinessSharedAudience businessSharedAudience3 = new OASBusinessSharedAudience();
        OASBusinessSharedAudience businessSharedAudience4 = new OASBusinessSharedAudience();

        System.assert(businessSharedAudience1.equals(businessSharedAudience2));
        System.assert(businessSharedAudience3.equals(businessSharedAudience4));
        System.assertEquals(businessSharedAudience1.hashCode(), businessSharedAudience2.hashCode());
        System.assertEquals(businessSharedAudience3.hashCode(), businessSharedAudience4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBusinessSharedAudience businessSharedAudience = new OASBusinessSharedAudience();
        Map<String, String> x-property-mappings = businessSharedAudience.getx-property-mappings();
        System.assertEquals('audienceId', x-property-mappings.get('audience_id'));
        System.assertEquals('operationType', x-property-mappings.get('operation_type'));
        System.assertEquals('recipientBusinessIds', x-property-mappings.get('recipient_business_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessSharedAudience businessSharedAudience = new OASBusinessSharedAudience();
        System.assertEquals(new List<String>(), businessSharedAudience.recipientBusinessIds);
        System.assertEquals(null, businessSharedAudience.audienceId);
        System.assertEquals(null, businessSharedAudience.operationType);
    }
}
