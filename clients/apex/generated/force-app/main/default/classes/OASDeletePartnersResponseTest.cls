@isTest
private class OASDeletePartnersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePartnersResponse deletePartnersResponse1 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse2 = deletePartnersResponse1;
        OASDeletePartnersResponse deletePartnersResponse3 = new OASDeletePartnersResponse();
        OASDeletePartnersResponse deletePartnersResponse4 = deletePartnersResponse3;

        System.assert(deletePartnersResponse1.equals(deletePartnersResponse2));
        System.assert(deletePartnersResponse2.equals(deletePartnersResponse1));
        System.assert(deletePartnersResponse1.equals(deletePartnersResponse1));
        System.assert(deletePartnersResponse3.equals(deletePartnersResponse4));
        System.assert(deletePartnersResponse4.equals(deletePartnersResponse3));
        System.assert(deletePartnersResponse3.equals(deletePartnersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePartnersResponse deletePartnersResponse1 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse2 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse3 = new OASDeletePartnersResponse();
        OASDeletePartnersResponse deletePartnersResponse4 = new OASDeletePartnersResponse();

        System.assert(deletePartnersResponse1.equals(deletePartnersResponse2));
        System.assert(deletePartnersResponse2.equals(deletePartnersResponse1));
        System.assert(deletePartnersResponse3.equals(deletePartnersResponse4));
        System.assert(deletePartnersResponse4.equals(deletePartnersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePartnersResponse deletePartnersResponse1 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse2 = new OASDeletePartnersResponse();

        System.assertEquals(false, deletePartnersResponse1.equals('foo'));
        System.assertEquals(false, deletePartnersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePartnersResponse deletePartnersResponse1 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse2 = new OASDeletePartnersResponse();
        OASDeletePartnersResponse deletePartnersResponse3;

        System.assertEquals(false, deletePartnersResponse1.equals(deletePartnersResponse3));
        System.assertEquals(false, deletePartnersResponse2.equals(deletePartnersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePartnersResponse deletePartnersResponse1 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse2 = new OASDeletePartnersResponse();

        System.assertEquals(deletePartnersResponse1.hashCode(), deletePartnersResponse1.hashCode());
        System.assertEquals(deletePartnersResponse2.hashCode(), deletePartnersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePartnersResponse deletePartnersResponse1 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse2 = OASDeletePartnersResponse.getExample();
        OASDeletePartnersResponse deletePartnersResponse3 = new OASDeletePartnersResponse();
        OASDeletePartnersResponse deletePartnersResponse4 = new OASDeletePartnersResponse();

        System.assert(deletePartnersResponse1.equals(deletePartnersResponse2));
        System.assert(deletePartnersResponse3.equals(deletePartnersResponse4));
        System.assertEquals(deletePartnersResponse1.hashCode(), deletePartnersResponse2.hashCode());
        System.assertEquals(deletePartnersResponse3.hashCode(), deletePartnersResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeletePartnersResponse deletePartnersResponse = new OASDeletePartnersResponse();
        Map<String, String> x-property-mappings = deletePartnersResponse.getx-property-mappings();
        System.assertEquals('deletedPartners', x-property-mappings.get('deleted_partners'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePartnersResponse deletePartnersResponse = new OASDeletePartnersResponse();
        System.assertEquals(new List<String>(), deletePartnersResponse.deletedPartners);
    }
}
