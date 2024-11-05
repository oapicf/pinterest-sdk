@isTest
private class OASGetBusinessPartners200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessPartners200Response getBusinessPartners200Response1 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response2 = getBusinessPartners200Response1;
        OASGetBusinessPartners200Response getBusinessPartners200Response3 = new OASGetBusinessPartners200Response();
        OASGetBusinessPartners200Response getBusinessPartners200Response4 = getBusinessPartners200Response3;

        System.assert(getBusinessPartners200Response1.equals(getBusinessPartners200Response2));
        System.assert(getBusinessPartners200Response2.equals(getBusinessPartners200Response1));
        System.assert(getBusinessPartners200Response1.equals(getBusinessPartners200Response1));
        System.assert(getBusinessPartners200Response3.equals(getBusinessPartners200Response4));
        System.assert(getBusinessPartners200Response4.equals(getBusinessPartners200Response3));
        System.assert(getBusinessPartners200Response3.equals(getBusinessPartners200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessPartners200Response getBusinessPartners200Response1 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response2 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response3 = new OASGetBusinessPartners200Response();
        OASGetBusinessPartners200Response getBusinessPartners200Response4 = new OASGetBusinessPartners200Response();

        System.assert(getBusinessPartners200Response1.equals(getBusinessPartners200Response2));
        System.assert(getBusinessPartners200Response2.equals(getBusinessPartners200Response1));
        System.assert(getBusinessPartners200Response3.equals(getBusinessPartners200Response4));
        System.assert(getBusinessPartners200Response4.equals(getBusinessPartners200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessPartners200Response getBusinessPartners200Response1 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response2 = new OASGetBusinessPartners200Response();

        System.assertEquals(false, getBusinessPartners200Response1.equals('foo'));
        System.assertEquals(false, getBusinessPartners200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessPartners200Response getBusinessPartners200Response1 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response2 = new OASGetBusinessPartners200Response();
        OASGetBusinessPartners200Response getBusinessPartners200Response3;

        System.assertEquals(false, getBusinessPartners200Response1.equals(getBusinessPartners200Response3));
        System.assertEquals(false, getBusinessPartners200Response2.equals(getBusinessPartners200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessPartners200Response getBusinessPartners200Response1 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response2 = new OASGetBusinessPartners200Response();

        System.assertEquals(getBusinessPartners200Response1.hashCode(), getBusinessPartners200Response1.hashCode());
        System.assertEquals(getBusinessPartners200Response2.hashCode(), getBusinessPartners200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessPartners200Response getBusinessPartners200Response1 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response2 = OASGetBusinessPartners200Response.getExample();
        OASGetBusinessPartners200Response getBusinessPartners200Response3 = new OASGetBusinessPartners200Response();
        OASGetBusinessPartners200Response getBusinessPartners200Response4 = new OASGetBusinessPartners200Response();

        System.assert(getBusinessPartners200Response1.equals(getBusinessPartners200Response2));
        System.assert(getBusinessPartners200Response3.equals(getBusinessPartners200Response4));
        System.assertEquals(getBusinessPartners200Response1.hashCode(), getBusinessPartners200Response2.hashCode());
        System.assertEquals(getBusinessPartners200Response3.hashCode(), getBusinessPartners200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBusinessPartners200Response getBusinessPartners200Response = new OASGetBusinessPartners200Response();
        System.assertEquals(new List<OASUserBusinessRoleBinding>(), getBusinessPartners200Response.items);
        System.assertEquals(null, getBusinessPartners200Response.bookmark);
    }
}
