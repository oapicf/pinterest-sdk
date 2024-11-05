@isTest
private class OASCreativeAssetsProcessingRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord1 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord2 = creativeAssetsProcessingRecord1;
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord3 = new OASCreativeAssetsProcessingRecord();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord4 = creativeAssetsProcessingRecord3;

        System.assert(creativeAssetsProcessingRecord1.equals(creativeAssetsProcessingRecord2));
        System.assert(creativeAssetsProcessingRecord2.equals(creativeAssetsProcessingRecord1));
        System.assert(creativeAssetsProcessingRecord1.equals(creativeAssetsProcessingRecord1));
        System.assert(creativeAssetsProcessingRecord3.equals(creativeAssetsProcessingRecord4));
        System.assert(creativeAssetsProcessingRecord4.equals(creativeAssetsProcessingRecord3));
        System.assert(creativeAssetsProcessingRecord3.equals(creativeAssetsProcessingRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord1 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord2 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord3 = new OASCreativeAssetsProcessingRecord();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord4 = new OASCreativeAssetsProcessingRecord();

        System.assert(creativeAssetsProcessingRecord1.equals(creativeAssetsProcessingRecord2));
        System.assert(creativeAssetsProcessingRecord2.equals(creativeAssetsProcessingRecord1));
        System.assert(creativeAssetsProcessingRecord3.equals(creativeAssetsProcessingRecord4));
        System.assert(creativeAssetsProcessingRecord4.equals(creativeAssetsProcessingRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord1 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord2 = new OASCreativeAssetsProcessingRecord();

        System.assertEquals(false, creativeAssetsProcessingRecord1.equals('foo'));
        System.assertEquals(false, creativeAssetsProcessingRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord1 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord2 = new OASCreativeAssetsProcessingRecord();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord3;

        System.assertEquals(false, creativeAssetsProcessingRecord1.equals(creativeAssetsProcessingRecord3));
        System.assertEquals(false, creativeAssetsProcessingRecord2.equals(creativeAssetsProcessingRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord1 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord2 = new OASCreativeAssetsProcessingRecord();

        System.assertEquals(creativeAssetsProcessingRecord1.hashCode(), creativeAssetsProcessingRecord1.hashCode());
        System.assertEquals(creativeAssetsProcessingRecord2.hashCode(), creativeAssetsProcessingRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord1 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord2 = OASCreativeAssetsProcessingRecord.getExample();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord3 = new OASCreativeAssetsProcessingRecord();
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord4 = new OASCreativeAssetsProcessingRecord();

        System.assert(creativeAssetsProcessingRecord1.equals(creativeAssetsProcessingRecord2));
        System.assert(creativeAssetsProcessingRecord3.equals(creativeAssetsProcessingRecord4));
        System.assertEquals(creativeAssetsProcessingRecord1.hashCode(), creativeAssetsProcessingRecord2.hashCode());
        System.assertEquals(creativeAssetsProcessingRecord3.hashCode(), creativeAssetsProcessingRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord = new OASCreativeAssetsProcessingRecord();
        Map<String, String> x-property-mappings = creativeAssetsProcessingRecord.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord = new OASCreativeAssetsProcessingRecord();
        System.assertEquals(new List<OASItemValidationEvent>(), creativeAssetsProcessingRecord.errors);
        System.assertEquals(new List<OASItemValidationEvent>(), creativeAssetsProcessingRecord.warnings);
        System.assertEquals(null, creativeAssetsProcessingRecord.creativeAssetsId);
        System.assertEquals(null, creativeAssetsProcessingRecord.status);
    }
}
