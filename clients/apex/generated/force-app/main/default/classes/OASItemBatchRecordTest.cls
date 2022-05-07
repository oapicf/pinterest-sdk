@isTest
private class OASItemBatchRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemBatchRecord itemBatchRecord1 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord2 = itemBatchRecord1;
        OASItemBatchRecord itemBatchRecord3 = new OASItemBatchRecord();
        OASItemBatchRecord itemBatchRecord4 = itemBatchRecord3;

        System.assert(itemBatchRecord1.equals(itemBatchRecord2));
        System.assert(itemBatchRecord2.equals(itemBatchRecord1));
        System.assert(itemBatchRecord1.equals(itemBatchRecord1));
        System.assert(itemBatchRecord3.equals(itemBatchRecord4));
        System.assert(itemBatchRecord4.equals(itemBatchRecord3));
        System.assert(itemBatchRecord3.equals(itemBatchRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemBatchRecord itemBatchRecord1 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord2 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord3 = new OASItemBatchRecord();
        OASItemBatchRecord itemBatchRecord4 = new OASItemBatchRecord();

        System.assert(itemBatchRecord1.equals(itemBatchRecord2));
        System.assert(itemBatchRecord2.equals(itemBatchRecord1));
        System.assert(itemBatchRecord3.equals(itemBatchRecord4));
        System.assert(itemBatchRecord4.equals(itemBatchRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemBatchRecord itemBatchRecord1 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord2 = new OASItemBatchRecord();

        System.assertEquals(false, itemBatchRecord1.equals('foo'));
        System.assertEquals(false, itemBatchRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemBatchRecord itemBatchRecord1 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord2 = new OASItemBatchRecord();
        OASItemBatchRecord itemBatchRecord3;

        System.assertEquals(false, itemBatchRecord1.equals(itemBatchRecord3));
        System.assertEquals(false, itemBatchRecord2.equals(itemBatchRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemBatchRecord itemBatchRecord1 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord2 = new OASItemBatchRecord();

        System.assertEquals(itemBatchRecord1.hashCode(), itemBatchRecord1.hashCode());
        System.assertEquals(itemBatchRecord2.hashCode(), itemBatchRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemBatchRecord itemBatchRecord1 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord2 = OASItemBatchRecord.getExample();
        OASItemBatchRecord itemBatchRecord3 = new OASItemBatchRecord();
        OASItemBatchRecord itemBatchRecord4 = new OASItemBatchRecord();

        System.assert(itemBatchRecord1.equals(itemBatchRecord2));
        System.assert(itemBatchRecord3.equals(itemBatchRecord4));
        System.assertEquals(itemBatchRecord1.hashCode(), itemBatchRecord2.hashCode());
        System.assertEquals(itemBatchRecord3.hashCode(), itemBatchRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemBatchRecord itemBatchRecord = new OASItemBatchRecord();
        Map<String, String> x-property-mappings = itemBatchRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
