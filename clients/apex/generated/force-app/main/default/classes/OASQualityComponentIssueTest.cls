@isTest
private class OASQualityComponentIssueTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityComponentIssue qualityComponentIssue1 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue2 = qualityComponentIssue1;
        OASQualityComponentIssue qualityComponentIssue3 = new OASQualityComponentIssue();
        OASQualityComponentIssue qualityComponentIssue4 = qualityComponentIssue3;

        System.assert(qualityComponentIssue1.equals(qualityComponentIssue2));
        System.assert(qualityComponentIssue2.equals(qualityComponentIssue1));
        System.assert(qualityComponentIssue1.equals(qualityComponentIssue1));
        System.assert(qualityComponentIssue3.equals(qualityComponentIssue4));
        System.assert(qualityComponentIssue4.equals(qualityComponentIssue3));
        System.assert(qualityComponentIssue3.equals(qualityComponentIssue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityComponentIssue qualityComponentIssue1 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue2 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue3 = new OASQualityComponentIssue();
        OASQualityComponentIssue qualityComponentIssue4 = new OASQualityComponentIssue();

        System.assert(qualityComponentIssue1.equals(qualityComponentIssue2));
        System.assert(qualityComponentIssue2.equals(qualityComponentIssue1));
        System.assert(qualityComponentIssue3.equals(qualityComponentIssue4));
        System.assert(qualityComponentIssue4.equals(qualityComponentIssue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityComponentIssue qualityComponentIssue1 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue2 = new OASQualityComponentIssue();

        System.assertEquals(false, qualityComponentIssue1.equals('foo'));
        System.assertEquals(false, qualityComponentIssue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityComponentIssue qualityComponentIssue1 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue2 = new OASQualityComponentIssue();
        OASQualityComponentIssue qualityComponentIssue3;

        System.assertEquals(false, qualityComponentIssue1.equals(qualityComponentIssue3));
        System.assertEquals(false, qualityComponentIssue2.equals(qualityComponentIssue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityComponentIssue qualityComponentIssue1 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue2 = new OASQualityComponentIssue();

        System.assertEquals(qualityComponentIssue1.hashCode(), qualityComponentIssue1.hashCode());
        System.assertEquals(qualityComponentIssue2.hashCode(), qualityComponentIssue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityComponentIssue qualityComponentIssue1 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue2 = OASQualityComponentIssue.getExample();
        OASQualityComponentIssue qualityComponentIssue3 = new OASQualityComponentIssue();
        OASQualityComponentIssue qualityComponentIssue4 = new OASQualityComponentIssue();

        System.assert(qualityComponentIssue1.equals(qualityComponentIssue2));
        System.assert(qualityComponentIssue3.equals(qualityComponentIssue4));
        System.assertEquals(qualityComponentIssue1.hashCode(), qualityComponentIssue2.hashCode());
        System.assertEquals(qualityComponentIssue3.hashCode(), qualityComponentIssue4.hashCode());
    }
}
