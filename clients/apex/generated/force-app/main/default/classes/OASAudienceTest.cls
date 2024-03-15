@isTest
private class OASAudienceTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudience audience1 = OASAudience.getExample();
        OASAudience audience2 = audience1;
        OASAudience audience3 = new OASAudience();
        OASAudience audience4 = audience3;

        System.assert(audience1.equals(audience2));
        System.assert(audience2.equals(audience1));
        System.assert(audience1.equals(audience1));
        System.assert(audience3.equals(audience4));
        System.assert(audience4.equals(audience3));
        System.assert(audience3.equals(audience3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudience audience1 = OASAudience.getExample();
        OASAudience audience2 = OASAudience.getExample();
        OASAudience audience3 = new OASAudience();
        OASAudience audience4 = new OASAudience();

        System.assert(audience1.equals(audience2));
        System.assert(audience2.equals(audience1));
        System.assert(audience3.equals(audience4));
        System.assert(audience4.equals(audience3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudience audience1 = OASAudience.getExample();
        OASAudience audience2 = new OASAudience();

        System.assertEquals(false, audience1.equals('foo'));
        System.assertEquals(false, audience2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudience audience1 = OASAudience.getExample();
        OASAudience audience2 = new OASAudience();
        OASAudience audience3;

        System.assertEquals(false, audience1.equals(audience3));
        System.assertEquals(false, audience2.equals(audience3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudience audience1 = OASAudience.getExample();
        OASAudience audience2 = new OASAudience();

        System.assertEquals(audience1.hashCode(), audience1.hashCode());
        System.assertEquals(audience2.hashCode(), audience2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudience audience1 = OASAudience.getExample();
        OASAudience audience2 = OASAudience.getExample();
        OASAudience audience3 = new OASAudience();
        OASAudience audience4 = new OASAudience();

        System.assert(audience1.equals(audience2));
        System.assert(audience3.equals(audience4));
        System.assertEquals(audience1.hashCode(), audience2.hashCode());
        System.assertEquals(audience3.hashCode(), audience4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudience audience = new OASAudience();
        Map<String, String> x-property-mappings = audience.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('audienceType', x-property-mappings.get('audience_type'));
        System.assertEquals('createdTimestamp', x-property-mappings.get('created_timestamp'));
        System.assertEquals('updatedTimestamp', x-property-mappings.get('updated_timestamp'));
    }
}
