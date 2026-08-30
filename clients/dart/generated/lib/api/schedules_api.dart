//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class SchedulesApi {
  SchedulesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create schedules
  ///
  /// Batch create schedules
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [List<ScheduleCreate>] scheduleCreate (required):
  Future<Response> schedulesCreateWithHttpInfo(String adAccountId, List<ScheduleCreate> scheduleCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/schedules'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = scheduleCreate;

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

  /// Create schedules
  ///
  /// Batch create schedules
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [List<ScheduleCreate>] scheduleCreate (required):
  Future<List<SchedulesCreate200ResponseInner>?> schedulesCreate(String adAccountId, List<ScheduleCreate> scheduleCreate, { Future<void>? abortTrigger, }) async {
    final response = await schedulesCreateWithHttpInfo(adAccountId, scheduleCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<SchedulesCreate200ResponseInner>') as List)
        .cast<SchedulesCreate200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get Schedules
  ///
  /// Get schedules for a specific advertiser
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [List<String>] entityIds (required):
  ///   List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
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
  /// * [List<ScheduleStatus>] scheduleStatuses:
  ///   Filter schedules by status (one or more)
  ///
  /// * [ScheduleType] scheduleType:
  ///   Filter schedules by a type
  Future<Response> schedulesListWithHttpInfo(String adAccountId, List<String> entityIds, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, List<ScheduleStatus>? scheduleStatuses, ScheduleType? scheduleType, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/schedules'
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
    if (scheduleStatuses != null) {
      queryParams.addAll(_queryParams('multi', 'schedule_statuses', scheduleStatuses));
    }
    if (scheduleType != null) {
      queryParams.addAll(_queryParams('', 'schedule_type', scheduleType));
    }
      queryParams.addAll(_queryParams('multi', 'entity_ids', entityIds));

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

  /// Get Schedules
  ///
  /// Get schedules for a specific advertiser
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [List<String>] entityIds (required):
  ///   List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
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
  /// * [List<ScheduleStatus>] scheduleStatuses:
  ///   Filter schedules by status (one or more)
  ///
  /// * [ScheduleType] scheduleType:
  ///   Filter schedules by a type
  Future<SchedulesList200Response?> schedulesList(String adAccountId, List<String> entityIds, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, List<ScheduleStatus>? scheduleStatuses, ScheduleType? scheduleType, Future<void>? abortTrigger, }) async {
    final response = await schedulesListWithHttpInfo(adAccountId, entityIds, bookmark: bookmark, pageSize: pageSize, order: order, scheduleStatuses: scheduleStatuses, scheduleType: scheduleType, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SchedulesList200Response',) as SchedulesList200Response;
    
    }
    return null;
  }

  /// Update schedules
  ///
  /// Update one or more schedules
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [List<ScheduleBatchUpdate>] scheduleBatchUpdate (required):
  Future<Response> schedulesUpdateWithHttpInfo(String adAccountId, List<ScheduleBatchUpdate> scheduleBatchUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/schedules'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = scheduleBatchUpdate;

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

  /// Update schedules
  ///
  /// Update one or more schedules
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [List<ScheduleBatchUpdate>] scheduleBatchUpdate (required):
  Future<List<SchedulesCreate200ResponseInner>?> schedulesUpdate(String adAccountId, List<ScheduleBatchUpdate> scheduleBatchUpdate, { Future<void>? abortTrigger, }) async {
    final response = await schedulesUpdateWithHttpInfo(adAccountId, scheduleBatchUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<SchedulesCreate200ResponseInner>') as List)
        .cast<SchedulesCreate200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }
}
