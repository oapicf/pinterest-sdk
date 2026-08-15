//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class LeadFormsApi {
  LeadFormsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get lead form by id
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] leadFormId (required):
  ///   Unique identifier of a lead form.
  Future<Response> leadFormGetWithHttpInfo(String adAccountId, String leadFormId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{lead_form_id}', leadFormId);

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

  /// Get lead form by id
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] leadFormId (required):
  ///   Unique identifier of a lead form.
  Future<LeadFormResponse?> leadFormGet(String adAccountId, String leadFormId,) async {
    final response = await leadFormGetWithHttpInfo(adAccountId, leadFormId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadFormResponse',) as LeadFormResponse;
    
    }
    return null;
  }

  /// Create lead form test data
  ///
  /// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] leadFormId (required):
  ///   Unique identifier of a lead form.
  ///
  /// * [LeadFormTestRequest] leadFormTestRequest (required):
  ///   Subscription to create.
  Future<Response> leadFormTestCreateWithHttpInfo(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{lead_form_id}', leadFormId);

    // ignore: prefer_final_locals
    Object? postBody = leadFormTestRequest;

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

  /// Create lead form test data
  ///
  /// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] leadFormId (required):
  ///   Unique identifier of a lead form.
  ///
  /// * [LeadFormTestRequest] leadFormTestRequest (required):
  ///   Subscription to create.
  Future<LeadFormTestResponse?> leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest,) async {
    final response = await leadFormTestCreateWithHttpInfo(adAccountId, leadFormId, leadFormTestRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadFormTestResponse',) as LeadFormTestResponse;
    
    }
    return null;
  }

  /// Create lead forms
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<LeadFormCreateRequest>] leadFormCreateRequest (required):
  ///   List of lead forms to create, size limit [1, 30].
  Future<Response> leadFormsCreateWithHttpInfo(String adAccountId, List<LeadFormCreateRequest> leadFormCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/lead_forms'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = leadFormCreateRequest;

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

  /// Create lead forms
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<LeadFormCreateRequest>] leadFormCreateRequest (required):
  ///   List of lead forms to create, size limit [1, 30].
  Future<LeadFormArrayResponse?> leadFormsCreate(String adAccountId, List<LeadFormCreateRequest> leadFormCreateRequest,) async {
    final response = await leadFormsCreateWithHttpInfo(adAccountId, leadFormCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadFormArrayResponse',) as LeadFormArrayResponse;
    
    }
    return null;
  }

  /// List lead forms
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
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
  Future<Response> leadFormsListWithHttpInfo(String adAccountId, { int? pageSize, String? order, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/lead_forms'
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

  /// List lead forms
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
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
  Future<LeadFormsList200Response?> leadFormsList(String adAccountId, { int? pageSize, String? order, String? bookmark, }) async {
    final response = await leadFormsListWithHttpInfo(adAccountId,  pageSize: pageSize, order: order, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadFormsList200Response',) as LeadFormsList200Response;
    
    }
    return null;
  }

  /// Update lead forms
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<LeadFormUpdateRequest>] leadFormUpdateRequest (required):
  ///   List of lead forms to update, size limit [1, 30].
  Future<Response> leadFormsUpdateWithHttpInfo(String adAccountId, List<LeadFormUpdateRequest> leadFormUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/lead_forms'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = leadFormUpdateRequest;

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

  /// Update lead forms
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<LeadFormUpdateRequest>] leadFormUpdateRequest (required):
  ///   List of lead forms to update, size limit [1, 30].
  Future<LeadFormArrayResponse?> leadFormsUpdate(String adAccountId, List<LeadFormUpdateRequest> leadFormUpdateRequest,) async {
    final response = await leadFormsUpdateWithHttpInfo(adAccountId, leadFormUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LeadFormArrayResponse',) as LeadFormArrayResponse;
    
    }
    return null;
  }
}
