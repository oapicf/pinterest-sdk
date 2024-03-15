@isTest
private class OASBulkDownloadRequestCampaignFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter1 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter2 = bulkDownloadRequestCampaignFilter1;
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter3 = new OASBulkDownloadRequestCampaignFilter();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter4 = bulkDownloadRequestCampaignFilter3;

        System.assert(bulkDownloadRequestCampaignFilter1.equals(bulkDownloadRequestCampaignFilter2));
        System.assert(bulkDownloadRequestCampaignFilter2.equals(bulkDownloadRequestCampaignFilter1));
        System.assert(bulkDownloadRequestCampaignFilter1.equals(bulkDownloadRequestCampaignFilter1));
        System.assert(bulkDownloadRequestCampaignFilter3.equals(bulkDownloadRequestCampaignFilter4));
        System.assert(bulkDownloadRequestCampaignFilter4.equals(bulkDownloadRequestCampaignFilter3));
        System.assert(bulkDownloadRequestCampaignFilter3.equals(bulkDownloadRequestCampaignFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter1 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter2 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter3 = new OASBulkDownloadRequestCampaignFilter();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter4 = new OASBulkDownloadRequestCampaignFilter();

        System.assert(bulkDownloadRequestCampaignFilter1.equals(bulkDownloadRequestCampaignFilter2));
        System.assert(bulkDownloadRequestCampaignFilter2.equals(bulkDownloadRequestCampaignFilter1));
        System.assert(bulkDownloadRequestCampaignFilter3.equals(bulkDownloadRequestCampaignFilter4));
        System.assert(bulkDownloadRequestCampaignFilter4.equals(bulkDownloadRequestCampaignFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter1 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter2 = new OASBulkDownloadRequestCampaignFilter();

        System.assertEquals(false, bulkDownloadRequestCampaignFilter1.equals('foo'));
        System.assertEquals(false, bulkDownloadRequestCampaignFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter1 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter2 = new OASBulkDownloadRequestCampaignFilter();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter3;

        System.assertEquals(false, bulkDownloadRequestCampaignFilter1.equals(bulkDownloadRequestCampaignFilter3));
        System.assertEquals(false, bulkDownloadRequestCampaignFilter2.equals(bulkDownloadRequestCampaignFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter1 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter2 = new OASBulkDownloadRequestCampaignFilter();

        System.assertEquals(bulkDownloadRequestCampaignFilter1.hashCode(), bulkDownloadRequestCampaignFilter1.hashCode());
        System.assertEquals(bulkDownloadRequestCampaignFilter2.hashCode(), bulkDownloadRequestCampaignFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter1 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter2 = OASBulkDownloadRequestCampaignFilter.getExample();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter3 = new OASBulkDownloadRequestCampaignFilter();
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter4 = new OASBulkDownloadRequestCampaignFilter();

        System.assert(bulkDownloadRequestCampaignFilter1.equals(bulkDownloadRequestCampaignFilter2));
        System.assert(bulkDownloadRequestCampaignFilter3.equals(bulkDownloadRequestCampaignFilter4));
        System.assertEquals(bulkDownloadRequestCampaignFilter1.hashCode(), bulkDownloadRequestCampaignFilter2.hashCode());
        System.assertEquals(bulkDownloadRequestCampaignFilter3.hashCode(), bulkDownloadRequestCampaignFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter = new OASBulkDownloadRequestCampaignFilter();
        Map<String, String> x-property-mappings = bulkDownloadRequestCampaignFilter.getx-property-mappings();
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('campaignStatus', x-property-mappings.get('campaign_status'));
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter = new OASBulkDownloadRequestCampaignFilter();
        System.assertEquals(new List<OASCampaignSummaryStatus>(), bulkDownloadRequestCampaignFilter.campaignStatus);
        System.assertEquals(new List<OASObjectiveType>(), bulkDownloadRequestCampaignFilter.objectiveType);
        System.assertEquals(null, bulkDownloadRequestCampaignFilter.startTime);
        System.assertEquals(null, bulkDownloadRequestCampaignFilter.endTime);
        System.assertEquals(null, bulkDownloadRequestCampaignFilter.name);
    }
}
