@isTest
private class OASBrandAccountsCreate200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response1 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response2 = brandAccountsCreate200Response1;
        OASBrandAccountsCreate200Response brandAccountsCreate200Response3 = new OASBrandAccountsCreate200Response();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response4 = brandAccountsCreate200Response3;

        System.assert(brandAccountsCreate200Response1.equals(brandAccountsCreate200Response2));
        System.assert(brandAccountsCreate200Response2.equals(brandAccountsCreate200Response1));
        System.assert(brandAccountsCreate200Response1.equals(brandAccountsCreate200Response1));
        System.assert(brandAccountsCreate200Response3.equals(brandAccountsCreate200Response4));
        System.assert(brandAccountsCreate200Response4.equals(brandAccountsCreate200Response3));
        System.assert(brandAccountsCreate200Response3.equals(brandAccountsCreate200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response1 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response2 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response3 = new OASBrandAccountsCreate200Response();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response4 = new OASBrandAccountsCreate200Response();

        System.assert(brandAccountsCreate200Response1.equals(brandAccountsCreate200Response2));
        System.assert(brandAccountsCreate200Response2.equals(brandAccountsCreate200Response1));
        System.assert(brandAccountsCreate200Response3.equals(brandAccountsCreate200Response4));
        System.assert(brandAccountsCreate200Response4.equals(brandAccountsCreate200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response1 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response2 = new OASBrandAccountsCreate200Response();

        System.assertEquals(false, brandAccountsCreate200Response1.equals('foo'));
        System.assertEquals(false, brandAccountsCreate200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response1 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response2 = new OASBrandAccountsCreate200Response();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response3;

        System.assertEquals(false, brandAccountsCreate200Response1.equals(brandAccountsCreate200Response3));
        System.assertEquals(false, brandAccountsCreate200Response2.equals(brandAccountsCreate200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response1 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response2 = new OASBrandAccountsCreate200Response();

        System.assertEquals(brandAccountsCreate200Response1.hashCode(), brandAccountsCreate200Response1.hashCode());
        System.assertEquals(brandAccountsCreate200Response2.hashCode(), brandAccountsCreate200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response1 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response2 = OASBrandAccountsCreate200Response.getExample();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response3 = new OASBrandAccountsCreate200Response();
        OASBrandAccountsCreate200Response brandAccountsCreate200Response4 = new OASBrandAccountsCreate200Response();

        System.assert(brandAccountsCreate200Response1.equals(brandAccountsCreate200Response2));
        System.assert(brandAccountsCreate200Response3.equals(brandAccountsCreate200Response4));
        System.assertEquals(brandAccountsCreate200Response1.hashCode(), brandAccountsCreate200Response2.hashCode());
        System.assertEquals(brandAccountsCreate200Response3.hashCode(), brandAccountsCreate200Response4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBrandAccountsCreate200Response brandAccountsCreate200Response = new OASBrandAccountsCreate200Response();
        Map<String, String> x-property-mappings = brandAccountsCreate200Response.getx-property-mappings();
        System.assertEquals('brandAccountId', x-property-mappings.get('brand_account_id'));
    }
}
