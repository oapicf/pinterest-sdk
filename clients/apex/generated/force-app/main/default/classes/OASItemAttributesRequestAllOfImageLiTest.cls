@isTest
private class OASItemAttributesRequestAllOfImageLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink1 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink2 = itemAttributesRequestAllOfImageLink1;
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink3 = new OASItemAttributesRequestAllOfImageLi();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink4 = itemAttributesRequestAllOfImageLink3;

        System.assert(itemAttributesRequestAllOfImageLink1.equals(itemAttributesRequestAllOfImageLink2));
        System.assert(itemAttributesRequestAllOfImageLink2.equals(itemAttributesRequestAllOfImageLink1));
        System.assert(itemAttributesRequestAllOfImageLink1.equals(itemAttributesRequestAllOfImageLink1));
        System.assert(itemAttributesRequestAllOfImageLink3.equals(itemAttributesRequestAllOfImageLink4));
        System.assert(itemAttributesRequestAllOfImageLink4.equals(itemAttributesRequestAllOfImageLink3));
        System.assert(itemAttributesRequestAllOfImageLink3.equals(itemAttributesRequestAllOfImageLink3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink1 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink2 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink3 = new OASItemAttributesRequestAllOfImageLi();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink4 = new OASItemAttributesRequestAllOfImageLi();

        System.assert(itemAttributesRequestAllOfImageLink1.equals(itemAttributesRequestAllOfImageLink2));
        System.assert(itemAttributesRequestAllOfImageLink2.equals(itemAttributesRequestAllOfImageLink1));
        System.assert(itemAttributesRequestAllOfImageLink3.equals(itemAttributesRequestAllOfImageLink4));
        System.assert(itemAttributesRequestAllOfImageLink4.equals(itemAttributesRequestAllOfImageLink3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink1 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink2 = new OASItemAttributesRequestAllOfImageLi();

        System.assertEquals(false, itemAttributesRequestAllOfImageLink1.equals('foo'));
        System.assertEquals(false, itemAttributesRequestAllOfImageLink2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink1 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink2 = new OASItemAttributesRequestAllOfImageLi();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink3;

        System.assertEquals(false, itemAttributesRequestAllOfImageLink1.equals(itemAttributesRequestAllOfImageLink3));
        System.assertEquals(false, itemAttributesRequestAllOfImageLink2.equals(itemAttributesRequestAllOfImageLink3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink1 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink2 = new OASItemAttributesRequestAllOfImageLi();

        System.assertEquals(itemAttributesRequestAllOfImageLink1.hashCode(), itemAttributesRequestAllOfImageLink1.hashCode());
        System.assertEquals(itemAttributesRequestAllOfImageLink2.hashCode(), itemAttributesRequestAllOfImageLink2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink1 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink2 = OASItemAttributesRequestAllOfImageLi.getExample();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink3 = new OASItemAttributesRequestAllOfImageLi();
        OASItemAttributesRequestAllOfImageLi itemAttributesRequestAllOfImageLink4 = new OASItemAttributesRequestAllOfImageLi();

        System.assert(itemAttributesRequestAllOfImageLink1.equals(itemAttributesRequestAllOfImageLink2));
        System.assert(itemAttributesRequestAllOfImageLink3.equals(itemAttributesRequestAllOfImageLink4));
        System.assertEquals(itemAttributesRequestAllOfImageLink1.hashCode(), itemAttributesRequestAllOfImageLink2.hashCode());
        System.assertEquals(itemAttributesRequestAllOfImageLink3.hashCode(), itemAttributesRequestAllOfImageLink4.hashCode());
    }
}
