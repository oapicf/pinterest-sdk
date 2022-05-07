//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for UserAccountApi
void main() {
  final instance = UserAccountApi();

  group('tests for UserAccountApi', () {
    // Get user account analytics
    //
    // Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
    //
    //Future<Map<String, AnalyticsMetricsResponse>> userAccountAnalytics(DateTime startDate, DateTime endDate, { String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField, String adAccountId }) async
    test('test userAccountAnalytics', () async {
      // TODO
    });

    // Get user account
    //
    // Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.
    //
    //Future<Account> userAccountGet({ String adAccountId }) async
    test('test userAccountGet', () async {
      // TODO
    });

  });
}
