@isTest
private class OASDeletePartnersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePartnersRequest deletePartnersRequest1 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest2 = deletePartnersRequest1;
        OASDeletePartnersRequest deletePartnersRequest3 = new OASDeletePartnersRequest();
        OASDeletePartnersRequest deletePartnersRequest4 = deletePartnersRequest3;

        System.assert(deletePartnersRequest1.equals(deletePartnersRequest2));
        System.assert(deletePartnersRequest2.equals(deletePartnersRequest1));
        System.assert(deletePartnersRequest1.equals(deletePartnersRequest1));
        System.assert(deletePartnersRequest3.equals(deletePartnersRequest4));
        System.assert(deletePartnersRequest4.equals(deletePartnersRequest3));
        System.assert(deletePartnersRequest3.equals(deletePartnersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePartnersRequest deletePartnersRequest1 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest2 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest3 = new OASDeletePartnersRequest();
        OASDeletePartnersRequest deletePartnersRequest4 = new OASDeletePartnersRequest();

        System.assert(deletePartnersRequest1.equals(deletePartnersRequest2));
        System.assert(deletePartnersRequest2.equals(deletePartnersRequest1));
        System.assert(deletePartnersRequest3.equals(deletePartnersRequest4));
        System.assert(deletePartnersRequest4.equals(deletePartnersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePartnersRequest deletePartnersRequest1 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest2 = new OASDeletePartnersRequest();

        System.assertEquals(false, deletePartnersRequest1.equals('foo'));
        System.assertEquals(false, deletePartnersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePartnersRequest deletePartnersRequest1 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest2 = new OASDeletePartnersRequest();
        OASDeletePartnersRequest deletePartnersRequest3;

        System.assertEquals(false, deletePartnersRequest1.equals(deletePartnersRequest3));
        System.assertEquals(false, deletePartnersRequest2.equals(deletePartnersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePartnersRequest deletePartnersRequest1 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest2 = new OASDeletePartnersRequest();

        System.assertEquals(deletePartnersRequest1.hashCode(), deletePartnersRequest1.hashCode());
        System.assertEquals(deletePartnersRequest2.hashCode(), deletePartnersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePartnersRequest deletePartnersRequest1 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest2 = OASDeletePartnersRequest.getExample();
        OASDeletePartnersRequest deletePartnersRequest3 = new OASDeletePartnersRequest();
        OASDeletePartnersRequest deletePartnersRequest4 = new OASDeletePartnersRequest();

        System.assert(deletePartnersRequest1.equals(deletePartnersRequest2));
        System.assert(deletePartnersRequest3.equals(deletePartnersRequest4));
        System.assertEquals(deletePartnersRequest1.hashCode(), deletePartnersRequest2.hashCode());
        System.assertEquals(deletePartnersRequest3.hashCode(), deletePartnersRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeletePartnersRequest deletePartnersRequest = new OASDeletePartnersRequest();
        Map<String, String> x-property-mappings = deletePartnersRequest.getx-property-mappings();
        System.assertEquals('partnerIds', x-property-mappings.get('partner_ids'));
        System.assertEquals('partnerType', x-property-mappings.get('partner_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePartnersRequest deletePartnersRequest = new OASDeletePartnersRequest();
        System.assertEquals(new List<String>(), deletePartnersRequest.partnerIds);
        System.assertEquals(null, deletePartnersRequest.partnerType);
    }
}
