@isTest
private class OASQualityComponentDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityComponentDetails qualityComponentDetails1 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails2 = qualityComponentDetails1;
        OASQualityComponentDetails qualityComponentDetails3 = new OASQualityComponentDetails();
        OASQualityComponentDetails qualityComponentDetails4 = qualityComponentDetails3;

        System.assert(qualityComponentDetails1.equals(qualityComponentDetails2));
        System.assert(qualityComponentDetails2.equals(qualityComponentDetails1));
        System.assert(qualityComponentDetails1.equals(qualityComponentDetails1));
        System.assert(qualityComponentDetails3.equals(qualityComponentDetails4));
        System.assert(qualityComponentDetails4.equals(qualityComponentDetails3));
        System.assert(qualityComponentDetails3.equals(qualityComponentDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityComponentDetails qualityComponentDetails1 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails2 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails3 = new OASQualityComponentDetails();
        OASQualityComponentDetails qualityComponentDetails4 = new OASQualityComponentDetails();

        System.assert(qualityComponentDetails1.equals(qualityComponentDetails2));
        System.assert(qualityComponentDetails2.equals(qualityComponentDetails1));
        System.assert(qualityComponentDetails3.equals(qualityComponentDetails4));
        System.assert(qualityComponentDetails4.equals(qualityComponentDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityComponentDetails qualityComponentDetails1 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails2 = new OASQualityComponentDetails();

        System.assertEquals(false, qualityComponentDetails1.equals('foo'));
        System.assertEquals(false, qualityComponentDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityComponentDetails qualityComponentDetails1 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails2 = new OASQualityComponentDetails();
        OASQualityComponentDetails qualityComponentDetails3;

        System.assertEquals(false, qualityComponentDetails1.equals(qualityComponentDetails3));
        System.assertEquals(false, qualityComponentDetails2.equals(qualityComponentDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityComponentDetails qualityComponentDetails1 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails2 = new OASQualityComponentDetails();

        System.assertEquals(qualityComponentDetails1.hashCode(), qualityComponentDetails1.hashCode());
        System.assertEquals(qualityComponentDetails2.hashCode(), qualityComponentDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityComponentDetails qualityComponentDetails1 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails2 = OASQualityComponentDetails.getExample();
        OASQualityComponentDetails qualityComponentDetails3 = new OASQualityComponentDetails();
        OASQualityComponentDetails qualityComponentDetails4 = new OASQualityComponentDetails();

        System.assert(qualityComponentDetails1.equals(qualityComponentDetails2));
        System.assert(qualityComponentDetails3.equals(qualityComponentDetails4));
        System.assertEquals(qualityComponentDetails1.hashCode(), qualityComponentDetails2.hashCode());
        System.assertEquals(qualityComponentDetails3.hashCode(), qualityComponentDetails4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQualityComponentDetails qualityComponentDetails = new OASQualityComponentDetails();
        System.assertEquals(new List<OASQualityComponentIssue>(), qualityComponentDetails.issues);
        System.assertEquals(null, qualityComponentDetails.coverage);
        System.assertEquals(null, qualityComponentDetails.overlap);
    }
}
