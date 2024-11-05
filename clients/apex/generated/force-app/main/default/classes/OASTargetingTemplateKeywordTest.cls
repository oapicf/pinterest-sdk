@isTest
private class OASTargetingTemplateKeywordTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateKeyword targetingTemplateKeyword1 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword2 = targetingTemplateKeyword1;
        OASTargetingTemplateKeyword targetingTemplateKeyword3 = new OASTargetingTemplateKeyword();
        OASTargetingTemplateKeyword targetingTemplateKeyword4 = targetingTemplateKeyword3;

        System.assert(targetingTemplateKeyword1.equals(targetingTemplateKeyword2));
        System.assert(targetingTemplateKeyword2.equals(targetingTemplateKeyword1));
        System.assert(targetingTemplateKeyword1.equals(targetingTemplateKeyword1));
        System.assert(targetingTemplateKeyword3.equals(targetingTemplateKeyword4));
        System.assert(targetingTemplateKeyword4.equals(targetingTemplateKeyword3));
        System.assert(targetingTemplateKeyword3.equals(targetingTemplateKeyword3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateKeyword targetingTemplateKeyword1 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword2 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword3 = new OASTargetingTemplateKeyword();
        OASTargetingTemplateKeyword targetingTemplateKeyword4 = new OASTargetingTemplateKeyword();

        System.assert(targetingTemplateKeyword1.equals(targetingTemplateKeyword2));
        System.assert(targetingTemplateKeyword2.equals(targetingTemplateKeyword1));
        System.assert(targetingTemplateKeyword3.equals(targetingTemplateKeyword4));
        System.assert(targetingTemplateKeyword4.equals(targetingTemplateKeyword3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateKeyword targetingTemplateKeyword1 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword2 = new OASTargetingTemplateKeyword();

        System.assertEquals(false, targetingTemplateKeyword1.equals('foo'));
        System.assertEquals(false, targetingTemplateKeyword2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateKeyword targetingTemplateKeyword1 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword2 = new OASTargetingTemplateKeyword();
        OASTargetingTemplateKeyword targetingTemplateKeyword3;

        System.assertEquals(false, targetingTemplateKeyword1.equals(targetingTemplateKeyword3));
        System.assertEquals(false, targetingTemplateKeyword2.equals(targetingTemplateKeyword3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateKeyword targetingTemplateKeyword1 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword2 = new OASTargetingTemplateKeyword();

        System.assertEquals(targetingTemplateKeyword1.hashCode(), targetingTemplateKeyword1.hashCode());
        System.assertEquals(targetingTemplateKeyword2.hashCode(), targetingTemplateKeyword2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateKeyword targetingTemplateKeyword1 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword2 = OASTargetingTemplateKeyword.getExample();
        OASTargetingTemplateKeyword targetingTemplateKeyword3 = new OASTargetingTemplateKeyword();
        OASTargetingTemplateKeyword targetingTemplateKeyword4 = new OASTargetingTemplateKeyword();

        System.assert(targetingTemplateKeyword1.equals(targetingTemplateKeyword2));
        System.assert(targetingTemplateKeyword3.equals(targetingTemplateKeyword4));
        System.assertEquals(targetingTemplateKeyword1.hashCode(), targetingTemplateKeyword2.hashCode());
        System.assertEquals(targetingTemplateKeyword3.hashCode(), targetingTemplateKeyword4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateKeyword targetingTemplateKeyword = new OASTargetingTemplateKeyword();
        Map<String, String> x-property-mappings = targetingTemplateKeyword.getx-property-mappings();
        System.assertEquals('matchType', x-property-mappings.get('match_type'));
    }
}
