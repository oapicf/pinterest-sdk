@isTest
private class OASGetBusinessEmployers200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response1 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response2 = getBusinessEmployers200Response1;
        OASGetBusinessEmployers200Response getBusinessEmployers200Response3 = new OASGetBusinessEmployers200Response();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response4 = getBusinessEmployers200Response3;

        System.assert(getBusinessEmployers200Response1.equals(getBusinessEmployers200Response2));
        System.assert(getBusinessEmployers200Response2.equals(getBusinessEmployers200Response1));
        System.assert(getBusinessEmployers200Response1.equals(getBusinessEmployers200Response1));
        System.assert(getBusinessEmployers200Response3.equals(getBusinessEmployers200Response4));
        System.assert(getBusinessEmployers200Response4.equals(getBusinessEmployers200Response3));
        System.assert(getBusinessEmployers200Response3.equals(getBusinessEmployers200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response1 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response2 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response3 = new OASGetBusinessEmployers200Response();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response4 = new OASGetBusinessEmployers200Response();

        System.assert(getBusinessEmployers200Response1.equals(getBusinessEmployers200Response2));
        System.assert(getBusinessEmployers200Response2.equals(getBusinessEmployers200Response1));
        System.assert(getBusinessEmployers200Response3.equals(getBusinessEmployers200Response4));
        System.assert(getBusinessEmployers200Response4.equals(getBusinessEmployers200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response1 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response2 = new OASGetBusinessEmployers200Response();

        System.assertEquals(false, getBusinessEmployers200Response1.equals('foo'));
        System.assertEquals(false, getBusinessEmployers200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response1 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response2 = new OASGetBusinessEmployers200Response();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response3;

        System.assertEquals(false, getBusinessEmployers200Response1.equals(getBusinessEmployers200Response3));
        System.assertEquals(false, getBusinessEmployers200Response2.equals(getBusinessEmployers200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response1 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response2 = new OASGetBusinessEmployers200Response();

        System.assertEquals(getBusinessEmployers200Response1.hashCode(), getBusinessEmployers200Response1.hashCode());
        System.assertEquals(getBusinessEmployers200Response2.hashCode(), getBusinessEmployers200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response1 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response2 = OASGetBusinessEmployers200Response.getExample();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response3 = new OASGetBusinessEmployers200Response();
        OASGetBusinessEmployers200Response getBusinessEmployers200Response4 = new OASGetBusinessEmployers200Response();

        System.assert(getBusinessEmployers200Response1.equals(getBusinessEmployers200Response2));
        System.assert(getBusinessEmployers200Response3.equals(getBusinessEmployers200Response4));
        System.assertEquals(getBusinessEmployers200Response1.hashCode(), getBusinessEmployers200Response2.hashCode());
        System.assertEquals(getBusinessEmployers200Response3.hashCode(), getBusinessEmployers200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response = new OASGetBusinessEmployers200Response();
        System.assertEquals(new List<OASUserBusinessRoleBinding>(), getBusinessEmployers200Response.items);
        System.assertEquals(null, getBusinessEmployers200Response.bookmark);
    }
}
