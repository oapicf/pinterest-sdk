@isTest
private class OASTemplateResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplateResponse templateResponse1 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse2 = templateResponse1;
        OASTemplateResponse templateResponse3 = new OASTemplateResponse();
        OASTemplateResponse templateResponse4 = templateResponse3;

        System.assert(templateResponse1.equals(templateResponse2));
        System.assert(templateResponse2.equals(templateResponse1));
        System.assert(templateResponse1.equals(templateResponse1));
        System.assert(templateResponse3.equals(templateResponse4));
        System.assert(templateResponse4.equals(templateResponse3));
        System.assert(templateResponse3.equals(templateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplateResponse templateResponse1 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse2 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse3 = new OASTemplateResponse();
        OASTemplateResponse templateResponse4 = new OASTemplateResponse();

        System.assert(templateResponse1.equals(templateResponse2));
        System.assert(templateResponse2.equals(templateResponse1));
        System.assert(templateResponse3.equals(templateResponse4));
        System.assert(templateResponse4.equals(templateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplateResponse templateResponse1 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse2 = new OASTemplateResponse();

        System.assertEquals(false, templateResponse1.equals('foo'));
        System.assertEquals(false, templateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplateResponse templateResponse1 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse2 = new OASTemplateResponse();
        OASTemplateResponse templateResponse3;

        System.assertEquals(false, templateResponse1.equals(templateResponse3));
        System.assertEquals(false, templateResponse2.equals(templateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplateResponse templateResponse1 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse2 = new OASTemplateResponse();

        System.assertEquals(templateResponse1.hashCode(), templateResponse1.hashCode());
        System.assertEquals(templateResponse2.hashCode(), templateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplateResponse templateResponse1 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse2 = OASTemplateResponse.getExample();
        OASTemplateResponse templateResponse3 = new OASTemplateResponse();
        OASTemplateResponse templateResponse4 = new OASTemplateResponse();

        System.assert(templateResponse1.equals(templateResponse2));
        System.assert(templateResponse3.equals(templateResponse4));
        System.assertEquals(templateResponse1.hashCode(), templateResponse2.hashCode());
        System.assertEquals(templateResponse3.hashCode(), templateResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTemplateResponse templateResponse = new OASTemplateResponse();
        Map<String, String> x-property-mappings = templateResponse.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('adAccountIds', x-property-mappings.get('ad_account_ids'));
        System.assertEquals('userId', x-property-mappings.get('user_id'));
        System.assertEquals('reportStartRelativeDaysInPast', x-property-mappings.get('report_start_relative_days_in_past'));
        System.assertEquals('reportEndRelativeDaysInPast', x-property-mappings.get('report_end_relative_days_in_past'));
        System.assertEquals('dateRange', x-property-mappings.get('date_range'));
        System.assertEquals('reportLevel', x-property-mappings.get('report_level'));
        System.assertEquals('reportFormat', x-property-mappings.get('report_format'));
        System.assertEquals('viewWindowDays', x-property-mappings.get('view_window_days'));
        System.assertEquals('clickWindowDays', x-property-mappings.get('click_window_days'));
        System.assertEquals('engagementWindowDays', x-property-mappings.get('engagement_window_days'));
        System.assertEquals('conversionReportTimeType', x-property-mappings.get('conversion_report_time_type'));
        System.assertEquals('filtersJson', x-property-mappings.get('filters_json'));
        System.assertEquals('isOwnedByUser', x-property-mappings.get('is_owned_by_user'));
        System.assertEquals('isScheduled', x-property-mappings.get('is_scheduled'));
        System.assertEquals('creationSource', x-property-mappings.get('creation_source'));
        System.assertEquals('isDeleted', x-property-mappings.get('is_deleted'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('customColumnIds', x-property-mappings.get('custom_column_ids'));
        System.assertEquals('ingestionSources', x-property-mappings.get('ingestion_sources'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTemplateResponse templateResponse = new OASTemplateResponse();
        System.assertEquals(new List<String>(), templateResponse.adAccountIds);
        System.assertEquals(new List<String>(), templateResponse.columns);
        System.assertEquals(new List<String>(), templateResponse.customColumnIds);
        System.assertEquals(new List<String>(), templateResponse.ingestionSources);
        System.assertEquals(null, templateResponse.id);
        System.assertEquals(null, templateResponse.adAccountId);
        System.assertEquals(null, templateResponse.userId);
        System.assertEquals(null, templateResponse.name);
        System.assertEquals(null, templateResponse.reportStartRelativeDaysInPast);
        System.assertEquals(null, templateResponse.reportEndRelativeDaysInPast);
        System.assertEquals(null, templateResponse.dateRange);
        System.assertEquals(null, templateResponse.reportLevel);
        System.assertEquals(null, templateResponse.reportFormat);
        System.assertEquals(null, templateResponse.granularity);
        System.assertEquals(null, templateResponse.viewWindowDays);
        System.assertEquals(null, templateResponse.clickWindowDays);
        System.assertEquals(null, templateResponse.engagementWindowDays);
        System.assertEquals(null, templateResponse.conversionReportTimeType);
        System.assertEquals(null, templateResponse.filtersJson);
        System.assertEquals(null, templateResponse.isOwnedByUser);
        System.assertEquals(null, templateResponse.isScheduled);
        System.assertEquals(null, templateResponse.creationSource);
        System.assertEquals(null, templateResponse.isDeleted);
        System.assertEquals(null, templateResponse.updatedTime);
        System.assertEquals(null, templateResponse.type);
    }
}
