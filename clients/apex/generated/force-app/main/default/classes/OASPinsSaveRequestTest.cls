@isTest
private class OASPinsSaveRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinsSaveRequest pinsSaveRequest1 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest2 = pinsSaveRequest1;
        OASPinsSaveRequest pinsSaveRequest3 = new OASPinsSaveRequest();
        OASPinsSaveRequest pinsSaveRequest4 = pinsSaveRequest3;

        System.assert(pinsSaveRequest1.equals(pinsSaveRequest2));
        System.assert(pinsSaveRequest2.equals(pinsSaveRequest1));
        System.assert(pinsSaveRequest1.equals(pinsSaveRequest1));
        System.assert(pinsSaveRequest3.equals(pinsSaveRequest4));
        System.assert(pinsSaveRequest4.equals(pinsSaveRequest3));
        System.assert(pinsSaveRequest3.equals(pinsSaveRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinsSaveRequest pinsSaveRequest1 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest2 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest3 = new OASPinsSaveRequest();
        OASPinsSaveRequest pinsSaveRequest4 = new OASPinsSaveRequest();

        System.assert(pinsSaveRequest1.equals(pinsSaveRequest2));
        System.assert(pinsSaveRequest2.equals(pinsSaveRequest1));
        System.assert(pinsSaveRequest3.equals(pinsSaveRequest4));
        System.assert(pinsSaveRequest4.equals(pinsSaveRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinsSaveRequest pinsSaveRequest1 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest2 = new OASPinsSaveRequest();

        System.assertEquals(false, pinsSaveRequest1.equals('foo'));
        System.assertEquals(false, pinsSaveRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinsSaveRequest pinsSaveRequest1 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest2 = new OASPinsSaveRequest();
        OASPinsSaveRequest pinsSaveRequest3;

        System.assertEquals(false, pinsSaveRequest1.equals(pinsSaveRequest3));
        System.assertEquals(false, pinsSaveRequest2.equals(pinsSaveRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinsSaveRequest pinsSaveRequest1 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest2 = new OASPinsSaveRequest();

        System.assertEquals(pinsSaveRequest1.hashCode(), pinsSaveRequest1.hashCode());
        System.assertEquals(pinsSaveRequest2.hashCode(), pinsSaveRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinsSaveRequest pinsSaveRequest1 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest2 = OASPinsSaveRequest.getExample();
        OASPinsSaveRequest pinsSaveRequest3 = new OASPinsSaveRequest();
        OASPinsSaveRequest pinsSaveRequest4 = new OASPinsSaveRequest();

        System.assert(pinsSaveRequest1.equals(pinsSaveRequest2));
        System.assert(pinsSaveRequest3.equals(pinsSaveRequest4));
        System.assertEquals(pinsSaveRequest1.hashCode(), pinsSaveRequest2.hashCode());
        System.assertEquals(pinsSaveRequest3.hashCode(), pinsSaveRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinsSaveRequest pinsSaveRequest = new OASPinsSaveRequest();
        Map<String, String> x-property-mappings = pinsSaveRequest.getx-property-mappings();
        System.assertEquals('boardId', x-property-mappings.get('board_id'));
        System.assertEquals('boardSectionId', x-property-mappings.get('board_section_id'));
    }
}
