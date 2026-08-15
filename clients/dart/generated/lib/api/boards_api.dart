//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BoardsApi {
  BoardsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create board section
  ///
  /// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [BoardSection] boardSection (required):
  ///   Create a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardSectionsCreateWithHttpInfo(String boardId, BoardSection boardSection, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}/sections'
      .replaceAll('{board_id}', boardId);

    // ignore: prefer_final_locals
    Object? postBody = boardSection;

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

  /// Create board section
  ///
  /// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [BoardSection] boardSection (required):
  ///   Create a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<BoardSection?> boardSectionsCreate(String boardId, BoardSection boardSection, { String? adAccountId, }) async {
    final response = await boardSectionsCreateWithHttpInfo(boardId, boardSection,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardSection',) as BoardSection;
    
    }
    return null;
  }

  /// Delete board section
  ///
  /// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] sectionId (required):
  ///   Unique identifier of a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardSectionsDeleteWithHttpInfo(String boardId, String sectionId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}/sections/{section_id}'
      .replaceAll('{board_id}', boardId)
      .replaceAll('{section_id}', sectionId);

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

  /// Delete board section
  ///
  /// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] sectionId (required):
  ///   Unique identifier of a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<void> boardSectionsDelete(String boardId, String sectionId, { String? adAccountId, }) async {
    final response = await boardSectionsDeleteWithHttpInfo(boardId, sectionId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// List board sections
  ///
  /// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> boardSectionsListWithHttpInfo(String boardId, { String? adAccountId, String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}/sections'
      .replaceAll('{board_id}', boardId);

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

  /// List board sections
  ///
  /// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<BoardSectionsList200Response?> boardSectionsList(String boardId, { String? adAccountId, String? bookmark, int? pageSize, }) async {
    final response = await boardSectionsListWithHttpInfo(boardId,  adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardSectionsList200Response',) as BoardSectionsList200Response;
    
    }
    return null;
  }

  /// List Pins on board section
  ///
  /// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] sectionId (required):
  ///   Unique identifier of a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<Response> boardSectionsListPinsWithHttpInfo(String boardId, String sectionId, { String? adAccountId, String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}/sections/{section_id}/pins'
      .replaceAll('{board_id}', boardId)
      .replaceAll('{section_id}', sectionId);

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

  /// List Pins on board section
  ///
  /// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] sectionId (required):
  ///   Unique identifier of a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  Future<BoardsListPins200Response?> boardSectionsListPins(String boardId, String sectionId, { String? adAccountId, String? bookmark, int? pageSize, }) async {
    final response = await boardSectionsListPinsWithHttpInfo(boardId, sectionId,  adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardsListPins200Response',) as BoardsListPins200Response;
    
    }
    return null;
  }

  /// Update board section
  ///
  /// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] sectionId (required):
  ///   Unique identifier of a board section.
  ///
  /// * [BoardSection] boardSection (required):
  ///   Update a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardSectionsUpdateWithHttpInfo(String boardId, String sectionId, BoardSection boardSection, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}/sections/{section_id}'
      .replaceAll('{board_id}', boardId)
      .replaceAll('{section_id}', sectionId);

    // ignore: prefer_final_locals
    Object? postBody = boardSection;

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

  /// Update board section
  ///
  /// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] sectionId (required):
  ///   Unique identifier of a board section.
  ///
  /// * [BoardSection] boardSection (required):
  ///   Update a board section.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<BoardSection?> boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection, { String? adAccountId, }) async {
    final response = await boardSectionsUpdateWithHttpInfo(boardId, sectionId, boardSection,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardSection',) as BoardSection;
    
    }
    return null;
  }

  /// Create board
  ///
  /// Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [BoardCreate] boardCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardsCreateWithHttpInfo(BoardCreate boardCreate, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards';

    // ignore: prefer_final_locals
    Object? postBody = boardCreate;

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

  /// Create board
  ///
  /// Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [BoardCreate] boardCreate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Board?> boardsCreate(BoardCreate boardCreate, { String? adAccountId, }) async {
    final response = await boardsCreateWithHttpInfo(boardCreate,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Board',) as Board;
    
    }
    return null;
  }

  /// Delete board
  ///
  /// Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardsDeleteWithHttpInfo(String boardId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}'
      .replaceAll('{board_id}', boardId);

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

  /// Delete board
  ///
  /// Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<void> boardsDelete(String boardId, { String? adAccountId, }) async {
    final response = await boardsDeleteWithHttpInfo(boardId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get board
  ///
  /// Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardsGetWithHttpInfo(String boardId, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}'
      .replaceAll('{board_id}', boardId);

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
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get board
  ///
  /// Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Board?> boardsGet(String boardId, { String? adAccountId, }) async {
    final response = await boardsGetWithHttpInfo(boardId,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Board',) as Board;
    
    }
    return null;
  }

  /// List boards
  ///
  /// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [BoardPrivacyFilter] privacy:
  ///   The privacy level of the board
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> boardsListWithHttpInfo({ String? adAccountId, BoardPrivacyFilter? privacy, String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (privacy != null) {
      queryParams.addAll(_queryParams('', 'privacy', privacy));
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

  /// List boards
  ///
  /// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [BoardPrivacyFilter] privacy:
  ///   The privacy level of the board
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<BoardsList200Response?> boardsList({ String? adAccountId, BoardPrivacyFilter? privacy, String? bookmark, int? pageSize, }) async {
    final response = await boardsListWithHttpInfo( adAccountId: adAccountId, privacy: privacy, bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardsList200Response',) as BoardsList200Response;
    
    }
    return null;
  }

  /// List Pins on board
  ///
  /// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [List<CreativeType>] creativeTypes:
  ///   Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<Response> boardsListPinsWithHttpInfo(String boardId, { String? bookmark, int? pageSize, List<CreativeType>? creativeTypes, String? adAccountId, bool? pinMetrics, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}/pins'
      .replaceAll('{board_id}', boardId);

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
    if (creativeTypes != null) {
      queryParams.addAll(_queryParams('multi', 'creative_types', creativeTypes));
    }
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

  /// List Pins on board
  ///
  /// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///   Unique identifier of a board.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [List<CreativeType>] creativeTypes:
  ///   Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] pinMetrics:
  ///   Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
  Future<BoardsListPins200Response?> boardsListPins(String boardId, { String? bookmark, int? pageSize, List<CreativeType>? creativeTypes, String? adAccountId, bool? pinMetrics, }) async {
    final response = await boardsListPinsWithHttpInfo(boardId,  bookmark: bookmark, pageSize: pageSize, creativeTypes: creativeTypes, adAccountId: adAccountId, pinMetrics: pinMetrics, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardsListPins200Response',) as BoardsListPins200Response;
    
    }
    return null;
  }

  /// Update board
  ///
  /// Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///
  /// * [BoardWithUpdatePrivacyUpdate] boardWithUpdatePrivacyUpdate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> boardsUpdateWithHttpInfo(String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, { String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/boards/{board_id}'
      .replaceAll('{board_id}', boardId);

    // ignore: prefer_final_locals
    Object? postBody = boardWithUpdatePrivacyUpdate;

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

  /// Update board
  ///
  /// Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
  ///
  /// Parameters:
  ///
  /// * [String] boardId (required):
  ///
  /// * [BoardWithUpdatePrivacyUpdate] boardWithUpdatePrivacyUpdate (required):
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<BoardWithUpdatePrivacy?> boardsUpdate(String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, { String? adAccountId, }) async {
    final response = await boardsUpdateWithHttpInfo(boardId, boardWithUpdatePrivacyUpdate,  adAccountId: adAccountId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BoardWithUpdatePrivacy',) as BoardWithUpdatePrivacy;
    
    }
    return null;
  }
}
