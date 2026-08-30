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
  /// Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdsCreditRedeemCreate] adsCreditRedeemCreate (required):
  Future<Response> adsCreditRedeemWithHttpInfo(String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads_credit/redeem'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adsCreditRedeemCreate;

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

  /// Redeem ad credits
  ///
  /// Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdsCreditRedeemCreate] adsCreditRedeemCreate (required):
  Future<AdsCreditRedeem?> adsCreditRedeem(String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate, { Future<void>? abortTrigger, }) async {
    final response = await adsCreditRedeemWithHttpInfo(adAccountId, adsCreditRedeemCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsCreditRedeem',) as AdsCreditRedeem;
    
    }
    return null;
  }

  /// Get ads credit discounts
  ///
  /// Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> adsCreditsDiscountsGetWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get ads credit discounts
  ///
  /// Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<AdsCreditsDiscountsGet200Response?> adsCreditsDiscountsGet(String adAccountId, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await adsCreditsDiscountsGetWithHttpInfo(adAccountId, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  Future<Response> billingInvoiceDownloadGetWithHttpInfo(String adAccountId, String billingInvoiceId, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
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
  Future<BillingInvoiceDownloadResponse?> billingInvoiceDownloadGet(String adAccountId, String billingInvoiceId, { Future<void>? abortTrigger, }) async {
    final response = await billingInvoiceDownloadGetWithHttpInfo(adAccountId, billingInvoiceId, abortTrigger: abortTrigger,);
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  ///
  /// * [PinterestLibPaginationOrder] order:
  ///   The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [BillingInvoiceSortField] sort:
  ///   Field of which to sort billing invoices
  ///
  /// * [BillingInvoiceStatus] status:
  ///   Status of billing invoices to filter by
  ///
  /// * [BillingInvoiceDocumentType] documentType:
  ///   Document type of billing invoices to filter by
  ///
  /// * [DateTime] startDueDate:
  ///   Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
  ///
  /// * [DateTime] endDueDate:
  ///   Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
  Future<Response> billingInvoicesGetWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, BillingInvoiceSortField? sort, BillingInvoiceStatus? status, BillingInvoiceDocumentType? documentType, DateTime? startDueDate, DateTime? endDueDate, Future<void>? abortTrigger, }) async {
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
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (sort != null) {
      queryParams.addAll(_queryParams('', 'sort', sort));
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
      abortTrigger: abortTrigger,
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  ///
  /// * [PinterestLibPaginationOrder] order:
  ///   The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [BillingInvoiceSortField] sort:
  ///   Field of which to sort billing invoices
  ///
  /// * [BillingInvoiceStatus] status:
  ///   Status of billing invoices to filter by
  ///
  /// * [BillingInvoiceDocumentType] documentType:
  ///   Document type of billing invoices to filter by
  ///
  /// * [DateTime] startDueDate:
  ///   Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
  ///
  /// * [DateTime] endDueDate:
  ///   Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
  Future<BillingInvoicesGet200Response?> billingInvoicesGet(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, BillingInvoiceSortField? sort, BillingInvoiceStatus? status, BillingInvoiceDocumentType? documentType, DateTime? startDueDate, DateTime? endDueDate, Future<void>? abortTrigger, }) async {
    final response = await billingInvoicesGetWithHttpInfo(adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, sort: sort, status: status, documentType: documentType, startDueDate: startDueDate, endDueDate: endDueDate, abortTrigger: abortTrigger,);
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
  /// Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [bool] isActive (required):
  ///   Return active billing profiles, if false return all billing profiles.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> billingProfilesGetWithHttpInfo(bool isActive, String adAccountId, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get billing profiles
  ///
  /// Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Parameters:
  ///
  /// * [bool] isActive (required):
  ///   Return active billing profiles, if false return all billing profiles.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BillingProfilesGet200Response?> billingProfilesGet(bool isActive, String adAccountId, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await billingProfilesGetWithHttpInfo(isActive, adAccountId, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  ///   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> ssioAccountsGetWithHttpInfo(String adAccountId, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get Salesforce account details including bill-to information.
  ///
  ///   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<SSIOAccount?> ssioAccountsGet(String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await ssioAccountsGetWithHttpInfo(adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOAccount',) as SSIOAccount;
    
    }
    return null;
  }

  /// Create insertion order through SSIO.
  ///
  ///   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOInsertionOrderCreate] sSIOInsertionOrderCreate (required):
  Future<Response> ssioInsertionOrderCreateWithHttpInfo(String adAccountId, SSIOInsertionOrderCreate sSIOInsertionOrderCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/insertion_orders'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = sSIOInsertionOrderCreate;

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

  /// Create insertion order through SSIO.
  ///
  ///   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOInsertionOrderCreate] sSIOInsertionOrderCreate (required):
  Future<SSIOInsertionOrder?> ssioInsertionOrderCreate(String adAccountId, SSIOInsertionOrderCreate sSIOInsertionOrderCreate, { Future<void>? abortTrigger, }) async {
    final response = await ssioInsertionOrderCreateWithHttpInfo(adAccountId, sSIOInsertionOrderCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOInsertionOrder',) as SSIOInsertionOrder;
    
    }
    return null;
  }

  /// Edit insertion order through SSIO.
  ///
  ///   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOInsertionOrderUpdate] sSIOInsertionOrderUpdate (required):
  Future<Response> ssioInsertionOrderEditWithHttpInfo(String adAccountId, SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/insertion_orders'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = sSIOInsertionOrderUpdate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Edit insertion order through SSIO.
  ///
  ///   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SSIOInsertionOrderUpdate] sSIOInsertionOrderUpdate (required):
  Future<SSIOInsertionOrder?> ssioInsertionOrderEdit(String adAccountId, SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate, { Future<void>? abortTrigger, }) async {
    final response = await ssioInsertionOrderEditWithHttpInfo(adAccountId, sSIOInsertionOrderUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SSIOInsertionOrder',) as SSIOInsertionOrder;
    
    }
    return null;
  }

  /// Get insertion order status by ad account id.
  ///
  ///   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get insertion order status by ad account id.
  ///
  ///   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<SsioInsertionOrdersStatusGetByAdAccount200Response?> ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, { String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await ssioInsertionOrdersStatusGetByAdAccountWithHttpInfo(adAccountId, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
  ///   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
  Future<Response> ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(String adAccountId, String pinOrderId, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get insertion order status by pin order id.
  ///
  ///   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] pinOrderId (required):
  ///   The pin order id associated with the ssio insertion order
  Future<SSIOInsertionOrderStatusResponse?> ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId, { Future<void>? abortTrigger, }) async {
    final response = await ssioInsertionOrdersStatusGetByPinOrderIdWithHttpInfo(adAccountId, pinOrderId, abortTrigger: abortTrigger,);
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
  ///   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] pinOrderId:
  ///   The pin order id associated with the SSIO insertion order
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> ssioOrderLinesGetByAdAccountWithHttpInfo(String adAccountId, { String? pinOrderId, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ssio/order_lines'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pinOrderId != null) {
      queryParams.addAll(_queryParams('', 'pin_order_id', pinOrderId));
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

  /// Get Salesforce order lines by ad account id.
  ///
  ///   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] pinOrderId:
  ///   The pin order id associated with the SSIO insertion order
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<SsioOrderLinesGetByAdAccount200Response?> ssioOrderLinesGetByAdAccount(String adAccountId, { String? pinOrderId, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await ssioOrderLinesGetByAdAccountWithHttpInfo(adAccountId, pinOrderId: pinOrderId, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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
