@isTest
private class OASItemProcessingRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemProcessingRecord itemProcessingRecord1 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord2 = itemProcessingRecord1;
        OASItemProcessingRecord itemProcessingRecord3 = new OASItemProcessingRecord();
        OASItemProcessingRecord itemProcessingRecord4 = itemProcessingRecord3;

        System.assert(itemProcessingRecord1.equals(itemProcessingRecord2));
        System.assert(itemProcessingRecord2.equals(itemProcessingRecord1));
        System.assert(itemProcessingRecord1.equals(itemProcessingRecord1));
        System.assert(itemProcessingRecord3.equals(itemProcessingRecord4));
        System.assert(itemProcessingRecord4.equals(itemProcessingRecord3));
        System.assert(itemProcessingRecord3.equals(itemProcessingRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemProcessingRecord itemProcessingRecord1 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord2 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord3 = new OASItemProcessingRecord();
        OASItemProcessingRecord itemProcessingRecord4 = new OASItemProcessingRecord();

        System.assert(itemProcessingRecord1.equals(itemProcessingRecord2));
        System.assert(itemProcessingRecord2.equals(itemProcessingRecord1));
        System.assert(itemProcessingRecord3.equals(itemProcessingRecord4));
        System.assert(itemProcessingRecord4.equals(itemProcessingRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemProcessingRecord itemProcessingRecord1 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord2 = new OASItemProcessingRecord();

        System.assertEquals(false, itemProcessingRecord1.equals('foo'));
        System.assertEquals(false, itemProcessingRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemProcessingRecord itemProcessingRecord1 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord2 = new OASItemProcessingRecord();
        OASItemProcessingRecord itemProcessingRecord3;

        System.assertEquals(false, itemProcessingRecord1.equals(itemProcessingRecord3));
        System.assertEquals(false, itemProcessingRecord2.equals(itemProcessingRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemProcessingRecord itemProcessingRecord1 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord2 = new OASItemProcessingRecord();

        System.assertEquals(itemProcessingRecord1.hashCode(), itemProcessingRecord1.hashCode());
        System.assertEquals(itemProcessingRecord2.hashCode(), itemProcessingRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemProcessingRecord itemProcessingRecord1 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord2 = OASItemProcessingRecord.getExample();
        OASItemProcessingRecord itemProcessingRecord3 = new OASItemProcessingRecord();
        OASItemProcessingRecord itemProcessingRecord4 = new OASItemProcessingRecord();

        System.assert(itemProcessingRecord1.equals(itemProcessingRecord2));
        System.assert(itemProcessingRecord3.equals(itemProcessingRecord4));
        System.assertEquals(itemProcessingRecord1.hashCode(), itemProcessingRecord2.hashCode());
        System.assertEquals(itemProcessingRecord3.hashCode(), itemProcessingRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemProcessingRecord itemProcessingRecord = new OASItemProcessingRecord();
        Map<String, String> x-property-mappings = itemProcessingRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemProcessingRecord itemProcessingRecord = new OASItemProcessingRecord();
        System.assertEquals(new List<OASItemValidationEvent>(), itemProcessingRecord.errors);
        System.assertEquals(new List<OASItemValidationEvent>(), itemProcessingRecord.warnings);
        System.assertEquals(null, itemProcessingRecord.itemId);
        System.assertEquals(null, itemProcessingRecord.status);
    }
}
