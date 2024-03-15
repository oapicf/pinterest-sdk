@isTest
private class OASAudienceRuleTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceRule audienceRule1 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule2 = audienceRule1;
        OASAudienceRule audienceRule3 = new OASAudienceRule();
        OASAudienceRule audienceRule4 = audienceRule3;

        System.assert(audienceRule1.equals(audienceRule2));
        System.assert(audienceRule2.equals(audienceRule1));
        System.assert(audienceRule1.equals(audienceRule1));
        System.assert(audienceRule3.equals(audienceRule4));
        System.assert(audienceRule4.equals(audienceRule3));
        System.assert(audienceRule3.equals(audienceRule3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceRule audienceRule1 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule2 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule3 = new OASAudienceRule();
        OASAudienceRule audienceRule4 = new OASAudienceRule();

        System.assert(audienceRule1.equals(audienceRule2));
        System.assert(audienceRule2.equals(audienceRule1));
        System.assert(audienceRule3.equals(audienceRule4));
        System.assert(audienceRule4.equals(audienceRule3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceRule audienceRule1 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule2 = new OASAudienceRule();

        System.assertEquals(false, audienceRule1.equals('foo'));
        System.assertEquals(false, audienceRule2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceRule audienceRule1 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule2 = new OASAudienceRule();
        OASAudienceRule audienceRule3;

        System.assertEquals(false, audienceRule1.equals(audienceRule3));
        System.assertEquals(false, audienceRule2.equals(audienceRule3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceRule audienceRule1 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule2 = new OASAudienceRule();

        System.assertEquals(audienceRule1.hashCode(), audienceRule1.hashCode());
        System.assertEquals(audienceRule2.hashCode(), audienceRule2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceRule audienceRule1 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule2 = OASAudienceRule.getExample();
        OASAudienceRule audienceRule3 = new OASAudienceRule();
        OASAudienceRule audienceRule4 = new OASAudienceRule();

        System.assert(audienceRule1.equals(audienceRule2));
        System.assert(audienceRule3.equals(audienceRule4));
        System.assertEquals(audienceRule1.hashCode(), audienceRule2.hashCode());
        System.assertEquals(audienceRule3.hashCode(), audienceRule4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceRule audienceRule = new OASAudienceRule();
        Map<String, String> x-property-mappings = audienceRule.getx-property-mappings();
        System.assertEquals('customerListId', x-property-mappings.get('customer_list_id'));
        System.assertEquals('engagementDomain', x-property-mappings.get('engagement_domain'));
        System.assertEquals('engagementType', x-property-mappings.get('engagement_type'));
        System.assertEquals('eventData', x-property-mappings.get('event_data'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
        System.assertEquals('retentionDays', x-property-mappings.get('retention_days'));
        System.assertEquals('seedId', x-property-mappings.get('seed_id'));
        System.assertEquals('visitorSourceId', x-property-mappings.get('visitor_source_id'));
        System.assertEquals('eventSource', x-property-mappings.get('event_source'));
        System.assertEquals('ingestionSource', x-property-mappings.get('ingestion_source'));
        System.assertEquals('engagerType', x-property-mappings.get('engager_type'));
        System.assertEquals('campaignId', x-property-mappings.get('campaign_id'));
        System.assertEquals('adId', x-property-mappings.get('ad_id'));
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudienceRule audienceRule = new OASAudienceRule();
        System.assertEquals(new List<String>(), audienceRule.engagementDomain);
        System.assertEquals(new List<String>(), audienceRule.pinId);
        System.assertEquals(new List<String>(), audienceRule.seedId);
        System.assertEquals(new List<String>(), audienceRule.url);
        System.assertEquals(new List<String>(), audienceRule.campaignId);
        System.assertEquals(new List<String>(), audienceRule.adId);
        System.assertEquals(new List<OASObjectiveType>(), audienceRule.objectiveType);
        System.assertEquals(null, audienceRule.country);
        System.assertEquals(null, audienceRule.customerListId);
        System.assertEquals(null, audienceRule.engagementType);
        System.assertEquals(null, audienceRule.event);
        System.assertEquals(null, audienceRule.eventData);
        System.assertEquals(null, audienceRule.percentage);
        System.assertEquals(null, audienceRule.prefill);
        System.assertEquals(null, audienceRule.retentionDays);
        System.assertEquals(null, audienceRule.visitorSourceId);
        System.assertEquals(null, audienceRule.eventSource);
        System.assertEquals(null, audienceRule.ingestionSource);
        System.assertEquals(null, audienceRule.engagerType);
        System.assertEquals(null, audienceRule.adAccountId);
    }
}
