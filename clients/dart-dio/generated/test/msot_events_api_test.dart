import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MsotEventsApi
void main() {
  final instance = Openapi().getMsotEventsApi();

  group(MsotEventsApi, () {
    // Send Measurement Source Of Truth (MSOT) attributed conversion events
    //
    // <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
    //
    //Future msotEventsCreate(String adAccountId, ConversionMSOTEvents conversionMSOTEvents) async
    test('test msotEventsCreate', () async {
      // TODO
    });

  });
}
