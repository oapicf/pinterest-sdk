@isTest
private class OASCatalogsReportParametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsReportParameters catalogsReportParameters1 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters2 = catalogsReportParameters1;
        OASCatalogsReportParameters catalogsReportParameters3 = new OASCatalogsReportParameters();
        OASCatalogsReportParameters catalogsReportParameters4 = catalogsReportParameters3;

        System.assert(catalogsReportParameters1.equals(catalogsReportParameters2));
        System.assert(catalogsReportParameters2.equals(catalogsReportParameters1));
        System.assert(catalogsReportParameters1.equals(catalogsReportParameters1));
        System.assert(catalogsReportParameters3.equals(catalogsReportParameters4));
        System.assert(catalogsReportParameters4.equals(catalogsReportParameters3));
        System.assert(catalogsReportParameters3.equals(catalogsReportParameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsReportParameters catalogsReportParameters1 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters2 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters3 = new OASCatalogsReportParameters();
        OASCatalogsReportParameters catalogsReportParameters4 = new OASCatalogsReportParameters();

        System.assert(catalogsReportParameters1.equals(catalogsReportParameters2));
        System.assert(catalogsReportParameters2.equals(catalogsReportParameters1));
        System.assert(catalogsReportParameters3.equals(catalogsReportParameters4));
        System.assert(catalogsReportParameters4.equals(catalogsReportParameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsReportParameters catalogsReportParameters1 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters2 = new OASCatalogsReportParameters();

        System.assertEquals(false, catalogsReportParameters1.equals('foo'));
        System.assertEquals(false, catalogsReportParameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsReportParameters catalogsReportParameters1 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters2 = new OASCatalogsReportParameters();
        OASCatalogsReportParameters catalogsReportParameters3;

        System.assertEquals(false, catalogsReportParameters1.equals(catalogsReportParameters3));
        System.assertEquals(false, catalogsReportParameters2.equals(catalogsReportParameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsReportParameters catalogsReportParameters1 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters2 = new OASCatalogsReportParameters();

        System.assertEquals(catalogsReportParameters1.hashCode(), catalogsReportParameters1.hashCode());
        System.assertEquals(catalogsReportParameters2.hashCode(), catalogsReportParameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsReportParameters catalogsReportParameters1 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters2 = OASCatalogsReportParameters.getExample();
        OASCatalogsReportParameters catalogsReportParameters3 = new OASCatalogsReportParameters();
        OASCatalogsReportParameters catalogsReportParameters4 = new OASCatalogsReportParameters();

        System.assert(catalogsReportParameters1.equals(catalogsReportParameters2));
        System.assert(catalogsReportParameters3.equals(catalogsReportParameters4));
        System.assertEquals(catalogsReportParameters1.hashCode(), catalogsReportParameters2.hashCode());
        System.assertEquals(catalogsReportParameters3.hashCode(), catalogsReportParameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsReportParameters catalogsReportParameters = new OASCatalogsReportParameters();
        Map<String, String> x-property-mappings = catalogsReportParameters.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
