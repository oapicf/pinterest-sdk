import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PinsApi
void main() {
  final instance = Openapi().getPinsApi();

  group(PinsApi, () {
    // Get multiple Pin analytics
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    //
    //Future<BuiltMap<String, BuiltMap<String, PinAnalyticsMetricsResponse>>> multiPinsAnalytics(BuiltList<String> pinIds, Date startDate, Date endDate, BuiltList<PinsAnalyticsMetricTypesParameterInner> metricTypes, { String appTypes, String adAccountId }) async
    test('test multiPinsAnalytics', () async {
      // TODO
    });

    // Get Pin analytics
    //
    // Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    //
    //Future<BuiltMap<String, PinAnalyticsMetricsResponse>> pinsAnalytics(String pinId, Date startDate, Date endDate, BuiltList<PinsAnalyticsMetricTypesParameterInner> metricTypes, { String appTypes, String splitField, String adAccountId }) async
    test('test pinsAnalytics', () async {
      // TODO
    });

    // Create Pin
    //
    // Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/web-features/add-ons-overview/'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/api-features/content-overview/'>Content App Solutions Guide</a>.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.
    //
    //Future<Pin> pinsCreate(PinCreate pinCreate, { String adAccountId }) async
    test('test pinsCreate', () async {
      // TODO
    });

    // Delete Pin
    //
    // Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
    //
    //Future pinsDelete(String pinId, { String adAccountId }) async
    test('test pinsDelete', () async {
      // TODO
    });

    // Get Pin
    //
    // Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
    //
    //Future<Pin> pinsGet(String pinId, { bool pinMetrics, String adAccountId }) async
    test('test pinsGet', () async {
      // TODO
    });

    // List Pins
    //
    // Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href='/docs/api/v5/#operation/boards/list_pins'>GET List Pins on Board</a>.
    //
    //Future<PinsList200Response> pinsList({ String bookmark, int pageSize, String pinFilter, bool includeProtectedPins, String pinType, BuiltList<String> creativeTypes, String adAccountId, bool pinMetrics }) async
    test('test pinsList', () async {
      // TODO
    });

    // Save Pin
    //
    // Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
    //
    //Future<Pin> pinsSave(String pinId, PinsSaveRequest pinsSaveRequest, { String adAccountId }) async
    test('test pinsSave', () async {
      // TODO
    });

    // Update Pin
    //
    // Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
    //
    //Future<Pin> pinsUpdate(String pinId, PinUpdate pinUpdate, { String adAccountId }) async
    test('test pinsUpdate', () async {
      // TODO
    });

  });
}
