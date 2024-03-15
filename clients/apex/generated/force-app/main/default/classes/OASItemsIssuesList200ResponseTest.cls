@isTest
private class OASItemsIssuesList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemsIssuesList200Response itemsIssuesList200Response1 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response2 = itemsIssuesList200Response1;
        OASItemsIssuesList200Response itemsIssuesList200Response3 = new OASItemsIssuesList200Response();
        OASItemsIssuesList200Response itemsIssuesList200Response4 = itemsIssuesList200Response3;

        System.assert(itemsIssuesList200Response1.equals(itemsIssuesList200Response2));
        System.assert(itemsIssuesList200Response2.equals(itemsIssuesList200Response1));
        System.assert(itemsIssuesList200Response1.equals(itemsIssuesList200Response1));
        System.assert(itemsIssuesList200Response3.equals(itemsIssuesList200Response4));
        System.assert(itemsIssuesList200Response4.equals(itemsIssuesList200Response3));
        System.assert(itemsIssuesList200Response3.equals(itemsIssuesList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemsIssuesList200Response itemsIssuesList200Response1 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response2 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response3 = new OASItemsIssuesList200Response();
        OASItemsIssuesList200Response itemsIssuesList200Response4 = new OASItemsIssuesList200Response();

        System.assert(itemsIssuesList200Response1.equals(itemsIssuesList200Response2));
        System.assert(itemsIssuesList200Response2.equals(itemsIssuesList200Response1));
        System.assert(itemsIssuesList200Response3.equals(itemsIssuesList200Response4));
        System.assert(itemsIssuesList200Response4.equals(itemsIssuesList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemsIssuesList200Response itemsIssuesList200Response1 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response2 = new OASItemsIssuesList200Response();

        System.assertEquals(false, itemsIssuesList200Response1.equals('foo'));
        System.assertEquals(false, itemsIssuesList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemsIssuesList200Response itemsIssuesList200Response1 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response2 = new OASItemsIssuesList200Response();
        OASItemsIssuesList200Response itemsIssuesList200Response3;

        System.assertEquals(false, itemsIssuesList200Response1.equals(itemsIssuesList200Response3));
        System.assertEquals(false, itemsIssuesList200Response2.equals(itemsIssuesList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemsIssuesList200Response itemsIssuesList200Response1 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response2 = new OASItemsIssuesList200Response();

        System.assertEquals(itemsIssuesList200Response1.hashCode(), itemsIssuesList200Response1.hashCode());
        System.assertEquals(itemsIssuesList200Response2.hashCode(), itemsIssuesList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemsIssuesList200Response itemsIssuesList200Response1 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response2 = OASItemsIssuesList200Response.getExample();
        OASItemsIssuesList200Response itemsIssuesList200Response3 = new OASItemsIssuesList200Response();
        OASItemsIssuesList200Response itemsIssuesList200Response4 = new OASItemsIssuesList200Response();

        System.assert(itemsIssuesList200Response1.equals(itemsIssuesList200Response2));
        System.assert(itemsIssuesList200Response3.equals(itemsIssuesList200Response4));
        System.assertEquals(itemsIssuesList200Response1.hashCode(), itemsIssuesList200Response2.hashCode());
        System.assertEquals(itemsIssuesList200Response3.hashCode(), itemsIssuesList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemsIssuesList200Response itemsIssuesList200Response = new OASItemsIssuesList200Response();
        System.assertEquals(new List<OASCatalogsItemValidationIssues>(), itemsIssuesList200Response.items);
        System.assertEquals(null, itemsIssuesList200Response.bookmark);
    }
}
