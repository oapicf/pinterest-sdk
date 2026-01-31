@isTest
private class OASBillingInvoiceResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBillingInvoiceResponse billingInvoiceResponse1 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse2 = billingInvoiceResponse1;
        OASBillingInvoiceResponse billingInvoiceResponse3 = new OASBillingInvoiceResponse();
        OASBillingInvoiceResponse billingInvoiceResponse4 = billingInvoiceResponse3;

        System.assert(billingInvoiceResponse1.equals(billingInvoiceResponse2));
        System.assert(billingInvoiceResponse2.equals(billingInvoiceResponse1));
        System.assert(billingInvoiceResponse1.equals(billingInvoiceResponse1));
        System.assert(billingInvoiceResponse3.equals(billingInvoiceResponse4));
        System.assert(billingInvoiceResponse4.equals(billingInvoiceResponse3));
        System.assert(billingInvoiceResponse3.equals(billingInvoiceResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBillingInvoiceResponse billingInvoiceResponse1 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse2 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse3 = new OASBillingInvoiceResponse();
        OASBillingInvoiceResponse billingInvoiceResponse4 = new OASBillingInvoiceResponse();

        System.assert(billingInvoiceResponse1.equals(billingInvoiceResponse2));
        System.assert(billingInvoiceResponse2.equals(billingInvoiceResponse1));
        System.assert(billingInvoiceResponse3.equals(billingInvoiceResponse4));
        System.assert(billingInvoiceResponse4.equals(billingInvoiceResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBillingInvoiceResponse billingInvoiceResponse1 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse2 = new OASBillingInvoiceResponse();

        System.assertEquals(false, billingInvoiceResponse1.equals('foo'));
        System.assertEquals(false, billingInvoiceResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBillingInvoiceResponse billingInvoiceResponse1 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse2 = new OASBillingInvoiceResponse();
        OASBillingInvoiceResponse billingInvoiceResponse3;

        System.assertEquals(false, billingInvoiceResponse1.equals(billingInvoiceResponse3));
        System.assertEquals(false, billingInvoiceResponse2.equals(billingInvoiceResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBillingInvoiceResponse billingInvoiceResponse1 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse2 = new OASBillingInvoiceResponse();

        System.assertEquals(billingInvoiceResponse1.hashCode(), billingInvoiceResponse1.hashCode());
        System.assertEquals(billingInvoiceResponse2.hashCode(), billingInvoiceResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBillingInvoiceResponse billingInvoiceResponse1 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse2 = OASBillingInvoiceResponse.getExample();
        OASBillingInvoiceResponse billingInvoiceResponse3 = new OASBillingInvoiceResponse();
        OASBillingInvoiceResponse billingInvoiceResponse4 = new OASBillingInvoiceResponse();

        System.assert(billingInvoiceResponse1.equals(billingInvoiceResponse2));
        System.assert(billingInvoiceResponse3.equals(billingInvoiceResponse4));
        System.assertEquals(billingInvoiceResponse1.hashCode(), billingInvoiceResponse2.hashCode());
        System.assertEquals(billingInvoiceResponse3.hashCode(), billingInvoiceResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBillingInvoiceResponse billingInvoiceResponse = new OASBillingInvoiceResponse();
        Map<String, String> x-property-mappings = billingInvoiceResponse.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('adAccountName', x-property-mappings.get('ad_account_name'));
        System.assertEquals('amountBilledMicroCurrency', x-property-mappings.get('amount_billed_micro_currency'));
        System.assertEquals('amountDiscountMicroCurrency', x-property-mappings.get('amount_discount_micro_currency'));
        System.assertEquals('amountNetMicroCurrency', x-property-mappings.get('amount_net_micro_currency'));
        System.assertEquals('amountTaxMicroCurrency', x-property-mappings.get('amount_tax_micro_currency'));
        System.assertEquals('billToCountry', x-property-mappings.get('bill_to_country'));
        System.assertEquals('billingPeriodEndDate', x-property-mappings.get('billing_period_end_date'));
        System.assertEquals('billingPeriodStartDate', x-property-mappings.get('billing_period_start_date'));
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('documentType', x-property-mappings.get('document_type'));
        System.assertEquals('invoiceDueDate', x-property-mappings.get('invoice_due_date'));
        System.assertEquals('paymentTerms', x-property-mappings.get('payment_terms'));
    }
}
