@isTest
private class OASAmazonConnectRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAmazonConnectRequest amazonConnectRequest1 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest2 = amazonConnectRequest1;
        OASAmazonConnectRequest amazonConnectRequest3 = new OASAmazonConnectRequest();
        OASAmazonConnectRequest amazonConnectRequest4 = amazonConnectRequest3;

        System.assert(amazonConnectRequest1.equals(amazonConnectRequest2));
        System.assert(amazonConnectRequest2.equals(amazonConnectRequest1));
        System.assert(amazonConnectRequest1.equals(amazonConnectRequest1));
        System.assert(amazonConnectRequest3.equals(amazonConnectRequest4));
        System.assert(amazonConnectRequest4.equals(amazonConnectRequest3));
        System.assert(amazonConnectRequest3.equals(amazonConnectRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAmazonConnectRequest amazonConnectRequest1 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest2 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest3 = new OASAmazonConnectRequest();
        OASAmazonConnectRequest amazonConnectRequest4 = new OASAmazonConnectRequest();

        System.assert(amazonConnectRequest1.equals(amazonConnectRequest2));
        System.assert(amazonConnectRequest2.equals(amazonConnectRequest1));
        System.assert(amazonConnectRequest3.equals(amazonConnectRequest4));
        System.assert(amazonConnectRequest4.equals(amazonConnectRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAmazonConnectRequest amazonConnectRequest1 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest2 = new OASAmazonConnectRequest();

        System.assertEquals(false, amazonConnectRequest1.equals('foo'));
        System.assertEquals(false, amazonConnectRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAmazonConnectRequest amazonConnectRequest1 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest2 = new OASAmazonConnectRequest();
        OASAmazonConnectRequest amazonConnectRequest3;

        System.assertEquals(false, amazonConnectRequest1.equals(amazonConnectRequest3));
        System.assertEquals(false, amazonConnectRequest2.equals(amazonConnectRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAmazonConnectRequest amazonConnectRequest1 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest2 = new OASAmazonConnectRequest();

        System.assertEquals(amazonConnectRequest1.hashCode(), amazonConnectRequest1.hashCode());
        System.assertEquals(amazonConnectRequest2.hashCode(), amazonConnectRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAmazonConnectRequest amazonConnectRequest1 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest2 = OASAmazonConnectRequest.getExample();
        OASAmazonConnectRequest amazonConnectRequest3 = new OASAmazonConnectRequest();
        OASAmazonConnectRequest amazonConnectRequest4 = new OASAmazonConnectRequest();

        System.assert(amazonConnectRequest1.equals(amazonConnectRequest2));
        System.assert(amazonConnectRequest3.equals(amazonConnectRequest4));
        System.assertEquals(amazonConnectRequest1.hashCode(), amazonConnectRequest2.hashCode());
        System.assertEquals(amazonConnectRequest3.hashCode(), amazonConnectRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAmazonConnectRequest amazonConnectRequest = new OASAmazonConnectRequest();
        Map<String, String> x-property-mappings = amazonConnectRequest.getx-property-mappings();
        System.assertEquals('amazonStorefrontId', x-property-mappings.get('amazon_storefront_id'));
        System.assertEquals('amazonStorefrontName', x-property-mappings.get('amazon_storefront_name'));
        System.assertEquals('amazonStorefrontUrl', x-property-mappings.get('amazon_storefront_url'));
        System.assertEquals('amazonUserId', x-property-mappings.get('amazon_user_id'));
        System.assertEquals('isAmazonAccountLinked', x-property-mappings.get('is_amazon_account_linked'));
        System.assertEquals('oneTimePasscode', x-property-mappings.get('one_time_passcode'));
        System.assertEquals('pinterestUserId', x-property-mappings.get('pinterest_user_id'));
    }
}
