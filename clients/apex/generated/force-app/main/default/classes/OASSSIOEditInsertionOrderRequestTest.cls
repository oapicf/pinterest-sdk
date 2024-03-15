@isTest
private class OASSSIOEditInsertionOrderRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest1 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest2 = ssIOEditInsertionOrderRequest1;
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest3 = new OASSSIOEditInsertionOrderRequest();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest4 = ssIOEditInsertionOrderRequest3;

        System.assert(ssIOEditInsertionOrderRequest1.equals(ssIOEditInsertionOrderRequest2));
        System.assert(ssIOEditInsertionOrderRequest2.equals(ssIOEditInsertionOrderRequest1));
        System.assert(ssIOEditInsertionOrderRequest1.equals(ssIOEditInsertionOrderRequest1));
        System.assert(ssIOEditInsertionOrderRequest3.equals(ssIOEditInsertionOrderRequest4));
        System.assert(ssIOEditInsertionOrderRequest4.equals(ssIOEditInsertionOrderRequest3));
        System.assert(ssIOEditInsertionOrderRequest3.equals(ssIOEditInsertionOrderRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest1 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest2 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest3 = new OASSSIOEditInsertionOrderRequest();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest4 = new OASSSIOEditInsertionOrderRequest();

        System.assert(ssIOEditInsertionOrderRequest1.equals(ssIOEditInsertionOrderRequest2));
        System.assert(ssIOEditInsertionOrderRequest2.equals(ssIOEditInsertionOrderRequest1));
        System.assert(ssIOEditInsertionOrderRequest3.equals(ssIOEditInsertionOrderRequest4));
        System.assert(ssIOEditInsertionOrderRequest4.equals(ssIOEditInsertionOrderRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest1 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest2 = new OASSSIOEditInsertionOrderRequest();

        System.assertEquals(false, ssIOEditInsertionOrderRequest1.equals('foo'));
        System.assertEquals(false, ssIOEditInsertionOrderRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest1 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest2 = new OASSSIOEditInsertionOrderRequest();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest3;

        System.assertEquals(false, ssIOEditInsertionOrderRequest1.equals(ssIOEditInsertionOrderRequest3));
        System.assertEquals(false, ssIOEditInsertionOrderRequest2.equals(ssIOEditInsertionOrderRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest1 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest2 = new OASSSIOEditInsertionOrderRequest();

        System.assertEquals(ssIOEditInsertionOrderRequest1.hashCode(), ssIOEditInsertionOrderRequest1.hashCode());
        System.assertEquals(ssIOEditInsertionOrderRequest2.hashCode(), ssIOEditInsertionOrderRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest1 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest2 = OASSSIOEditInsertionOrderRequest.getExample();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest3 = new OASSSIOEditInsertionOrderRequest();
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest4 = new OASSSIOEditInsertionOrderRequest();

        System.assert(ssIOEditInsertionOrderRequest1.equals(ssIOEditInsertionOrderRequest2));
        System.assert(ssIOEditInsertionOrderRequest3.equals(ssIOEditInsertionOrderRequest4));
        System.assertEquals(ssIOEditInsertionOrderRequest1.hashCode(), ssIOEditInsertionOrderRequest2.hashCode());
        System.assertEquals(ssIOEditInsertionOrderRequest3.hashCode(), ssIOEditInsertionOrderRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest = new OASSSIOEditInsertionOrderRequest();
        Map<String, String> x-property-mappings = ssIOEditInsertionOrderRequest.getx-property-mappings();
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
        System.assertEquals('oracleLineId', x-property-mappings.get('oracle_line_id'));
        System.assertEquals('salesforceOrderId', x-property-mappings.get('salesforce_order_id'));
        System.assertEquals('salesforceOrderLineId', x-property-mappings.get('salesforce_order_line_id'));
        System.assertEquals('adsManagerOrderLineId', x-property-mappings.get('ads_manager_order_line_id'));
    }
}
