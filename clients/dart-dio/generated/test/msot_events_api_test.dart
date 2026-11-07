import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MsotEventsApi
void main() {
  final instance = Openapi().getMsotEventsApi();

  group(MsotEventsApi, () {
    // Send Measurement Source Of Truth (MSOT) attributed conversion events
    //
    // **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
    //
    //Future msotEventsCreate(String adAccountId, ConversionMSOTEventsCreate conversionMSOTEventsCreate) async
    test('test msotEventsCreate', () async {
      // TODO
    });

  });
}
