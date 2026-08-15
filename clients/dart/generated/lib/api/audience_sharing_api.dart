//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudienceSharingApi {
  AudienceSharingApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// List accounts with access to an audience owned by an ad account
  ///
  /// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of the audience to use to filter the results.
  ///
  /// * [AudienceAccountType] accountType (required):
  ///   Filter accounts by account type.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> adAccountsAudiencesSharedAccountsListWithHttpInfo(String adAccountId, String audienceId, AudienceAccountType accountType, { int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/shared/accounts'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'audience_id', audienceId));
      queryParams.addAll(_queryParams('', 'account_type', accountType));
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
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

  /// List accounts with access to an audience owned by an ad account
  ///
  /// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of the audience to use to filter the results.
  ///
  /// * [AudienceAccountType] accountType (required):
  ///   Filter accounts by account type.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<AdAccountsAudiencesSharedAccountsList200Response?> adAccountsAudiencesSharedAccountsList(String adAccountId, String audienceId, AudienceAccountType accountType, { int? pageSize, String? bookmark, }) async {
    final response = await adAccountsAudiencesSharedAccountsListWithHttpInfo(adAccountId, audienceId, accountType,  pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsAudiencesSharedAccountsList200Response',) as AdAccountsAudiencesSharedAccountsList200Response;
    
    }
    return null;
  }

  /// List accounts with access to an audience owned by a business
  ///
  /// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of the audience to use to filter the results.
  ///
  /// * [AudienceAccountType] accountType (required):
  ///   Filter accounts by account type.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> businessAccountAudiencesSharedAccountsListWithHttpInfo(String businessId, String audienceId, AudienceAccountType accountType, { int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/audiences/shared/accounts'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'audience_id', audienceId));
      queryParams.addAll(_queryParams('', 'account_type', accountType));
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
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

  /// List accounts with access to an audience owned by a business
  ///
  /// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] audienceId (required):
  ///   Unique identifier of the audience to use to filter the results.
  ///
  /// * [AudienceAccountType] accountType (required):
  ///   Filter accounts by account type.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<AdAccountsAudiencesSharedAccountsList200Response?> businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, { int? pageSize, String? bookmark, }) async {
    final response = await businessAccountAudiencesSharedAccountsListWithHttpInfo(businessId, audienceId, accountType,  pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsAudiencesSharedAccountsList200Response',) as AdAccountsAudiencesSharedAccountsList200Response;
    
    }
    return null;
  }

  /// List received audiences for a business
  ///
  /// Get a list of received audiences for the given business.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> sharedAudiencesForBusinessListWithHttpInfo(String businessId, { String? bookmark, String? order, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/audiences'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
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

  /// List received audiences for a business
  ///
  /// Get a list of received audiences for the given business.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<AudiencesList200Response?> sharedAudiencesForBusinessList(String businessId, { String? bookmark, String? order, int? pageSize, }) async {
    final response = await sharedAudiencesForBusinessListWithHttpInfo(businessId,  bookmark: bookmark, order: order, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AudiencesList200Response',) as AudiencesList200Response;
    
    }
    return null;
  }

  /// Update audience sharing between ad accounts
  ///
  /// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SharedAudience] sharedAudience (required):
  Future<Response> updateAdAccountToAdAccountSharedAudienceWithHttpInfo(String adAccountId, SharedAudience sharedAudience,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = sharedAudience;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Update audience sharing between ad accounts
  ///
  /// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SharedAudience] sharedAudience (required):
  Future<SharedAudienceResponse?> updateAdAccountToAdAccountSharedAudience(String adAccountId, SharedAudience sharedAudience,) async {
    final response = await updateAdAccountToAdAccountSharedAudienceWithHttpInfo(adAccountId, sharedAudience,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SharedAudienceResponse',) as SharedAudienceResponse;
    
    }
    return null;
  }

  /// Update audience sharing from an ad account to businesses
  ///
  /// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BusinessSharedAudience] businessSharedAudience (required):
  Future<Response> updateAdAccountToBusinessSharedAudienceWithHttpInfo(String adAccountId, BusinessSharedAudience businessSharedAudience,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audiences/businesses/shared'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = businessSharedAudience;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Update audience sharing from an ad account to businesses
  ///
  /// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [BusinessSharedAudience] businessSharedAudience (required):
  Future<BusinessSharedAudienceResponse?> updateAdAccountToBusinessSharedAudience(String adAccountId, BusinessSharedAudience businessSharedAudience,) async {
    final response = await updateAdAccountToBusinessSharedAudienceWithHttpInfo(adAccountId, businessSharedAudience,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessSharedAudienceResponse',) as BusinessSharedAudienceResponse;
    
    }
    return null;
  }

  /// Update audience sharing from a business to ad accounts
  ///
  /// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [SharedAudience] sharedAudience (required):
  Future<Response> updateBusinessToAdAccountSharedAudienceWithHttpInfo(String businessId, SharedAudience sharedAudience,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/audiences/ad_accounts/shared'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = sharedAudience;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Update audience sharing from a business to ad accounts
  ///
  /// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [SharedAudience] sharedAudience (required):
  Future<SharedAudienceResponse?> updateBusinessToAdAccountSharedAudience(String businessId, SharedAudience sharedAudience,) async {
    final response = await updateBusinessToAdAccountSharedAudienceWithHttpInfo(businessId, sharedAudience,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SharedAudienceResponse',) as SharedAudienceResponse;
    
    }
    return null;
  }

  /// Update audience sharing between businesses
  ///
  /// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [BusinessSharedAudience] businessSharedAudience (required):
  Future<Response> updateBusinessToBusinessSharedAudienceWithHttpInfo(String businessId, BusinessSharedAudience businessSharedAudience,) async {
    // ignore: prefer_const_declarations
    final path = r'/businesses/{business_id}/audiences/businesses/shared'
      .replaceAll('{business_id}', businessId);

    // ignore: prefer_final_locals
    Object? postBody = businessSharedAudience;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// Update audience sharing between businesses
  ///
  /// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
  ///
  /// Parameters:
  ///
  /// * [String] businessId (required):
  ///   Unique identifier of the requesting business.
  ///
  /// * [BusinessSharedAudience] businessSharedAudience (required):
  Future<BusinessSharedAudienceResponse?> updateBusinessToBusinessSharedAudience(String businessId, BusinessSharedAudience businessSharedAudience,) async {
    final response = await updateBusinessToBusinessSharedAudienceWithHttpInfo(businessId, businessSharedAudience,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BusinessSharedAudienceResponse',) as BusinessSharedAudienceResponse;
    
    }
    return null;
  }
}
