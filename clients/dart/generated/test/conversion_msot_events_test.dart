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

// tests for ConversionMSOTEvents
void main() {
  // final instance = ConversionMSOTEvents();

  group('test ConversionMSOTEvents', () {
    // Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
    // List<int> actionTimestamps (default value: const [])
    test('to test the property `actionTimestamps`', () async {
      // TODO
    });

    // The ID of the ad group that was attributed to the conversion event.
    // String adGroupId
    test('to test the property `adGroupId`', () async {
      // TODO
    });

    // The attribution model used to attribute the conversion event.
    // String attributionModel
    test('to test the property `attributionModel`', () async {
      // TODO
    });

    // Ad event type.
    // String attributionScope
    test('to test the property `attributionScope`', () async {
      // TODO
    });

    // Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
    // double attributionScore
    test('to test the property `attributionScore`', () async {
      // TODO
    });

    // The ID of the campaign that was attributed to the conversion event.
    // String campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Currency currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // Type of user event.
    // String eventName
    test('to test the property `eventName`', () async {
      // TODO
    });

    // The time when the event occurred. Unix timestamp in seconds.
    // int eventTimestamp
    test('to test the property `eventTimestamp`', () async {
      // TODO
    });

    // Total number of ad events including other non-Pinterest ad platforms.
    // int totalEventTouchpoints
    test('to test the property `totalEventTouchpoints`', () async {
      // TODO
    });

    // Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
    // int totalEvents
    test('to test the property `totalEvents`', () async {
      // TODO
    });

    // Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
    // double value
    test('to test the property `value`', () async {
      // TODO
    });


  });

}
