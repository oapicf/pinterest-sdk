@isTest
private class OASItemDeleteBatchRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord1 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord2 = itemDeleteBatchRecord1;
        OASItemDeleteBatchRecord itemDeleteBatchRecord3 = new OASItemDeleteBatchRecord();
        OASItemDeleteBatchRecord itemDeleteBatchRecord4 = itemDeleteBatchRecord3;

        System.assert(itemDeleteBatchRecord1.equals(itemDeleteBatchRecord2));
        System.assert(itemDeleteBatchRecord2.equals(itemDeleteBatchRecord1));
        System.assert(itemDeleteBatchRecord1.equals(itemDeleteBatchRecord1));
        System.assert(itemDeleteBatchRecord3.equals(itemDeleteBatchRecord4));
        System.assert(itemDeleteBatchRecord4.equals(itemDeleteBatchRecord3));
        System.assert(itemDeleteBatchRecord3.equals(itemDeleteBatchRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord1 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord2 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord3 = new OASItemDeleteBatchRecord();
        OASItemDeleteBatchRecord itemDeleteBatchRecord4 = new OASItemDeleteBatchRecord();

        System.assert(itemDeleteBatchRecord1.equals(itemDeleteBatchRecord2));
        System.assert(itemDeleteBatchRecord2.equals(itemDeleteBatchRecord1));
        System.assert(itemDeleteBatchRecord3.equals(itemDeleteBatchRecord4));
        System.assert(itemDeleteBatchRecord4.equals(itemDeleteBatchRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord1 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord2 = new OASItemDeleteBatchRecord();

        System.assertEquals(false, itemDeleteBatchRecord1.equals('foo'));
        System.assertEquals(false, itemDeleteBatchRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord1 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord2 = new OASItemDeleteBatchRecord();
        OASItemDeleteBatchRecord itemDeleteBatchRecord3;

        System.assertEquals(false, itemDeleteBatchRecord1.equals(itemDeleteBatchRecord3));
        System.assertEquals(false, itemDeleteBatchRecord2.equals(itemDeleteBatchRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord1 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord2 = new OASItemDeleteBatchRecord();

        System.assertEquals(itemDeleteBatchRecord1.hashCode(), itemDeleteBatchRecord1.hashCode());
        System.assertEquals(itemDeleteBatchRecord2.hashCode(), itemDeleteBatchRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord1 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord2 = OASItemDeleteBatchRecord.getExample();
        OASItemDeleteBatchRecord itemDeleteBatchRecord3 = new OASItemDeleteBatchRecord();
        OASItemDeleteBatchRecord itemDeleteBatchRecord4 = new OASItemDeleteBatchRecord();

        System.assert(itemDeleteBatchRecord1.equals(itemDeleteBatchRecord2));
        System.assert(itemDeleteBatchRecord3.equals(itemDeleteBatchRecord4));
        System.assertEquals(itemDeleteBatchRecord1.hashCode(), itemDeleteBatchRecord2.hashCode());
        System.assertEquals(itemDeleteBatchRecord3.hashCode(), itemDeleteBatchRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemDeleteBatchRecord itemDeleteBatchRecord = new OASItemDeleteBatchRecord();
        Map<String, String> x-property-mappings = itemDeleteBatchRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
