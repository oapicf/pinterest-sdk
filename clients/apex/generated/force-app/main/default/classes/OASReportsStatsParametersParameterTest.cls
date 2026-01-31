@isTest
private class OASReportsStatsParametersParameterTest {
    @isTest
    private static void equalsSameInstance() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter1 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter2 = reportsStatsParametersParameter1;
        OASReportsStatsParametersParameter reportsStatsParametersParameter3 = new OASReportsStatsParametersParameter();
        OASReportsStatsParametersParameter reportsStatsParametersParameter4 = reportsStatsParametersParameter3;

        System.assert(reportsStatsParametersParameter1.equals(reportsStatsParametersParameter2));
        System.assert(reportsStatsParametersParameter2.equals(reportsStatsParametersParameter1));
        System.assert(reportsStatsParametersParameter1.equals(reportsStatsParametersParameter1));
        System.assert(reportsStatsParametersParameter3.equals(reportsStatsParametersParameter4));
        System.assert(reportsStatsParametersParameter4.equals(reportsStatsParametersParameter3));
        System.assert(reportsStatsParametersParameter3.equals(reportsStatsParametersParameter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter1 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter2 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter3 = new OASReportsStatsParametersParameter();
        OASReportsStatsParametersParameter reportsStatsParametersParameter4 = new OASReportsStatsParametersParameter();

        System.assert(reportsStatsParametersParameter1.equals(reportsStatsParametersParameter2));
        System.assert(reportsStatsParametersParameter2.equals(reportsStatsParametersParameter1));
        System.assert(reportsStatsParametersParameter3.equals(reportsStatsParametersParameter4));
        System.assert(reportsStatsParametersParameter4.equals(reportsStatsParametersParameter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter1 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter2 = new OASReportsStatsParametersParameter();

        System.assertEquals(false, reportsStatsParametersParameter1.equals('foo'));
        System.assertEquals(false, reportsStatsParametersParameter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter1 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter2 = new OASReportsStatsParametersParameter();
        OASReportsStatsParametersParameter reportsStatsParametersParameter3;

        System.assertEquals(false, reportsStatsParametersParameter1.equals(reportsStatsParametersParameter3));
        System.assertEquals(false, reportsStatsParametersParameter2.equals(reportsStatsParametersParameter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter1 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter2 = new OASReportsStatsParametersParameter();

        System.assertEquals(reportsStatsParametersParameter1.hashCode(), reportsStatsParametersParameter1.hashCode());
        System.assertEquals(reportsStatsParametersParameter2.hashCode(), reportsStatsParametersParameter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter1 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter2 = OASReportsStatsParametersParameter.getExample();
        OASReportsStatsParametersParameter reportsStatsParametersParameter3 = new OASReportsStatsParametersParameter();
        OASReportsStatsParametersParameter reportsStatsParametersParameter4 = new OASReportsStatsParametersParameter();

        System.assert(reportsStatsParametersParameter1.equals(reportsStatsParametersParameter2));
        System.assert(reportsStatsParametersParameter3.equals(reportsStatsParametersParameter4));
        System.assertEquals(reportsStatsParametersParameter1.hashCode(), reportsStatsParametersParameter2.hashCode());
        System.assertEquals(reportsStatsParametersParameter3.hashCode(), reportsStatsParametersParameter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASReportsStatsParametersParameter reportsStatsParametersParameter = new OASReportsStatsParametersParameter();
        Map<String, String> x-property-mappings = reportsStatsParametersParameter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
