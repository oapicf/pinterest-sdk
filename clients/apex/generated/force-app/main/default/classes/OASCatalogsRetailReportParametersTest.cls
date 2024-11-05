@isTest
private class OASCatalogsRetailReportParametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters1 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters2 = catalogsRetailReportParameters1;
        OASCatalogsRetailReportParameters catalogsRetailReportParameters3 = new OASCatalogsRetailReportParameters();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters4 = catalogsRetailReportParameters3;

        System.assert(catalogsRetailReportParameters1.equals(catalogsRetailReportParameters2));
        System.assert(catalogsRetailReportParameters2.equals(catalogsRetailReportParameters1));
        System.assert(catalogsRetailReportParameters1.equals(catalogsRetailReportParameters1));
        System.assert(catalogsRetailReportParameters3.equals(catalogsRetailReportParameters4));
        System.assert(catalogsRetailReportParameters4.equals(catalogsRetailReportParameters3));
        System.assert(catalogsRetailReportParameters3.equals(catalogsRetailReportParameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters1 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters2 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters3 = new OASCatalogsRetailReportParameters();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters4 = new OASCatalogsRetailReportParameters();

        System.assert(catalogsRetailReportParameters1.equals(catalogsRetailReportParameters2));
        System.assert(catalogsRetailReportParameters2.equals(catalogsRetailReportParameters1));
        System.assert(catalogsRetailReportParameters3.equals(catalogsRetailReportParameters4));
        System.assert(catalogsRetailReportParameters4.equals(catalogsRetailReportParameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters1 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters2 = new OASCatalogsRetailReportParameters();

        System.assertEquals(false, catalogsRetailReportParameters1.equals('foo'));
        System.assertEquals(false, catalogsRetailReportParameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters1 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters2 = new OASCatalogsRetailReportParameters();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters3;

        System.assertEquals(false, catalogsRetailReportParameters1.equals(catalogsRetailReportParameters3));
        System.assertEquals(false, catalogsRetailReportParameters2.equals(catalogsRetailReportParameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters1 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters2 = new OASCatalogsRetailReportParameters();

        System.assertEquals(catalogsRetailReportParameters1.hashCode(), catalogsRetailReportParameters1.hashCode());
        System.assertEquals(catalogsRetailReportParameters2.hashCode(), catalogsRetailReportParameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters1 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters2 = OASCatalogsRetailReportParameters.getExample();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters3 = new OASCatalogsRetailReportParameters();
        OASCatalogsRetailReportParameters catalogsRetailReportParameters4 = new OASCatalogsRetailReportParameters();

        System.assert(catalogsRetailReportParameters1.equals(catalogsRetailReportParameters2));
        System.assert(catalogsRetailReportParameters3.equals(catalogsRetailReportParameters4));
        System.assertEquals(catalogsRetailReportParameters1.hashCode(), catalogsRetailReportParameters2.hashCode());
        System.assertEquals(catalogsRetailReportParameters3.hashCode(), catalogsRetailReportParameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailReportParameters catalogsRetailReportParameters = new OASCatalogsRetailReportParameters();
        Map<String, String> x-property-mappings = catalogsRetailReportParameters.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
