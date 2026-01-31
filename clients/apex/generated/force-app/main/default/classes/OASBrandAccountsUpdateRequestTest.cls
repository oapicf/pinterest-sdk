@isTest
private class OASBrandAccountsUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest1 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest2 = brandAccountsUpdateRequest1;
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest3 = new OASBrandAccountsUpdateRequest();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest4 = brandAccountsUpdateRequest3;

        System.assert(brandAccountsUpdateRequest1.equals(brandAccountsUpdateRequest2));
        System.assert(brandAccountsUpdateRequest2.equals(brandAccountsUpdateRequest1));
        System.assert(brandAccountsUpdateRequest1.equals(brandAccountsUpdateRequest1));
        System.assert(brandAccountsUpdateRequest3.equals(brandAccountsUpdateRequest4));
        System.assert(brandAccountsUpdateRequest4.equals(brandAccountsUpdateRequest3));
        System.assert(brandAccountsUpdateRequest3.equals(brandAccountsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest1 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest2 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest3 = new OASBrandAccountsUpdateRequest();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest4 = new OASBrandAccountsUpdateRequest();

        System.assert(brandAccountsUpdateRequest1.equals(brandAccountsUpdateRequest2));
        System.assert(brandAccountsUpdateRequest2.equals(brandAccountsUpdateRequest1));
        System.assert(brandAccountsUpdateRequest3.equals(brandAccountsUpdateRequest4));
        System.assert(brandAccountsUpdateRequest4.equals(brandAccountsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest1 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest2 = new OASBrandAccountsUpdateRequest();

        System.assertEquals(false, brandAccountsUpdateRequest1.equals('foo'));
        System.assertEquals(false, brandAccountsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest1 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest2 = new OASBrandAccountsUpdateRequest();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest3;

        System.assertEquals(false, brandAccountsUpdateRequest1.equals(brandAccountsUpdateRequest3));
        System.assertEquals(false, brandAccountsUpdateRequest2.equals(brandAccountsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest1 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest2 = new OASBrandAccountsUpdateRequest();

        System.assertEquals(brandAccountsUpdateRequest1.hashCode(), brandAccountsUpdateRequest1.hashCode());
        System.assertEquals(brandAccountsUpdateRequest2.hashCode(), brandAccountsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest1 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest2 = OASBrandAccountsUpdateRequest.getExample();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest3 = new OASBrandAccountsUpdateRequest();
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest4 = new OASBrandAccountsUpdateRequest();

        System.assert(brandAccountsUpdateRequest1.equals(brandAccountsUpdateRequest2));
        System.assert(brandAccountsUpdateRequest3.equals(brandAccountsUpdateRequest4));
        System.assertEquals(brandAccountsUpdateRequest1.hashCode(), brandAccountsUpdateRequest2.hashCode());
        System.assertEquals(brandAccountsUpdateRequest3.hashCode(), brandAccountsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBrandAccountsUpdateRequest brandAccountsUpdateRequest = new OASBrandAccountsUpdateRequest();
        Map<String, String> x-property-mappings = brandAccountsUpdateRequest.getx-property-mappings();
        System.assertEquals('profileImage', x-property-mappings.get('profile_image'));
    }
}
