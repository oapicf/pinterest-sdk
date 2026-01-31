@isTest
private class OASConversionHealthSelectionItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionHealthSelectionItem conversionHealthSelectionItem1 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem2 = conversionHealthSelectionItem1;
        OASConversionHealthSelectionItem conversionHealthSelectionItem3 = new OASConversionHealthSelectionItem();
        OASConversionHealthSelectionItem conversionHealthSelectionItem4 = conversionHealthSelectionItem3;

        System.assert(conversionHealthSelectionItem1.equals(conversionHealthSelectionItem2));
        System.assert(conversionHealthSelectionItem2.equals(conversionHealthSelectionItem1));
        System.assert(conversionHealthSelectionItem1.equals(conversionHealthSelectionItem1));
        System.assert(conversionHealthSelectionItem3.equals(conversionHealthSelectionItem4));
        System.assert(conversionHealthSelectionItem4.equals(conversionHealthSelectionItem3));
        System.assert(conversionHealthSelectionItem3.equals(conversionHealthSelectionItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionHealthSelectionItem conversionHealthSelectionItem1 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem2 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem3 = new OASConversionHealthSelectionItem();
        OASConversionHealthSelectionItem conversionHealthSelectionItem4 = new OASConversionHealthSelectionItem();

        System.assert(conversionHealthSelectionItem1.equals(conversionHealthSelectionItem2));
        System.assert(conversionHealthSelectionItem2.equals(conversionHealthSelectionItem1));
        System.assert(conversionHealthSelectionItem3.equals(conversionHealthSelectionItem4));
        System.assert(conversionHealthSelectionItem4.equals(conversionHealthSelectionItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionHealthSelectionItem conversionHealthSelectionItem1 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem2 = new OASConversionHealthSelectionItem();

        System.assertEquals(false, conversionHealthSelectionItem1.equals('foo'));
        System.assertEquals(false, conversionHealthSelectionItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionHealthSelectionItem conversionHealthSelectionItem1 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem2 = new OASConversionHealthSelectionItem();
        OASConversionHealthSelectionItem conversionHealthSelectionItem3;

        System.assertEquals(false, conversionHealthSelectionItem1.equals(conversionHealthSelectionItem3));
        System.assertEquals(false, conversionHealthSelectionItem2.equals(conversionHealthSelectionItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionHealthSelectionItem conversionHealthSelectionItem1 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem2 = new OASConversionHealthSelectionItem();

        System.assertEquals(conversionHealthSelectionItem1.hashCode(), conversionHealthSelectionItem1.hashCode());
        System.assertEquals(conversionHealthSelectionItem2.hashCode(), conversionHealthSelectionItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionHealthSelectionItem conversionHealthSelectionItem1 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem2 = OASConversionHealthSelectionItem.getExample();
        OASConversionHealthSelectionItem conversionHealthSelectionItem3 = new OASConversionHealthSelectionItem();
        OASConversionHealthSelectionItem conversionHealthSelectionItem4 = new OASConversionHealthSelectionItem();

        System.assert(conversionHealthSelectionItem1.equals(conversionHealthSelectionItem2));
        System.assert(conversionHealthSelectionItem3.equals(conversionHealthSelectionItem4));
        System.assertEquals(conversionHealthSelectionItem1.hashCode(), conversionHealthSelectionItem2.hashCode());
        System.assertEquals(conversionHealthSelectionItem3.hashCode(), conversionHealthSelectionItem4.hashCode());
    }
}
