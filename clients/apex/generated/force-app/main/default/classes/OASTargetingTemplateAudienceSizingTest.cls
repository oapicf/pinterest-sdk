@isTest
private class OASTargetingTemplateAudienceSizingTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing1 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing2 = targetingTemplateAudienceSizing1;
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing3 = new OASTargetingTemplateAudienceSizing();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing4 = targetingTemplateAudienceSizing3;

        System.assert(targetingTemplateAudienceSizing1.equals(targetingTemplateAudienceSizing2));
        System.assert(targetingTemplateAudienceSizing2.equals(targetingTemplateAudienceSizing1));
        System.assert(targetingTemplateAudienceSizing1.equals(targetingTemplateAudienceSizing1));
        System.assert(targetingTemplateAudienceSizing3.equals(targetingTemplateAudienceSizing4));
        System.assert(targetingTemplateAudienceSizing4.equals(targetingTemplateAudienceSizing3));
        System.assert(targetingTemplateAudienceSizing3.equals(targetingTemplateAudienceSizing3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing1 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing2 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing3 = new OASTargetingTemplateAudienceSizing();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing4 = new OASTargetingTemplateAudienceSizing();

        System.assert(targetingTemplateAudienceSizing1.equals(targetingTemplateAudienceSizing2));
        System.assert(targetingTemplateAudienceSizing2.equals(targetingTemplateAudienceSizing1));
        System.assert(targetingTemplateAudienceSizing3.equals(targetingTemplateAudienceSizing4));
        System.assert(targetingTemplateAudienceSizing4.equals(targetingTemplateAudienceSizing3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing1 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing2 = new OASTargetingTemplateAudienceSizing();

        System.assertEquals(false, targetingTemplateAudienceSizing1.equals('foo'));
        System.assertEquals(false, targetingTemplateAudienceSizing2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing1 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing2 = new OASTargetingTemplateAudienceSizing();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing3;

        System.assertEquals(false, targetingTemplateAudienceSizing1.equals(targetingTemplateAudienceSizing3));
        System.assertEquals(false, targetingTemplateAudienceSizing2.equals(targetingTemplateAudienceSizing3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing1 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing2 = new OASTargetingTemplateAudienceSizing();

        System.assertEquals(targetingTemplateAudienceSizing1.hashCode(), targetingTemplateAudienceSizing1.hashCode());
        System.assertEquals(targetingTemplateAudienceSizing2.hashCode(), targetingTemplateAudienceSizing2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing1 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing2 = OASTargetingTemplateAudienceSizing.getExample();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing3 = new OASTargetingTemplateAudienceSizing();
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing4 = new OASTargetingTemplateAudienceSizing();

        System.assert(targetingTemplateAudienceSizing1.equals(targetingTemplateAudienceSizing2));
        System.assert(targetingTemplateAudienceSizing3.equals(targetingTemplateAudienceSizing4));
        System.assertEquals(targetingTemplateAudienceSizing1.hashCode(), targetingTemplateAudienceSizing2.hashCode());
        System.assertEquals(targetingTemplateAudienceSizing3.hashCode(), targetingTemplateAudienceSizing4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateAudienceSizing targetingTemplateAudienceSizing = new OASTargetingTemplateAudienceSizing();
        Map<String, String> x-property-mappings = targetingTemplateAudienceSizing.getx-property-mappings();
        System.assertEquals('reachEstimate', x-property-mappings.get('reach_estimate'));
    }
}
