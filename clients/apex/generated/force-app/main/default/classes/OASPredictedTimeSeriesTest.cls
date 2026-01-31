@isTest
private class OASPredictedTimeSeriesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPredictedTimeSeries predictedTimeSeries1 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries2 = predictedTimeSeries1;
        OASPredictedTimeSeries predictedTimeSeries3 = new OASPredictedTimeSeries();
        OASPredictedTimeSeries predictedTimeSeries4 = predictedTimeSeries3;

        System.assert(predictedTimeSeries1.equals(predictedTimeSeries2));
        System.assert(predictedTimeSeries2.equals(predictedTimeSeries1));
        System.assert(predictedTimeSeries1.equals(predictedTimeSeries1));
        System.assert(predictedTimeSeries3.equals(predictedTimeSeries4));
        System.assert(predictedTimeSeries4.equals(predictedTimeSeries3));
        System.assert(predictedTimeSeries3.equals(predictedTimeSeries3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPredictedTimeSeries predictedTimeSeries1 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries2 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries3 = new OASPredictedTimeSeries();
        OASPredictedTimeSeries predictedTimeSeries4 = new OASPredictedTimeSeries();

        System.assert(predictedTimeSeries1.equals(predictedTimeSeries2));
        System.assert(predictedTimeSeries2.equals(predictedTimeSeries1));
        System.assert(predictedTimeSeries3.equals(predictedTimeSeries4));
        System.assert(predictedTimeSeries4.equals(predictedTimeSeries3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPredictedTimeSeries predictedTimeSeries1 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries2 = new OASPredictedTimeSeries();

        System.assertEquals(false, predictedTimeSeries1.equals('foo'));
        System.assertEquals(false, predictedTimeSeries2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPredictedTimeSeries predictedTimeSeries1 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries2 = new OASPredictedTimeSeries();
        OASPredictedTimeSeries predictedTimeSeries3;

        System.assertEquals(false, predictedTimeSeries1.equals(predictedTimeSeries3));
        System.assertEquals(false, predictedTimeSeries2.equals(predictedTimeSeries3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPredictedTimeSeries predictedTimeSeries1 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries2 = new OASPredictedTimeSeries();

        System.assertEquals(predictedTimeSeries1.hashCode(), predictedTimeSeries1.hashCode());
        System.assertEquals(predictedTimeSeries2.hashCode(), predictedTimeSeries2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPredictedTimeSeries predictedTimeSeries1 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries2 = OASPredictedTimeSeries.getExample();
        OASPredictedTimeSeries predictedTimeSeries3 = new OASPredictedTimeSeries();
        OASPredictedTimeSeries predictedTimeSeries4 = new OASPredictedTimeSeries();

        System.assert(predictedTimeSeries1.equals(predictedTimeSeries2));
        System.assert(predictedTimeSeries3.equals(predictedTimeSeries4));
        System.assertEquals(predictedTimeSeries1.hashCode(), predictedTimeSeries2.hashCode());
        System.assertEquals(predictedTimeSeries3.hashCode(), predictedTimeSeries4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPredictedTimeSeries predictedTimeSeries = new OASPredictedTimeSeries();
        Map<String, String> x-property-mappings = predictedTimeSeries.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
