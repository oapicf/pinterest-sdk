//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BillingApi {
  BillingApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Redeem ad credits
  ///
  /// Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdsCreditRedeemRequest] adsCreditRedeemRequest (required):
  ///   Redeem ad credits request.
  Future<Response> adsCreditRedeemWithHttpInfo(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads_credit/redeem'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adsCreditRedeemRequest;

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

  /// Redeem ad credits
  ///
  /// Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdsCreditRedeemRequest] adsCreditRedeemRequest (required):
  ///   Redeem ad credits request.
  Future<AdsCreditRedeemResponse?> adsCreditRedeem(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest,) async {
    final response = await adsCreditRedeemWithHttpInfo(adAccountId, adsCreditRedeemRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsCreditRedeemResponse',) as AdsCreditRedeemResponse;
    
    }
    return null;
  }

  /// Get ads credit discounts
  ///
  /// Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> adsCreditsDiscountsGetWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads_credit/discounts'
      .replaceAll('{ad_account_id}', adAccountId);

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

  /// Get ads credit discounts
  ///
  /// Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<AdsCreditsDiscountsGet200Response?> adsCreditsDiscountsGet(String adAccountId, { String? bookmark, int? pageSize, }) async {
    final response = await adsCreditsDiscountsGetWithHttpInfo(adAccountId,  bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsCreditsDiscountsGet200Response',) as AdsCreditsDiscountsGet200Response;
    
    }
    return null;
  }

  /// Get download url for a billing invoice
  ///
  /// Get download url for a billing invoice.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] billingInvoiceId (required):
  ///   Unique identifier of a billing invoice.
  Future<Response> billingInvoiceDownloadGetWithHttpInfo(String adAccountId, String billingInvoiceId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{billing_invoice_id}', billingInvoiceId);

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

  /// Get download url for a billing invoice
  ///
  /// Get download url for a billing invoice.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] billingInvoiceId (required):
  ///   Unique identifier of a billing invoice.
  Future<BillingInvoiceDownloadResponse?> billingInvoiceDownloadGet(String adAccountId, String billingInvoiceId,) async {
    final response = await billingInvoiceDownloadGetWithHttpInfo(adAccountId, billingInvoiceId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BillingInvoiceDownloadResponse',) as BillingInvoiceDownloadResponse;
    
    }
    return null;
  }

  /// Get billing invoices
  ///
  /// Get billing invoices in the advertiser account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] sort:
  ///   Field of which to sort billing invoices
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] status:
  ///   Status of billing invoices to filter by
  ///
  /// * [String] documentType:
  ///   Document type of billing invoices to filter by
  ///
  /// * [DateTime] startDueDate:
  ///   Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
  ///
  /// * [DateTime] endDueDate:
  ///   Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
  Future<Response> billingInvoicesGetWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, String? sort, String? order, String? status, String? documentType, DateTime? startDueDate, DateTime? endDueDate, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/billing_invoices'
      .replaceAll('{ad_account_id}', adAccountId);

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
    if (sort != null) {
      queryParams.addAll(_queryParams('', 'sort', sort));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (status != null) {
      queryParams.addAll(_queryParams('', 'status', status));
    }
    if (documentType != null) {
      queryParams.addAll(_queryParams('', 'document_type', documentType));
    }
    if (startDueDate != null) {
      queryParams.addAll(_queryParams('', 'start_due_date', startDueDate));
    }
    if (endDueDate != null) {
      queryParams.addAll(_queryParams('', 'end_due_date', endDueDate));
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

  /// Get billing invoices
  ///
  /// Get billing invoices in the advertiser account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] sort:
  ///   Field of which to sort billing invoices
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] status:
  ///   Status of billing invoices to filter by
  ///
  /// * [String] documentType:
  ///   Document type of billing invoices to filter by
  ///
  /// * [DateTime] startDueDate:
  ///   Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
  ///
  /// * [DateTime] endDueDate:
  ///   Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
  Future<BillingInvoicesGet200Response?> billingInvoicesGet(String adAccountId, { String? bookmark, int? pageSize, String? sort, String? order, String? status, String? documentType, DateTime? startDueDate, DateTime? endDueDate, }) async {
    final response = await billingInvoicesGetWithHttpInfo(adAccountId,  bookmark: bookmark, pageSize: pageSize, sort: sort, order: order, status: status, documentType: documentType, startDueDate: startDueDate, endDueDate: endDueDate, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BillingInvoicesGet200Response',) as BillingInvoicesGet200Response;
    
    }
    return null;
  }

  /// Get billing profiles
  ///
  /// Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] isActive (required):
  ///   Return active billing profiles, if false return all billing profiles.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> billingProfilesGetWithHttpInfo(String adAccountId, bool isActive, { String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/billing_profiles'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'is_active', isActive));
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

  /// Get billing profiles
  ///
  /// Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] isActive (required):
  ///   Return active billing profiles, if false return all billing profiles.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<BillingProfilesGet200Response?> billingProfilesGet(String adAccountId, bool isActive, { String? bookmark, int? pageSize, }) async {
    final response = await billingProfilesGetWithHttpInfo(adAccountId, isActive,  bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BillingProfilesGet200Response',) as BillingProfilesGet200Response;
    
    }
    return null;
  }

  /// Get Salesforce account details including bill-to information.
  ///
  /// Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> ssioAccountsGetWithHttpInfo(String adAccountId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/accounts'
      .replaceAll('{ad_account_id}', adAccountId);

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

  /// Get Salesforce account details including bill-to information.
  ///
  /// Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<SSIOAccountResponse?> ssioAccountsGet(String adAccountId,) async {
    final response = await ssioAccountsGetWithHttpInfo(adAccountId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOAccountResponse',) as SSIOAccountResponse;
    
    }
    return null;
  }

  /// Create insertion order through SSIO.
  ///
  /// Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOCreateInsertionOrderRequest] sSIOCreateInsertionOrderRequest (required):
  ///   Order line to create.
  Future<Response> ssioInsertionOrderCreateWithHttpInfo(String adAccountId, SSIOCreateInsertionOrderRequest sSIOCreateInsertionOrderRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/insertion_orders'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = sSIOCreateInsertionOrderRequest;

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

  /// Create insertion order through SSIO.
  ///
  /// Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOCreateInsertionOrderRequest] sSIOCreateInsertionOrderRequest (required):
  ///   Order line to create.
  Future<SSIOCreateInsertionOrderResponse?> ssioInsertionOrderCreate(String adAccountId, SSIOCreateInsertionOrderRequest sSIOCreateInsertionOrderRequest,) async {
    final response = await ssioInsertionOrderCreateWithHttpInfo(adAccountId, sSIOCreateInsertionOrderRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOCreateInsertionOrderResponse',) as SSIOCreateInsertionOrderResponse;
    
    }
    return null;
  }

  /// Edit insertion order through SSIO.
  ///
  /// Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOEditInsertionOrderRequest] sSIOEditInsertionOrderRequest (required):
  ///   Order line to create.
  Future<Response> ssioInsertionOrderEditWithHttpInfo(String adAccountId, SSIOEditInsertionOrderRequest sSIOEditInsertionOrderRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/insertion_orders'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = sSIOEditInsertionOrderRequest;

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

  /// Edit insertion order through SSIO.
  ///
  /// Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOEditInsertionOrderRequest] sSIOEditInsertionOrderRequest (required):
  ///   Order line to create.
  Future<SSIOEditInsertionOrderResponse?> ssioInsertionOrderEdit(String adAccountId, SSIOEditInsertionOrderRequest sSIOEditInsertionOrderRequest,) async {
    final response = await ssioInsertionOrderEditWithHttpInfo(adAccountId, sSIOEditInsertionOrderRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOEditInsertionOrderResponse',) as SSIOEditInsertionOrderResponse;
    
    }
    return null;
  }

  /// Get insertion order status by ad account id.
  ///
  /// Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/insertion_orders/status'
      .replaceAll('{ad_account_id}', adAccountId);

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

  /// Get insertion order status by ad account id.
  ///
  /// Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<SsioInsertionOrdersStatusGetByAdAccount200Response?> ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, { String? bookmark, int? pageSize, }) async {
    final response = await ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(adAccountId,  bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SsioInsertionOrdersStatusGetByAdAccount200Response',) as SsioInsertionOrdersStatusGetByAdAccount200Response;
    
    }
    return null;
  }

  /// Get insertion order status by pin order id.
  ///
  /// Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] pinOrderId (required):
  ///   The pin order id associated with the ssio insertion order
  Future<Response> ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(String adAccountId, String pinOrderId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{pin_order_id}', pinOrderId);

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

  /// Get insertion order status by pin order id.
  ///
  /// Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] pinOrderId (required):
  ///   The pin order id associated with the ssio insertion order
  Future<SSIOInsertionOrderStatusResponse?> ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId,) async {
    final response = await ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(adAccountId, pinOrderId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOInsertionOrderStatusResponse',) as SSIOInsertionOrderStatusResponse;
    
    }
    return null;
  }

  /// Get Salesforce order lines by ad account id.
  ///
  /// Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] pinOrderId:
  ///   The pin order id associated with the ssio insertino order
  Future<Response> ssioOrderLinesGetByAdAccountWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, String? pinOrderId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/order_lines'
      .replaceAll('{ad_account_id}', adAccountId);

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
    if (pinOrderId != null) {
      queryParams.addAll(_queryParams('', 'pin_order_id', pinOrderId));
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

  /// Get Salesforce order lines by ad account id.
  ///
  /// Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] pinOrderId:
  ///   The pin order id associated with the ssio insertino order
  Future<SsioOrderLinesGetByAdAccount200Response?> ssioOrderLinesGetByAdAccount(String adAccountId, { String? bookmark, int? pageSize, String? pinOrderId, }) async {
    final response = await ssioOrderLinesGetByAdAccountWithHttpInfo(adAccountId,  bookmark: bookmark, pageSize: pageSize, pinOrderId: pinOrderId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SsioOrderLinesGetByAdAccount200Response',) as SsioOrderLinesGetByAdAccount200Response;
    
    }
    return null;
  }
}
