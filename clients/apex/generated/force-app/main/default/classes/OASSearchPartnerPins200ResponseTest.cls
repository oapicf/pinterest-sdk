@isTest
private class OASSearchPartnerPins200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchPartnerPins200Response searchPartnerPins200Response1 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response2 = searchPartnerPins200Response1;
        OASSearchPartnerPins200Response searchPartnerPins200Response3 = new OASSearchPartnerPins200Response();
        OASSearchPartnerPins200Response searchPartnerPins200Response4 = searchPartnerPins200Response3;

        System.assert(searchPartnerPins200Response1.equals(searchPartnerPins200Response2));
        System.assert(searchPartnerPins200Response2.equals(searchPartnerPins200Response1));
        System.assert(searchPartnerPins200Response1.equals(searchPartnerPins200Response1));
        System.assert(searchPartnerPins200Response3.equals(searchPartnerPins200Response4));
        System.assert(searchPartnerPins200Response4.equals(searchPartnerPins200Response3));
        System.assert(searchPartnerPins200Response3.equals(searchPartnerPins200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchPartnerPins200Response searchPartnerPins200Response1 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response2 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response3 = new OASSearchPartnerPins200Response();
        OASSearchPartnerPins200Response searchPartnerPins200Response4 = new OASSearchPartnerPins200Response();

        System.assert(searchPartnerPins200Response1.equals(searchPartnerPins200Response2));
        System.assert(searchPartnerPins200Response2.equals(searchPartnerPins200Response1));
        System.assert(searchPartnerPins200Response3.equals(searchPartnerPins200Response4));
        System.assert(searchPartnerPins200Response4.equals(searchPartnerPins200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchPartnerPins200Response searchPartnerPins200Response1 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response2 = new OASSearchPartnerPins200Response();

        System.assertEquals(false, searchPartnerPins200Response1.equals('foo'));
        System.assertEquals(false, searchPartnerPins200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchPartnerPins200Response searchPartnerPins200Response1 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response2 = new OASSearchPartnerPins200Response();
        OASSearchPartnerPins200Response searchPartnerPins200Response3;

        System.assertEquals(false, searchPartnerPins200Response1.equals(searchPartnerPins200Response3));
        System.assertEquals(false, searchPartnerPins200Response2.equals(searchPartnerPins200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchPartnerPins200Response searchPartnerPins200Response1 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response2 = new OASSearchPartnerPins200Response();

        System.assertEquals(searchPartnerPins200Response1.hashCode(), searchPartnerPins200Response1.hashCode());
        System.assertEquals(searchPartnerPins200Response2.hashCode(), searchPartnerPins200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchPartnerPins200Response searchPartnerPins200Response1 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response2 = OASSearchPartnerPins200Response.getExample();
        OASSearchPartnerPins200Response searchPartnerPins200Response3 = new OASSearchPartnerPins200Response();
        OASSearchPartnerPins200Response searchPartnerPins200Response4 = new OASSearchPartnerPins200Response();

        System.assert(searchPartnerPins200Response1.equals(searchPartnerPins200Response2));
        System.assert(searchPartnerPins200Response3.equals(searchPartnerPins200Response4));
        System.assertEquals(searchPartnerPins200Response1.hashCode(), searchPartnerPins200Response2.hashCode());
        System.assertEquals(searchPartnerPins200Response3.hashCode(), searchPartnerPins200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSearchPartnerPins200Response searchPartnerPins200Response = new OASSearchPartnerPins200Response();
        System.assertEquals(new List<OASSummaryPin>(), searchPartnerPins200Response.items);
        System.assertEquals(null, searchPartnerPins200Response.bookmark);
    }
}
