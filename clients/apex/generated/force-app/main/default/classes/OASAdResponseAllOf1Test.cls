@isTest
private class OASAdResponseAllOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASAdResponseAllOf1 adResponseAllOf11 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf12 = adResponseAllOf11;
        OASAdResponseAllOf1 adResponseAllOf13 = new OASAdResponseAllOf1();
        OASAdResponseAllOf1 adResponseAllOf14 = adResponseAllOf13;

        System.assert(adResponseAllOf11.equals(adResponseAllOf12));
        System.assert(adResponseAllOf12.equals(adResponseAllOf11));
        System.assert(adResponseAllOf11.equals(adResponseAllOf11));
        System.assert(adResponseAllOf13.equals(adResponseAllOf14));
        System.assert(adResponseAllOf14.equals(adResponseAllOf13));
        System.assert(adResponseAllOf13.equals(adResponseAllOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdResponseAllOf1 adResponseAllOf11 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf12 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf13 = new OASAdResponseAllOf1();
        OASAdResponseAllOf1 adResponseAllOf14 = new OASAdResponseAllOf1();

        System.assert(adResponseAllOf11.equals(adResponseAllOf12));
        System.assert(adResponseAllOf12.equals(adResponseAllOf11));
        System.assert(adResponseAllOf13.equals(adResponseAllOf14));
        System.assert(adResponseAllOf14.equals(adResponseAllOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdResponseAllOf1 adResponseAllOf11 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf12 = new OASAdResponseAllOf1();

        System.assertEquals(false, adResponseAllOf11.equals('foo'));
        System.assertEquals(false, adResponseAllOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdResponseAllOf1 adResponseAllOf11 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf12 = new OASAdResponseAllOf1();
        OASAdResponseAllOf1 adResponseAllOf13;

        System.assertEquals(false, adResponseAllOf11.equals(adResponseAllOf13));
        System.assertEquals(false, adResponseAllOf12.equals(adResponseAllOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdResponseAllOf1 adResponseAllOf11 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf12 = new OASAdResponseAllOf1();

        System.assertEquals(adResponseAllOf11.hashCode(), adResponseAllOf11.hashCode());
        System.assertEquals(adResponseAllOf12.hashCode(), adResponseAllOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdResponseAllOf1 adResponseAllOf11 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf12 = OASAdResponseAllOf1.getExample();
        OASAdResponseAllOf1 adResponseAllOf13 = new OASAdResponseAllOf1();
        OASAdResponseAllOf1 adResponseAllOf14 = new OASAdResponseAllOf1();

        System.assert(adResponseAllOf11.equals(adResponseAllOf12));
        System.assert(adResponseAllOf13.equals(adResponseAllOf14));
        System.assertEquals(adResponseAllOf11.hashCode(), adResponseAllOf12.hashCode());
        System.assertEquals(adResponseAllOf13.hashCode(), adResponseAllOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdResponseAllOf1 adResponseAllOf1 = new OASAdResponseAllOf1();
        Map<String, String> x-property-mappings = adResponseAllOf1.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('campaignId', x-property-mappings.get('campaign_id'));
        System.assertEquals('collectionItemsDestinationUrlTemplate', x-property-mappings.get('collection_items_destination_url_template'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('rejectedReasons', x-property-mappings.get('rejected_reasons'));
        System.assertEquals('rejectionLabels', x-property-mappings.get('rejection_labels'));
        System.assertEquals('reviewStatus', x-property-mappings.get('review_status'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('summaryStatus', x-property-mappings.get('summary_status'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdResponseAllOf1 adResponseAllOf1 = new OASAdResponseAllOf1();
        System.assertEquals(new List<RejectedReasonsEnum>(), adResponseAllOf1.rejectedReasons);
        System.assertEquals(new List<String>(), adResponseAllOf1.rejectionLabels);
        System.assertEquals(null, adResponseAllOf1.adAccountId);
        System.assertEquals(null, adResponseAllOf1.campaignId);
        System.assertEquals(null, adResponseAllOf1.collectionItemsDestinationUrlTemplate);
        System.assertEquals(null, adResponseAllOf1.createdTime);
        System.assertEquals(null, adResponseAllOf1.id);
        System.assertEquals(null, adResponseAllOf1.reviewStatus);
        System.assertEquals(null, adResponseAllOf1.type);
        System.assertEquals(null, adResponseAllOf1.updatedTime);
        System.assertEquals(null, adResponseAllOf1.summaryStatus);
    }
}
