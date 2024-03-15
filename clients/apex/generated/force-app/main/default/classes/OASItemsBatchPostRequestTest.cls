@isTest
private class OASItemsBatchPostRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemsBatchPostRequest itemsBatchPostRequest1 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest2 = itemsBatchPostRequest1;
        OASItemsBatchPostRequest itemsBatchPostRequest3 = new OASItemsBatchPostRequest();
        OASItemsBatchPostRequest itemsBatchPostRequest4 = itemsBatchPostRequest3;

        System.assert(itemsBatchPostRequest1.equals(itemsBatchPostRequest2));
        System.assert(itemsBatchPostRequest2.equals(itemsBatchPostRequest1));
        System.assert(itemsBatchPostRequest1.equals(itemsBatchPostRequest1));
        System.assert(itemsBatchPostRequest3.equals(itemsBatchPostRequest4));
        System.assert(itemsBatchPostRequest4.equals(itemsBatchPostRequest3));
        System.assert(itemsBatchPostRequest3.equals(itemsBatchPostRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemsBatchPostRequest itemsBatchPostRequest1 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest2 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest3 = new OASItemsBatchPostRequest();
        OASItemsBatchPostRequest itemsBatchPostRequest4 = new OASItemsBatchPostRequest();

        System.assert(itemsBatchPostRequest1.equals(itemsBatchPostRequest2));
        System.assert(itemsBatchPostRequest2.equals(itemsBatchPostRequest1));
        System.assert(itemsBatchPostRequest3.equals(itemsBatchPostRequest4));
        System.assert(itemsBatchPostRequest4.equals(itemsBatchPostRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemsBatchPostRequest itemsBatchPostRequest1 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest2 = new OASItemsBatchPostRequest();

        System.assertEquals(false, itemsBatchPostRequest1.equals('foo'));
        System.assertEquals(false, itemsBatchPostRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemsBatchPostRequest itemsBatchPostRequest1 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest2 = new OASItemsBatchPostRequest();
        OASItemsBatchPostRequest itemsBatchPostRequest3;

        System.assertEquals(false, itemsBatchPostRequest1.equals(itemsBatchPostRequest3));
        System.assertEquals(false, itemsBatchPostRequest2.equals(itemsBatchPostRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemsBatchPostRequest itemsBatchPostRequest1 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest2 = new OASItemsBatchPostRequest();

        System.assertEquals(itemsBatchPostRequest1.hashCode(), itemsBatchPostRequest1.hashCode());
        System.assertEquals(itemsBatchPostRequest2.hashCode(), itemsBatchPostRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemsBatchPostRequest itemsBatchPostRequest1 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest2 = OASItemsBatchPostRequest.getExample();
        OASItemsBatchPostRequest itemsBatchPostRequest3 = new OASItemsBatchPostRequest();
        OASItemsBatchPostRequest itemsBatchPostRequest4 = new OASItemsBatchPostRequest();

        System.assert(itemsBatchPostRequest1.equals(itemsBatchPostRequest2));
        System.assert(itemsBatchPostRequest3.equals(itemsBatchPostRequest4));
        System.assertEquals(itemsBatchPostRequest1.hashCode(), itemsBatchPostRequest2.hashCode());
        System.assertEquals(itemsBatchPostRequest3.hashCode(), itemsBatchPostRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemsBatchPostRequest itemsBatchPostRequest = new OASItemsBatchPostRequest();
        Map<String, String> x-property-mappings = itemsBatchPostRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemsBatchPostRequest itemsBatchPostRequest = new OASItemsBatchPostRequest();
        System.assertEquals(new List<OASItemDeleteBatchRecord>(), itemsBatchPostRequest.items);
        System.assertEquals(null, itemsBatchPostRequest.catalogType);
        System.assertEquals(null, itemsBatchPostRequest.country);
        System.assertEquals(null, itemsBatchPostRequest.language);
        System.assertEquals(null, itemsBatchPostRequest.catalogId);
        System.assertEquals(null, itemsBatchPostRequest.operation);
    }
}
