//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for AdsAnalyticsCreateAsyncRequest
void main() {
  // final instance = AdsAnalyticsCreateAsyncRequest();

  group('test AdsAnalyticsCreateAsyncRequest', () {
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
    // List<ConversionReportAttributionType> attributionTypes (default value: const [])
    test('to test the property `attributionTypes`', () async {
      // TODO
    });

    // List of campaign ids
    // List<String> campaignIds (default value: const [])
    test('to test the property `campaignIds`', () async {
      // TODO
    });

    // List of status values for filtering
    // List<CampaignSummaryStatus> campaignStatuses (default value: const [])
    test('to test the property `campaignStatuses`', () async {
      // TODO
    });

    // List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
    // List<ObjectiveType> campaignObjectiveTypes (default value: const [])
    test('to test the property `campaignObjectiveTypes`', () async {
      // TODO
    });

    // List of ad group ids
    // List<String> adGroupIds (default value: const [])
    test('to test the property `adGroupIds`', () async {
      // TODO
    });

    // List of values for filtering
    // List<AdGroupSummaryStatus> adGroupStatuses (default value: const [])
    test('to test the property `adGroupStatuses`', () async {
      // TODO
    });

    // List of ad ids [This parameter is no supported for Product Item Level Reports]
    // List<String> adIds (default value: const [])
    test('to test the property `adIds`', () async {
      // TODO
    });

    // List of values for filtering [This parameter is not supported for Product Item Level Reports]
    // List<PinPromotionSummaryStatus> adStatuses (default value: const [])
    test('to test the property `adStatuses`', () async {
      // TODO
    });

    // List of product group ids
    // List<String> productGroupIds (default value: const [])
    test('to test the property `productGroupIds`', () async {
      // TODO
    });

    // List of values for filtering
    // List<ProductGroupSummaryStatus> productGroupStatuses (default value: const [])
    test('to test the property `productGroupStatuses`', () async {
      // TODO
    });

    // List of product item ids
    // List<String> productItemIds (default value: const [])
    test('to test the property `productItemIds`', () async {
      // TODO
    });

    // List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
    // List<AdsAnalyticsTargetingType> targetingTypes (default value: const [])
    test('to test the property `targetingTypes`', () async {
      // TODO
    });

    // List of metrics filters
    // List<AdsAnalyticsMetricsFilter> metricsFilters (default value: const [])
    test('to test the property `metricsFilters`', () async {
      // TODO
    });

    // Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
    // List<ReportingColumnAsync> columns (default value: const [])
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


  });

}
