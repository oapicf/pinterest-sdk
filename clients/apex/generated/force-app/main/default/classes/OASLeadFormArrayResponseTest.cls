@isTest
private class OASLeadFormArrayResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormArrayResponse leadFormArrayResponse1 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse2 = leadFormArrayResponse1;
        OASLeadFormArrayResponse leadFormArrayResponse3 = new OASLeadFormArrayResponse();
        OASLeadFormArrayResponse leadFormArrayResponse4 = leadFormArrayResponse3;

        System.assert(leadFormArrayResponse1.equals(leadFormArrayResponse2));
        System.assert(leadFormArrayResponse2.equals(leadFormArrayResponse1));
        System.assert(leadFormArrayResponse1.equals(leadFormArrayResponse1));
        System.assert(leadFormArrayResponse3.equals(leadFormArrayResponse4));
        System.assert(leadFormArrayResponse4.equals(leadFormArrayResponse3));
        System.assert(leadFormArrayResponse3.equals(leadFormArrayResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormArrayResponse leadFormArrayResponse1 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse2 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse3 = new OASLeadFormArrayResponse();
        OASLeadFormArrayResponse leadFormArrayResponse4 = new OASLeadFormArrayResponse();

        System.assert(leadFormArrayResponse1.equals(leadFormArrayResponse2));
        System.assert(leadFormArrayResponse2.equals(leadFormArrayResponse1));
        System.assert(leadFormArrayResponse3.equals(leadFormArrayResponse4));
        System.assert(leadFormArrayResponse4.equals(leadFormArrayResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormArrayResponse leadFormArrayResponse1 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse2 = new OASLeadFormArrayResponse();

        System.assertEquals(false, leadFormArrayResponse1.equals('foo'));
        System.assertEquals(false, leadFormArrayResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormArrayResponse leadFormArrayResponse1 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse2 = new OASLeadFormArrayResponse();
        OASLeadFormArrayResponse leadFormArrayResponse3;

        System.assertEquals(false, leadFormArrayResponse1.equals(leadFormArrayResponse3));
        System.assertEquals(false, leadFormArrayResponse2.equals(leadFormArrayResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormArrayResponse leadFormArrayResponse1 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse2 = new OASLeadFormArrayResponse();

        System.assertEquals(leadFormArrayResponse1.hashCode(), leadFormArrayResponse1.hashCode());
        System.assertEquals(leadFormArrayResponse2.hashCode(), leadFormArrayResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormArrayResponse leadFormArrayResponse1 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse2 = OASLeadFormArrayResponse.getExample();
        OASLeadFormArrayResponse leadFormArrayResponse3 = new OASLeadFormArrayResponse();
        OASLeadFormArrayResponse leadFormArrayResponse4 = new OASLeadFormArrayResponse();

        System.assert(leadFormArrayResponse1.equals(leadFormArrayResponse2));
        System.assert(leadFormArrayResponse3.equals(leadFormArrayResponse4));
        System.assertEquals(leadFormArrayResponse1.hashCode(), leadFormArrayResponse2.hashCode());
        System.assertEquals(leadFormArrayResponse3.hashCode(), leadFormArrayResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormArrayResponse leadFormArrayResponse = new OASLeadFormArrayResponse();
        System.assertEquals(new List<OASLeadFormArrayResponseItemsInner>(), leadFormArrayResponse.items);
    }
}
