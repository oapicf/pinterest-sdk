@isTest
private class OASBoardCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardCreate boardCreate1 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate2 = boardCreate1;
        OASBoardCreate boardCreate3 = new OASBoardCreate();
        OASBoardCreate boardCreate4 = boardCreate3;

        System.assert(boardCreate1.equals(boardCreate2));
        System.assert(boardCreate2.equals(boardCreate1));
        System.assert(boardCreate1.equals(boardCreate1));
        System.assert(boardCreate3.equals(boardCreate4));
        System.assert(boardCreate4.equals(boardCreate3));
        System.assert(boardCreate3.equals(boardCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardCreate boardCreate1 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate2 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate3 = new OASBoardCreate();
        OASBoardCreate boardCreate4 = new OASBoardCreate();

        System.assert(boardCreate1.equals(boardCreate2));
        System.assert(boardCreate2.equals(boardCreate1));
        System.assert(boardCreate3.equals(boardCreate4));
        System.assert(boardCreate4.equals(boardCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardCreate boardCreate1 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate2 = new OASBoardCreate();

        System.assertEquals(false, boardCreate1.equals('foo'));
        System.assertEquals(false, boardCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardCreate boardCreate1 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate2 = new OASBoardCreate();
        OASBoardCreate boardCreate3;

        System.assertEquals(false, boardCreate1.equals(boardCreate3));
        System.assertEquals(false, boardCreate2.equals(boardCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardCreate boardCreate1 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate2 = new OASBoardCreate();

        System.assertEquals(boardCreate1.hashCode(), boardCreate1.hashCode());
        System.assertEquals(boardCreate2.hashCode(), boardCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardCreate boardCreate1 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate2 = OASBoardCreate.getExample();
        OASBoardCreate boardCreate3 = new OASBoardCreate();
        OASBoardCreate boardCreate4 = new OASBoardCreate();

        System.assert(boardCreate1.equals(boardCreate2));
        System.assert(boardCreate3.equals(boardCreate4));
        System.assertEquals(boardCreate1.hashCode(), boardCreate2.hashCode());
        System.assertEquals(boardCreate3.hashCode(), boardCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBoardCreate boardCreate = new OASBoardCreate();
        Map<String, String> x-property-mappings = boardCreate.getx-property-mappings();
        System.assertEquals('isAdsOnly', x-property-mappings.get('is_ads_only'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardCreate boardCreate = new OASBoardCreate();
        System.assertEquals(false, boardCreate.isAdsOnly);
        System.assertEquals(OASBoardPrivacy.PUBLIC, boardCreate.privacy);
        System.assertEquals(null, boardCreate.description);
        System.assertEquals(null, boardCreate.name);
    }
}
