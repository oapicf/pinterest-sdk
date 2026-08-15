//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CustomerListsApi {
  CustomerListsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create customer lists
  ///
  /// <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [CustomerListRequest] customerListRequest (required):
  ///   Parameters to get Customer lists info
  Future<Response> customerListsCreateWithHttpInfo(String adAccountId, CustomerListRequest customerListRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = customerListRequest;

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

  /// Create customer lists
  ///
  /// <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [CustomerListRequest] customerListRequest (required):
  ///   Parameters to get Customer lists info
  Future<CustomerList?> customerListsCreate(String adAccountId, CustomerListRequest customerListRequest,) async {
    final response = await customerListsCreateWithHttpInfo(adAccountId, customerListRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerList',) as CustomerList;
    
    }
    return null;
  }

  /// Get customer list
  ///
  /// Gets a specific customer list given the customer list ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  Future<Response> customerListsGetWithHttpInfo(String adAccountId, String customerListId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{customer_list_id}', customerListId);

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

  /// Get customer list
  ///
  /// Gets a specific customer list given the customer list ID.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  Future<CustomerList?> customerListsGet(String adAccountId, String customerListId,) async {
    final response = await customerListsGetWithHttpInfo(adAccountId, customerListId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerList',) as CustomerList;
    
    }
    return null;
  }

  /// Get customer lists
  ///
  /// <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> customerListsListWithHttpInfo(String adAccountId, { int? pageSize, String? order, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
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

  /// Get customer lists
  ///
  /// <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<CustomerListsList200Response?> customerListsList(String adAccountId, { int? pageSize, String? order, String? bookmark, }) async {
    final response = await customerListsListWithHttpInfo(adAccountId,  pageSize: pageSize, order: order, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerListsList200Response',) as CustomerListsList200Response;
    
    }
    return null;
  }

  /// Update customer list
  ///
  /// <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [CustomerListUpdateRequest] customerListUpdateRequest (required):
  Future<Response> customerListsUpdateWithHttpInfo(String adAccountId, String customerListId, CustomerListUpdateRequest customerListUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{customer_list_id}', customerListId);

    // ignore: prefer_final_locals
    Object? postBody = customerListUpdateRequest;

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

  /// Update customer list
  ///
  /// <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] customerListId (required):
  ///   Unique identifier of a customer list
  ///
  /// * [CustomerListUpdateRequest] customerListUpdateRequest (required):
  Future<CustomerList?> customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateRequest customerListUpdateRequest,) async {
    final response = await customerListsUpdateWithHttpInfo(adAccountId, customerListId, customerListUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CustomerList',) as CustomerList;
    
    }
    return null;
  }
}
