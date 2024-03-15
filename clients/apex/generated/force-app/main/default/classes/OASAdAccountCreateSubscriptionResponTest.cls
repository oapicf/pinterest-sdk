@isTest
private class OASAdAccountCreateSubscriptionResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse1 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse2 = adAccountCreateSubscriptionResponse1;
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse3 = new OASAdAccountCreateSubscriptionRespon();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse4 = adAccountCreateSubscriptionResponse3;

        System.assert(adAccountCreateSubscriptionResponse1.equals(adAccountCreateSubscriptionResponse2));
        System.assert(adAccountCreateSubscriptionResponse2.equals(adAccountCreateSubscriptionResponse1));
        System.assert(adAccountCreateSubscriptionResponse1.equals(adAccountCreateSubscriptionResponse1));
        System.assert(adAccountCreateSubscriptionResponse3.equals(adAccountCreateSubscriptionResponse4));
        System.assert(adAccountCreateSubscriptionResponse4.equals(adAccountCreateSubscriptionResponse3));
        System.assert(adAccountCreateSubscriptionResponse3.equals(adAccountCreateSubscriptionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse1 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse2 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse3 = new OASAdAccountCreateSubscriptionRespon();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse4 = new OASAdAccountCreateSubscriptionRespon();

        System.assert(adAccountCreateSubscriptionResponse1.equals(adAccountCreateSubscriptionResponse2));
        System.assert(adAccountCreateSubscriptionResponse2.equals(adAccountCreateSubscriptionResponse1));
        System.assert(adAccountCreateSubscriptionResponse3.equals(adAccountCreateSubscriptionResponse4));
        System.assert(adAccountCreateSubscriptionResponse4.equals(adAccountCreateSubscriptionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse1 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse2 = new OASAdAccountCreateSubscriptionRespon();

        System.assertEquals(false, adAccountCreateSubscriptionResponse1.equals('foo'));
        System.assertEquals(false, adAccountCreateSubscriptionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse1 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse2 = new OASAdAccountCreateSubscriptionRespon();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse3;

        System.assertEquals(false, adAccountCreateSubscriptionResponse1.equals(adAccountCreateSubscriptionResponse3));
        System.assertEquals(false, adAccountCreateSubscriptionResponse2.equals(adAccountCreateSubscriptionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse1 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse2 = new OASAdAccountCreateSubscriptionRespon();

        System.assertEquals(adAccountCreateSubscriptionResponse1.hashCode(), adAccountCreateSubscriptionResponse1.hashCode());
        System.assertEquals(adAccountCreateSubscriptionResponse2.hashCode(), adAccountCreateSubscriptionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse1 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse2 = OASAdAccountCreateSubscriptionRespon.getExample();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse3 = new OASAdAccountCreateSubscriptionRespon();
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse4 = new OASAdAccountCreateSubscriptionRespon();

        System.assert(adAccountCreateSubscriptionResponse1.equals(adAccountCreateSubscriptionResponse2));
        System.assert(adAccountCreateSubscriptionResponse3.equals(adAccountCreateSubscriptionResponse4));
        System.assertEquals(adAccountCreateSubscriptionResponse1.hashCode(), adAccountCreateSubscriptionResponse2.hashCode());
        System.assertEquals(adAccountCreateSubscriptionResponse3.hashCode(), adAccountCreateSubscriptionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountCreateSubscriptionRespon adAccountCreateSubscriptionResponse = new OASAdAccountCreateSubscriptionRespon();
        Map<String, String> x-property-mappings = adAccountCreateSubscriptionResponse.getx-property-mappings();
        System.assertEquals('cryptographicKey', x-property-mappings.get('cryptographic_key'));
        System.assertEquals('cryptographicAlgorithm', x-property-mappings.get('cryptographic_algorithm'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
    }
}
