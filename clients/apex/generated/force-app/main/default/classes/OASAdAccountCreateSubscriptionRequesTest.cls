@isTest
private class OASAdAccountCreateSubscriptionRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata2 = adAccountCreateSubscriptionRequestPartnerMetadata1;
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata3 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata4 = adAccountCreateSubscriptionRequestPartnerMetadata3;

        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata1.equals(adAccountCreateSubscriptionRequestPartnerMetadata2));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata2.equals(adAccountCreateSubscriptionRequestPartnerMetadata1));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata1.equals(adAccountCreateSubscriptionRequestPartnerMetadata1));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata3.equals(adAccountCreateSubscriptionRequestPartnerMetadata4));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata4.equals(adAccountCreateSubscriptionRequestPartnerMetadata3));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata3.equals(adAccountCreateSubscriptionRequestPartnerMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata2 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata3 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata4 = new OASAdAccountCreateSubscriptionReques();

        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata1.equals(adAccountCreateSubscriptionRequestPartnerMetadata2));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata2.equals(adAccountCreateSubscriptionRequestPartnerMetadata1));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata3.equals(adAccountCreateSubscriptionRequestPartnerMetadata4));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata4.equals(adAccountCreateSubscriptionRequestPartnerMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata2 = new OASAdAccountCreateSubscriptionReques();

        System.assertEquals(false, adAccountCreateSubscriptionRequestPartnerMetadata1.equals('foo'));
        System.assertEquals(false, adAccountCreateSubscriptionRequestPartnerMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata2 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata3;

        System.assertEquals(false, adAccountCreateSubscriptionRequestPartnerMetadata1.equals(adAccountCreateSubscriptionRequestPartnerMetadata3));
        System.assertEquals(false, adAccountCreateSubscriptionRequestPartnerMetadata2.equals(adAccountCreateSubscriptionRequestPartnerMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata2 = new OASAdAccountCreateSubscriptionReques();

        System.assertEquals(adAccountCreateSubscriptionRequestPartnerMetadata1.hashCode(), adAccountCreateSubscriptionRequestPartnerMetadata1.hashCode());
        System.assertEquals(adAccountCreateSubscriptionRequestPartnerMetadata2.hashCode(), adAccountCreateSubscriptionRequestPartnerMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata1 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata2 = OASAdAccountCreateSubscriptionReques.getExample();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata3 = new OASAdAccountCreateSubscriptionReques();
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata4 = new OASAdAccountCreateSubscriptionReques();

        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata1.equals(adAccountCreateSubscriptionRequestPartnerMetadata2));
        System.assert(adAccountCreateSubscriptionRequestPartnerMetadata3.equals(adAccountCreateSubscriptionRequestPartnerMetadata4));
        System.assertEquals(adAccountCreateSubscriptionRequestPartnerMetadata1.hashCode(), adAccountCreateSubscriptionRequestPartnerMetadata2.hashCode());
        System.assertEquals(adAccountCreateSubscriptionRequestPartnerMetadata3.hashCode(), adAccountCreateSubscriptionRequestPartnerMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountCreateSubscriptionReques adAccountCreateSubscriptionRequestPartnerMetadata = new OASAdAccountCreateSubscriptionReques();
        Map<String, String> x-property-mappings = adAccountCreateSubscriptionRequestPartnerMetadata.getx-property-mappings();
        System.assertEquals('subscriberKey', x-property-mappings.get('subscriber_key'));
    }
}
