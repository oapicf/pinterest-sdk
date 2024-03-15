@isTest
private class OASPinTest {
    @isTest
    private static void equalsSameInstance() {
        OASPin pin1 = OASPin.getExample();
        OASPin pin2 = pin1;
        OASPin pin3 = new OASPin();
        OASPin pin4 = pin3;

        System.assert(pin1.equals(pin2));
        System.assert(pin2.equals(pin1));
        System.assert(pin1.equals(pin1));
        System.assert(pin3.equals(pin4));
        System.assert(pin4.equals(pin3));
        System.assert(pin3.equals(pin3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPin pin1 = OASPin.getExample();
        OASPin pin2 = OASPin.getExample();
        OASPin pin3 = new OASPin();
        OASPin pin4 = new OASPin();

        System.assert(pin1.equals(pin2));
        System.assert(pin2.equals(pin1));
        System.assert(pin3.equals(pin4));
        System.assert(pin4.equals(pin3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPin pin1 = OASPin.getExample();
        OASPin pin2 = new OASPin();

        System.assertEquals(false, pin1.equals('foo'));
        System.assertEquals(false, pin2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPin pin1 = OASPin.getExample();
        OASPin pin2 = new OASPin();
        OASPin pin3;

        System.assertEquals(false, pin1.equals(pin3));
        System.assertEquals(false, pin2.equals(pin3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPin pin1 = OASPin.getExample();
        OASPin pin2 = new OASPin();

        System.assertEquals(pin1.hashCode(), pin1.hashCode());
        System.assertEquals(pin2.hashCode(), pin2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPin pin1 = OASPin.getExample();
        OASPin pin2 = OASPin.getExample();
        OASPin pin3 = new OASPin();
        OASPin pin4 = new OASPin();

        System.assert(pin1.equals(pin2));
        System.assert(pin3.equals(pin4));
        System.assertEquals(pin1.hashCode(), pin2.hashCode());
        System.assertEquals(pin3.hashCode(), pin4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPin pin = new OASPin();
        Map<String, String> x-property-mappings = pin.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('dominantColor', x-property-mappings.get('dominant_color'));
        System.assertEquals('altText', x-property-mappings.get('alt_text'));
        System.assertEquals('creativeType', x-property-mappings.get('creative_type'));
        System.assertEquals('boardId', x-property-mappings.get('board_id'));
        System.assertEquals('boardSectionId', x-property-mappings.get('board_section_id'));
        System.assertEquals('boardOwner', x-property-mappings.get('board_owner'));
        System.assertEquals('isOwner', x-property-mappings.get('is_owner'));
        System.assertEquals('mediaSource', x-property-mappings.get('media_source'));
        System.assertEquals('parentPinId', x-property-mappings.get('parent_pin_id'));
        System.assertEquals('isStandard', x-property-mappings.get('is_standard'));
        System.assertEquals('hasBeenPromoted', x-property-mappings.get('has_been_promoted'));
        System.assertEquals('pinMetrics', x-property-mappings.get('pin_metrics'));
    }
}
