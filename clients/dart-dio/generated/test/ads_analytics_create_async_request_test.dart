import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdsAnalyticsCreateAsyncRequest
void main() {
  final instance = AdsAnalyticsCreateAsyncRequestBuilder();
  // TODO add properties to the builder and call build()

  group(AdsAnalyticsCreateAsyncRequest, () {
    // Metric report start date (UTC). Format: YYYY-MM-DD
    // String startDate
    test('to test the property `startDate`', () async {
      // TODO
    });

    // Metric report end date (UTC). Format: YYYY-MM-DD
    // String endDate
    test('to test the property `endDate`', () async {
      // TODO
    });

    // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
    // Granularity granularity
    test('to test the property `granularity`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    // ConversionAttributionWindowDays clickWindowDays (default value: ConversionAttributionWindowDays.number30)
    test('to test the property `clickWindowDays`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    // ConversionAttributionWindowDays engagementWindowDays (default value: ConversionAttributionWindowDays.number30)
    test('to test the property `engagementWindowDays`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    // ConversionAttributionWindowDays viewWindowDays (default value: ConversionAttributionWindowDays.number1)
    test('to test the property `viewWindowDays`', () async {
      // TODO
    });

    // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    // ConversionReportTimeType conversionReportTime (default value: 'TIME_OF_AD_ACTION')
    test('to test the property `conversionReportTime`', () async {
      // TODO
    });

    // List of types of attribution for the conversion report
    // BuiltList<ConversionReportAttributionType> attributionTypes
    test('to test the property `attributionTypes`', () async {
      // TODO
    });

    // List of campaign ids
    // BuiltList<String> campaignIds
    test('to test the property `campaignIds`', () async {
      // TODO
    });

    // List of status values for filtering
    // BuiltList<CampaignSummaryStatus> campaignStatuses
    test('to test the property `campaignStatuses`', () async {
      // TODO
    });

    // List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
    // BuiltList<ObjectiveType> campaignObjectiveTypes
    test('to test the property `campaignObjectiveTypes`', () async {
      // TODO
    });

    // List of ad group ids
    // BuiltList<String> adGroupIds
    test('to test the property `adGroupIds`', () async {
      // TODO
    });

    // List of values for filtering
    // BuiltList<AdGroupSummaryStatus> adGroupStatuses
    test('to test the property `adGroupStatuses`', () async {
      // TODO
    });

    // List of ad ids [This parameter is no supported for Product Item Level Reports]
    // BuiltList<String> adIds
    test('to test the property `adIds`', () async {
      // TODO
    });

    // List of values for filtering [This parameter is not supported for Product Item Level Reports]
    // BuiltList<PinPromotionSummaryStatus> adStatuses
    test('to test the property `adStatuses`', () async {
      // TODO
    });

    // List of product group ids
    // BuiltList<String> productGroupIds
    test('to test the property `productGroupIds`', () async {
      // TODO
    });

    // List of values for filtering
    // BuiltList<ProductGroupSummaryStatus> productGroupStatuses
    test('to test the property `productGroupStatuses`', () async {
      // TODO
    });

    // List of product item ids
    // BuiltList<String> productItemIds
    test('to test the property `productItemIds`', () async {
      // TODO
    });

    // List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    // BuiltList<AdsAnalyticsTargetingType> targetingTypes
    test('to test the property `targetingTypes`', () async {
      // TODO
    });

    // List of metrics filters
    // BuiltList<AdsAnalyticsMetricsFilter> metricsFilters
    test('to test the property `metricsFilters`', () async {
      // TODO
    });

    // Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
    // BuiltList<ReportingColumnAsync> columns
    test('to test the property `columns`', () async {
      // TODO
    });

    // Level of the report
    // MetricsReportingLevel level
    test('to test the property `level`', () async {
      // TODO
    });

    // Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
    // DataOutputFormat reportFormat (default value: 'JSON')
    test('to test the property `reportFormat`', () async {
      // TODO
    });

    // Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
    // String primarySort
    test('to test the property `primarySort`', () async {
      // TODO
    });

    // Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
    // int startHour
    test('to test the property `startHour`', () async {
      // TODO
    });

    // Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
    // int endHour
    test('to test the property `endHour`', () async {
      // TODO
    });

  });
}
