@isTest
private class OASItemUpdateBatchRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord1 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord2 = itemUpdateBatchRecord1;
        OASItemUpdateBatchRecord itemUpdateBatchRecord3 = new OASItemUpdateBatchRecord();
        OASItemUpdateBatchRecord itemUpdateBatchRecord4 = itemUpdateBatchRecord3;

        System.assert(itemUpdateBatchRecord1.equals(itemUpdateBatchRecord2));
        System.assert(itemUpdateBatchRecord2.equals(itemUpdateBatchRecord1));
        System.assert(itemUpdateBatchRecord1.equals(itemUpdateBatchRecord1));
        System.assert(itemUpdateBatchRecord3.equals(itemUpdateBatchRecord4));
        System.assert(itemUpdateBatchRecord4.equals(itemUpdateBatchRecord3));
        System.assert(itemUpdateBatchRecord3.equals(itemUpdateBatchRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord1 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord2 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord3 = new OASItemUpdateBatchRecord();
        OASItemUpdateBatchRecord itemUpdateBatchRecord4 = new OASItemUpdateBatchRecord();

        System.assert(itemUpdateBatchRecord1.equals(itemUpdateBatchRecord2));
        System.assert(itemUpdateBatchRecord2.equals(itemUpdateBatchRecord1));
        System.assert(itemUpdateBatchRecord3.equals(itemUpdateBatchRecord4));
        System.assert(itemUpdateBatchRecord4.equals(itemUpdateBatchRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord1 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord2 = new OASItemUpdateBatchRecord();

        System.assertEquals(false, itemUpdateBatchRecord1.equals('foo'));
        System.assertEquals(false, itemUpdateBatchRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord1 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord2 = new OASItemUpdateBatchRecord();
        OASItemUpdateBatchRecord itemUpdateBatchRecord3;

        System.assertEquals(false, itemUpdateBatchRecord1.equals(itemUpdateBatchRecord3));
        System.assertEquals(false, itemUpdateBatchRecord2.equals(itemUpdateBatchRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord1 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord2 = new OASItemUpdateBatchRecord();

        System.assertEquals(itemUpdateBatchRecord1.hashCode(), itemUpdateBatchRecord1.hashCode());
        System.assertEquals(itemUpdateBatchRecord2.hashCode(), itemUpdateBatchRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord1 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord2 = OASItemUpdateBatchRecord.getExample();
        OASItemUpdateBatchRecord itemUpdateBatchRecord3 = new OASItemUpdateBatchRecord();
        OASItemUpdateBatchRecord itemUpdateBatchRecord4 = new OASItemUpdateBatchRecord();

        System.assert(itemUpdateBatchRecord1.equals(itemUpdateBatchRecord2));
        System.assert(itemUpdateBatchRecord3.equals(itemUpdateBatchRecord4));
        System.assertEquals(itemUpdateBatchRecord1.hashCode(), itemUpdateBatchRecord2.hashCode());
        System.assertEquals(itemUpdateBatchRecord3.hashCode(), itemUpdateBatchRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord = new OASItemUpdateBatchRecord();
        Map<String, String> x-property-mappings = itemUpdateBatchRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemUpdateBatchRecord itemUpdateBatchRecord = new OASItemUpdateBatchRecord();
        System.assertEquals(new List<OASUpdateMaskFieldType>(), itemUpdateBatchRecord.updateMask);
        System.assertEquals(null, itemUpdateBatchRecord.itemId);
        System.assertEquals(null, itemUpdateBatchRecord.attributes);
    }
}
