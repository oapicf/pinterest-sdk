import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for UserAccountApi
void main() {
  final instance = Openapi().getUserAccountApi();

  group(UserAccountApi, () {
    // List following boards
    //
    // Get a list of the boards a user follows. The request returns a board summary object array.
    //
    //Future<BoardsList200Response> boardsUserFollowsList({ String adAccountId, bool explicitFollowing, String bookmark, int pageSize }) async
    test('test boardsUserFollowsList', () async {
      // TODO
    });

    // Follow user
    //
    // **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
    //
    //Future<FollowUser> followUserUpdate(String username, FollowUserCreate followUserCreate) async
    test('test followUserUpdate', () async {
      // TODO
    });

    // List followers
    //
    // Get a list of your followers.
    //
    //Future<FollowersList200Response> followersList({ String bookmark, int pageSize }) async
    test('test followersList', () async {
      // TODO
    });

    // List linked businesses
    //
    // Get a list of your linked business accounts.
    //
    //Future<BuiltList<LinkedBusiness>> linkedBusinessAccountsGet() async
    test('test linkedBusinessAccountsGet', () async {
      // TODO
    });

    // Unverify website
    //
    // Unverify a website verified by the signed-in user.
    //
    //Future<UserWebsite> unverifyWebsiteDelete(String website) async
    test('test unverifyWebsiteDelete', () async {
      // TODO
    });

    // Get user account analytics
    //
    // Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    //
    //Future<BuiltMap<String, AnalyticsMetricsResponse>> userAccountAnalytics(Date startDate, Date endDate, { String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source_, BuiltList<QuerymetrictypesItems> metricTypes, String splitField, String adAccountId }) async
    test('test userAccountAnalytics', () async {
      // TODO
    });

    // Get user account top pins analytics
    //
    // Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    //
    //Future<TopPinsAnalyticsResponse> userAccountAnalyticsTopPins(Date startDate, Date endDate, TopPinsSortBy sortBy, { String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source_, BuiltList<QuerymetrictypesItems> metricTypes, int numOfPins, num createdInLastNDays, String adAccountId }) async
    test('test userAccountAnalyticsTopPins', () async {
      // TODO
    });

    // Get user account top video pins analytics
    //
    // Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    //
    //Future<TopVideoPinsAnalyticsResponse> userAccountAnalyticsTopVideoPins(Date startDate, Date endDate, TopVideoPinsSortBy sortBy, { String fromClaimedContent, String pinFormat, String appTypes, String contentType, String source_, BuiltList<QueryvideopinmetrictypesItems> metricTypes, int numOfPins, num createdInLastNDays, String adAccountId }) async
    test('test userAccountAnalyticsTopVideoPins', () async {
      // TODO
    });

    // List following interests
    //
    // Get a list of a user's following interests in one place.
    //
    //Future<UserAccountFollowedInterests200Response> userAccountFollowedInterests(String username, { String bookmark, int pageSize }) async
    test('test userAccountFollowedInterests', () async {
      // TODO
    });

    // Get user account
    //
    // Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.
    //
    //Future<Account> userAccountGet({ String adAccountId }) async
    test('test userAccountGet', () async {
      // TODO
    });

    // List following
    //
    // Get a list of who a certain user follows.
    //
    //Future<FollowersList200Response> userFollowingGet({ String adAccountId, bool explicitFollowing, UserFollowingFeedType feedType, String bookmark, int pageSize }) async
    test('test userFollowingGet', () async {
      // TODO
    });

    // Get user websites
    //
    // Get user websites, claimed or not
    //
    //Future<UserWebsitesGet200Response> userWebsitesGet({ String bookmark, int pageSize }) async
    test('test userWebsitesGet', () async {
      // TODO
    });

    // Verify website
    //
    // Verify a website as a signed-in user.
    //
    //Future<UserWebsite> verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate, { String adAccountId }) async
    test('test verifyWebsiteUpdate', () async {
      // TODO
    });

    // Get user verification code for website claiming
    //
    // Get verification code for user to install on the website to claim it.
    //
    //Future<UserWebsiteVerification> websiteVerificationGet({ String adAccountId }) async
    test('test websiteVerificationGet', () async {
      // TODO
    });

  });
}
