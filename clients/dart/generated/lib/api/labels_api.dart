//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class LabelsApi {
  LabelsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create labels
  ///
  /// <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelCreateRequest] labelCreateRequest (required):
  Future<Response> labelsCreateWithHttpInfo(String adAccountId, LabelCreateRequest labelCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/labels'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = labelCreateRequest;

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

  /// Create labels
  ///
  /// <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelCreateRequest] labelCreateRequest (required):
  Future<LabelsResponse?> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest,) async {
    final response = await labelsCreateWithHttpInfo(adAccountId, labelCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LabelsResponse',) as LabelsResponse;
    
    }
    return null;
  }

  /// List labels
  ///
  /// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [List<String>] labelIds:
  ///   List of Label Ids to use to filter the results.
  ///
  /// * [List<String>] entityStatuses:
  ///   Label entity status
  ///
  /// * [List<String>] labelTypes:
  ///   Label type.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> labelsListWithHttpInfo(String adAccountId, { List<String>? campaignIds, List<String>? labelIds, List<String>? entityStatuses, List<String>? labelTypes, int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/labels'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (campaignIds != null) {
      queryParams.addAll(_queryParams('multi', 'campaign_ids', campaignIds));
    }
    if (labelIds != null) {
      queryParams.addAll(_queryParams('multi', 'label_ids', labelIds));
    }
    if (entityStatuses != null) {
      queryParams.addAll(_queryParams('multi', 'entity_statuses', entityStatuses));
    }
    if (labelTypes != null) {
      queryParams.addAll(_queryParams('multi', 'label_types', labelTypes));
    }
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

  /// List labels
  ///
  /// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [List<String>] labelIds:
  ///   List of Label Ids to use to filter the results.
  ///
  /// * [List<String>] entityStatuses:
  ///   Label entity status
  ///
  /// * [List<String>] labelTypes:
  ///   Label type.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<LabelsList200Response?> labelsList(String adAccountId, { List<String>? campaignIds, List<String>? labelIds, List<String>? entityStatuses, List<String>? labelTypes, int? pageSize, String? bookmark, }) async {
    final response = await labelsListWithHttpInfo(adAccountId,  campaignIds: campaignIds, labelIds: labelIds, entityStatuses: entityStatuses, labelTypes: labelTypes, pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LabelsList200Response',) as LabelsList200Response;
    
    }
    return null;
  }

  /// Update labels
  ///
  /// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelUpdateRequest] labelUpdateRequest (required):
  Future<Response> labelsUpdateWithHttpInfo(String adAccountId, LabelUpdateRequest labelUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/labels'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = labelUpdateRequest;

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

  /// Update labels
  ///
  /// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelUpdateRequest] labelUpdateRequest (required):
  Future<LabelsResponse?> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest,) async {
    final response = await labelsUpdateWithHttpInfo(adAccountId, labelUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LabelsResponse',) as LabelsResponse;
    
    }
    return null;
  }
}
