import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ResourcesApi
void main() {
  final instance = Openapi().getResourcesApi();

  group(ResourcesApi, () {
    // Get ad accounts countries
    //
    // Get Ad Accounts countries
    //
    //Future<AdAccountCountriesGet200Response> adAccountCountriesGet() async
    test('test adAccountCountriesGet', () async {
      // TODO
    });

    // Get available metrics' definitions
    //
    // Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
    //
    //Future<DeliveryMetricsGet200Response> deliveryMetricsGet({ ReportType reportType }) async
    test('test deliveryMetricsGet', () async {
      // TODO
    });

    // Get interest details
    //
    // Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
    //
    //Future<SingleInterestTargetingOption> interestTargetingOptionsGet(String interestId) async
    test('test interestTargetingOptionsGet', () async {
      // TODO
    });

    // Get lead form questions
    //
    // Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    //
    //Future leadFormQuestionsGet() async
    test('test leadFormQuestionsGet', () async {
      // TODO
    });

    // Get metrics ready state
    //
    // Learn whether conversion or non-conversion metrics are finalized and ready to query.
    //
    //Future<BookClosed> metricsReadyStateGet(String date) async
    test('test metricsReadyStateGet', () async {
      // TODO
    });

    // Get targeting options
    //
    //     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
    //
    //Future<BuiltList<JsonObject>> targetingOptionsGet(PublicTargetingType targetingType, { String adAccountId, String clientId, String oauthSignature, String timestamp }) async
    test('test targetingOptionsGet', () async {
      // TODO
    });

  });
}
