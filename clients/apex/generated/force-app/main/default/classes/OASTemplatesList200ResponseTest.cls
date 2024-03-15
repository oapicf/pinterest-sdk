@isTest
private class OASTemplatesList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplatesList200Response templatesList200Response1 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response2 = templatesList200Response1;
        OASTemplatesList200Response templatesList200Response3 = new OASTemplatesList200Response();
        OASTemplatesList200Response templatesList200Response4 = templatesList200Response3;

        System.assert(templatesList200Response1.equals(templatesList200Response2));
        System.assert(templatesList200Response2.equals(templatesList200Response1));
        System.assert(templatesList200Response1.equals(templatesList200Response1));
        System.assert(templatesList200Response3.equals(templatesList200Response4));
        System.assert(templatesList200Response4.equals(templatesList200Response3));
        System.assert(templatesList200Response3.equals(templatesList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplatesList200Response templatesList200Response1 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response2 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response3 = new OASTemplatesList200Response();
        OASTemplatesList200Response templatesList200Response4 = new OASTemplatesList200Response();

        System.assert(templatesList200Response1.equals(templatesList200Response2));
        System.assert(templatesList200Response2.equals(templatesList200Response1));
        System.assert(templatesList200Response3.equals(templatesList200Response4));
        System.assert(templatesList200Response4.equals(templatesList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplatesList200Response templatesList200Response1 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response2 = new OASTemplatesList200Response();

        System.assertEquals(false, templatesList200Response1.equals('foo'));
        System.assertEquals(false, templatesList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplatesList200Response templatesList200Response1 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response2 = new OASTemplatesList200Response();
        OASTemplatesList200Response templatesList200Response3;

        System.assertEquals(false, templatesList200Response1.equals(templatesList200Response3));
        System.assertEquals(false, templatesList200Response2.equals(templatesList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplatesList200Response templatesList200Response1 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response2 = new OASTemplatesList200Response();

        System.assertEquals(templatesList200Response1.hashCode(), templatesList200Response1.hashCode());
        System.assertEquals(templatesList200Response2.hashCode(), templatesList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplatesList200Response templatesList200Response1 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response2 = OASTemplatesList200Response.getExample();
        OASTemplatesList200Response templatesList200Response3 = new OASTemplatesList200Response();
        OASTemplatesList200Response templatesList200Response4 = new OASTemplatesList200Response();

        System.assert(templatesList200Response1.equals(templatesList200Response2));
        System.assert(templatesList200Response3.equals(templatesList200Response4));
        System.assertEquals(templatesList200Response1.hashCode(), templatesList200Response2.hashCode());
        System.assertEquals(templatesList200Response3.hashCode(), templatesList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTemplatesList200Response templatesList200Response = new OASTemplatesList200Response();
        System.assertEquals(new List<OASTemplateResponse>(), templatesList200Response.items);
        System.assertEquals(null, templatesList200Response.bookmark);
    }
}
