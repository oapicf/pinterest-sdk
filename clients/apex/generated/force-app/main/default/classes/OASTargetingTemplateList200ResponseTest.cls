@isTest
private class OASTargetingTemplateList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateList200Response targetingTemplateList200Response1 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response2 = targetingTemplateList200Response1;
        OASTargetingTemplateList200Response targetingTemplateList200Response3 = new OASTargetingTemplateList200Response();
        OASTargetingTemplateList200Response targetingTemplateList200Response4 = targetingTemplateList200Response3;

        System.assert(targetingTemplateList200Response1.equals(targetingTemplateList200Response2));
        System.assert(targetingTemplateList200Response2.equals(targetingTemplateList200Response1));
        System.assert(targetingTemplateList200Response1.equals(targetingTemplateList200Response1));
        System.assert(targetingTemplateList200Response3.equals(targetingTemplateList200Response4));
        System.assert(targetingTemplateList200Response4.equals(targetingTemplateList200Response3));
        System.assert(targetingTemplateList200Response3.equals(targetingTemplateList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateList200Response targetingTemplateList200Response1 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response2 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response3 = new OASTargetingTemplateList200Response();
        OASTargetingTemplateList200Response targetingTemplateList200Response4 = new OASTargetingTemplateList200Response();

        System.assert(targetingTemplateList200Response1.equals(targetingTemplateList200Response2));
        System.assert(targetingTemplateList200Response2.equals(targetingTemplateList200Response1));
        System.assert(targetingTemplateList200Response3.equals(targetingTemplateList200Response4));
        System.assert(targetingTemplateList200Response4.equals(targetingTemplateList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateList200Response targetingTemplateList200Response1 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response2 = new OASTargetingTemplateList200Response();

        System.assertEquals(false, targetingTemplateList200Response1.equals('foo'));
        System.assertEquals(false, targetingTemplateList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateList200Response targetingTemplateList200Response1 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response2 = new OASTargetingTemplateList200Response();
        OASTargetingTemplateList200Response targetingTemplateList200Response3;

        System.assertEquals(false, targetingTemplateList200Response1.equals(targetingTemplateList200Response3));
        System.assertEquals(false, targetingTemplateList200Response2.equals(targetingTemplateList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateList200Response targetingTemplateList200Response1 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response2 = new OASTargetingTemplateList200Response();

        System.assertEquals(targetingTemplateList200Response1.hashCode(), targetingTemplateList200Response1.hashCode());
        System.assertEquals(targetingTemplateList200Response2.hashCode(), targetingTemplateList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateList200Response targetingTemplateList200Response1 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response2 = OASTargetingTemplateList200Response.getExample();
        OASTargetingTemplateList200Response targetingTemplateList200Response3 = new OASTargetingTemplateList200Response();
        OASTargetingTemplateList200Response targetingTemplateList200Response4 = new OASTargetingTemplateList200Response();

        System.assert(targetingTemplateList200Response1.equals(targetingTemplateList200Response2));
        System.assert(targetingTemplateList200Response3.equals(targetingTemplateList200Response4));
        System.assertEquals(targetingTemplateList200Response1.hashCode(), targetingTemplateList200Response2.hashCode());
        System.assertEquals(targetingTemplateList200Response3.hashCode(), targetingTemplateList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingTemplateList200Response targetingTemplateList200Response = new OASTargetingTemplateList200Response();
        System.assertEquals(new List<OASTargetingTemplateResponseData>(), targetingTemplateList200Response.items);
        System.assertEquals(null, targetingTemplateList200Response.bookmark);
    }
}
