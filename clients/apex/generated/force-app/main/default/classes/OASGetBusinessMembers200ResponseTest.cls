@isTest
private class OASGetBusinessMembers200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessMembers200Response getBusinessMembers200Response1 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response2 = getBusinessMembers200Response1;
        OASGetBusinessMembers200Response getBusinessMembers200Response3 = new OASGetBusinessMembers200Response();
        OASGetBusinessMembers200Response getBusinessMembers200Response4 = getBusinessMembers200Response3;

        System.assert(getBusinessMembers200Response1.equals(getBusinessMembers200Response2));
        System.assert(getBusinessMembers200Response2.equals(getBusinessMembers200Response1));
        System.assert(getBusinessMembers200Response1.equals(getBusinessMembers200Response1));
        System.assert(getBusinessMembers200Response3.equals(getBusinessMembers200Response4));
        System.assert(getBusinessMembers200Response4.equals(getBusinessMembers200Response3));
        System.assert(getBusinessMembers200Response3.equals(getBusinessMembers200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessMembers200Response getBusinessMembers200Response1 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response2 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response3 = new OASGetBusinessMembers200Response();
        OASGetBusinessMembers200Response getBusinessMembers200Response4 = new OASGetBusinessMembers200Response();

        System.assert(getBusinessMembers200Response1.equals(getBusinessMembers200Response2));
        System.assert(getBusinessMembers200Response2.equals(getBusinessMembers200Response1));
        System.assert(getBusinessMembers200Response3.equals(getBusinessMembers200Response4));
        System.assert(getBusinessMembers200Response4.equals(getBusinessMembers200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessMembers200Response getBusinessMembers200Response1 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response2 = new OASGetBusinessMembers200Response();

        System.assertEquals(false, getBusinessMembers200Response1.equals('foo'));
        System.assertEquals(false, getBusinessMembers200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessMembers200Response getBusinessMembers200Response1 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response2 = new OASGetBusinessMembers200Response();
        OASGetBusinessMembers200Response getBusinessMembers200Response3;

        System.assertEquals(false, getBusinessMembers200Response1.equals(getBusinessMembers200Response3));
        System.assertEquals(false, getBusinessMembers200Response2.equals(getBusinessMembers200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessMembers200Response getBusinessMembers200Response1 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response2 = new OASGetBusinessMembers200Response();

        System.assertEquals(getBusinessMembers200Response1.hashCode(), getBusinessMembers200Response1.hashCode());
        System.assertEquals(getBusinessMembers200Response2.hashCode(), getBusinessMembers200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessMembers200Response getBusinessMembers200Response1 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response2 = OASGetBusinessMembers200Response.getExample();
        OASGetBusinessMembers200Response getBusinessMembers200Response3 = new OASGetBusinessMembers200Response();
        OASGetBusinessMembers200Response getBusinessMembers200Response4 = new OASGetBusinessMembers200Response();

        System.assert(getBusinessMembers200Response1.equals(getBusinessMembers200Response2));
        System.assert(getBusinessMembers200Response3.equals(getBusinessMembers200Response4));
        System.assertEquals(getBusinessMembers200Response1.hashCode(), getBusinessMembers200Response2.hashCode());
        System.assertEquals(getBusinessMembers200Response3.hashCode(), getBusinessMembers200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBusinessMembers200Response getBusinessMembers200Response = new OASGetBusinessMembers200Response();
        System.assertEquals(new List<OASUserBusinessRoleBinding>(), getBusinessMembers200Response.items);
        System.assertEquals(null, getBusinessMembers200Response.bookmark);
    }
}
