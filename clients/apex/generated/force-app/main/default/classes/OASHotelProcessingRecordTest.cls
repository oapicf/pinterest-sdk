@isTest
private class OASHotelProcessingRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASHotelProcessingRecord hotelProcessingRecord1 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord2 = hotelProcessingRecord1;
        OASHotelProcessingRecord hotelProcessingRecord3 = new OASHotelProcessingRecord();
        OASHotelProcessingRecord hotelProcessingRecord4 = hotelProcessingRecord3;

        System.assert(hotelProcessingRecord1.equals(hotelProcessingRecord2));
        System.assert(hotelProcessingRecord2.equals(hotelProcessingRecord1));
        System.assert(hotelProcessingRecord1.equals(hotelProcessingRecord1));
        System.assert(hotelProcessingRecord3.equals(hotelProcessingRecord4));
        System.assert(hotelProcessingRecord4.equals(hotelProcessingRecord3));
        System.assert(hotelProcessingRecord3.equals(hotelProcessingRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHotelProcessingRecord hotelProcessingRecord1 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord2 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord3 = new OASHotelProcessingRecord();
        OASHotelProcessingRecord hotelProcessingRecord4 = new OASHotelProcessingRecord();

        System.assert(hotelProcessingRecord1.equals(hotelProcessingRecord2));
        System.assert(hotelProcessingRecord2.equals(hotelProcessingRecord1));
        System.assert(hotelProcessingRecord3.equals(hotelProcessingRecord4));
        System.assert(hotelProcessingRecord4.equals(hotelProcessingRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHotelProcessingRecord hotelProcessingRecord1 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord2 = new OASHotelProcessingRecord();

        System.assertEquals(false, hotelProcessingRecord1.equals('foo'));
        System.assertEquals(false, hotelProcessingRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHotelProcessingRecord hotelProcessingRecord1 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord2 = new OASHotelProcessingRecord();
        OASHotelProcessingRecord hotelProcessingRecord3;

        System.assertEquals(false, hotelProcessingRecord1.equals(hotelProcessingRecord3));
        System.assertEquals(false, hotelProcessingRecord2.equals(hotelProcessingRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHotelProcessingRecord hotelProcessingRecord1 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord2 = new OASHotelProcessingRecord();

        System.assertEquals(hotelProcessingRecord1.hashCode(), hotelProcessingRecord1.hashCode());
        System.assertEquals(hotelProcessingRecord2.hashCode(), hotelProcessingRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHotelProcessingRecord hotelProcessingRecord1 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord2 = OASHotelProcessingRecord.getExample();
        OASHotelProcessingRecord hotelProcessingRecord3 = new OASHotelProcessingRecord();
        OASHotelProcessingRecord hotelProcessingRecord4 = new OASHotelProcessingRecord();

        System.assert(hotelProcessingRecord1.equals(hotelProcessingRecord2));
        System.assert(hotelProcessingRecord3.equals(hotelProcessingRecord4));
        System.assertEquals(hotelProcessingRecord1.hashCode(), hotelProcessingRecord2.hashCode());
        System.assertEquals(hotelProcessingRecord3.hashCode(), hotelProcessingRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASHotelProcessingRecord hotelProcessingRecord = new OASHotelProcessingRecord();
        Map<String, String> x-property-mappings = hotelProcessingRecord.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASHotelProcessingRecord hotelProcessingRecord = new OASHotelProcessingRecord();
        System.assertEquals(new List<OASItemValidationEvent>(), hotelProcessingRecord.errors);
        System.assertEquals(new List<OASItemValidationEvent>(), hotelProcessingRecord.warnings);
        System.assertEquals(null, hotelProcessingRecord.hotelId);
        System.assertEquals(null, hotelProcessingRecord.status);
    }
}
