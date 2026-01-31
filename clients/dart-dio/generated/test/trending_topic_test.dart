import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TrendingTopic
void main() {
  final instance = TrendingTopicBuilder();
  // TODO add properties to the builder and call build()

  group(TrendingTopic, () {
    // Description of the trending topic
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // Month-over-month growth percentage
    // int percentGrowthMom
    test('to test the property `percentGrowthMom`', () async {
      // TODO
    });

    // Array of pin images related to this trend (up to 6)
    // BuiltList<TrendingPin> pins
    test('to test the property `pins`', () async {
      // TODO
    });

    // List of related interest categories
    // BuiltList<String> relatedInterests
    test('to test the property `relatedInterests`', () async {
      // TODO
    });

    // List of related search terms
    // BuiltList<String> relatedSearches
    test('to test the property `relatedSearches`', () async {
      // TODO
    });

    // Time series data showing trend values over time, with dates as keys and values as numeric
    // BuiltMap<String, num> timeSeries
    test('to test the property `timeSeries`', () async {
      // TODO
    });

    // Title of the trending topic
    // String title
    test('to test the property `title`', () async {
      // TODO
    });

  });
}
