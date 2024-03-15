@isTest
private class OASSSIOOrderLineTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOOrderLine ssIOOrderLine1 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine2 = ssIOOrderLine1;
        OASSSIOOrderLine ssIOOrderLine3 = new OASSSIOOrderLine();
        OASSSIOOrderLine ssIOOrderLine4 = ssIOOrderLine3;

        System.assert(ssIOOrderLine1.equals(ssIOOrderLine2));
        System.assert(ssIOOrderLine2.equals(ssIOOrderLine1));
        System.assert(ssIOOrderLine1.equals(ssIOOrderLine1));
        System.assert(ssIOOrderLine3.equals(ssIOOrderLine4));
        System.assert(ssIOOrderLine4.equals(ssIOOrderLine3));
        System.assert(ssIOOrderLine3.equals(ssIOOrderLine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOOrderLine ssIOOrderLine1 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine2 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine3 = new OASSSIOOrderLine();
        OASSSIOOrderLine ssIOOrderLine4 = new OASSSIOOrderLine();

        System.assert(ssIOOrderLine1.equals(ssIOOrderLine2));
        System.assert(ssIOOrderLine2.equals(ssIOOrderLine1));
        System.assert(ssIOOrderLine3.equals(ssIOOrderLine4));
        System.assert(ssIOOrderLine4.equals(ssIOOrderLine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOOrderLine ssIOOrderLine1 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine2 = new OASSSIOOrderLine();

        System.assertEquals(false, ssIOOrderLine1.equals('foo'));
        System.assertEquals(false, ssIOOrderLine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOOrderLine ssIOOrderLine1 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine2 = new OASSSIOOrderLine();
        OASSSIOOrderLine ssIOOrderLine3;

        System.assertEquals(false, ssIOOrderLine1.equals(ssIOOrderLine3));
        System.assertEquals(false, ssIOOrderLine2.equals(ssIOOrderLine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOOrderLine ssIOOrderLine1 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine2 = new OASSSIOOrderLine();

        System.assertEquals(ssIOOrderLine1.hashCode(), ssIOOrderLine1.hashCode());
        System.assertEquals(ssIOOrderLine2.hashCode(), ssIOOrderLine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOOrderLine ssIOOrderLine1 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine2 = OASSSIOOrderLine.getExample();
        OASSSIOOrderLine ssIOOrderLine3 = new OASSSIOOrderLine();
        OASSSIOOrderLine ssIOOrderLine4 = new OASSSIOOrderLine();

        System.assert(ssIOOrderLine1.equals(ssIOOrderLine2));
        System.assert(ssIOOrderLine3.equals(ssIOOrderLine4));
        System.assertEquals(ssIOOrderLine1.hashCode(), ssIOOrderLine2.hashCode());
        System.assertEquals(ssIOOrderLine3.hashCode(), ssIOOrderLine4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOOrderLine ssIOOrderLine = new OASSSIOOrderLine();
        Map<String, String> x-property-mappings = ssIOOrderLine.getx-property-mappings();
        System.assertEquals('salesforceOrderLineId', x-property-mappings.get('salesforce_order_line_id'));
        System.assertEquals('adsManagerOrderLineId', x-property-mappings.get('ads_manager_order_line_id'));
        System.assertEquals('pinOrderId', x-property-mappings.get('pin_order_id'));
        System.assertEquals('lastModifiedDateTime', x-property-mappings.get('last_modified_date_time'));
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('billToCompanyName', x-property-mappings.get('bill_to_company_name'));
        System.assertEquals('billingContactFirstname', x-property-mappings.get('billing_contact_firstname'));
        System.assertEquals('billingContactLastname', x-property-mappings.get('billing_contact_lastname'));
        System.assertEquals('billingContactEmail', x-property-mappings.get('billing_contact_email'));
        System.assertEquals('mediaContactEmail', x-property-mappings.get('media_contact_email'));
        System.assertEquals('mediaContactFirstname', x-property-mappings.get('media_contact_firstname'));
        System.assertEquals('mediaContactLastname', x-property-mappings.get('media_contact_lastname'));
        System.assertEquals('currencyInfo', x-property-mappings.get('currency_info'));
        System.assertEquals('agencyLink', x-property-mappings.get('agency_link'));
        System.assertEquals('poNumber', x-property-mappings.get('po_number'));
        System.assertEquals('orderName', x-property-mappings.get('order_name'));
        System.assertEquals('pmpName', x-property-mappings.get('pmp_name'));
        System.assertEquals('acceptedTermsId', x-property-mappings.get('accepted_terms_id'));
        System.assertEquals('acceptedTermsTime', x-property-mappings.get('accepted_terms_time'));
        System.assertEquals('budgetAmount', x-property-mappings.get('budget_amount'));
        System.assertEquals('estimatedMonthlySpend', x-property-mappings.get('estimated_monthly_spend'));
    }
}
