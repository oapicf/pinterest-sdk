//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class UserAccountApi {
  UserAccountApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// List following boards
  ///
  /// Get a list of the boards a user follows. The request returns a board summary object array.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardsUserFollowsListWithHttpInfo({ String? bookmark, int? pageSize, bool? explicitFollowing, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/following/boards';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (explicitFollowing != null) {
      queryParams.addAll(_queryParams('', 'explicit_following', explicitFollowing));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// List following boards
  ///
  /// Get a list of the boards a user follows. The request returns a board summary object array.
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<BoardsUserFollowsList200Response?> boardsUserFollowsList({ String? bookmark, int? pageSize, bool? explicitFollowing, String? adAccountId, }) async {
    final response = await boardsUserFollowsListWithHttpInfo( bookmark: bookmark, pageSize: pageSize, explicitFollowing: explicitFollowing, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardsUserFollowsList200Response',) as BoardsUserFollowsList200Response;
    
    }
    return null;
  }

  /// Follow user
  ///
  /// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] username (required):
  ///   A valid username
  ///
  /// * [FollowUserRequest] followUserRequest (required):
  ///   Follow a user.
  Future<Response> followUserUpdateWithHttpInfo(String username, FollowUserRequest followUserRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/following/{username}'
      .replaceAll('{username}', username);

    // ignore: prefer_final_locals
    Object? postBody = followUserRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Follow user
  ///
  /// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
  ///
  /// Parameters:
  ///
  /// * [String] username (required):
  ///   A valid username
  ///
  /// * [FollowUserRequest] followUserRequest (required):
  ///   Follow a user.
  Future<UserSummary?> followUserUpdate(String username, FollowUserRequest followUserRequest,) async {
    final response = await followUserUpdateWithHttpInfo(username, followUserRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserSummary',) as UserSummary;
    
    }
    return null;
  }

  /// List followers
  ///
  /// Get a list of your followers.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> followersListWithHttpInfo({ String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/followers';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// List followers
  ///
  /// Get a list of your followers.
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<FollowersList200Response?> followersList({ String? bookmark, int? pageSize, }) async {
    final response = await followersListWithHttpInfo( bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'FollowersList200Response',) as FollowersList200Response;
    
    }
    return null;
  }

  /// List linked businesses
  ///
  /// Get a list of your linked business accounts.
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> linkedBusinessAccountsGetWithHttpInfo() async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/businesses';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// List linked businesses
  ///
  /// Get a list of your linked business accounts.
  Future<List<LinkedBusiness>?> linkedBusinessAccountsGet() async {
    final response = await linkedBusinessAccountsGetWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<LinkedBusiness>') as List)
        .cast<LinkedBusiness>()
        .toList(growable: false);

    }
    return null;
  }

  /// Unverify website
  ///
  /// Unverifu a website verified by the signed-in user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] website (required):
  ///   Website with path or domain only
  Future<Response> unverifyWebsiteDeleteWithHttpInfo(String website,) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/websites';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'website', website));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Unverify website
  ///
  /// Unverifu a website verified by the signed-in user.
  ///
  /// Parameters:
  ///
  /// * [String] website (required):
  ///   Website with path or domain only
  Future<void> unverifyWebsiteDelete(String website,) async {
    final response = await unverifyWebsiteDeleteWithHttpInfo(website,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get user account analytics
  ///
  /// Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [String] fromClaimedContent:
  ///   Filter on Pins that match your claimed domain.
  ///
  /// * [String] pinFormat:
  ///   Pin formats to get data for, default is all.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] contentType:
  ///   Filter to paid or organic data. Default is all.
  ///
  /// * [String] source_:
  ///   Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  ///
  /// * [List<String>] metricTypes:
  ///   Metric types to get data for, default is all. 
  ///
  /// * [String] splitField:
  ///   How to split the data into groups. Not including this param means data won't be split.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountAnalyticsWithHttpInfo(DateTime startDate, DateTime endDate, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<String>? metricTypes, String? splitField, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/analytics';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
    if (fromClaimedContent != null) {
      queryParams.addAll(_queryParams('', 'from_claimed_content', fromClaimedContent));
    }
    if (pinFormat != null) {
      queryParams.addAll(_queryParams('', 'pin_format', pinFormat));
    }
    if (appTypes != null) {
      queryParams.addAll(_queryParams('', 'app_types', appTypes));
    }
    if (contentType != null) {
      queryParams.addAll(_queryParams('', 'content_type', contentType));
    }
    if (source_ != null) {
      queryParams.addAll(_queryParams('', 'source', source_));
    }
    if (metricTypes != null) {
      queryParams.addAll(_queryParams('csv', 'metric_types', metricTypes));
    }
    if (splitField != null) {
      queryParams.addAll(_queryParams('', 'split_field', splitField));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get user account analytics
  ///
  /// Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [String] fromClaimedContent:
  ///   Filter on Pins that match your claimed domain.
  ///
  /// * [String] pinFormat:
  ///   Pin formats to get data for, default is all.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] contentType:
  ///   Filter to paid or organic data. Default is all.
  ///
  /// * [String] source_:
  ///   Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  ///
  /// * [List<String>] metricTypes:
  ///   Metric types to get data for, default is all. 
  ///
  /// * [String] splitField:
  ///   How to split the data into groups. Not including this param means data won't be split.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Map<String, AnalyticsMetricsResponse>?> userAccountAnalytics(DateTime startDate, DateTime endDate, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<String>? metricTypes, String? splitField, String? adAccountId, }) async {
    final response = await userAccountAnalyticsWithHttpInfo(startDate, endDate,  fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source_: source_, metricTypes: metricTypes, splitField: splitField, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return Map<String, AnalyticsMetricsResponse>.from(await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Map<String, AnalyticsMetricsResponse>'),);

    }
    return null;
  }

  /// Get user account top pins analytics
  ///
  /// Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [String] sortBy (required):
  ///   Specify sorting order for metrics
  ///
  /// * [String] fromClaimedContent:
  ///   Filter on Pins that match your claimed domain.
  ///
  /// * [String] pinFormat:
  ///   Pin formats to get data for, default is all.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] contentType:
  ///   Filter to paid or organic data. Default is all.
  ///
  /// * [String] source_:
  ///   Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  ///
  /// * [List<String>] metricTypes:
  ///   Metric types to get data for, default is all. 
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [int] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountAnalyticsTopPinsWithHttpInfo(DateTime startDate, DateTime endDate, String sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<String>? metricTypes, int? numOfPins, int? createdInLastNDays, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/analytics/top_pins';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
      queryParams.addAll(_queryParams('', 'sort_by', sortBy));
    if (fromClaimedContent != null) {
      queryParams.addAll(_queryParams('', 'from_claimed_content', fromClaimedContent));
    }
    if (pinFormat != null) {
      queryParams.addAll(_queryParams('', 'pin_format', pinFormat));
    }
    if (appTypes != null) {
      queryParams.addAll(_queryParams('', 'app_types', appTypes));
    }
    if (contentType != null) {
      queryParams.addAll(_queryParams('', 'content_type', contentType));
    }
    if (source_ != null) {
      queryParams.addAll(_queryParams('', 'source', source_));
    }
    if (metricTypes != null) {
      queryParams.addAll(_queryParams('csv', 'metric_types', metricTypes));
    }
    if (numOfPins != null) {
      queryParams.addAll(_queryParams('', 'num_of_pins', numOfPins));
    }
    if (createdInLastNDays != null) {
      queryParams.addAll(_queryParams('', 'created_in_last_n_days', createdInLastNDays));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get user account top pins analytics
  ///
  /// Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [String] sortBy (required):
  ///   Specify sorting order for metrics
  ///
  /// * [String] fromClaimedContent:
  ///   Filter on Pins that match your claimed domain.
  ///
  /// * [String] pinFormat:
  ///   Pin formats to get data for, default is all.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] contentType:
  ///   Filter to paid or organic data. Default is all.
  ///
  /// * [String] source_:
  ///   Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  ///
  /// * [List<String>] metricTypes:
  ///   Metric types to get data for, default is all. 
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [int] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<TopPinsAnalyticsResponse?> userAccountAnalyticsTopPins(DateTime startDate, DateTime endDate, String sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<String>? metricTypes, int? numOfPins, int? createdInLastNDays, String? adAccountId, }) async {
    final response = await userAccountAnalyticsTopPinsWithHttpInfo(startDate, endDate, sortBy,  fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source_: source_, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TopPinsAnalyticsResponse',) as TopPinsAnalyticsResponse;
    
    }
    return null;
  }

  /// Get user account top video pins analytics
  ///
  /// Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [String] sortBy (required):
  ///   Specify sorting order for video metrics
  ///
  /// * [String] fromClaimedContent:
  ///   Filter on Pins that match your claimed domain.
  ///
  /// * [String] pinFormat:
  ///   Pin formats to get data for, default is all.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] contentType:
  ///   Filter to paid or organic data. Default is all.
  ///
  /// * [String] source_:
  ///   Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  ///
  /// * [List<String>] metricTypes:
  ///   Metric types to get video data for, default is all. 
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [int] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountAnalyticsTopVideoPinsWithHttpInfo(DateTime startDate, DateTime endDate, String sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<String>? metricTypes, int? numOfPins, int? createdInLastNDays, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/analytics/top_video_pins';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
      queryParams.addAll(_queryParams('', 'sort_by', sortBy));
    if (fromClaimedContent != null) {
      queryParams.addAll(_queryParams('', 'from_claimed_content', fromClaimedContent));
    }
    if (pinFormat != null) {
      queryParams.addAll(_queryParams('', 'pin_format', pinFormat));
    }
    if (appTypes != null) {
      queryParams.addAll(_queryParams('', 'app_types', appTypes));
    }
    if (contentType != null) {
      queryParams.addAll(_queryParams('', 'content_type', contentType));
    }
    if (source_ != null) {
      queryParams.addAll(_queryParams('', 'source', source_));
    }
    if (metricTypes != null) {
      queryParams.addAll(_queryParams('csv', 'metric_types', metricTypes));
    }
    if (numOfPins != null) {
      queryParams.addAll(_queryParams('', 'num_of_pins', numOfPins));
    }
    if (createdInLastNDays != null) {
      queryParams.addAll(_queryParams('', 'created_in_last_n_days', createdInLastNDays));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get user account top video pins analytics
  ///
  /// Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [String] sortBy (required):
  ///   Specify sorting order for video metrics
  ///
  /// * [String] fromClaimedContent:
  ///   Filter on Pins that match your claimed domain.
  ///
  /// * [String] pinFormat:
  ///   Pin formats to get data for, default is all.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] contentType:
  ///   Filter to paid or organic data. Default is all.
  ///
  /// * [String] source_:
  ///   Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
  ///
  /// * [List<String>] metricTypes:
  ///   Metric types to get video data for, default is all. 
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [int] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<TopVideoPinsAnalyticsResponse?> userAccountAnalyticsTopVideoPins(DateTime startDate, DateTime endDate, String sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<String>? metricTypes, int? numOfPins, int? createdInLastNDays, String? adAccountId, }) async {
    final response = await userAccountAnalyticsTopVideoPinsWithHttpInfo(startDate, endDate, sortBy,  fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source_: source_, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TopVideoPinsAnalyticsResponse',) as TopVideoPinsAnalyticsResponse;
    
    }
    return null;
  }

  /// List following interests
  ///
  /// Get a list of a user's following interests in one place.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] username (required):
  ///   A valid username
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> userAccountFollowedInterestsWithHttpInfo(String username, { String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/users/{username}/interests/follow'
      .replaceAll('{username}', username);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// List following interests
  ///
  /// Get a list of a user's following interests in one place.
  ///
  /// Parameters:
  ///
  /// * [String] username (required):
  ///   A valid username
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<UserAccountFollowedInterests200Response?> userAccountFollowedInterests(String username, { String? bookmark, int? pageSize, }) async {
    final response = await userAccountFollowedInterestsWithHttpInfo(username,  bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserAccountFollowedInterests200Response',) as UserAccountFollowedInterests200Response;
    
    }
    return null;
  }

  /// Get user account
  ///
  /// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountGetWithHttpInfo({ String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get user account
  ///
  /// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Account?> userAccountGet({ String? adAccountId, }) async {
    final response = await userAccountGetWithHttpInfo( adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Account',) as Account;
    
    }
    return null;
  }

  /// List following
  ///
  /// Get a list of who a certain user follows.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [UserFollowingFeedType] feedType:
  ///   Thrift param specifying what type of followees will be kept. Default to include all followees.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userFollowingGetWithHttpInfo({ String? bookmark, int? pageSize, UserFollowingFeedType? feedType, bool? explicitFollowing, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/following';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (feedType != null) {
      queryParams.addAll(_queryParams('', 'feed_type', feedType));
    }
    if (explicitFollowing != null) {
      queryParams.addAll(_queryParams('', 'explicit_following', explicitFollowing));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// List following
  ///
  /// Get a list of who a certain user follows.
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [UserFollowingFeedType] feedType:
  ///   Thrift param specifying what type of followees will be kept. Default to include all followees.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<UserFollowingGet200Response?> userFollowingGet({ String? bookmark, int? pageSize, UserFollowingFeedType? feedType, bool? explicitFollowing, String? adAccountId, }) async {
    final response = await userFollowingGetWithHttpInfo( bookmark: bookmark, pageSize: pageSize, feedType: feedType, explicitFollowing: explicitFollowing, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserFollowingGet200Response',) as UserFollowingGet200Response;
    
    }
    return null;
  }

  /// Get user websites
  ///
  /// Get user websites, claimed or not
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> userWebsitesGetWithHttpInfo({ String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/websites';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get user websites
  ///
  /// Get user websites, claimed or not
  ///
  /// Parameters:
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<UserWebsitesGet200Response?> userWebsitesGet({ String? bookmark, int? pageSize, }) async {
    final response = await userWebsitesGetWithHttpInfo( bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserWebsitesGet200Response',) as UserWebsitesGet200Response;
    
    }
    return null;
  }

  /// Verify website
  ///
  /// Verify a website as a signed-in user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [UserWebsiteVerifyRequest] userWebsiteVerifyRequest (required):
  ///   Verify a website.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> verifyWebsiteUpdateWithHttpInfo(UserWebsiteVerifyRequest userWebsiteVerifyRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/websites';

    // ignore: prefer_final_locals
    Object? postBody = userWebsiteVerifyRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Verify website
  ///
  /// Verify a website as a signed-in user.
  ///
  /// Parameters:
  ///
  /// * [UserWebsiteVerifyRequest] userWebsiteVerifyRequest (required):
  ///   Verify a website.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<UserWebsiteSummary?> verifyWebsiteUpdate(UserWebsiteVerifyRequest userWebsiteVerifyRequest, { String? adAccountId, }) async {
    final response = await verifyWebsiteUpdateWithHttpInfo(userWebsiteVerifyRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserWebsiteSummary',) as UserWebsiteSummary;
    
    }
    return null;
  }

  /// Get user verification code for website claiming
  ///
  /// Get verification code for user to install on the website to claim it.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> websiteVerificationGetWithHttpInfo({ String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/websites/verification';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get user verification code for website claiming
  ///
  /// Get verification code for user to install on the website to claim it.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<UserWebsiteVerificationCode?> websiteVerificationGet({ String? adAccountId, }) async {
    final response = await websiteVerificationGetWithHttpInfo( adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserWebsiteVerificationCode',) as UserWebsiteVerificationCode;
    
    }
    return null;
  }
}
