@isTest
private class OASPinsAnalyticsMetricTypesParameterTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner1 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner2 = pinsAnalyticsMetricTypesParameterInner1;
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner3 = new OASPinsAnalyticsMetricTypesParameter();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner4 = pinsAnalyticsMetricTypesParameterInner3;

        System.assert(pinsAnalyticsMetricTypesParameterInner1.equals(pinsAnalyticsMetricTypesParameterInner2));
        System.assert(pinsAnalyticsMetricTypesParameterInner2.equals(pinsAnalyticsMetricTypesParameterInner1));
        System.assert(pinsAnalyticsMetricTypesParameterInner1.equals(pinsAnalyticsMetricTypesParameterInner1));
        System.assert(pinsAnalyticsMetricTypesParameterInner3.equals(pinsAnalyticsMetricTypesParameterInner4));
        System.assert(pinsAnalyticsMetricTypesParameterInner4.equals(pinsAnalyticsMetricTypesParameterInner3));
        System.assert(pinsAnalyticsMetricTypesParameterInner3.equals(pinsAnalyticsMetricTypesParameterInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner1 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner2 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner3 = new OASPinsAnalyticsMetricTypesParameter();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner4 = new OASPinsAnalyticsMetricTypesParameter();

        System.assert(pinsAnalyticsMetricTypesParameterInner1.equals(pinsAnalyticsMetricTypesParameterInner2));
        System.assert(pinsAnalyticsMetricTypesParameterInner2.equals(pinsAnalyticsMetricTypesParameterInner1));
        System.assert(pinsAnalyticsMetricTypesParameterInner3.equals(pinsAnalyticsMetricTypesParameterInner4));
        System.assert(pinsAnalyticsMetricTypesParameterInner4.equals(pinsAnalyticsMetricTypesParameterInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner1 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner2 = new OASPinsAnalyticsMetricTypesParameter();

        System.assertEquals(false, pinsAnalyticsMetricTypesParameterInner1.equals('foo'));
        System.assertEquals(false, pinsAnalyticsMetricTypesParameterInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner1 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner2 = new OASPinsAnalyticsMetricTypesParameter();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner3;

        System.assertEquals(false, pinsAnalyticsMetricTypesParameterInner1.equals(pinsAnalyticsMetricTypesParameterInner3));
        System.assertEquals(false, pinsAnalyticsMetricTypesParameterInner2.equals(pinsAnalyticsMetricTypesParameterInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner1 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner2 = new OASPinsAnalyticsMetricTypesParameter();

        System.assertEquals(pinsAnalyticsMetricTypesParameterInner1.hashCode(), pinsAnalyticsMetricTypesParameterInner1.hashCode());
        System.assertEquals(pinsAnalyticsMetricTypesParameterInner2.hashCode(), pinsAnalyticsMetricTypesParameterInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner1 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner2 = OASPinsAnalyticsMetricTypesParameter.getExample();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner3 = new OASPinsAnalyticsMetricTypesParameter();
        OASPinsAnalyticsMetricTypesParameter pinsAnalyticsMetricTypesParameterInner4 = new OASPinsAnalyticsMetricTypesParameter();

        System.assert(pinsAnalyticsMetricTypesParameterInner1.equals(pinsAnalyticsMetricTypesParameterInner2));
        System.assert(pinsAnalyticsMetricTypesParameterInner3.equals(pinsAnalyticsMetricTypesParameterInner4));
        System.assertEquals(pinsAnalyticsMetricTypesParameterInner1.hashCode(), pinsAnalyticsMetricTypesParameterInner2.hashCode());
        System.assertEquals(pinsAnalyticsMetricTypesParameterInner3.hashCode(), pinsAnalyticsMetricTypesParameterInner4.hashCode());
    }
}
