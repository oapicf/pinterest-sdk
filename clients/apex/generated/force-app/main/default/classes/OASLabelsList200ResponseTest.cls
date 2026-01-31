@isTest
private class OASLabelsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLabelsList200Response labelsList200Response1 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response2 = labelsList200Response1;
        OASLabelsList200Response labelsList200Response3 = new OASLabelsList200Response();
        OASLabelsList200Response labelsList200Response4 = labelsList200Response3;

        System.assert(labelsList200Response1.equals(labelsList200Response2));
        System.assert(labelsList200Response2.equals(labelsList200Response1));
        System.assert(labelsList200Response1.equals(labelsList200Response1));
        System.assert(labelsList200Response3.equals(labelsList200Response4));
        System.assert(labelsList200Response4.equals(labelsList200Response3));
        System.assert(labelsList200Response3.equals(labelsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLabelsList200Response labelsList200Response1 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response2 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response3 = new OASLabelsList200Response();
        OASLabelsList200Response labelsList200Response4 = new OASLabelsList200Response();

        System.assert(labelsList200Response1.equals(labelsList200Response2));
        System.assert(labelsList200Response2.equals(labelsList200Response1));
        System.assert(labelsList200Response3.equals(labelsList200Response4));
        System.assert(labelsList200Response4.equals(labelsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLabelsList200Response labelsList200Response1 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response2 = new OASLabelsList200Response();

        System.assertEquals(false, labelsList200Response1.equals('foo'));
        System.assertEquals(false, labelsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLabelsList200Response labelsList200Response1 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response2 = new OASLabelsList200Response();
        OASLabelsList200Response labelsList200Response3;

        System.assertEquals(false, labelsList200Response1.equals(labelsList200Response3));
        System.assertEquals(false, labelsList200Response2.equals(labelsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLabelsList200Response labelsList200Response1 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response2 = new OASLabelsList200Response();

        System.assertEquals(labelsList200Response1.hashCode(), labelsList200Response1.hashCode());
        System.assertEquals(labelsList200Response2.hashCode(), labelsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLabelsList200Response labelsList200Response1 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response2 = OASLabelsList200Response.getExample();
        OASLabelsList200Response labelsList200Response3 = new OASLabelsList200Response();
        OASLabelsList200Response labelsList200Response4 = new OASLabelsList200Response();

        System.assert(labelsList200Response1.equals(labelsList200Response2));
        System.assert(labelsList200Response3.equals(labelsList200Response4));
        System.assertEquals(labelsList200Response1.hashCode(), labelsList200Response2.hashCode());
        System.assertEquals(labelsList200Response3.hashCode(), labelsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLabelsList200Response labelsList200Response = new OASLabelsList200Response();
        System.assertEquals(new List<OASLabelsResponse>(), labelsList200Response.items);
        System.assertEquals(null, labelsList200Response.bookmark);
    }
}
