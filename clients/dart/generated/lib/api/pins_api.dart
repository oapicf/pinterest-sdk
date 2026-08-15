//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class PinsApi {
  PinsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get multiple Pin analytics
  ///
  /// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<String>] pinIds (required):
  ///   List of Pin IDs.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<String>] metricTypes (required):
  ///   Pin metric types to get data for.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> multiPinsAnalyticsWithHttpInfo(List<String> pinIds, DateTime startDate, DateTime endDate, List<String> metricTypes, { String? appTypes, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/analytics';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'pin_ids', pinIds));
      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
    if (appTypes != null) {
      queryParams.addAll(_queryParams('', 'app_types', appTypes));
    }
      queryParams.addAll(_queryParams('csv', 'metric_types', metricTypes));
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

  /// Get multiple Pin analytics
  ///
  /// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  ///
  /// Parameters:
  ///
  /// * [List<String>] pinIds (required):
  ///   List of Pin IDs.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<String>] metricTypes (required):
  ///   Pin metric types to get data for.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Map<String, Map<String, PinAnalyticsMetricsResponse>>?> multiPinsAnalytics(List<String> pinIds, DateTime startDate, DateTime endDate, List<String> metricTypes, { String? appTypes, String? adAccountId, }) async {
    final response = await multiPinsAnalyticsWithHttpInfo(pinIds, startDate, endDate, metricTypes,  appTypes: appTypes, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return Map<String, Map<String, PinAnalyticsMetricsResponse>>.from(await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Map<String, Map<String, PinAnalyticsMetricsResponse>>'),);

    }
    return null;
  }

  /// Get Pin analytics
  ///
  /// Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of a Pin.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<String>] metricTypes (required):
  ///   Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] splitField:
  ///   How to split the data into groups. Not including this param means data won't be split.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> pinsAnalyticsWithHttpInfo(String pinId, DateTime startDate, DateTime endDate, List<String> metricTypes, { String? appTypes, String? splitField, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}/analytics'
      .replaceAll('{pin_id}', pinId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
    if (appTypes != null) {
      queryParams.addAll(_queryParams('', 'app_types', appTypes));
    }
      queryParams.addAll(_queryParams('csv', 'metric_types', metricTypes));
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

  /// Get Pin analytics
  ///
  /// Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of a Pin.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<String>] metricTypes (required):
  ///   Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
  ///
  /// * [String] appTypes:
  ///   Apps or devices to get data for, default is all.
  ///
  /// * [String] splitField:
  ///   How to split the data into groups. Not including this param means data won't be split.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Map<String, PinAnalyticsMetricsResponse>?> pinsAnalytics(String pinId, DateTime startDate, DateTime endDate, List<String> metricTypes, { String? appTypes, String? splitField, String? adAccountId, }) async {
    final response = await pinsAnalyticsWithHttpInfo(pinId, startDate, endDate, metricTypes,  appTypes: appTypes, splitField: splitField, adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return Map<String, PinAnalyticsMetricsResponse>.from(await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Map<String, PinAnalyticsMetricsResponse>'),);

    }
    return null;
  }

  /// Create Pin
  ///
  ///   Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [PinCreate] pinCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> pinsCreateWithHttpInfo(PinCreate pinCreate, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins';

    // ignore: prefer_final_locals
    Object? postBody = pinCreate;

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

  /// Create Pin
  ///
  ///   Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
  ///
  /// Parameters:
  ///
  /// * [PinCreate] pinCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Pin?> pinsCreate(PinCreate pinCreate, { String? adAccountId, }) async {
    final response = await pinsCreateWithHttpInfo(pinCreate,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Pin',) as Pin;
    
    }
    return null;
  }

  /// Delete Pin
  ///
  ///    Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> pinsDeleteWithHttpInfo(String pinId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}'
      .replaceAll('{pin_id}', pinId);

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
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete Pin
  ///
  ///    Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<void> pinsDelete(String pinId, { String? adAccountId, }) async {
    final response = await pinsDeleteWithHttpInfo(pinId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get Pin
  ///
  ///    Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<Response> pinsGetWithHttpInfo(String pinId, { String? adAccountId, bool? pinMetrics, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}'
      .replaceAll('{pin_id}', pinId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (pinMetrics != null) {
      queryParams.addAll(_queryParams('', 'pin_metrics', pinMetrics));
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

  /// Get Pin
  ///
  ///    Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<Pin?> pinsGet(String pinId, { String? adAccountId, bool? pinMetrics, }) async {
    final response = await pinsGetWithHttpInfo(pinId,  adAccountId: adAccountId, pinMetrics: pinMetrics, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Pin',) as Pin;
    
    }
    return null;
  }

  /// List Pins
  ///
  ///      Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinFilter:
  ///   The filter to apply to the pins
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  ///
  /// * [bool] includeProtectedPins:
  ///   Whether to include protected pins in the results
  ///
  /// * [String] pinType:
  ///   The type of pins to return, currently only enabled for private pins
  ///
  /// * [List<CreativeType>] creativeTypes:
  ///   Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> pinsListWithHttpInfo({ String? pinFilter, bool? pinMetrics, bool? includeProtectedPins, String? pinType, List<CreativeType>? creativeTypes, String? adAccountId, String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pinFilter != null) {
      queryParams.addAll(_queryParams('', 'pin_filter', pinFilter));
    }
    if (pinMetrics != null) {
      queryParams.addAll(_queryParams('', 'pin_metrics', pinMetrics));
    }
    if (includeProtectedPins != null) {
      queryParams.addAll(_queryParams('', 'include_protected_pins', includeProtectedPins));
    }
    if (pinType != null) {
      queryParams.addAll(_queryParams('', 'pin_type', pinType));
    }
    if (creativeTypes != null) {
      queryParams.addAll(_queryParams('multi', 'creative_types', creativeTypes));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
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
    );
  }

  /// List Pins
  ///
  ///      Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
  ///
  /// Parameters:
  ///
  /// * [String] pinFilter:
  ///   The filter to apply to the pins
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  ///
  /// * [bool] includeProtectedPins:
  ///   Whether to include protected pins in the results
  ///
  /// * [String] pinType:
  ///   The type of pins to return, currently only enabled for private pins
  ///
  /// * [List<CreativeType>] creativeTypes:
  ///   Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<PinsList200Response?> pinsList({ String? pinFilter, bool? pinMetrics, bool? includeProtectedPins, String? pinType, List<CreativeType>? creativeTypes, String? adAccountId, String? bookmark, int? pageSize, }) async {
    final response = await pinsListWithHttpInfo( pinFilter: pinFilter, pinMetrics: pinMetrics, includeProtectedPins: includeProtectedPins, pinType: pinType, creativeTypes: creativeTypes, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'PinsList200Response',) as PinsList200Response;
    
    }
    return null;
  }

  /// Save Pin
  ///
  /// Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of a Pin.
  ///
  /// * [PinsSaveRequest] pinsSaveRequest (required):
  ///   Request object used to save an existing pin
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> pinsSaveWithHttpInfo(String pinId, PinsSaveRequest pinsSaveRequest, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}/save'
      .replaceAll('{pin_id}', pinId);

    // ignore: prefer_final_locals
    Object? postBody = pinsSaveRequest;

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

  /// Save Pin
  ///
  /// Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///   Unique identifier of a Pin.
  ///
  /// * [PinsSaveRequest] pinsSaveRequest (required):
  ///   Request object used to save an existing pin
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Pin?> pinsSave(String pinId, PinsSaveRequest pinsSaveRequest, { String? adAccountId, }) async {
    final response = await pinsSaveWithHttpInfo(pinId, pinsSaveRequest,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Pin',) as Pin;
    
    }
    return null;
  }

  /// Update Pin
  ///
  /// Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///
  /// * [PinUpdate] pinUpdate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> pinsUpdateWithHttpInfo(String pinId, PinUpdate pinUpdate, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/pins/{pin_id}'
      .replaceAll('{pin_id}', pinId);

    // ignore: prefer_final_locals
    Object? postBody = pinUpdate;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Update Pin
  ///
  /// Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Parameters:
  ///
  /// * [String] pinId (required):
  ///
  /// * [PinUpdate] pinUpdate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Pin?> pinsUpdate(String pinId, PinUpdate pinUpdate, { String? adAccountId, }) async {
    final response = await pinsUpdateWithHttpInfo(pinId, pinUpdate,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Pin',) as Pin;
    
    }
    return null;
  }
}
