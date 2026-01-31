import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for OptimizationGoalMetadataConversionTagV3GoalMetadata
void main() {
  final instance = OptimizationGoalMetadataConversionTagV3GoalMetadataBuilder();
  // TODO add properties to the builder and call build()

  group(OptimizationGoalMetadataConversionTagV3GoalMetadata, () {
    // OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows
    test('to test the property `attributionWindows`', () async {
      // TODO
    });

    // String conversionEvent
    test('to test the property `conversionEvent`', () async {
      // TODO
    });

    // String conversionTagId
    test('to test the property `conversionTagId`', () async {
      // TODO
    });

    // String cpaGoalValueInMicroCurrency
    test('to test the property `cpaGoalValueInMicroCurrency`', () async {
      // TODO
    });

    // Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
    // bool isRoasOptimized
    test('to test the property `isRoasOptimized`', () async {
      // TODO
    });

    // Conversion learning model type
    // String learningModeType
    test('to test the property `learningModeType`', () async {
      // TODO
    });

    // Event name for custom or standard events mapped to an oCPM model
    // String reportingEvent
    test('to test the property `reportingEvent`', () async {
      // TODO
    });

  });
}
