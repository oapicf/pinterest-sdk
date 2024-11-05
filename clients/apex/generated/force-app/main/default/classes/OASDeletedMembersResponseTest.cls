@isTest
private class OASDeletedMembersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletedMembersResponse deletedMembersResponse1 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse2 = deletedMembersResponse1;
        OASDeletedMembersResponse deletedMembersResponse3 = new OASDeletedMembersResponse();
        OASDeletedMembersResponse deletedMembersResponse4 = deletedMembersResponse3;

        System.assert(deletedMembersResponse1.equals(deletedMembersResponse2));
        System.assert(deletedMembersResponse2.equals(deletedMembersResponse1));
        System.assert(deletedMembersResponse1.equals(deletedMembersResponse1));
        System.assert(deletedMembersResponse3.equals(deletedMembersResponse4));
        System.assert(deletedMembersResponse4.equals(deletedMembersResponse3));
        System.assert(deletedMembersResponse3.equals(deletedMembersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletedMembersResponse deletedMembersResponse1 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse2 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse3 = new OASDeletedMembersResponse();
        OASDeletedMembersResponse deletedMembersResponse4 = new OASDeletedMembersResponse();

        System.assert(deletedMembersResponse1.equals(deletedMembersResponse2));
        System.assert(deletedMembersResponse2.equals(deletedMembersResponse1));
        System.assert(deletedMembersResponse3.equals(deletedMembersResponse4));
        System.assert(deletedMembersResponse4.equals(deletedMembersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletedMembersResponse deletedMembersResponse1 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse2 = new OASDeletedMembersResponse();

        System.assertEquals(false, deletedMembersResponse1.equals('foo'));
        System.assertEquals(false, deletedMembersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletedMembersResponse deletedMembersResponse1 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse2 = new OASDeletedMembersResponse();
        OASDeletedMembersResponse deletedMembersResponse3;

        System.assertEquals(false, deletedMembersResponse1.equals(deletedMembersResponse3));
        System.assertEquals(false, deletedMembersResponse2.equals(deletedMembersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletedMembersResponse deletedMembersResponse1 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse2 = new OASDeletedMembersResponse();

        System.assertEquals(deletedMembersResponse1.hashCode(), deletedMembersResponse1.hashCode());
        System.assertEquals(deletedMembersResponse2.hashCode(), deletedMembersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletedMembersResponse deletedMembersResponse1 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse2 = OASDeletedMembersResponse.getExample();
        OASDeletedMembersResponse deletedMembersResponse3 = new OASDeletedMembersResponse();
        OASDeletedMembersResponse deletedMembersResponse4 = new OASDeletedMembersResponse();

        System.assert(deletedMembersResponse1.equals(deletedMembersResponse2));
        System.assert(deletedMembersResponse3.equals(deletedMembersResponse4));
        System.assertEquals(deletedMembersResponse1.hashCode(), deletedMembersResponse2.hashCode());
        System.assertEquals(deletedMembersResponse3.hashCode(), deletedMembersResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeletedMembersResponse deletedMembersResponse = new OASDeletedMembersResponse();
        Map<String, String> x-property-mappings = deletedMembersResponse.getx-property-mappings();
        System.assertEquals('deletedMembers', x-property-mappings.get('deleted_members'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletedMembersResponse deletedMembersResponse = new OASDeletedMembersResponse();
        System.assertEquals(new List<String>(), deletedMembersResponse.deletedMembers);
    }
}
