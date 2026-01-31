@isTest
private class OASBrandAccountsCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest1 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest2 = brandAccountsCreateRequest1;
        OASBrandAccountsCreateRequest brandAccountsCreateRequest3 = new OASBrandAccountsCreateRequest();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest4 = brandAccountsCreateRequest3;

        System.assert(brandAccountsCreateRequest1.equals(brandAccountsCreateRequest2));
        System.assert(brandAccountsCreateRequest2.equals(brandAccountsCreateRequest1));
        System.assert(brandAccountsCreateRequest1.equals(brandAccountsCreateRequest1));
        System.assert(brandAccountsCreateRequest3.equals(brandAccountsCreateRequest4));
        System.assert(brandAccountsCreateRequest4.equals(brandAccountsCreateRequest3));
        System.assert(brandAccountsCreateRequest3.equals(brandAccountsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest1 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest2 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest3 = new OASBrandAccountsCreateRequest();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest4 = new OASBrandAccountsCreateRequest();

        System.assert(brandAccountsCreateRequest1.equals(brandAccountsCreateRequest2));
        System.assert(brandAccountsCreateRequest2.equals(brandAccountsCreateRequest1));
        System.assert(brandAccountsCreateRequest3.equals(brandAccountsCreateRequest4));
        System.assert(brandAccountsCreateRequest4.equals(brandAccountsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest1 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest2 = new OASBrandAccountsCreateRequest();

        System.assertEquals(false, brandAccountsCreateRequest1.equals('foo'));
        System.assertEquals(false, brandAccountsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest1 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest2 = new OASBrandAccountsCreateRequest();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest3;

        System.assertEquals(false, brandAccountsCreateRequest1.equals(brandAccountsCreateRequest3));
        System.assertEquals(false, brandAccountsCreateRequest2.equals(brandAccountsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest1 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest2 = new OASBrandAccountsCreateRequest();

        System.assertEquals(brandAccountsCreateRequest1.hashCode(), brandAccountsCreateRequest1.hashCode());
        System.assertEquals(brandAccountsCreateRequest2.hashCode(), brandAccountsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest1 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest2 = OASBrandAccountsCreateRequest.getExample();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest3 = new OASBrandAccountsCreateRequest();
        OASBrandAccountsCreateRequest brandAccountsCreateRequest4 = new OASBrandAccountsCreateRequest();

        System.assert(brandAccountsCreateRequest1.equals(brandAccountsCreateRequest2));
        System.assert(brandAccountsCreateRequest3.equals(brandAccountsCreateRequest4));
        System.assertEquals(brandAccountsCreateRequest1.hashCode(), brandAccountsCreateRequest2.hashCode());
        System.assertEquals(brandAccountsCreateRequest3.hashCode(), brandAccountsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBrandAccountsCreateRequest brandAccountsCreateRequest = new OASBrandAccountsCreateRequest();
        Map<String, String> x-property-mappings = brandAccountsCreateRequest.getx-property-mappings();
        System.assertEquals('profileImage', x-property-mappings.get('profile_image'));
    }
}
