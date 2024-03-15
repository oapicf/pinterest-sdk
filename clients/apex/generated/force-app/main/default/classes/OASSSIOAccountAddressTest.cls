@isTest
private class OASSSIOAccountAddressTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOAccountAddress ssIOAccountAddress1 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress2 = ssIOAccountAddress1;
        OASSSIOAccountAddress ssIOAccountAddress3 = new OASSSIOAccountAddress();
        OASSSIOAccountAddress ssIOAccountAddress4 = ssIOAccountAddress3;

        System.assert(ssIOAccountAddress1.equals(ssIOAccountAddress2));
        System.assert(ssIOAccountAddress2.equals(ssIOAccountAddress1));
        System.assert(ssIOAccountAddress1.equals(ssIOAccountAddress1));
        System.assert(ssIOAccountAddress3.equals(ssIOAccountAddress4));
        System.assert(ssIOAccountAddress4.equals(ssIOAccountAddress3));
        System.assert(ssIOAccountAddress3.equals(ssIOAccountAddress3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOAccountAddress ssIOAccountAddress1 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress2 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress3 = new OASSSIOAccountAddress();
        OASSSIOAccountAddress ssIOAccountAddress4 = new OASSSIOAccountAddress();

        System.assert(ssIOAccountAddress1.equals(ssIOAccountAddress2));
        System.assert(ssIOAccountAddress2.equals(ssIOAccountAddress1));
        System.assert(ssIOAccountAddress3.equals(ssIOAccountAddress4));
        System.assert(ssIOAccountAddress4.equals(ssIOAccountAddress3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOAccountAddress ssIOAccountAddress1 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress2 = new OASSSIOAccountAddress();

        System.assertEquals(false, ssIOAccountAddress1.equals('foo'));
        System.assertEquals(false, ssIOAccountAddress2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOAccountAddress ssIOAccountAddress1 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress2 = new OASSSIOAccountAddress();
        OASSSIOAccountAddress ssIOAccountAddress3;

        System.assertEquals(false, ssIOAccountAddress1.equals(ssIOAccountAddress3));
        System.assertEquals(false, ssIOAccountAddress2.equals(ssIOAccountAddress3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOAccountAddress ssIOAccountAddress1 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress2 = new OASSSIOAccountAddress();

        System.assertEquals(ssIOAccountAddress1.hashCode(), ssIOAccountAddress1.hashCode());
        System.assertEquals(ssIOAccountAddress2.hashCode(), ssIOAccountAddress2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOAccountAddress ssIOAccountAddress1 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress2 = OASSSIOAccountAddress.getExample();
        OASSSIOAccountAddress ssIOAccountAddress3 = new OASSSIOAccountAddress();
        OASSSIOAccountAddress ssIOAccountAddress4 = new OASSSIOAccountAddress();

        System.assert(ssIOAccountAddress1.equals(ssIOAccountAddress2));
        System.assert(ssIOAccountAddress3.equals(ssIOAccountAddress4));
        System.assertEquals(ssIOAccountAddress1.hashCode(), ssIOAccountAddress2.hashCode());
        System.assertEquals(ssIOAccountAddress3.hashCode(), ssIOAccountAddress4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOAccountAddress ssIOAccountAddress = new OASSSIOAccountAddress();
        Map<String, String> x-property-mappings = ssIOAccountAddress.getx-property-mappings();
        System.assertEquals('addressId', x-property-mappings.get('address_id'));
        System.assertEquals('orderLegalEntity', x-property-mappings.get('order_legal_entity'));
    }
}
