@isTest
private class OASEventQualityScoreTest {
    @isTest
    private static void equalsSameInstance() {
        OASEventQualityScore eventQualityScore1 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore2 = eventQualityScore1;
        OASEventQualityScore eventQualityScore3 = new OASEventQualityScore();
        OASEventQualityScore eventQualityScore4 = eventQualityScore3;

        System.assert(eventQualityScore1.equals(eventQualityScore2));
        System.assert(eventQualityScore2.equals(eventQualityScore1));
        System.assert(eventQualityScore1.equals(eventQualityScore1));
        System.assert(eventQualityScore3.equals(eventQualityScore4));
        System.assert(eventQualityScore4.equals(eventQualityScore3));
        System.assert(eventQualityScore3.equals(eventQualityScore3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEventQualityScore eventQualityScore1 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore2 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore3 = new OASEventQualityScore();
        OASEventQualityScore eventQualityScore4 = new OASEventQualityScore();

        System.assert(eventQualityScore1.equals(eventQualityScore2));
        System.assert(eventQualityScore2.equals(eventQualityScore1));
        System.assert(eventQualityScore3.equals(eventQualityScore4));
        System.assert(eventQualityScore4.equals(eventQualityScore3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEventQualityScore eventQualityScore1 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore2 = new OASEventQualityScore();

        System.assertEquals(false, eventQualityScore1.equals('foo'));
        System.assertEquals(false, eventQualityScore2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEventQualityScore eventQualityScore1 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore2 = new OASEventQualityScore();
        OASEventQualityScore eventQualityScore3;

        System.assertEquals(false, eventQualityScore1.equals(eventQualityScore3));
        System.assertEquals(false, eventQualityScore2.equals(eventQualityScore3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEventQualityScore eventQualityScore1 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore2 = new OASEventQualityScore();

        System.assertEquals(eventQualityScore1.hashCode(), eventQualityScore1.hashCode());
        System.assertEquals(eventQualityScore2.hashCode(), eventQualityScore2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEventQualityScore eventQualityScore1 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore2 = OASEventQualityScore.getExample();
        OASEventQualityScore eventQualityScore3 = new OASEventQualityScore();
        OASEventQualityScore eventQualityScore4 = new OASEventQualityScore();

        System.assert(eventQualityScore1.equals(eventQualityScore2));
        System.assert(eventQualityScore3.equals(eventQualityScore4));
        System.assertEquals(eventQualityScore1.hashCode(), eventQualityScore2.hashCode());
        System.assertEquals(eventQualityScore3.hashCode(), eventQualityScore4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEventQualityScore eventQualityScore = new OASEventQualityScore();
        Map<String, String> x-property-mappings = eventQualityScore.getx-property-mappings();
        System.assertEquals('ingestionSource', x-property-mappings.get('ingestion_source'));
        System.assertEquals('lookbackPeriod', x-property-mappings.get('lookback_period'));
        System.assertEquals('overallStatus', x-property-mappings.get('overall_status'));
        System.assertEquals('qualityComponents', x-property-mappings.get('quality_components'));
        System.assertEquals('sourcePlatform', x-property-mappings.get('source_platform'));
    }
}
