@isTest
private class OASLeadFormsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormsList200Response leadFormsList200Response1 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response2 = leadFormsList200Response1;
        OASLeadFormsList200Response leadFormsList200Response3 = new OASLeadFormsList200Response();
        OASLeadFormsList200Response leadFormsList200Response4 = leadFormsList200Response3;

        System.assert(leadFormsList200Response1.equals(leadFormsList200Response2));
        System.assert(leadFormsList200Response2.equals(leadFormsList200Response1));
        System.assert(leadFormsList200Response1.equals(leadFormsList200Response1));
        System.assert(leadFormsList200Response3.equals(leadFormsList200Response4));
        System.assert(leadFormsList200Response4.equals(leadFormsList200Response3));
        System.assert(leadFormsList200Response3.equals(leadFormsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormsList200Response leadFormsList200Response1 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response2 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response3 = new OASLeadFormsList200Response();
        OASLeadFormsList200Response leadFormsList200Response4 = new OASLeadFormsList200Response();

        System.assert(leadFormsList200Response1.equals(leadFormsList200Response2));
        System.assert(leadFormsList200Response2.equals(leadFormsList200Response1));
        System.assert(leadFormsList200Response3.equals(leadFormsList200Response4));
        System.assert(leadFormsList200Response4.equals(leadFormsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormsList200Response leadFormsList200Response1 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response2 = new OASLeadFormsList200Response();

        System.assertEquals(false, leadFormsList200Response1.equals('foo'));
        System.assertEquals(false, leadFormsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormsList200Response leadFormsList200Response1 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response2 = new OASLeadFormsList200Response();
        OASLeadFormsList200Response leadFormsList200Response3;

        System.assertEquals(false, leadFormsList200Response1.equals(leadFormsList200Response3));
        System.assertEquals(false, leadFormsList200Response2.equals(leadFormsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormsList200Response leadFormsList200Response1 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response2 = new OASLeadFormsList200Response();

        System.assertEquals(leadFormsList200Response1.hashCode(), leadFormsList200Response1.hashCode());
        System.assertEquals(leadFormsList200Response2.hashCode(), leadFormsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormsList200Response leadFormsList200Response1 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response2 = OASLeadFormsList200Response.getExample();
        OASLeadFormsList200Response leadFormsList200Response3 = new OASLeadFormsList200Response();
        OASLeadFormsList200Response leadFormsList200Response4 = new OASLeadFormsList200Response();

        System.assert(leadFormsList200Response1.equals(leadFormsList200Response2));
        System.assert(leadFormsList200Response3.equals(leadFormsList200Response4));
        System.assertEquals(leadFormsList200Response1.hashCode(), leadFormsList200Response2.hashCode());
        System.assertEquals(leadFormsList200Response3.hashCode(), leadFormsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormsList200Response leadFormsList200Response = new OASLeadFormsList200Response();
        System.assertEquals(new List<OASLeadFormResponse>(), leadFormsList200Response.items);
        System.assertEquals(null, leadFormsList200Response.bookmark);
    }
}
