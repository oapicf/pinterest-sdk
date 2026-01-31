@isTest
private class OASRecordCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRecordCounts recordCounts1 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts2 = recordCounts1;
        OASRecordCounts recordCounts3 = new OASRecordCounts();
        OASRecordCounts recordCounts4 = recordCounts3;

        System.assert(recordCounts1.equals(recordCounts2));
        System.assert(recordCounts2.equals(recordCounts1));
        System.assert(recordCounts1.equals(recordCounts1));
        System.assert(recordCounts3.equals(recordCounts4));
        System.assert(recordCounts4.equals(recordCounts3));
        System.assert(recordCounts3.equals(recordCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRecordCounts recordCounts1 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts2 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts3 = new OASRecordCounts();
        OASRecordCounts recordCounts4 = new OASRecordCounts();

        System.assert(recordCounts1.equals(recordCounts2));
        System.assert(recordCounts2.equals(recordCounts1));
        System.assert(recordCounts3.equals(recordCounts4));
        System.assert(recordCounts4.equals(recordCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRecordCounts recordCounts1 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts2 = new OASRecordCounts();

        System.assertEquals(false, recordCounts1.equals('foo'));
        System.assertEquals(false, recordCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRecordCounts recordCounts1 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts2 = new OASRecordCounts();
        OASRecordCounts recordCounts3;

        System.assertEquals(false, recordCounts1.equals(recordCounts3));
        System.assertEquals(false, recordCounts2.equals(recordCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRecordCounts recordCounts1 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts2 = new OASRecordCounts();

        System.assertEquals(recordCounts1.hashCode(), recordCounts1.hashCode());
        System.assertEquals(recordCounts2.hashCode(), recordCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRecordCounts recordCounts1 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts2 = OASRecordCounts.getExample();
        OASRecordCounts recordCounts3 = new OASRecordCounts();
        OASRecordCounts recordCounts4 = new OASRecordCounts();

        System.assert(recordCounts1.equals(recordCounts2));
        System.assert(recordCounts3.equals(recordCounts4));
        System.assertEquals(recordCounts1.hashCode(), recordCounts2.hashCode());
        System.assertEquals(recordCounts3.hashCode(), recordCounts4.hashCode());
    }
}
