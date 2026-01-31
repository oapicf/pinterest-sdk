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

// tests for ConversionProductReportRequest
void main() {
  // final instance = ConversionProductReportRequest();

  group('test ConversionProductReportRequest', () {
    // List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
    // List<String> adGroupIds (default value: const [])
    test('to test the property `adGroupIds`', () async {
      // TODO
    });

    // List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
    // List<String> campaignIds (default value: const [])
    test('to test the property `campaignIds`', () async {
      // TODO
    });

    // List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
    // List<ObjectiveType> campaignObjectiveTypes (default value: const [])
    test('to test the property `campaignObjectiveTypes`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    // ConversionAttributionWindowDays clickWindowDays (default value: ConversionAttributionWindowDays.number30)
    test('to test the property `clickWindowDays`', () async {
      // TODO
    });

    // Metric and entity columns
    // List<ConversionProductReportingColumn> columns (default value: const [])
    test('to test the property `columns`', () async {
      // TODO
    });

    // String conversionProductAttributionType
    test('to test the property `conversionProductAttributionType`', () async {
      // TODO
    });

    // String conversionProductBreakdown
    test('to test the property `conversionProductBreakdown`', () async {
      // TODO
    });

    // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    // ConversionReportTimeType conversionReportTime (default value: 'TIME_OF_AD_ACTION')
    test('to test the property `conversionReportTime`', () async {
      // TODO
    });

    // Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
    // String endDate
    test('to test the property `endDate`', () async {
      // TODO
    });

    // TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
    // String granularity
    test('to test the property `granularity`', () async {
      // TODO
    });

    // Level of the report
    // String level
    test('to test the property `level`', () async {
      // TODO
    });

    // List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
    // List<String> productSkuIds (default value: const [])
    test('to test the property `productSkuIds`', () async {
      // TODO
    });

    // Name of the conversion product report.
    // String reportName
    test('to test the property `reportName`', () async {
      // TODO
    });

    // Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
    // String startDate
    test('to test the property `startDate`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
    // ConversionAttributionWindowDays viewWindowDays (default value: ConversionAttributionWindowDays.number30)
    test('to test the property `viewWindowDays`', () async {
      // TODO
    });


  });

}
