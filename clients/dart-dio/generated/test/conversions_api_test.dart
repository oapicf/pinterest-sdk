import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ConversionsApi
void main() {
  final instance = Openapi().getConversionsApi();

  group(ConversionsApi, () {
    // Create advertiser defined events
    //
    // Map advertiser defined events to standard events for the given ad account.
    //
    //Future<AdvertiserDefinedEventsCreate200Response> advertiserDefinedEventsCreate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) async
    test('test advertiserDefinedEventsCreate', () async {
      // TODO
    });

    // Delete advertiser defined events
    //
    // Untrack advertiser defined events for the given ad account.
    //
    //Future<AdvertiserDefinedEventsCreate200Response> advertiserDefinedEventsDelete(String adAccountId, BuiltList<String> eventNames) async
    test('test advertiserDefinedEventsDelete', () async {
      // TODO
    });

    // Get advertiser defined events
    //
    // Get advertiser defined events for the given ad account.
    //
    //Future<AdvertiserDefinedEventsGet200Response> advertiserDefinedEventsGet(String adAccountId) async
    test('test advertiserDefinedEventsGet', () async {
      // TODO
    });

    // Update advertiser defined events
    //
    // Update advertiser defined event names or mappings for the given ad account.
    //
    //Future<AdvertiserDefinedEventsCreate200Response> advertiserDefinedEventsUpdate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) async
    test('test advertiserDefinedEventsUpdate', () async {
      // TODO
    });

  });
}
