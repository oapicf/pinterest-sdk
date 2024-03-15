@isTest
private class OASItemCreateBatchRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemCreateBatchRecord itemCreateBatchRecord1 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord2 = itemCreateBatchRecord1;
        OASItemCreateBatchRecord itemCreateBatchRecord3 = new OASItemCreateBatchRecord();
        OASItemCreateBatchRecord itemCreateBatchRecord4 = itemCreateBatchRecord3;

        System.assert(itemCreateBatchRecord1.equals(itemCreateBatchRecord2));
        System.assert(itemCreateBatchRecord2.equals(itemCreateBatchRecord1));
        System.assert(itemCreateBatchRecord1.equals(itemCreateBatchRecord1));
        System.assert(itemCreateBatchRecord3.equals(itemCreateBatchRecord4));
        System.assert(itemCreateBatchRecord4.equals(itemCreateBatchRecord3));
        System.assert(itemCreateBatchRecord3.equals(itemCreateBatchRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemCreateBatchRecord itemCreateBatchRecord1 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord2 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord3 = new OASItemCreateBatchRecord();
        OASItemCreateBatchRecord itemCreateBatchRecord4 = new OASItemCreateBatchRecord();

        System.assert(itemCreateBatchRecord1.equals(itemCreateBatchRecord2));
        System.assert(itemCreateBatchRecord2.equals(itemCreateBatchRecord1));
        System.assert(itemCreateBatchRecord3.equals(itemCreateBatchRecord4));
        System.assert(itemCreateBatchRecord4.equals(itemCreateBatchRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemCreateBatchRecord itemCreateBatchRecord1 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord2 = new OASItemCreateBatchRecord();

        System.assertEquals(false, itemCreateBatchRecord1.equals('foo'));
        System.assertEquals(false, itemCreateBatchRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemCreateBatchRecord itemCreateBatchRecord1 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord2 = new OASItemCreateBatchRecord();
        OASItemCreateBatchRecord itemCreateBatchRecord3;

        System.assertEquals(false, itemCreateBatchRecord1.equals(itemCreateBatchRecord3));
        System.assertEquals(false, itemCreateBatchRecord2.equals(itemCreateBatchRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemCreateBatchRecord itemCreateBatchRecord1 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord2 = new OASItemCreateBatchRecord();

        System.assertEquals(itemCreateBatchRecord1.hashCode(), itemCreateBatchRecord1.hashCode());
        System.assertEquals(itemCreateBatchRecord2.hashCode(), itemCreateBatchRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemCreateBatchRecord itemCreateBatchRecord1 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord2 = OASItemCreateBatchRecord.getExample();
        OASItemCreateBatchRecord itemCreateBatchRecord3 = new OASItemCreateBatchRecord();
        OASItemCreateBatchRecord itemCreateBatchRecord4 = new OASItemCreateBatchRecord();

        System.assert(itemCreateBatchRecord1.equals(itemCreateBatchRecord2));
        System.assert(itemCreateBatchRecord3.equals(itemCreateBatchRecord4));
        System.assertEquals(itemCreateBatchRecord1.hashCode(), itemCreateBatchRecord2.hashCode());
        System.assertEquals(itemCreateBatchRecord3.hashCode(), itemCreateBatchRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemCreateBatchRecord itemCreateBatchRecord = new OASItemCreateBatchRecord();
        Map<String, String> x-property-mappings = itemCreateBatchRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
