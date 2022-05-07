//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for AdsAnalyticsCreateAsyncRequestAllOf
void main() {
  final instance = AdsAnalyticsCreateAsyncRequestAllOf();

  group('test AdsAnalyticsCreateAsyncRequestAllOf', () {
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
    // ConversionAttributionWindowDays clickWindowDays (default value: 30)
    test('to test the property `clickWindowDays`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    // ConversionAttributionWindowDays engagementWindowDays (default value: 30)
    test('to test the property `engagementWindowDays`', () async {
      // TODO
    });

    // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    // ConversionAttributionWindowDays viewWindowDays (default value: 1)
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


  });

}
