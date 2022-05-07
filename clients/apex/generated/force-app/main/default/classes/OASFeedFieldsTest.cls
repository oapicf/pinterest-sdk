@isTest
private class OASFeedFieldsTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedFields feedFields1 = OASFeedFields.getExample();
        OASFeedFields feedFields2 = feedFields1;
        OASFeedFields feedFields3 = new OASFeedFields();
        OASFeedFields feedFields4 = feedFields3;

        System.assert(feedFields1.equals(feedFields2));
        System.assert(feedFields2.equals(feedFields1));
        System.assert(feedFields1.equals(feedFields1));
        System.assert(feedFields3.equals(feedFields4));
        System.assert(feedFields4.equals(feedFields3));
        System.assert(feedFields3.equals(feedFields3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedFields feedFields1 = OASFeedFields.getExample();
        OASFeedFields feedFields2 = OASFeedFields.getExample();
        OASFeedFields feedFields3 = new OASFeedFields();
        OASFeedFields feedFields4 = new OASFeedFields();

        System.assert(feedFields1.equals(feedFields2));
        System.assert(feedFields2.equals(feedFields1));
        System.assert(feedFields3.equals(feedFields4));
        System.assert(feedFields4.equals(feedFields3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedFields feedFields1 = OASFeedFields.getExample();
        OASFeedFields feedFields2 = new OASFeedFields();

        System.assertEquals(false, feedFields1.equals('foo'));
        System.assertEquals(false, feedFields2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedFields feedFields1 = OASFeedFields.getExample();
        OASFeedFields feedFields2 = new OASFeedFields();
        OASFeedFields feedFields3;

        System.assertEquals(false, feedFields1.equals(feedFields3));
        System.assertEquals(false, feedFields2.equals(feedFields3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedFields feedFields1 = OASFeedFields.getExample();
        OASFeedFields feedFields2 = new OASFeedFields();

        System.assertEquals(feedFields1.hashCode(), feedFields1.hashCode());
        System.assertEquals(feedFields2.hashCode(), feedFields2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedFields feedFields1 = OASFeedFields.getExample();
        OASFeedFields feedFields2 = OASFeedFields.getExample();
        OASFeedFields feedFields3 = new OASFeedFields();
        OASFeedFields feedFields4 = new OASFeedFields();

        System.assert(feedFields1.equals(feedFields2));
        System.assert(feedFields3.equals(feedFields4));
        System.assertEquals(feedFields1.hashCode(), feedFields2.hashCode());
        System.assertEquals(feedFields3.hashCode(), feedFields4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFeedFields feedFields = new OASFeedFields();
        Map<String, String> x-property-mappings = feedFields.getx-property-mappings();
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
    }
}
