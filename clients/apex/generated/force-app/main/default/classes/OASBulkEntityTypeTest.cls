@isTest
private class OASBulkEntityTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASBulkEntityType> expected = new Set<OASBulkEntityType>{
            OASBulkEntityType.CAMPAIGN,
            OASBulkEntityType.AD_GROUP,
            OASBulkEntityType.PRODUCT_GROUP,
            OASBulkEntityType.AD,
            OASBulkEntityType.KEYWORD
        };
        Set<OASBulkEntityType> actual  = new Set<OASBulkEntityType>(OASBulkEntityType.values());
        System.assertEquals(expected, actual);
    }
}
