@isTest
private class OASPinCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinCreate pinCreate1 = OASPinCreate.getExample();
        OASPinCreate pinCreate2 = pinCreate1;
        OASPinCreate pinCreate3 = new OASPinCreate();
        OASPinCreate pinCreate4 = pinCreate3;

        System.assert(pinCreate1.equals(pinCreate2));
        System.assert(pinCreate2.equals(pinCreate1));
        System.assert(pinCreate1.equals(pinCreate1));
        System.assert(pinCreate3.equals(pinCreate4));
        System.assert(pinCreate4.equals(pinCreate3));
        System.assert(pinCreate3.equals(pinCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinCreate pinCreate1 = OASPinCreate.getExample();
        OASPinCreate pinCreate2 = OASPinCreate.getExample();
        OASPinCreate pinCreate3 = new OASPinCreate();
        OASPinCreate pinCreate4 = new OASPinCreate();

        System.assert(pinCreate1.equals(pinCreate2));
        System.assert(pinCreate2.equals(pinCreate1));
        System.assert(pinCreate3.equals(pinCreate4));
        System.assert(pinCreate4.equals(pinCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinCreate pinCreate1 = OASPinCreate.getExample();
        OASPinCreate pinCreate2 = new OASPinCreate();

        System.assertEquals(false, pinCreate1.equals('foo'));
        System.assertEquals(false, pinCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinCreate pinCreate1 = OASPinCreate.getExample();
        OASPinCreate pinCreate2 = new OASPinCreate();
        OASPinCreate pinCreate3;

        System.assertEquals(false, pinCreate1.equals(pinCreate3));
        System.assertEquals(false, pinCreate2.equals(pinCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinCreate pinCreate1 = OASPinCreate.getExample();
        OASPinCreate pinCreate2 = new OASPinCreate();

        System.assertEquals(pinCreate1.hashCode(), pinCreate1.hashCode());
        System.assertEquals(pinCreate2.hashCode(), pinCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinCreate pinCreate1 = OASPinCreate.getExample();
        OASPinCreate pinCreate2 = OASPinCreate.getExample();
        OASPinCreate pinCreate3 = new OASPinCreate();
        OASPinCreate pinCreate4 = new OASPinCreate();

        System.assert(pinCreate1.equals(pinCreate2));
        System.assert(pinCreate3.equals(pinCreate4));
        System.assertEquals(pinCreate1.hashCode(), pinCreate2.hashCode());
        System.assertEquals(pinCreate3.hashCode(), pinCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinCreate pinCreate = new OASPinCreate();
        Map<String, String> x-property-mappings = pinCreate.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('dominantColor', x-property-mappings.get('dominant_color'));
        System.assertEquals('altText', x-property-mappings.get('alt_text'));
        System.assertEquals('boardId', x-property-mappings.get('board_id'));
        System.assertEquals('boardSectionId', x-property-mappings.get('board_section_id'));
        System.assertEquals('boardOwner', x-property-mappings.get('board_owner'));
        System.assertEquals('mediaSource', x-property-mappings.get('media_source'));
        System.assertEquals('parentPinId', x-property-mappings.get('parent_pin_id'));
    }
}
