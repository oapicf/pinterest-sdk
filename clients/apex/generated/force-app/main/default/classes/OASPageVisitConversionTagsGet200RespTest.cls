@isTest
private class OASPageVisitConversionTagsGet200RespTest {
    @isTest
    private static void equalsSameInstance() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response1 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response2 = pageVisitConversionTagsGet200Response1;
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response3 = new OASPageVisitConversionTagsGet200Resp();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response4 = pageVisitConversionTagsGet200Response3;

        System.assert(pageVisitConversionTagsGet200Response1.equals(pageVisitConversionTagsGet200Response2));
        System.assert(pageVisitConversionTagsGet200Response2.equals(pageVisitConversionTagsGet200Response1));
        System.assert(pageVisitConversionTagsGet200Response1.equals(pageVisitConversionTagsGet200Response1));
        System.assert(pageVisitConversionTagsGet200Response3.equals(pageVisitConversionTagsGet200Response4));
        System.assert(pageVisitConversionTagsGet200Response4.equals(pageVisitConversionTagsGet200Response3));
        System.assert(pageVisitConversionTagsGet200Response3.equals(pageVisitConversionTagsGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response1 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response2 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response3 = new OASPageVisitConversionTagsGet200Resp();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response4 = new OASPageVisitConversionTagsGet200Resp();

        System.assert(pageVisitConversionTagsGet200Response1.equals(pageVisitConversionTagsGet200Response2));
        System.assert(pageVisitConversionTagsGet200Response2.equals(pageVisitConversionTagsGet200Response1));
        System.assert(pageVisitConversionTagsGet200Response3.equals(pageVisitConversionTagsGet200Response4));
        System.assert(pageVisitConversionTagsGet200Response4.equals(pageVisitConversionTagsGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response1 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response2 = new OASPageVisitConversionTagsGet200Resp();

        System.assertEquals(false, pageVisitConversionTagsGet200Response1.equals('foo'));
        System.assertEquals(false, pageVisitConversionTagsGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response1 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response2 = new OASPageVisitConversionTagsGet200Resp();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response3;

        System.assertEquals(false, pageVisitConversionTagsGet200Response1.equals(pageVisitConversionTagsGet200Response3));
        System.assertEquals(false, pageVisitConversionTagsGet200Response2.equals(pageVisitConversionTagsGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response1 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response2 = new OASPageVisitConversionTagsGet200Resp();

        System.assertEquals(pageVisitConversionTagsGet200Response1.hashCode(), pageVisitConversionTagsGet200Response1.hashCode());
        System.assertEquals(pageVisitConversionTagsGet200Response2.hashCode(), pageVisitConversionTagsGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response1 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response2 = OASPageVisitConversionTagsGet200Resp.getExample();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response3 = new OASPageVisitConversionTagsGet200Resp();
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response4 = new OASPageVisitConversionTagsGet200Resp();

        System.assert(pageVisitConversionTagsGet200Response1.equals(pageVisitConversionTagsGet200Response2));
        System.assert(pageVisitConversionTagsGet200Response3.equals(pageVisitConversionTagsGet200Response4));
        System.assertEquals(pageVisitConversionTagsGet200Response1.hashCode(), pageVisitConversionTagsGet200Response2.hashCode());
        System.assertEquals(pageVisitConversionTagsGet200Response3.hashCode(), pageVisitConversionTagsGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPageVisitConversionTagsGet200Resp pageVisitConversionTagsGet200Response = new OASPageVisitConversionTagsGet200Resp();
        System.assertEquals(new List<OASConversionEventResponse>(), pageVisitConversionTagsGet200Response.items);
        System.assertEquals(null, pageVisitConversionTagsGet200Response.bookmark);
    }
}
