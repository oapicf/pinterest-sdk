@isTest
private class OASMMMReportingColumnTest {
    @isTest
    private static void allowableValues() {
        Set<OASMMMReportingColumn> expected = new Set<OASMMMReportingColumn>{
            OASMMMReportingColumn.SPEND_IN_DOLLAR,
            OASMMMReportingColumn.SPEND_IN_MICRO_DOLLAR,
            OASMMMReportingColumn.ECPC_IN_DOLLAR,
            OASMMMReportingColumn.ECTR,
            OASMMMReportingColumn.CAMPAIGN_NAME,
            OASMMMReportingColumn.TOTAL_ENGAGEMENT,
            OASMMMReportingColumn.EENGAGEMENT_RATE,
            OASMMMReportingColumn.ECPM_IN_DOLLAR,
            OASMMMReportingColumn.CAMPAIGN_ID,
            OASMMMReportingColumn.ADVERTISER_ID,
            OASMMMReportingColumn.AD_GROUP_ID,
            OASMMMReportingColumn.AD_GROUP_NAME,
            OASMMMReportingColumn.CLICKTHROUGH_1,
            OASMMMReportingColumn.IMPRESSION_1,
            OASMMMReportingColumn.CLICKTHROUGH_2,
            OASMMMReportingColumn.IMPRESSION_2,
            OASMMMReportingColumn.TOTAL_CLICKTHROUGH,
            OASMMMReportingColumn.TOTAL_IMPRESSION,
            OASMMMReportingColumn.ADVERTISER_NAME,
            OASMMMReportingColumn.SPEND_ORDER_LINE_PAID_TYPE
        };
        Set<OASMMMReportingColumn> actual  = new Set<OASMMMReportingColumn>(OASMMMReportingColumn.values());
        System.assertEquals(expected, actual);
    }
}
