@isTest
private class OASItemDeleteDiscontinuedBatchRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord1 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord2 = itemDeleteDiscontinuedBatchRecord1;
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord3 = new OASItemDeleteDiscontinuedBatchRecord();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord4 = itemDeleteDiscontinuedBatchRecord3;

        System.assert(itemDeleteDiscontinuedBatchRecord1.equals(itemDeleteDiscontinuedBatchRecord2));
        System.assert(itemDeleteDiscontinuedBatchRecord2.equals(itemDeleteDiscontinuedBatchRecord1));
        System.assert(itemDeleteDiscontinuedBatchRecord1.equals(itemDeleteDiscontinuedBatchRecord1));
        System.assert(itemDeleteDiscontinuedBatchRecord3.equals(itemDeleteDiscontinuedBatchRecord4));
        System.assert(itemDeleteDiscontinuedBatchRecord4.equals(itemDeleteDiscontinuedBatchRecord3));
        System.assert(itemDeleteDiscontinuedBatchRecord3.equals(itemDeleteDiscontinuedBatchRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord1 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord2 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord3 = new OASItemDeleteDiscontinuedBatchRecord();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord4 = new OASItemDeleteDiscontinuedBatchRecord();

        System.assert(itemDeleteDiscontinuedBatchRecord1.equals(itemDeleteDiscontinuedBatchRecord2));
        System.assert(itemDeleteDiscontinuedBatchRecord2.equals(itemDeleteDiscontinuedBatchRecord1));
        System.assert(itemDeleteDiscontinuedBatchRecord3.equals(itemDeleteDiscontinuedBatchRecord4));
        System.assert(itemDeleteDiscontinuedBatchRecord4.equals(itemDeleteDiscontinuedBatchRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord1 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord2 = new OASItemDeleteDiscontinuedBatchRecord();

        System.assertEquals(false, itemDeleteDiscontinuedBatchRecord1.equals('foo'));
        System.assertEquals(false, itemDeleteDiscontinuedBatchRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord1 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord2 = new OASItemDeleteDiscontinuedBatchRecord();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord3;

        System.assertEquals(false, itemDeleteDiscontinuedBatchRecord1.equals(itemDeleteDiscontinuedBatchRecord3));
        System.assertEquals(false, itemDeleteDiscontinuedBatchRecord2.equals(itemDeleteDiscontinuedBatchRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord1 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord2 = new OASItemDeleteDiscontinuedBatchRecord();

        System.assertEquals(itemDeleteDiscontinuedBatchRecord1.hashCode(), itemDeleteDiscontinuedBatchRecord1.hashCode());
        System.assertEquals(itemDeleteDiscontinuedBatchRecord2.hashCode(), itemDeleteDiscontinuedBatchRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord1 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord2 = OASItemDeleteDiscontinuedBatchRecord.getExample();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord3 = new OASItemDeleteDiscontinuedBatchRecord();
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord4 = new OASItemDeleteDiscontinuedBatchRecord();

        System.assert(itemDeleteDiscontinuedBatchRecord1.equals(itemDeleteDiscontinuedBatchRecord2));
        System.assert(itemDeleteDiscontinuedBatchRecord3.equals(itemDeleteDiscontinuedBatchRecord4));
        System.assertEquals(itemDeleteDiscontinuedBatchRecord1.hashCode(), itemDeleteDiscontinuedBatchRecord2.hashCode());
        System.assertEquals(itemDeleteDiscontinuedBatchRecord3.hashCode(), itemDeleteDiscontinuedBatchRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemDeleteDiscontinuedBatchRecord itemDeleteDiscontinuedBatchRecord = new OASItemDeleteDiscontinuedBatchRecord();
        Map<String, String> x-property-mappings = itemDeleteDiscontinuedBatchRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
