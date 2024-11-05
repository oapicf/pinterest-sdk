@isTest
private class OASGetInvites200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetInvites200Response getInvites200Response1 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response2 = getInvites200Response1;
        OASGetInvites200Response getInvites200Response3 = new OASGetInvites200Response();
        OASGetInvites200Response getInvites200Response4 = getInvites200Response3;

        System.assert(getInvites200Response1.equals(getInvites200Response2));
        System.assert(getInvites200Response2.equals(getInvites200Response1));
        System.assert(getInvites200Response1.equals(getInvites200Response1));
        System.assert(getInvites200Response3.equals(getInvites200Response4));
        System.assert(getInvites200Response4.equals(getInvites200Response3));
        System.assert(getInvites200Response3.equals(getInvites200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetInvites200Response getInvites200Response1 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response2 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response3 = new OASGetInvites200Response();
        OASGetInvites200Response getInvites200Response4 = new OASGetInvites200Response();

        System.assert(getInvites200Response1.equals(getInvites200Response2));
        System.assert(getInvites200Response2.equals(getInvites200Response1));
        System.assert(getInvites200Response3.equals(getInvites200Response4));
        System.assert(getInvites200Response4.equals(getInvites200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetInvites200Response getInvites200Response1 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response2 = new OASGetInvites200Response();

        System.assertEquals(false, getInvites200Response1.equals('foo'));
        System.assertEquals(false, getInvites200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetInvites200Response getInvites200Response1 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response2 = new OASGetInvites200Response();
        OASGetInvites200Response getInvites200Response3;

        System.assertEquals(false, getInvites200Response1.equals(getInvites200Response3));
        System.assertEquals(false, getInvites200Response2.equals(getInvites200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetInvites200Response getInvites200Response1 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response2 = new OASGetInvites200Response();

        System.assertEquals(getInvites200Response1.hashCode(), getInvites200Response1.hashCode());
        System.assertEquals(getInvites200Response2.hashCode(), getInvites200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetInvites200Response getInvites200Response1 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response2 = OASGetInvites200Response.getExample();
        OASGetInvites200Response getInvites200Response3 = new OASGetInvites200Response();
        OASGetInvites200Response getInvites200Response4 = new OASGetInvites200Response();

        System.assert(getInvites200Response1.equals(getInvites200Response2));
        System.assert(getInvites200Response3.equals(getInvites200Response4));
        System.assertEquals(getInvites200Response1.hashCode(), getInvites200Response2.hashCode());
        System.assertEquals(getInvites200Response3.hashCode(), getInvites200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetInvites200Response getInvites200Response = new OASGetInvites200Response();
        System.assertEquals(new List<OASInviteResponse>(), getInvites200Response.items);
        System.assertEquals(null, getInvites200Response.bookmark);
    }
}
