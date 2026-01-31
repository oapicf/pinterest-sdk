import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TargetingTypeFilter
void main() {
  final instance = TargetingTypeFilterBuilder();
  // TODO add properties to the builder and call build()

  group(TargetingTypeFilter, () {
    // List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    // BuiltList<String> targetingTypes
    test('to test the property `targetingTypes`', () async {
      // TODO
    });

  });
}
