@isTest
private class OASOrderLinesTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLines orderLines1 = OASOrderLines.getExample();
        OASOrderLines orderLines2 = orderLines1;
        OASOrderLines orderLines3 = new OASOrderLines();
        OASOrderLines orderLines4 = orderLines3;

        System.assert(orderLines1.equals(orderLines2));
        System.assert(orderLines2.equals(orderLines1));
        System.assert(orderLines1.equals(orderLines1));
        System.assert(orderLines3.equals(orderLines4));
        System.assert(orderLines4.equals(orderLines3));
        System.assert(orderLines3.equals(orderLines3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLines orderLines1 = OASOrderLines.getExample();
        OASOrderLines orderLines2 = OASOrderLines.getExample();
        OASOrderLines orderLines3 = new OASOrderLines();
        OASOrderLines orderLines4 = new OASOrderLines();

        System.assert(orderLines1.equals(orderLines2));
        System.assert(orderLines2.equals(orderLines1));
        System.assert(orderLines3.equals(orderLines4));
        System.assert(orderLines4.equals(orderLines3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLines orderLines1 = OASOrderLines.getExample();
        OASOrderLines orderLines2 = new OASOrderLines();

        System.assertEquals(false, orderLines1.equals('foo'));
        System.assertEquals(false, orderLines2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLines orderLines1 = OASOrderLines.getExample();
        OASOrderLines orderLines2 = new OASOrderLines();
        OASOrderLines orderLines3;

        System.assertEquals(false, orderLines1.equals(orderLines3));
        System.assertEquals(false, orderLines2.equals(orderLines3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLines orderLines1 = OASOrderLines.getExample();
        OASOrderLines orderLines2 = new OASOrderLines();

        System.assertEquals(orderLines1.hashCode(), orderLines1.hashCode());
        System.assertEquals(orderLines2.hashCode(), orderLines2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLines orderLines1 = OASOrderLines.getExample();
        OASOrderLines orderLines2 = OASOrderLines.getExample();
        OASOrderLines orderLines3 = new OASOrderLines();
        OASOrderLines orderLines4 = new OASOrderLines();

        System.assert(orderLines1.equals(orderLines2));
        System.assert(orderLines3.equals(orderLines4));
        System.assertEquals(orderLines1.hashCode(), orderLines2.hashCode());
        System.assertEquals(orderLines3.hashCode(), orderLines4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrderLines orderLines = new OASOrderLines();
        Map<String, String> x-property-mappings = orderLines.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('purchaseOrderId', x-property-mappings.get('purchase_order_id'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('paidBudget', x-property-mappings.get('paid_budget'));
        System.assertEquals('paidType', x-property-mappings.get('paid_type'));
    }
}
