@isTest
private class OASPinUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinUpdate pinUpdate1 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate2 = pinUpdate1;
        OASPinUpdate pinUpdate3 = new OASPinUpdate();
        OASPinUpdate pinUpdate4 = pinUpdate3;

        System.assert(pinUpdate1.equals(pinUpdate2));
        System.assert(pinUpdate2.equals(pinUpdate1));
        System.assert(pinUpdate1.equals(pinUpdate1));
        System.assert(pinUpdate3.equals(pinUpdate4));
        System.assert(pinUpdate4.equals(pinUpdate3));
        System.assert(pinUpdate3.equals(pinUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinUpdate pinUpdate1 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate2 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate3 = new OASPinUpdate();
        OASPinUpdate pinUpdate4 = new OASPinUpdate();

        System.assert(pinUpdate1.equals(pinUpdate2));
        System.assert(pinUpdate2.equals(pinUpdate1));
        System.assert(pinUpdate3.equals(pinUpdate4));
        System.assert(pinUpdate4.equals(pinUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinUpdate pinUpdate1 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate2 = new OASPinUpdate();

        System.assertEquals(false, pinUpdate1.equals('foo'));
        System.assertEquals(false, pinUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinUpdate pinUpdate1 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate2 = new OASPinUpdate();
        OASPinUpdate pinUpdate3;

        System.assertEquals(false, pinUpdate1.equals(pinUpdate3));
        System.assertEquals(false, pinUpdate2.equals(pinUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinUpdate pinUpdate1 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate2 = new OASPinUpdate();

        System.assertEquals(pinUpdate1.hashCode(), pinUpdate1.hashCode());
        System.assertEquals(pinUpdate2.hashCode(), pinUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinUpdate pinUpdate1 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate2 = OASPinUpdate.getExample();
        OASPinUpdate pinUpdate3 = new OASPinUpdate();
        OASPinUpdate pinUpdate4 = new OASPinUpdate();

        System.assert(pinUpdate1.equals(pinUpdate2));
        System.assert(pinUpdate3.equals(pinUpdate4));
        System.assertEquals(pinUpdate1.hashCode(), pinUpdate2.hashCode());
        System.assertEquals(pinUpdate3.hashCode(), pinUpdate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinUpdate pinUpdate = new OASPinUpdate();
        Map<String, String> x-property-mappings = pinUpdate.getx-property-mappings();
        System.assertEquals('altText', x-property-mappings.get('alt_text'));
        System.assertEquals('boardId', x-property-mappings.get('board_id'));
        System.assertEquals('boardSectionId', x-property-mappings.get('board_section_id'));
        System.assertEquals('carouselSlots', x-property-mappings.get('carousel_slots'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinUpdate pinUpdate = new OASPinUpdate();
        System.assertEquals(new List<OASPinUpdateCarouselSlotsInner>(), pinUpdate.carouselSlots);
        System.assertEquals(null, pinUpdate.altText);
        System.assertEquals(null, pinUpdate.boardId);
        System.assertEquals(null, pinUpdate.boardSectionId);
        System.assertEquals(null, pinUpdate.description);
        System.assertEquals(null, pinUpdate.link);
        System.assertEquals(null, pinUpdate.title);
        System.assertEquals(null, pinUpdate.note);
    }
}
