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

  /// Apply label to entity
  ///
  ///   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] labelId (required):
  ///   Label ID.
  ///
  /// * [LabeledEntitiesCreate] labeledEntitiesCreate (required):
  Future<Response> labelsApplyWithHttpInfo(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/labels/{label_id}/apply'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{label_id}', labelId);

    // ignore: prefer_final_locals
    Object? postBody = labeledEntitiesCreate;

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

  /// Apply label to entity
  ///
  ///   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] labelId (required):
  ///   Label ID.
  ///
  /// * [LabeledEntitiesCreate] labeledEntitiesCreate (required):
  Future<LabeledEntities?> labelsApply(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate, { Future<void>? abortTrigger, }) async {
    final response = await labelsApplyWithHttpInfo(adAccountId, labelId, labeledEntitiesCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LabeledEntities',) as LabeledEntities;
    
    }
    return null;
  }

  /// Create labels
  ///
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelCreateRequest] labelCreateRequest (required):
  Future<Response> labelsCreateWithHttpInfo(String adAccountId, LabelCreateRequest labelCreateRequest, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Create labels
  ///
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelCreateRequest] labelCreateRequest (required):
  Future<LabelsResponse?> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest, { Future<void>? abortTrigger, }) async {
    final response = await labelsCreateWithHttpInfo(adAccountId, labelCreateRequest, abortTrigger: abortTrigger,);
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
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
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
  /// * [List<QueryLabelEntityStatusesItems>] entityStatuses:
  ///   Label entity status
  ///
  /// * [List<QueryLabelTypesItems>] labelTypes:
  ///   Label type.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> labelsListWithHttpInfo(String adAccountId, { List<String>? campaignIds, List<String>? labelIds, List<QueryLabelEntityStatusesItems>? entityStatuses, List<QueryLabelTypesItems>? labelTypes, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
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

  /// List labels
  ///
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
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
  /// * [List<QueryLabelEntityStatusesItems>] entityStatuses:
  ///   Label entity status
  ///
  /// * [List<QueryLabelTypesItems>] labelTypes:
  ///   Label type.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<LabelsList200Response?> labelsList(String adAccountId, { List<String>? campaignIds, List<String>? labelIds, List<QueryLabelEntityStatusesItems>? entityStatuses, List<QueryLabelTypesItems>? labelTypes, String? bookmark, int? pageSize, Future<void>? abortTrigger, }) async {
    final response = await labelsListWithHttpInfo(adAccountId, campaignIds: campaignIds, labelIds: labelIds, entityStatuses: entityStatuses, labelTypes: labelTypes, bookmark: bookmark, pageSize: pageSize, abortTrigger: abortTrigger,);
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

  /// Remove label from entities
  ///
  ///   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] labelId (required):
  ///   Label ID.
  ///
  /// * [LabeledEntitiesCreate] labeledEntitiesCreate (required):
  Future<Response> labelsRemoveWithHttpInfo(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/labels/{label_id}/remove'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{label_id}', labelId);

    // ignore: prefer_final_locals
    Object? postBody = labeledEntitiesCreate;

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

  /// Remove label from entities
  ///
  ///   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] labelId (required):
  ///   Label ID.
  ///
  /// * [LabeledEntitiesCreate] labeledEntitiesCreate (required):
  Future<LabeledEntities?> labelsRemove(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate, { Future<void>? abortTrigger, }) async {
    final response = await labelsRemoveWithHttpInfo(adAccountId, labelId, labeledEntitiesCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'LabeledEntities',) as LabeledEntities;
    
    }
    return null;
  }

  /// Update labels
  ///
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelUpdateRequest] labelUpdateRequest (required):
  Future<Response> labelsUpdateWithHttpInfo(String adAccountId, LabelUpdateRequest labelUpdateRequest, { Future<void>? abortTrigger, }) async {
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
      abortTrigger: abortTrigger,
    );
  }

  /// Update labels
  ///
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [LabelUpdateRequest] labelUpdateRequest (required):
  Future<LabelsResponse?> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest, { Future<void>? abortTrigger, }) async {
    final response = await labelsUpdateWithHttpInfo(adAccountId, labelUpdateRequest, abortTrigger: abortTrigger,);
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
