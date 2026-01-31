@isTest
private class OASBillingInvoiceDownloadResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse1 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse2 = billingInvoiceDownloadResponse1;
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse3 = new OASBillingInvoiceDownloadResponse();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse4 = billingInvoiceDownloadResponse3;

        System.assert(billingInvoiceDownloadResponse1.equals(billingInvoiceDownloadResponse2));
        System.assert(billingInvoiceDownloadResponse2.equals(billingInvoiceDownloadResponse1));
        System.assert(billingInvoiceDownloadResponse1.equals(billingInvoiceDownloadResponse1));
        System.assert(billingInvoiceDownloadResponse3.equals(billingInvoiceDownloadResponse4));
        System.assert(billingInvoiceDownloadResponse4.equals(billingInvoiceDownloadResponse3));
        System.assert(billingInvoiceDownloadResponse3.equals(billingInvoiceDownloadResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse1 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse2 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse3 = new OASBillingInvoiceDownloadResponse();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse4 = new OASBillingInvoiceDownloadResponse();

        System.assert(billingInvoiceDownloadResponse1.equals(billingInvoiceDownloadResponse2));
        System.assert(billingInvoiceDownloadResponse2.equals(billingInvoiceDownloadResponse1));
        System.assert(billingInvoiceDownloadResponse3.equals(billingInvoiceDownloadResponse4));
        System.assert(billingInvoiceDownloadResponse4.equals(billingInvoiceDownloadResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse1 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse2 = new OASBillingInvoiceDownloadResponse();

        System.assertEquals(false, billingInvoiceDownloadResponse1.equals('foo'));
        System.assertEquals(false, billingInvoiceDownloadResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse1 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse2 = new OASBillingInvoiceDownloadResponse();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse3;

        System.assertEquals(false, billingInvoiceDownloadResponse1.equals(billingInvoiceDownloadResponse3));
        System.assertEquals(false, billingInvoiceDownloadResponse2.equals(billingInvoiceDownloadResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse1 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse2 = new OASBillingInvoiceDownloadResponse();

        System.assertEquals(billingInvoiceDownloadResponse1.hashCode(), billingInvoiceDownloadResponse1.hashCode());
        System.assertEquals(billingInvoiceDownloadResponse2.hashCode(), billingInvoiceDownloadResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse1 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse2 = OASBillingInvoiceDownloadResponse.getExample();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse3 = new OASBillingInvoiceDownloadResponse();
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse4 = new OASBillingInvoiceDownloadResponse();

        System.assert(billingInvoiceDownloadResponse1.equals(billingInvoiceDownloadResponse2));
        System.assert(billingInvoiceDownloadResponse3.equals(billingInvoiceDownloadResponse4));
        System.assertEquals(billingInvoiceDownloadResponse1.hashCode(), billingInvoiceDownloadResponse2.hashCode());
        System.assertEquals(billingInvoiceDownloadResponse3.hashCode(), billingInvoiceDownloadResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBillingInvoiceDownloadResponse billingInvoiceDownloadResponse = new OASBillingInvoiceDownloadResponse();
        Map<String, String> x-property-mappings = billingInvoiceDownloadResponse.getx-property-mappings();
        System.assertEquals('downloadUrl', x-property-mappings.get('download_url'));
    }
}
