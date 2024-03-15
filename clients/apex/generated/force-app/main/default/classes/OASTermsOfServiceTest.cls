@isTest
private class OASTermsOfServiceTest {
    @isTest
    private static void equalsSameInstance() {
        OASTermsOfService termsOfService1 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService2 = termsOfService1;
        OASTermsOfService termsOfService3 = new OASTermsOfService();
        OASTermsOfService termsOfService4 = termsOfService3;

        System.assert(termsOfService1.equals(termsOfService2));
        System.assert(termsOfService2.equals(termsOfService1));
        System.assert(termsOfService1.equals(termsOfService1));
        System.assert(termsOfService3.equals(termsOfService4));
        System.assert(termsOfService4.equals(termsOfService3));
        System.assert(termsOfService3.equals(termsOfService3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTermsOfService termsOfService1 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService2 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService3 = new OASTermsOfService();
        OASTermsOfService termsOfService4 = new OASTermsOfService();

        System.assert(termsOfService1.equals(termsOfService2));
        System.assert(termsOfService2.equals(termsOfService1));
        System.assert(termsOfService3.equals(termsOfService4));
        System.assert(termsOfService4.equals(termsOfService3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTermsOfService termsOfService1 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService2 = new OASTermsOfService();

        System.assertEquals(false, termsOfService1.equals('foo'));
        System.assertEquals(false, termsOfService2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTermsOfService termsOfService1 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService2 = new OASTermsOfService();
        OASTermsOfService termsOfService3;

        System.assertEquals(false, termsOfService1.equals(termsOfService3));
        System.assertEquals(false, termsOfService2.equals(termsOfService3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTermsOfService termsOfService1 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService2 = new OASTermsOfService();

        System.assertEquals(termsOfService1.hashCode(), termsOfService1.hashCode());
        System.assertEquals(termsOfService2.hashCode(), termsOfService2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTermsOfService termsOfService1 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService2 = OASTermsOfService.getExample();
        OASTermsOfService termsOfService3 = new OASTermsOfService();
        OASTermsOfService termsOfService4 = new OASTermsOfService();

        System.assert(termsOfService1.equals(termsOfService2));
        System.assert(termsOfService3.equals(termsOfService4));
        System.assertEquals(termsOfService1.hashCode(), termsOfService2.hashCode());
        System.assertEquals(termsOfService3.hashCode(), termsOfService4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTermsOfService termsOfService = new OASTermsOfService();
        Map<String, String> x-property-mappings = termsOfService.getx-property-mappings();
        System.assertEquals('hasAccepted', x-property-mappings.get('has_accepted'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
    }
}
