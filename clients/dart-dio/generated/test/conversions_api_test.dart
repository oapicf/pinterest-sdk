import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ConversionsApi
void main() {
  final instance = Openapi().getConversionsApi();

  group(ConversionsApi, () {
    // Get advertiser defined events
    //
    // <p>Get advertiser defined events for the given ad account.</p>
    //
    //Future<AdvertiserDefinedEventsResponse> advertiserDefinedEventsGet(String adAccountId) async
    test('test advertiserDefinedEventsGet', () async {
      // TODO
    });

  });
}
