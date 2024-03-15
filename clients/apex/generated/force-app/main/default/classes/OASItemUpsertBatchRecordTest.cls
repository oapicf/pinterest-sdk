@isTest
private class OASItemUpsertBatchRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord1 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord2 = itemUpsertBatchRecord1;
        OASItemUpsertBatchRecord itemUpsertBatchRecord3 = new OASItemUpsertBatchRecord();
        OASItemUpsertBatchRecord itemUpsertBatchRecord4 = itemUpsertBatchRecord3;

        System.assert(itemUpsertBatchRecord1.equals(itemUpsertBatchRecord2));
        System.assert(itemUpsertBatchRecord2.equals(itemUpsertBatchRecord1));
        System.assert(itemUpsertBatchRecord1.equals(itemUpsertBatchRecord1));
        System.assert(itemUpsertBatchRecord3.equals(itemUpsertBatchRecord4));
        System.assert(itemUpsertBatchRecord4.equals(itemUpsertBatchRecord3));
        System.assert(itemUpsertBatchRecord3.equals(itemUpsertBatchRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord1 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord2 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord3 = new OASItemUpsertBatchRecord();
        OASItemUpsertBatchRecord itemUpsertBatchRecord4 = new OASItemUpsertBatchRecord();

        System.assert(itemUpsertBatchRecord1.equals(itemUpsertBatchRecord2));
        System.assert(itemUpsertBatchRecord2.equals(itemUpsertBatchRecord1));
        System.assert(itemUpsertBatchRecord3.equals(itemUpsertBatchRecord4));
        System.assert(itemUpsertBatchRecord4.equals(itemUpsertBatchRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord1 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord2 = new OASItemUpsertBatchRecord();

        System.assertEquals(false, itemUpsertBatchRecord1.equals('foo'));
        System.assertEquals(false, itemUpsertBatchRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord1 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord2 = new OASItemUpsertBatchRecord();
        OASItemUpsertBatchRecord itemUpsertBatchRecord3;

        System.assertEquals(false, itemUpsertBatchRecord1.equals(itemUpsertBatchRecord3));
        System.assertEquals(false, itemUpsertBatchRecord2.equals(itemUpsertBatchRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord1 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord2 = new OASItemUpsertBatchRecord();

        System.assertEquals(itemUpsertBatchRecord1.hashCode(), itemUpsertBatchRecord1.hashCode());
        System.assertEquals(itemUpsertBatchRecord2.hashCode(), itemUpsertBatchRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord1 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord2 = OASItemUpsertBatchRecord.getExample();
        OASItemUpsertBatchRecord itemUpsertBatchRecord3 = new OASItemUpsertBatchRecord();
        OASItemUpsertBatchRecord itemUpsertBatchRecord4 = new OASItemUpsertBatchRecord();

        System.assert(itemUpsertBatchRecord1.equals(itemUpsertBatchRecord2));
        System.assert(itemUpsertBatchRecord3.equals(itemUpsertBatchRecord4));
        System.assertEquals(itemUpsertBatchRecord1.hashCode(), itemUpsertBatchRecord2.hashCode());
        System.assertEquals(itemUpsertBatchRecord3.hashCode(), itemUpsertBatchRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemUpsertBatchRecord itemUpsertBatchRecord = new OASItemUpsertBatchRecord();
        Map<String, String> x-property-mappings = itemUpsertBatchRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
