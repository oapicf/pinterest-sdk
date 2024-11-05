import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdGroupAudienceSizingResponse
void main() {
  final instance = AdGroupAudienceSizingResponseBuilder();
  // TODO add properties to the builder and call build()

  group(AdGroupAudienceSizingResponse, () {
    // The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    // num audienceSizeLowerBound
    test('to test the property `audienceSizeLowerBound`', () async {
      // TODO
    });

    // The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    // num audienceSizeUpperBound
    test('to test the property `audienceSizeUpperBound`', () async {
      // TODO
    });

  });
}
