//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TermsApi {
  TermsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// List related terms
  ///
  /// Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<String>] terms (required):
  ///   List of input terms.
  Future<Response> termsRelatedListWithHttpInfo(List<String> terms, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/terms/related';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'terms', terms));

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

  /// List related terms
  ///
  /// Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
  ///
  /// Parameters:
  ///
  /// * [List<String>] terms (required):
  ///   List of input terms.
  Future<RelatedTerms?> termsRelatedList(List<String> terms, { Future<void>? abortTrigger, }) async {
    final response = await termsRelatedListWithHttpInfo(terms, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RelatedTerms',) as RelatedTerms;
    
    }
    return null;
  }

  /// List suggested terms
  ///
  /// Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] term (required):
  ///   Input term.
  ///
  /// * [int] limit:
  ///   Max suggested terms to return.
  Future<Response> termsSuggestedListWithHttpInfo(String term, { int? limit, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/terms/suggested';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'term', term));
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
      abortTrigger: abortTrigger,
    );
  }

  /// List suggested terms
  ///
  /// Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
  ///
  /// Parameters:
  ///
  /// * [String] term (required):
  ///   Input term.
  ///
  /// * [int] limit:
  ///   Max suggested terms to return.
  Future<List<String>?> termsSuggestedList(String term, { int? limit, Future<void>? abortTrigger, }) async {
    final response = await termsSuggestedListWithHttpInfo(term, limit: limit, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<String>') as List)
        .cast<String>()
        .toList(growable: false);

    }
    return null;
  }
}
