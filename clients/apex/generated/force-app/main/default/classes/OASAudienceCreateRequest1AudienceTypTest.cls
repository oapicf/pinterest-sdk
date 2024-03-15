@isTest
private class OASAudienceCreateRequest1AudienceTypTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType1 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType2 = audienceCreateRequest1AudienceType1;
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType3 = new OASAudienceCreateRequest1AudienceTyp();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType4 = audienceCreateRequest1AudienceType3;

        System.assert(audienceCreateRequest1AudienceType1.equals(audienceCreateRequest1AudienceType2));
        System.assert(audienceCreateRequest1AudienceType2.equals(audienceCreateRequest1AudienceType1));
        System.assert(audienceCreateRequest1AudienceType1.equals(audienceCreateRequest1AudienceType1));
        System.assert(audienceCreateRequest1AudienceType3.equals(audienceCreateRequest1AudienceType4));
        System.assert(audienceCreateRequest1AudienceType4.equals(audienceCreateRequest1AudienceType3));
        System.assert(audienceCreateRequest1AudienceType3.equals(audienceCreateRequest1AudienceType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType1 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType2 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType3 = new OASAudienceCreateRequest1AudienceTyp();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType4 = new OASAudienceCreateRequest1AudienceTyp();

        System.assert(audienceCreateRequest1AudienceType1.equals(audienceCreateRequest1AudienceType2));
        System.assert(audienceCreateRequest1AudienceType2.equals(audienceCreateRequest1AudienceType1));
        System.assert(audienceCreateRequest1AudienceType3.equals(audienceCreateRequest1AudienceType4));
        System.assert(audienceCreateRequest1AudienceType4.equals(audienceCreateRequest1AudienceType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType1 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType2 = new OASAudienceCreateRequest1AudienceTyp();

        System.assertEquals(false, audienceCreateRequest1AudienceType1.equals('foo'));
        System.assertEquals(false, audienceCreateRequest1AudienceType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType1 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType2 = new OASAudienceCreateRequest1AudienceTyp();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType3;

        System.assertEquals(false, audienceCreateRequest1AudienceType1.equals(audienceCreateRequest1AudienceType3));
        System.assertEquals(false, audienceCreateRequest1AudienceType2.equals(audienceCreateRequest1AudienceType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType1 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType2 = new OASAudienceCreateRequest1AudienceTyp();

        System.assertEquals(audienceCreateRequest1AudienceType1.hashCode(), audienceCreateRequest1AudienceType1.hashCode());
        System.assertEquals(audienceCreateRequest1AudienceType2.hashCode(), audienceCreateRequest1AudienceType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType1 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType2 = OASAudienceCreateRequest1AudienceTyp.getExample();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType3 = new OASAudienceCreateRequest1AudienceTyp();
        OASAudienceCreateRequest1AudienceTyp audienceCreateRequest1AudienceType4 = new OASAudienceCreateRequest1AudienceTyp();

        System.assert(audienceCreateRequest1AudienceType1.equals(audienceCreateRequest1AudienceType2));
        System.assert(audienceCreateRequest1AudienceType3.equals(audienceCreateRequest1AudienceType4));
        System.assertEquals(audienceCreateRequest1AudienceType1.hashCode(), audienceCreateRequest1AudienceType2.hashCode());
        System.assertEquals(audienceCreateRequest1AudienceType3.hashCode(), audienceCreateRequest1AudienceType4.hashCode());
    }
}
