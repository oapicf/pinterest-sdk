//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class SearchApi {
  SearchApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Search pins by a given search term
  ///
  /// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] term (required):
  ///   Search term to look up pins.
  ///
  /// * [String] countryCode (required):
  ///   Two letter country code (ISO 3166-1 alpha-2)
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [String] locale:
  ///   Search locale.
  ///
  /// * [int] limit:
  ///   Max search result size
  Future<Response> searchPartnerPinsWithHttpInfo(String term, String countryCode, { String? bookmark, String? locale, int? limit, }) async {
    // ignore: prefer_const_declarations
    final path = r'/search/partner/pins';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'term', term));
      queryParams.addAll(_queryParams('', 'country_code', countryCode));
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (locale != null) {
      queryParams.addAll(_queryParams('', 'locale', locale));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
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

  /// Search pins by a given search term
  ///
  /// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
  ///
  /// Parameters:
  ///
  /// * [String] term (required):
  ///   Search term to look up pins.
  ///
  /// * [String] countryCode (required):
  ///   Two letter country code (ISO 3166-1 alpha-2)
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [String] locale:
  ///   Search locale.
  ///
  /// * [int] limit:
  ///   Max search result size
  Future<SearchPartnerPins200Response?> searchPartnerPins(String term, String countryCode, { String? bookmark, String? locale, int? limit, }) async {
    final response = await searchPartnerPinsWithHttpInfo(term, countryCode,  bookmark: bookmark, locale: locale, limit: limit, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SearchPartnerPins200Response',) as SearchPartnerPins200Response;
    
    }
    return null;
  }

  /// Search user's boards
  ///
  /// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] query:
  ///   Search query. Can contain pin description keywords or comma-separated pin IDs.
  Future<Response> searchUserBoardsGetWithHttpInfo({ String? adAccountId, String? bookmark, int? pageSize, String? query, }) async {
    // ignore: prefer_const_declarations
    final path = r'/search/boards';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (query != null) {
      queryParams.addAll(_queryParams('', 'query', query));
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

  /// Search user's boards
  ///
  /// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] query:
  ///   Search query. Can contain pin description keywords or comma-separated pin IDs.
  Future<SearchUserBoardsGet200Response?> searchUserBoardsGet({ String? adAccountId, String? bookmark, int? pageSize, String? query, }) async {
    final response = await searchUserBoardsGetWithHttpInfo( adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, query: query, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SearchUserBoardsGet200Response',) as SearchUserBoardsGet200Response;
    
    }
    return null;
  }

  /// Search user's Pins
  ///
  /// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] query (required):
  ///   Search query. Can contain pin description keywords or comma-separated pin IDs.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> searchUserPinsListWithHttpInfo(String query, { String? adAccountId, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/search/pins';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
      queryParams.addAll(_queryParams('', 'query', query));
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
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

  /// Search user's Pins
  ///
  /// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
  ///
  /// Parameters:
  ///
  /// * [String] query (required):
  ///   Search query. Can contain pin description keywords or comma-separated pin IDs.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<SearchUserPinsList200Response?> searchUserPinsList(String query, { String? adAccountId, String? bookmark, }) async {
    final response = await searchUserPinsListWithHttpInfo(query,  adAccountId: adAccountId, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SearchUserPinsList200Response',) as SearchUserPinsList200Response;
    
    }
    return null;
  }
}
