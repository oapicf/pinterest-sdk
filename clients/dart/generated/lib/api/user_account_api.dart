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
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> boardsUserFollowsListWithHttpInfo({ String? adAccountId, bool? explicitFollowing, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/following/boards';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (explicitFollowing != null) {
      queryParams.addAll(_queryParams('', 'explicit_following', explicitFollowing));
    }
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
      abortTrigger: abortTrigger,
    );
  }

  /// List following boards
  ///
  /// Get a list of the boards a user follows. The request returns a board summary object array.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BoardsList200Response?> boardsUserFollowsList({ String? adAccountId, bool? explicitFollowing, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await boardsUserFollowsListWithHttpInfo(adAccountId: adAccountId, explicitFollowing: explicitFollowing, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardsList200Response',) as BoardsList200Response;
    
    }
    return null;
  }

  /// Follow user
  ///
  /// **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] username (required):
  ///   A valid username
  ///
  /// * [FollowUserCreate] followUserCreate (required):
  Future<Response> followUserUpdateWithHttpInfo(String username, FollowUserCreate followUserCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/following/{username}'
      .replaceAll('{username}', username);

    // ignore: prefer_final_locals
    Object? postBody = followUserCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Follow user
  ///
  /// **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
  ///
  /// Parameters:
  ///
  /// * [String] username (required):
  ///   A valid username
  ///
  /// * [FollowUserCreate] followUserCreate (required):
  Future<FollowUser?> followUserUpdate(String username, FollowUserCreate followUserCreate, { Future<void>? abortTrigger, }) async {
    final response = await followUserUpdateWithHttpInfo(username, followUserCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'FollowUser',) as FollowUser;
    
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> followersListWithHttpInfo({ String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<FollowersList200Response?> followersList({ String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await followersListWithHttpInfo(bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  Future<Response> linkedBusinessAccountsGetWithHttpInfo({ Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// List linked businesses
  ///
  /// Get a list of your linked business accounts.
  Future<List<LinkedBusiness>?> linkedBusinessAccountsGet({ Future<void>? abortTrigger, }) async {
    final response = await linkedBusinessAccountsGetWithHttpInfo(abortTrigger: abortTrigger,);
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
  /// Unverify a website verified by the signed-in user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] website (required):
  ///   Website with path or domain only
  Future<Response> unverifyWebsiteDeleteWithHttpInfo(String website, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Unverify website
  ///
  /// Unverify a website verified by the signed-in user.
  ///
  /// Parameters:
  ///
  /// * [String] website (required):
  ///   Website with path or domain only
  Future<UserWebsite?> unverifyWebsiteDelete(String website, { Future<void>? abortTrigger, }) async {
    final response = await unverifyWebsiteDeleteWithHttpInfo(website, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserWebsite',) as UserWebsite;
    
    }
    return null;
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
  /// * [List<QuerymetrictypesItems>] metricTypes:
  ///   Metric types to get data for, default is all.
  ///
  /// * [String] splitField:
  ///   How to split the data into groups. Not including this param means data won't be split.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountAnalyticsWithHttpInfo(DateTime startDate, DateTime endDate, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<QuerymetrictypesItems>? metricTypes, String? splitField, String? adAccountId, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  /// * [List<QuerymetrictypesItems>] metricTypes:
  ///   Metric types to get data for, default is all.
  ///
  /// * [String] splitField:
  ///   How to split the data into groups. Not including this param means data won't be split.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Map<String, AnalyticsMetricsResponse>?> userAccountAnalytics(DateTime startDate, DateTime endDate, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<QuerymetrictypesItems>? metricTypes, String? splitField, String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await userAccountAnalyticsWithHttpInfo(startDate, endDate, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source_: source_, metricTypes: metricTypes, splitField: splitField, adAccountId: adAccountId, abortTrigger: abortTrigger,);
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
  /// * [TopPinsSortBy] sortBy (required):
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
  /// * [List<QuerymetrictypesItems>] metricTypes:
  ///   Metric types to get data for, default is all.
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [num] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountAnalyticsTopPinsWithHttpInfo(DateTime startDate, DateTime endDate, TopPinsSortBy sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<QuerymetrictypesItems>? metricTypes, int? numOfPins, num? createdInLastNDays, String? adAccountId, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  /// * [TopPinsSortBy] sortBy (required):
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
  /// * [List<QuerymetrictypesItems>] metricTypes:
  ///   Metric types to get data for, default is all.
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [num] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<TopPinsAnalyticsResponse?> userAccountAnalyticsTopPins(DateTime startDate, DateTime endDate, TopPinsSortBy sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<QuerymetrictypesItems>? metricTypes, int? numOfPins, num? createdInLastNDays, String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await userAccountAnalyticsTopPinsWithHttpInfo(startDate, endDate, sortBy, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source_: source_, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId, abortTrigger: abortTrigger,);
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
  /// * [TopVideoPinsSortBy] sortBy (required):
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
  /// * [List<QueryvideopinmetrictypesItems>] metricTypes:
  ///   Metric types to get video data for, default is all.
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [num] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountAnalyticsTopVideoPinsWithHttpInfo(DateTime startDate, DateTime endDate, TopVideoPinsSortBy sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<QueryvideopinmetrictypesItems>? metricTypes, int? numOfPins, num? createdInLastNDays, String? adAccountId, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  /// * [TopVideoPinsSortBy] sortBy (required):
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
  /// * [List<QueryvideopinmetrictypesItems>] metricTypes:
  ///   Metric types to get video data for, default is all.
  ///
  /// * [int] numOfPins:
  ///   Number of pins to include, default is 10. Max is 50.
  ///
  /// * [num] createdInLastNDays:
  ///   Get metrics for pins created in the last \"n\" days.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<TopVideoPinsAnalyticsResponse?> userAccountAnalyticsTopVideoPins(DateTime startDate, DateTime endDate, TopVideoPinsSortBy sortBy, { String? fromClaimedContent, String? pinFormat, String? appTypes, String? contentType, String? source_, List<QueryvideopinmetrictypesItems>? metricTypes, int? numOfPins, num? createdInLastNDays, String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await userAccountAnalyticsTopVideoPinsWithHttpInfo(startDate, endDate, sortBy, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, contentType: contentType, source_: source_, metricTypes: metricTypes, numOfPins: numOfPins, createdInLastNDays: createdInLastNDays, adAccountId: adAccountId, abortTrigger: abortTrigger,);
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> userAccountFollowedInterestsWithHttpInfo(String username, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<UserAccountFollowedInterests200Response?> userAccountFollowedInterests(String username, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await userAccountFollowedInterestsWithHttpInfo(username, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  /// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> userAccountGetWithHttpInfo({ String? adAccountId, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get user account
  ///
  /// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Account?> userAccountGet({ String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await userAccountGetWithHttpInfo(adAccountId: adAccountId, abortTrigger: abortTrigger,);
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
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [UserFollowingFeedType] feedType:
  ///   Thrift param specifying what type of followees will be kept. Default to include all followees.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> userFollowingGetWithHttpInfo({ String? adAccountId, bool? explicitFollowing, UserFollowingFeedType? feedType, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/following';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (explicitFollowing != null) {
      queryParams.addAll(_queryParams('', 'explicit_following', explicitFollowing));
    }
    if (feedType != null) {
      queryParams.addAll(_queryParams('', 'feed_type', feedType));
    }
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
      abortTrigger: abortTrigger,
    );
  }

  /// List following
  ///
  /// Get a list of who a certain user follows.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] explicitFollowing:
  ///   Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
  ///
  /// * [UserFollowingFeedType] feedType:
  ///   Thrift param specifying what type of followees will be kept. Default to include all followees.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<FollowersList200Response?> userFollowingGet({ String? adAccountId, bool? explicitFollowing, UserFollowingFeedType? feedType, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await userFollowingGetWithHttpInfo(adAccountId: adAccountId, explicitFollowing: explicitFollowing, feedType: feedType, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> userWebsitesGetWithHttpInfo({ String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<UserWebsitesGet200Response?> userWebsitesGet({ String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await userWebsitesGetWithHttpInfo(bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  /// * [UserWebsiteCreate] userWebsiteCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> verifyWebsiteUpdateWithHttpInfo(UserWebsiteCreate userWebsiteCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/user_account/websites';

    // ignore: prefer_final_locals
    Object? postBody = userWebsiteCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Verify website
  ///
  /// Verify a website as a signed-in user.
  ///
  /// Parameters:
  ///
  /// * [UserWebsiteCreate] userWebsiteCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<UserWebsite?> verifyWebsiteUpdate(UserWebsiteCreate userWebsiteCreate, { String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await verifyWebsiteUpdateWithHttpInfo(userWebsiteCreate, adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserWebsite',) as UserWebsite;
    
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
  Future<Response> websiteVerificationGetWithHttpInfo({ String? adAccountId, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  Future<UserWebsiteVerification?> websiteVerificationGet({ String? adAccountId, Future<void>? abortTrigger, }) async {
    final response = await websiteVerificationGetWithHttpInfo(adAccountId: adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'UserWebsiteVerification',) as UserWebsiteVerification;
    
    }
    return null;
  }
}
