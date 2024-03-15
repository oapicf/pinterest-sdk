@isTest
private class OASUserWebsiteVerifyRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest1 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest2 = userWebsiteVerifyRequest1;
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest3 = new OASUserWebsiteVerifyRequest();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest4 = userWebsiteVerifyRequest3;

        System.assert(userWebsiteVerifyRequest1.equals(userWebsiteVerifyRequest2));
        System.assert(userWebsiteVerifyRequest2.equals(userWebsiteVerifyRequest1));
        System.assert(userWebsiteVerifyRequest1.equals(userWebsiteVerifyRequest1));
        System.assert(userWebsiteVerifyRequest3.equals(userWebsiteVerifyRequest4));
        System.assert(userWebsiteVerifyRequest4.equals(userWebsiteVerifyRequest3));
        System.assert(userWebsiteVerifyRequest3.equals(userWebsiteVerifyRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest1 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest2 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest3 = new OASUserWebsiteVerifyRequest();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest4 = new OASUserWebsiteVerifyRequest();

        System.assert(userWebsiteVerifyRequest1.equals(userWebsiteVerifyRequest2));
        System.assert(userWebsiteVerifyRequest2.equals(userWebsiteVerifyRequest1));
        System.assert(userWebsiteVerifyRequest3.equals(userWebsiteVerifyRequest4));
        System.assert(userWebsiteVerifyRequest4.equals(userWebsiteVerifyRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest1 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest2 = new OASUserWebsiteVerifyRequest();

        System.assertEquals(false, userWebsiteVerifyRequest1.equals('foo'));
        System.assertEquals(false, userWebsiteVerifyRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest1 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest2 = new OASUserWebsiteVerifyRequest();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest3;

        System.assertEquals(false, userWebsiteVerifyRequest1.equals(userWebsiteVerifyRequest3));
        System.assertEquals(false, userWebsiteVerifyRequest2.equals(userWebsiteVerifyRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest1 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest2 = new OASUserWebsiteVerifyRequest();

        System.assertEquals(userWebsiteVerifyRequest1.hashCode(), userWebsiteVerifyRequest1.hashCode());
        System.assertEquals(userWebsiteVerifyRequest2.hashCode(), userWebsiteVerifyRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest1 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest2 = OASUserWebsiteVerifyRequest.getExample();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest3 = new OASUserWebsiteVerifyRequest();
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest4 = new OASUserWebsiteVerifyRequest();

        System.assert(userWebsiteVerifyRequest1.equals(userWebsiteVerifyRequest2));
        System.assert(userWebsiteVerifyRequest3.equals(userWebsiteVerifyRequest4));
        System.assertEquals(userWebsiteVerifyRequest1.hashCode(), userWebsiteVerifyRequest2.hashCode());
        System.assertEquals(userWebsiteVerifyRequest3.hashCode(), userWebsiteVerifyRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest = new OASUserWebsiteVerifyRequest();
        Map<String, String> x-property-mappings = userWebsiteVerifyRequest.getx-property-mappings();
        System.assertEquals('verificationMethod', x-property-mappings.get('verification_method'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserWebsiteVerifyRequest userWebsiteVerifyRequest = new OASUserWebsiteVerifyRequest();
        System.assertEquals(VerificationMethodEnum.METATAG, userWebsiteVerifyRequest.verificationMethod);
        System.assertEquals(null, userWebsiteVerifyRequest.website);
    }
}
