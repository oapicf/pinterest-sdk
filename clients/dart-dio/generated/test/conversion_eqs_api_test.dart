import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ConversionEqsApi
void main() {
  final instance = Openapi().getConversionEqsApi();

  group(ConversionEqsApi, () {
    // Get event quality score (EQS)
    //
    // Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
    //
    //Future<BuiltList<EventQualityScore>> conversionEqsList(LookbackPeriodOptions lookbackPeriod, String adAccountId, { SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource }) async
    test('test conversionEqsList', () async {
      // TODO
    });

  });
}
