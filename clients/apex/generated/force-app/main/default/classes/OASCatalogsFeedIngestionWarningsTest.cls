@isTest
private class OASCatalogsFeedIngestionWarningsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = catalogsFeedIngestionWarnings1;
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings4 = catalogsFeedIngestionWarnings3;

        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings2));
        System.assert(catalogsFeedIngestionWarnings2.equals(catalogsFeedIngestionWarnings1));
        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings1));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings4));
        System.assert(catalogsFeedIngestionWarnings4.equals(catalogsFeedIngestionWarnings3));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings4 = new OASCatalogsFeedIngestionWarnings();

        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings2));
        System.assert(catalogsFeedIngestionWarnings2.equals(catalogsFeedIngestionWarnings1));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings4));
        System.assert(catalogsFeedIngestionWarnings4.equals(catalogsFeedIngestionWarnings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = new OASCatalogsFeedIngestionWarnings();

        System.assertEquals(false, catalogsFeedIngestionWarnings1.equals('foo'));
        System.assertEquals(false, catalogsFeedIngestionWarnings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3;

        System.assertEquals(false, catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings3));
        System.assertEquals(false, catalogsFeedIngestionWarnings2.equals(catalogsFeedIngestionWarnings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = new OASCatalogsFeedIngestionWarnings();

        System.assertEquals(catalogsFeedIngestionWarnings1.hashCode(), catalogsFeedIngestionWarnings1.hashCode());
        System.assertEquals(catalogsFeedIngestionWarnings2.hashCode(), catalogsFeedIngestionWarnings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings4 = new OASCatalogsFeedIngestionWarnings();

        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings2));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings4));
        System.assertEquals(catalogsFeedIngestionWarnings1.hashCode(), catalogsFeedIngestionWarnings2.hashCode());
        System.assertEquals(catalogsFeedIngestionWarnings3.hashCode(), catalogsFeedIngestionWarnings4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings = new OASCatalogsFeedIngestionWarnings();
        Map<String, String> x-property-mappings = catalogsFeedIngestionWarnings.getx-property-mappings();
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS400', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_400'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS403', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_403'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS404', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_404'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS405', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_405'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS410', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_410'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS429', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_429'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS500', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_500'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS502', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_502'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS503', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_503'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS504', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_504'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS507', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_507'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS508', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_508'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS520', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_520'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS521', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_521'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS522', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_522'));
        System.assertEquals('adIMAGEDOWNLOADHTTPSTATUS525', x-property-mappings.get('AD_IMAGE_DOWNLOAD_HTTP_STATUS_525'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS400', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_400'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS403', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_403'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS404', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_404'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS405', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_405'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS410', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_410'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS429', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_429'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS500', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_500'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS502', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_502'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS503', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_503'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS504', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_504'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS507', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_507'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS508', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_508'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS520', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_520'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS521', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_521'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS522', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_522'));
        System.assertEquals('adVIDEODOWNLOADHTTPSTATUS525', x-property-mappings.get('AD_VIDEO_DOWNLOAD_HTTP_STATUS_525'));
    }
}
