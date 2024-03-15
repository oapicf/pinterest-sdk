@isTest
private class OASAdAccountCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountCreateRequest adAccountCreateRequest1 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest2 = adAccountCreateRequest1;
        OASAdAccountCreateRequest adAccountCreateRequest3 = new OASAdAccountCreateRequest();
        OASAdAccountCreateRequest adAccountCreateRequest4 = adAccountCreateRequest3;

        System.assert(adAccountCreateRequest1.equals(adAccountCreateRequest2));
        System.assert(adAccountCreateRequest2.equals(adAccountCreateRequest1));
        System.assert(adAccountCreateRequest1.equals(adAccountCreateRequest1));
        System.assert(adAccountCreateRequest3.equals(adAccountCreateRequest4));
        System.assert(adAccountCreateRequest4.equals(adAccountCreateRequest3));
        System.assert(adAccountCreateRequest3.equals(adAccountCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountCreateRequest adAccountCreateRequest1 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest2 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest3 = new OASAdAccountCreateRequest();
        OASAdAccountCreateRequest adAccountCreateRequest4 = new OASAdAccountCreateRequest();

        System.assert(adAccountCreateRequest1.equals(adAccountCreateRequest2));
        System.assert(adAccountCreateRequest2.equals(adAccountCreateRequest1));
        System.assert(adAccountCreateRequest3.equals(adAccountCreateRequest4));
        System.assert(adAccountCreateRequest4.equals(adAccountCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountCreateRequest adAccountCreateRequest1 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest2 = new OASAdAccountCreateRequest();

        System.assertEquals(false, adAccountCreateRequest1.equals('foo'));
        System.assertEquals(false, adAccountCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountCreateRequest adAccountCreateRequest1 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest2 = new OASAdAccountCreateRequest();
        OASAdAccountCreateRequest adAccountCreateRequest3;

        System.assertEquals(false, adAccountCreateRequest1.equals(adAccountCreateRequest3));
        System.assertEquals(false, adAccountCreateRequest2.equals(adAccountCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountCreateRequest adAccountCreateRequest1 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest2 = new OASAdAccountCreateRequest();

        System.assertEquals(adAccountCreateRequest1.hashCode(), adAccountCreateRequest1.hashCode());
        System.assertEquals(adAccountCreateRequest2.hashCode(), adAccountCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountCreateRequest adAccountCreateRequest1 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest2 = OASAdAccountCreateRequest.getExample();
        OASAdAccountCreateRequest adAccountCreateRequest3 = new OASAdAccountCreateRequest();
        OASAdAccountCreateRequest adAccountCreateRequest4 = new OASAdAccountCreateRequest();

        System.assert(adAccountCreateRequest1.equals(adAccountCreateRequest2));
        System.assert(adAccountCreateRequest3.equals(adAccountCreateRequest4));
        System.assertEquals(adAccountCreateRequest1.hashCode(), adAccountCreateRequest2.hashCode());
        System.assertEquals(adAccountCreateRequest3.hashCode(), adAccountCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountCreateRequest adAccountCreateRequest = new OASAdAccountCreateRequest();
        Map<String, String> x-property-mappings = adAccountCreateRequest.getx-property-mappings();
        System.assertEquals('ownerUserId', x-property-mappings.get('owner_user_id'));
    }
}
