@isTest
private class OASCatalogsHotelReportParametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters1 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters2 = catalogsHotelReportParameters1;
        OASCatalogsHotelReportParameters catalogsHotelReportParameters3 = new OASCatalogsHotelReportParameters();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters4 = catalogsHotelReportParameters3;

        System.assert(catalogsHotelReportParameters1.equals(catalogsHotelReportParameters2));
        System.assert(catalogsHotelReportParameters2.equals(catalogsHotelReportParameters1));
        System.assert(catalogsHotelReportParameters1.equals(catalogsHotelReportParameters1));
        System.assert(catalogsHotelReportParameters3.equals(catalogsHotelReportParameters4));
        System.assert(catalogsHotelReportParameters4.equals(catalogsHotelReportParameters3));
        System.assert(catalogsHotelReportParameters3.equals(catalogsHotelReportParameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters1 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters2 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters3 = new OASCatalogsHotelReportParameters();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters4 = new OASCatalogsHotelReportParameters();

        System.assert(catalogsHotelReportParameters1.equals(catalogsHotelReportParameters2));
        System.assert(catalogsHotelReportParameters2.equals(catalogsHotelReportParameters1));
        System.assert(catalogsHotelReportParameters3.equals(catalogsHotelReportParameters4));
        System.assert(catalogsHotelReportParameters4.equals(catalogsHotelReportParameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters1 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters2 = new OASCatalogsHotelReportParameters();

        System.assertEquals(false, catalogsHotelReportParameters1.equals('foo'));
        System.assertEquals(false, catalogsHotelReportParameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters1 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters2 = new OASCatalogsHotelReportParameters();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters3;

        System.assertEquals(false, catalogsHotelReportParameters1.equals(catalogsHotelReportParameters3));
        System.assertEquals(false, catalogsHotelReportParameters2.equals(catalogsHotelReportParameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters1 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters2 = new OASCatalogsHotelReportParameters();

        System.assertEquals(catalogsHotelReportParameters1.hashCode(), catalogsHotelReportParameters1.hashCode());
        System.assertEquals(catalogsHotelReportParameters2.hashCode(), catalogsHotelReportParameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters1 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters2 = OASCatalogsHotelReportParameters.getExample();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters3 = new OASCatalogsHotelReportParameters();
        OASCatalogsHotelReportParameters catalogsHotelReportParameters4 = new OASCatalogsHotelReportParameters();

        System.assert(catalogsHotelReportParameters1.equals(catalogsHotelReportParameters2));
        System.assert(catalogsHotelReportParameters3.equals(catalogsHotelReportParameters4));
        System.assertEquals(catalogsHotelReportParameters1.hashCode(), catalogsHotelReportParameters2.hashCode());
        System.assertEquals(catalogsHotelReportParameters3.hashCode(), catalogsHotelReportParameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelReportParameters catalogsHotelReportParameters = new OASCatalogsHotelReportParameters();
        Map<String, String> x-property-mappings = catalogsHotelReportParameters.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
