@isTest
private class OASAdGroupResponseAllOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf11 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf12 = adGroupResponseAllOf11;
        OASAdGroupResponseAllOf1 adGroupResponseAllOf13 = new OASAdGroupResponseAllOf1();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf14 = adGroupResponseAllOf13;

        System.assert(adGroupResponseAllOf11.equals(adGroupResponseAllOf12));
        System.assert(adGroupResponseAllOf12.equals(adGroupResponseAllOf11));
        System.assert(adGroupResponseAllOf11.equals(adGroupResponseAllOf11));
        System.assert(adGroupResponseAllOf13.equals(adGroupResponseAllOf14));
        System.assert(adGroupResponseAllOf14.equals(adGroupResponseAllOf13));
        System.assert(adGroupResponseAllOf13.equals(adGroupResponseAllOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf11 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf12 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf13 = new OASAdGroupResponseAllOf1();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf14 = new OASAdGroupResponseAllOf1();

        System.assert(adGroupResponseAllOf11.equals(adGroupResponseAllOf12));
        System.assert(adGroupResponseAllOf12.equals(adGroupResponseAllOf11));
        System.assert(adGroupResponseAllOf13.equals(adGroupResponseAllOf14));
        System.assert(adGroupResponseAllOf14.equals(adGroupResponseAllOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf11 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf12 = new OASAdGroupResponseAllOf1();

        System.assertEquals(false, adGroupResponseAllOf11.equals('foo'));
        System.assertEquals(false, adGroupResponseAllOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf11 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf12 = new OASAdGroupResponseAllOf1();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf13;

        System.assertEquals(false, adGroupResponseAllOf11.equals(adGroupResponseAllOf13));
        System.assertEquals(false, adGroupResponseAllOf12.equals(adGroupResponseAllOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf11 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf12 = new OASAdGroupResponseAllOf1();

        System.assertEquals(adGroupResponseAllOf11.hashCode(), adGroupResponseAllOf11.hashCode());
        System.assertEquals(adGroupResponseAllOf12.hashCode(), adGroupResponseAllOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf11 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf12 = OASAdGroupResponseAllOf1.getExample();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf13 = new OASAdGroupResponseAllOf1();
        OASAdGroupResponseAllOf1 adGroupResponseAllOf14 = new OASAdGroupResponseAllOf1();

        System.assert(adGroupResponseAllOf11.equals(adGroupResponseAllOf12));
        System.assert(adGroupResponseAllOf13.equals(adGroupResponseAllOf14));
        System.assertEquals(adGroupResponseAllOf11.hashCode(), adGroupResponseAllOf12.hashCode());
        System.assertEquals(adGroupResponseAllOf13.hashCode(), adGroupResponseAllOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupResponseAllOf1 adGroupResponseAllOf1 = new OASAdGroupResponseAllOf1();
        Map<String, String> x-property-mappings = adGroupResponseAllOf1.getx-property-mappings();
        System.assertEquals('campaignId', x-property-mappings.get('campaign_id'));
        System.assertEquals('billableEvent', x-property-mappings.get('billable_event'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
    }
}
