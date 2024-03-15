@isTest
private class OASUserWebsiteVerificationCodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode1 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode2 = userWebsiteVerificationCode1;
        OASUserWebsiteVerificationCode userWebsiteVerificationCode3 = new OASUserWebsiteVerificationCode();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode4 = userWebsiteVerificationCode3;

        System.assert(userWebsiteVerificationCode1.equals(userWebsiteVerificationCode2));
        System.assert(userWebsiteVerificationCode2.equals(userWebsiteVerificationCode1));
        System.assert(userWebsiteVerificationCode1.equals(userWebsiteVerificationCode1));
        System.assert(userWebsiteVerificationCode3.equals(userWebsiteVerificationCode4));
        System.assert(userWebsiteVerificationCode4.equals(userWebsiteVerificationCode3));
        System.assert(userWebsiteVerificationCode3.equals(userWebsiteVerificationCode3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode1 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode2 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode3 = new OASUserWebsiteVerificationCode();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode4 = new OASUserWebsiteVerificationCode();

        System.assert(userWebsiteVerificationCode1.equals(userWebsiteVerificationCode2));
        System.assert(userWebsiteVerificationCode2.equals(userWebsiteVerificationCode1));
        System.assert(userWebsiteVerificationCode3.equals(userWebsiteVerificationCode4));
        System.assert(userWebsiteVerificationCode4.equals(userWebsiteVerificationCode3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode1 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode2 = new OASUserWebsiteVerificationCode();

        System.assertEquals(false, userWebsiteVerificationCode1.equals('foo'));
        System.assertEquals(false, userWebsiteVerificationCode2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode1 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode2 = new OASUserWebsiteVerificationCode();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode3;

        System.assertEquals(false, userWebsiteVerificationCode1.equals(userWebsiteVerificationCode3));
        System.assertEquals(false, userWebsiteVerificationCode2.equals(userWebsiteVerificationCode3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode1 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode2 = new OASUserWebsiteVerificationCode();

        System.assertEquals(userWebsiteVerificationCode1.hashCode(), userWebsiteVerificationCode1.hashCode());
        System.assertEquals(userWebsiteVerificationCode2.hashCode(), userWebsiteVerificationCode2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode1 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode2 = OASUserWebsiteVerificationCode.getExample();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode3 = new OASUserWebsiteVerificationCode();
        OASUserWebsiteVerificationCode userWebsiteVerificationCode4 = new OASUserWebsiteVerificationCode();

        System.assert(userWebsiteVerificationCode1.equals(userWebsiteVerificationCode2));
        System.assert(userWebsiteVerificationCode3.equals(userWebsiteVerificationCode4));
        System.assertEquals(userWebsiteVerificationCode1.hashCode(), userWebsiteVerificationCode2.hashCode());
        System.assertEquals(userWebsiteVerificationCode3.hashCode(), userWebsiteVerificationCode4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserWebsiteVerificationCode userWebsiteVerificationCode = new OASUserWebsiteVerificationCode();
        Map<String, String> x-property-mappings = userWebsiteVerificationCode.getx-property-mappings();
        System.assertEquals('verificationCode', x-property-mappings.get('verification_code'));
        System.assertEquals('dnsTxtRecord', x-property-mappings.get('dns_txt_record'));
        System.assertEquals('fileContent', x-property-mappings.get('file_content'));
    }
}
