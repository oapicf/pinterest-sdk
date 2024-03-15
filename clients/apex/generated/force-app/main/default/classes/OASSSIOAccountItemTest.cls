@isTest
private class OASSSIOAccountItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOAccountItem ssIOAccountItem1 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem2 = ssIOAccountItem1;
        OASSSIOAccountItem ssIOAccountItem3 = new OASSSIOAccountItem();
        OASSSIOAccountItem ssIOAccountItem4 = ssIOAccountItem3;

        System.assert(ssIOAccountItem1.equals(ssIOAccountItem2));
        System.assert(ssIOAccountItem2.equals(ssIOAccountItem1));
        System.assert(ssIOAccountItem1.equals(ssIOAccountItem1));
        System.assert(ssIOAccountItem3.equals(ssIOAccountItem4));
        System.assert(ssIOAccountItem4.equals(ssIOAccountItem3));
        System.assert(ssIOAccountItem3.equals(ssIOAccountItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOAccountItem ssIOAccountItem1 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem2 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem3 = new OASSSIOAccountItem();
        OASSSIOAccountItem ssIOAccountItem4 = new OASSSIOAccountItem();

        System.assert(ssIOAccountItem1.equals(ssIOAccountItem2));
        System.assert(ssIOAccountItem2.equals(ssIOAccountItem1));
        System.assert(ssIOAccountItem3.equals(ssIOAccountItem4));
        System.assert(ssIOAccountItem4.equals(ssIOAccountItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOAccountItem ssIOAccountItem1 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem2 = new OASSSIOAccountItem();

        System.assertEquals(false, ssIOAccountItem1.equals('foo'));
        System.assertEquals(false, ssIOAccountItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOAccountItem ssIOAccountItem1 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem2 = new OASSSIOAccountItem();
        OASSSIOAccountItem ssIOAccountItem3;

        System.assertEquals(false, ssIOAccountItem1.equals(ssIOAccountItem3));
        System.assertEquals(false, ssIOAccountItem2.equals(ssIOAccountItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOAccountItem ssIOAccountItem1 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem2 = new OASSSIOAccountItem();

        System.assertEquals(ssIOAccountItem1.hashCode(), ssIOAccountItem1.hashCode());
        System.assertEquals(ssIOAccountItem2.hashCode(), ssIOAccountItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOAccountItem ssIOAccountItem1 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem2 = OASSSIOAccountItem.getExample();
        OASSSIOAccountItem ssIOAccountItem3 = new OASSSIOAccountItem();
        OASSSIOAccountItem ssIOAccountItem4 = new OASSSIOAccountItem();

        System.assert(ssIOAccountItem1.equals(ssIOAccountItem2));
        System.assert(ssIOAccountItem3.equals(ssIOAccountItem4));
        System.assertEquals(ssIOAccountItem1.hashCode(), ssIOAccountItem2.hashCode());
        System.assertEquals(ssIOAccountItem3.hashCode(), ssIOAccountItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOAccountItem ssIOAccountItem = new OASSSIOAccountItem();
        Map<String, String> x-property-mappings = ssIOAccountItem.getx-property-mappings();
        System.assertEquals('ioTermsId', x-property-mappings.get('io_terms_id'));
        System.assertEquals('ioTerms', x-property-mappings.get('io_terms'));
        System.assertEquals('usTermsId', x-property-mappings.get('us_terms_id'));
        System.assertEquals('usTerms', x-property-mappings.get('us_terms'));
        System.assertEquals('rowTermsId', x-property-mappings.get('row_terms_id'));
        System.assertEquals('rowTerms', x-property-mappings.get('row_terms'));
        System.assertEquals('ioType', x-property-mappings.get('io_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSSIOAccountItem ssIOAccountItem = new OASSSIOAccountItem();
        System.assertEquals(new List<OASSSIOAccountAddress>(), ssIOAccountItem.addresses);
        System.assertEquals(null, ssIOAccountItem.id);
        System.assertEquals(null, ssIOAccountItem.ioTermsId);
        System.assertEquals(null, ssIOAccountItem.ioTerms);
        System.assertEquals(null, ssIOAccountItem.usTermsId);
        System.assertEquals(null, ssIOAccountItem.usTerms);
        System.assertEquals(null, ssIOAccountItem.rowTermsId);
        System.assertEquals(null, ssIOAccountItem.rowTerms);
        System.assertEquals(null, ssIOAccountItem.ioType);
    }
}
