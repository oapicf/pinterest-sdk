@isTest
private class OASTargetingTemplateAudienceSizingReTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate1 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate2 = targetingTemplateAudienceSizingReachEstimate1;
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate3 = new OASTargetingTemplateAudienceSizingRe();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate4 = targetingTemplateAudienceSizingReachEstimate3;

        System.assert(targetingTemplateAudienceSizingReachEstimate1.equals(targetingTemplateAudienceSizingReachEstimate2));
        System.assert(targetingTemplateAudienceSizingReachEstimate2.equals(targetingTemplateAudienceSizingReachEstimate1));
        System.assert(targetingTemplateAudienceSizingReachEstimate1.equals(targetingTemplateAudienceSizingReachEstimate1));
        System.assert(targetingTemplateAudienceSizingReachEstimate3.equals(targetingTemplateAudienceSizingReachEstimate4));
        System.assert(targetingTemplateAudienceSizingReachEstimate4.equals(targetingTemplateAudienceSizingReachEstimate3));
        System.assert(targetingTemplateAudienceSizingReachEstimate3.equals(targetingTemplateAudienceSizingReachEstimate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate1 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate2 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate3 = new OASTargetingTemplateAudienceSizingRe();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate4 = new OASTargetingTemplateAudienceSizingRe();

        System.assert(targetingTemplateAudienceSizingReachEstimate1.equals(targetingTemplateAudienceSizingReachEstimate2));
        System.assert(targetingTemplateAudienceSizingReachEstimate2.equals(targetingTemplateAudienceSizingReachEstimate1));
        System.assert(targetingTemplateAudienceSizingReachEstimate3.equals(targetingTemplateAudienceSizingReachEstimate4));
        System.assert(targetingTemplateAudienceSizingReachEstimate4.equals(targetingTemplateAudienceSizingReachEstimate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate1 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate2 = new OASTargetingTemplateAudienceSizingRe();

        System.assertEquals(false, targetingTemplateAudienceSizingReachEstimate1.equals('foo'));
        System.assertEquals(false, targetingTemplateAudienceSizingReachEstimate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate1 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate2 = new OASTargetingTemplateAudienceSizingRe();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate3;

        System.assertEquals(false, targetingTemplateAudienceSizingReachEstimate1.equals(targetingTemplateAudienceSizingReachEstimate3));
        System.assertEquals(false, targetingTemplateAudienceSizingReachEstimate2.equals(targetingTemplateAudienceSizingReachEstimate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate1 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate2 = new OASTargetingTemplateAudienceSizingRe();

        System.assertEquals(targetingTemplateAudienceSizingReachEstimate1.hashCode(), targetingTemplateAudienceSizingReachEstimate1.hashCode());
        System.assertEquals(targetingTemplateAudienceSizingReachEstimate2.hashCode(), targetingTemplateAudienceSizingReachEstimate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate1 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate2 = OASTargetingTemplateAudienceSizingRe.getExample();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate3 = new OASTargetingTemplateAudienceSizingRe();
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate4 = new OASTargetingTemplateAudienceSizingRe();

        System.assert(targetingTemplateAudienceSizingReachEstimate1.equals(targetingTemplateAudienceSizingReachEstimate2));
        System.assert(targetingTemplateAudienceSizingReachEstimate3.equals(targetingTemplateAudienceSizingReachEstimate4));
        System.assertEquals(targetingTemplateAudienceSizingReachEstimate1.hashCode(), targetingTemplateAudienceSizingReachEstimate2.hashCode());
        System.assertEquals(targetingTemplateAudienceSizingReachEstimate3.hashCode(), targetingTemplateAudienceSizingReachEstimate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateAudienceSizingRe targetingTemplateAudienceSizingReachEstimate = new OASTargetingTemplateAudienceSizingRe();
        Map<String, String> x-property-mappings = targetingTemplateAudienceSizingReachEstimate.getx-property-mappings();
        System.assertEquals('lowerBound', x-property-mappings.get('lower_bound'));
        System.assertEquals('upperBound', x-property-mappings.get('upper_bound'));
    }
}
