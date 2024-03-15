@isTest
private class OASSSIOCreateInsertionOrderRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest1 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest2 = ssIOCreateInsertionOrderRequest1;
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest3 = new OASSSIOCreateInsertionOrderRequest();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest4 = ssIOCreateInsertionOrderRequest3;

        System.assert(ssIOCreateInsertionOrderRequest1.equals(ssIOCreateInsertionOrderRequest2));
        System.assert(ssIOCreateInsertionOrderRequest2.equals(ssIOCreateInsertionOrderRequest1));
        System.assert(ssIOCreateInsertionOrderRequest1.equals(ssIOCreateInsertionOrderRequest1));
        System.assert(ssIOCreateInsertionOrderRequest3.equals(ssIOCreateInsertionOrderRequest4));
        System.assert(ssIOCreateInsertionOrderRequest4.equals(ssIOCreateInsertionOrderRequest3));
        System.assert(ssIOCreateInsertionOrderRequest3.equals(ssIOCreateInsertionOrderRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest1 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest2 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest3 = new OASSSIOCreateInsertionOrderRequest();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest4 = new OASSSIOCreateInsertionOrderRequest();

        System.assert(ssIOCreateInsertionOrderRequest1.equals(ssIOCreateInsertionOrderRequest2));
        System.assert(ssIOCreateInsertionOrderRequest2.equals(ssIOCreateInsertionOrderRequest1));
        System.assert(ssIOCreateInsertionOrderRequest3.equals(ssIOCreateInsertionOrderRequest4));
        System.assert(ssIOCreateInsertionOrderRequest4.equals(ssIOCreateInsertionOrderRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest1 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest2 = new OASSSIOCreateInsertionOrderRequest();

        System.assertEquals(false, ssIOCreateInsertionOrderRequest1.equals('foo'));
        System.assertEquals(false, ssIOCreateInsertionOrderRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest1 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest2 = new OASSSIOCreateInsertionOrderRequest();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest3;

        System.assertEquals(false, ssIOCreateInsertionOrderRequest1.equals(ssIOCreateInsertionOrderRequest3));
        System.assertEquals(false, ssIOCreateInsertionOrderRequest2.equals(ssIOCreateInsertionOrderRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest1 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest2 = new OASSSIOCreateInsertionOrderRequest();

        System.assertEquals(ssIOCreateInsertionOrderRequest1.hashCode(), ssIOCreateInsertionOrderRequest1.hashCode());
        System.assertEquals(ssIOCreateInsertionOrderRequest2.hashCode(), ssIOCreateInsertionOrderRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest1 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest2 = OASSSIOCreateInsertionOrderRequest.getExample();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest3 = new OASSSIOCreateInsertionOrderRequest();
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest4 = new OASSSIOCreateInsertionOrderRequest();

        System.assert(ssIOCreateInsertionOrderRequest1.equals(ssIOCreateInsertionOrderRequest2));
        System.assert(ssIOCreateInsertionOrderRequest3.equals(ssIOCreateInsertionOrderRequest4));
        System.assertEquals(ssIOCreateInsertionOrderRequest1.hashCode(), ssIOCreateInsertionOrderRequest2.hashCode());
        System.assertEquals(ssIOCreateInsertionOrderRequest3.hashCode(), ssIOCreateInsertionOrderRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest = new OASSSIOCreateInsertionOrderRequest();
        Map<String, String> x-property-mappings = ssIOCreateInsertionOrderRequest.getx-property-mappings();
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('poNumber', x-property-mappings.get('po_number'));
        System.assertEquals('budgetAmount', x-property-mappings.get('budget_amount'));
        System.assertEquals('billingContactFirstname', x-property-mappings.get('billing_contact_firstname'));
        System.assertEquals('billingContactLastname', x-property-mappings.get('billing_contact_lastname'));
        System.assertEquals('billingContactEmail', x-property-mappings.get('billing_contact_email'));
        System.assertEquals('mediaContactFirstname', x-property-mappings.get('media_contact_firstname'));
        System.assertEquals('mediaContactLastname', x-property-mappings.get('media_contact_lastname'));
        System.assertEquals('mediaContactEmail', x-property-mappings.get('media_contact_email'));
        System.assertEquals('agencyLink', x-property-mappings.get('agency_link'));
        System.assertEquals('userEmail', x-property-mappings.get('user_email'));
        System.assertEquals('acceptedTermsTime', x-property-mappings.get('accepted_terms_time'));
        System.assertEquals('pmpId', x-property-mappings.get('pmp_id'));
        System.assertEquals('orderName', x-property-mappings.get('order_name'));
        System.assertEquals('orderLineType', x-property-mappings.get('order_line_type'));
        System.assertEquals('acceptedTermsId', x-property-mappings.get('accepted_terms_id'));
        System.assertEquals('billtoCompanyId', x-property-mappings.get('billto_company_id'));
        System.assertEquals('billtoBusinessAddressId', x-property-mappings.get('billto_business_address_id'));
        System.assertEquals('billtoBillingAddressId', x-property-mappings.get('billto_billing_address_id'));
        System.assertEquals('estimatedMonthlySpend', x-property-mappings.get('estimated_monthly_spend'));
        System.assertEquals('currencyInfo', x-property-mappings.get('currency_info'));
    }
}
