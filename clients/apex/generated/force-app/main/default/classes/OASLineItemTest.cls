@isTest
private class OASLineItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASLineItem lineItem1 = OASLineItem.getExample();
        OASLineItem lineItem2 = lineItem1;
        OASLineItem lineItem3 = new OASLineItem();
        OASLineItem lineItem4 = lineItem3;

        System.assert(lineItem1.equals(lineItem2));
        System.assert(lineItem2.equals(lineItem1));
        System.assert(lineItem1.equals(lineItem1));
        System.assert(lineItem3.equals(lineItem4));
        System.assert(lineItem4.equals(lineItem3));
        System.assert(lineItem3.equals(lineItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLineItem lineItem1 = OASLineItem.getExample();
        OASLineItem lineItem2 = OASLineItem.getExample();
        OASLineItem lineItem3 = new OASLineItem();
        OASLineItem lineItem4 = new OASLineItem();

        System.assert(lineItem1.equals(lineItem2));
        System.assert(lineItem2.equals(lineItem1));
        System.assert(lineItem3.equals(lineItem4));
        System.assert(lineItem4.equals(lineItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLineItem lineItem1 = OASLineItem.getExample();
        OASLineItem lineItem2 = new OASLineItem();

        System.assertEquals(false, lineItem1.equals('foo'));
        System.assertEquals(false, lineItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLineItem lineItem1 = OASLineItem.getExample();
        OASLineItem lineItem2 = new OASLineItem();
        OASLineItem lineItem3;

        System.assertEquals(false, lineItem1.equals(lineItem3));
        System.assertEquals(false, lineItem2.equals(lineItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLineItem lineItem1 = OASLineItem.getExample();
        OASLineItem lineItem2 = new OASLineItem();

        System.assertEquals(lineItem1.hashCode(), lineItem1.hashCode());
        System.assertEquals(lineItem2.hashCode(), lineItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLineItem lineItem1 = OASLineItem.getExample();
        OASLineItem lineItem2 = OASLineItem.getExample();
        OASLineItem lineItem3 = new OASLineItem();
        OASLineItem lineItem4 = new OASLineItem();

        System.assert(lineItem1.equals(lineItem2));
        System.assert(lineItem3.equals(lineItem4));
        System.assertEquals(lineItem1.hashCode(), lineItem2.hashCode());
        System.assertEquals(lineItem3.hashCode(), lineItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLineItem lineItem = new OASLineItem();
        Map<String, String> x-property-mappings = lineItem.getx-property-mappings();
        System.assertEquals('productBrand', x-property-mappings.get('product_brand'));
        System.assertEquals('productCategory', x-property-mappings.get('product_category'));
        System.assertEquals('productId', x-property-mappings.get('product_id'));
        System.assertEquals('productName', x-property-mappings.get('product_name'));
        System.assertEquals('productPrice', x-property-mappings.get('product_price'));
        System.assertEquals('productQuantity', x-property-mappings.get('product_quantity'));
        System.assertEquals('productVariant', x-property-mappings.get('product_variant'));
        System.assertEquals('productVariantId', x-property-mappings.get('product_variant_id'));
    }
}
