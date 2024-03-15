@isTest
private class OASBillingProfilesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBillingProfilesResponse billingProfilesResponse1 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse2 = billingProfilesResponse1;
        OASBillingProfilesResponse billingProfilesResponse3 = new OASBillingProfilesResponse();
        OASBillingProfilesResponse billingProfilesResponse4 = billingProfilesResponse3;

        System.assert(billingProfilesResponse1.equals(billingProfilesResponse2));
        System.assert(billingProfilesResponse2.equals(billingProfilesResponse1));
        System.assert(billingProfilesResponse1.equals(billingProfilesResponse1));
        System.assert(billingProfilesResponse3.equals(billingProfilesResponse4));
        System.assert(billingProfilesResponse4.equals(billingProfilesResponse3));
        System.assert(billingProfilesResponse3.equals(billingProfilesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBillingProfilesResponse billingProfilesResponse1 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse2 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse3 = new OASBillingProfilesResponse();
        OASBillingProfilesResponse billingProfilesResponse4 = new OASBillingProfilesResponse();

        System.assert(billingProfilesResponse1.equals(billingProfilesResponse2));
        System.assert(billingProfilesResponse2.equals(billingProfilesResponse1));
        System.assert(billingProfilesResponse3.equals(billingProfilesResponse4));
        System.assert(billingProfilesResponse4.equals(billingProfilesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBillingProfilesResponse billingProfilesResponse1 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse2 = new OASBillingProfilesResponse();

        System.assertEquals(false, billingProfilesResponse1.equals('foo'));
        System.assertEquals(false, billingProfilesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBillingProfilesResponse billingProfilesResponse1 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse2 = new OASBillingProfilesResponse();
        OASBillingProfilesResponse billingProfilesResponse3;

        System.assertEquals(false, billingProfilesResponse1.equals(billingProfilesResponse3));
        System.assertEquals(false, billingProfilesResponse2.equals(billingProfilesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBillingProfilesResponse billingProfilesResponse1 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse2 = new OASBillingProfilesResponse();

        System.assertEquals(billingProfilesResponse1.hashCode(), billingProfilesResponse1.hashCode());
        System.assertEquals(billingProfilesResponse2.hashCode(), billingProfilesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBillingProfilesResponse billingProfilesResponse1 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse2 = OASBillingProfilesResponse.getExample();
        OASBillingProfilesResponse billingProfilesResponse3 = new OASBillingProfilesResponse();
        OASBillingProfilesResponse billingProfilesResponse4 = new OASBillingProfilesResponse();

        System.assert(billingProfilesResponse1.equals(billingProfilesResponse2));
        System.assert(billingProfilesResponse3.equals(billingProfilesResponse4));
        System.assertEquals(billingProfilesResponse1.hashCode(), billingProfilesResponse2.hashCode());
        System.assertEquals(billingProfilesResponse3.hashCode(), billingProfilesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBillingProfilesResponse billingProfilesResponse = new OASBillingProfilesResponse();
        Map<String, String> x-property-mappings = billingProfilesResponse.getx-property-mappings();
        System.assertEquals('cardType', x-property-mappings.get('card_type'));
        System.assertEquals('advertiserId', x-property-mappings.get('advertiser_id'));
        System.assertEquals('paymentMethodBrand', x-property-mappings.get('payment_method_brand'));
    }
}
