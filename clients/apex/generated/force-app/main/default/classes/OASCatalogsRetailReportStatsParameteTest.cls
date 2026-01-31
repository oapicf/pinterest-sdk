@isTest
private class OASCatalogsRetailReportStatsParameteTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters1 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters2 = catalogsRetailReportStatsParameters1;
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters3 = new OASCatalogsRetailReportStatsParamete();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters4 = catalogsRetailReportStatsParameters3;

        System.assert(catalogsRetailReportStatsParameters1.equals(catalogsRetailReportStatsParameters2));
        System.assert(catalogsRetailReportStatsParameters2.equals(catalogsRetailReportStatsParameters1));
        System.assert(catalogsRetailReportStatsParameters1.equals(catalogsRetailReportStatsParameters1));
        System.assert(catalogsRetailReportStatsParameters3.equals(catalogsRetailReportStatsParameters4));
        System.assert(catalogsRetailReportStatsParameters4.equals(catalogsRetailReportStatsParameters3));
        System.assert(catalogsRetailReportStatsParameters3.equals(catalogsRetailReportStatsParameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters1 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters2 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters3 = new OASCatalogsRetailReportStatsParamete();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters4 = new OASCatalogsRetailReportStatsParamete();

        System.assert(catalogsRetailReportStatsParameters1.equals(catalogsRetailReportStatsParameters2));
        System.assert(catalogsRetailReportStatsParameters2.equals(catalogsRetailReportStatsParameters1));
        System.assert(catalogsRetailReportStatsParameters3.equals(catalogsRetailReportStatsParameters4));
        System.assert(catalogsRetailReportStatsParameters4.equals(catalogsRetailReportStatsParameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters1 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters2 = new OASCatalogsRetailReportStatsParamete();

        System.assertEquals(false, catalogsRetailReportStatsParameters1.equals('foo'));
        System.assertEquals(false, catalogsRetailReportStatsParameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters1 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters2 = new OASCatalogsRetailReportStatsParamete();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters3;

        System.assertEquals(false, catalogsRetailReportStatsParameters1.equals(catalogsRetailReportStatsParameters3));
        System.assertEquals(false, catalogsRetailReportStatsParameters2.equals(catalogsRetailReportStatsParameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters1 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters2 = new OASCatalogsRetailReportStatsParamete();

        System.assertEquals(catalogsRetailReportStatsParameters1.hashCode(), catalogsRetailReportStatsParameters1.hashCode());
        System.assertEquals(catalogsRetailReportStatsParameters2.hashCode(), catalogsRetailReportStatsParameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters1 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters2 = OASCatalogsRetailReportStatsParamete.getExample();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters3 = new OASCatalogsRetailReportStatsParamete();
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters4 = new OASCatalogsRetailReportStatsParamete();

        System.assert(catalogsRetailReportStatsParameters1.equals(catalogsRetailReportStatsParameters2));
        System.assert(catalogsRetailReportStatsParameters3.equals(catalogsRetailReportStatsParameters4));
        System.assertEquals(catalogsRetailReportStatsParameters1.hashCode(), catalogsRetailReportStatsParameters2.hashCode());
        System.assertEquals(catalogsRetailReportStatsParameters3.hashCode(), catalogsRetailReportStatsParameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailReportStatsParamete catalogsRetailReportStatsParameters = new OASCatalogsRetailReportStatsParamete();
        Map<String, String> x-property-mappings = catalogsRetailReportStatsParameters.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
