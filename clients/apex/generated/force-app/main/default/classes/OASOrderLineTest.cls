@isTest
private class OASOrderLineTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLine orderLine1 = OASOrderLine.getExample();
        OASOrderLine orderLine2 = orderLine1;
        OASOrderLine orderLine3 = new OASOrderLine();
        OASOrderLine orderLine4 = orderLine3;

        System.assert(orderLine1.equals(orderLine2));
        System.assert(orderLine2.equals(orderLine1));
        System.assert(orderLine1.equals(orderLine1));
        System.assert(orderLine3.equals(orderLine4));
        System.assert(orderLine4.equals(orderLine3));
        System.assert(orderLine3.equals(orderLine3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLine orderLine1 = OASOrderLine.getExample();
        OASOrderLine orderLine2 = OASOrderLine.getExample();
        OASOrderLine orderLine3 = new OASOrderLine();
        OASOrderLine orderLine4 = new OASOrderLine();

        System.assert(orderLine1.equals(orderLine2));
        System.assert(orderLine2.equals(orderLine1));
        System.assert(orderLine3.equals(orderLine4));
        System.assert(orderLine4.equals(orderLine3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLine orderLine1 = OASOrderLine.getExample();
        OASOrderLine orderLine2 = new OASOrderLine();

        System.assertEquals(false, orderLine1.equals('foo'));
        System.assertEquals(false, orderLine2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLine orderLine1 = OASOrderLine.getExample();
        OASOrderLine orderLine2 = new OASOrderLine();
        OASOrderLine orderLine3;

        System.assertEquals(false, orderLine1.equals(orderLine3));
        System.assertEquals(false, orderLine2.equals(orderLine3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLine orderLine1 = OASOrderLine.getExample();
        OASOrderLine orderLine2 = new OASOrderLine();

        System.assertEquals(orderLine1.hashCode(), orderLine1.hashCode());
        System.assertEquals(orderLine2.hashCode(), orderLine2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLine orderLine1 = OASOrderLine.getExample();
        OASOrderLine orderLine2 = OASOrderLine.getExample();
        OASOrderLine orderLine3 = new OASOrderLine();
        OASOrderLine orderLine4 = new OASOrderLine();

        System.assert(orderLine1.equals(orderLine2));
        System.assert(orderLine3.equals(orderLine4));
        System.assertEquals(orderLine1.hashCode(), orderLine2.hashCode());
        System.assertEquals(orderLine3.hashCode(), orderLine4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrderLine orderLine = new OASOrderLine();
        Map<String, String> x-property-mappings = orderLine.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('purchaseOrderId', x-property-mappings.get('purchase_order_id'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('paidBudget', x-property-mappings.get('paid_budget'));
        System.assertEquals('paidType', x-property-mappings.get('paid_type'));
        System.assertEquals('campaignIds', x-property-mappings.get('campaign_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderLine orderLine = new OASOrderLine();
        System.assertEquals(new List<String>(), orderLine.campaignIds);
        System.assertEquals(null, orderLine.id);
        System.assertEquals(null, orderLine.type);
        System.assertEquals(null, orderLine.adAccountId);
        System.assertEquals(null, orderLine.purchaseOrderId);
        System.assertEquals(null, orderLine.startTime);
        System.assertEquals(null, orderLine.endTime);
        System.assertEquals(null, orderLine.budget);
        System.assertEquals(null, orderLine.paidBudget);
        System.assertEquals(null, orderLine.status);
        System.assertEquals(null, orderLine.name);
        System.assertEquals(null, orderLine.paidType);
    }
}
