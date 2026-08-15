//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/brand_accounts_create200_response.dart';
import 'package:openapi/src/model/brand_accounts_create_request.dart';
import 'package:openapi/src/model/brand_accounts_update_request.dart';
import 'package:openapi/src/model/delete_partners_request.dart';
import 'package:openapi/src/model/delete_partners_response.dart';
import 'package:openapi/src/model/deleted_members_response.dart';
import 'package:openapi/src/model/error.dart';
import 'package:openapi/src/model/get_business_employers200_response.dart';
import 'package:openapi/src/model/get_business_members200_response.dart';
import 'package:openapi/src/model/get_business_partners200_response.dart';
import 'package:openapi/src/model/member_business_role.dart';
import 'package:openapi/src/model/members_to_delete_body.dart';
import 'package:openapi/src/model/partner_type.dart';
import 'package:openapi/src/model/system_user_update_request.dart';
import 'package:openapi/src/model/update_member_business_role_body.dart';
import 'package:openapi/src/model/update_member_results_response_array.dart';

class BusinessAccessRelationshipsApi {

  final Dio _dio;

  final Serializers _serializers;

  const BusinessAccessRelationshipsApi(this._dio, this._serializers);

  /// Create a Brand Account
  /// Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
  ///
  /// Parameters:
  /// * [businessHierarchyId] - business hierarchy node id
  /// * [brandAccountsCreateRequest] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BrandAccountsCreate200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BrandAccountsCreate200Response>> brandAccountsCreate({ 
    required String businessHierarchyId,
    required BrandAccountsCreateRequest brandAccountsCreateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts'.replaceAll('{' r'business_hierarchy_id' '}', encodeQueryParameter(_serializers, businessHierarchyId, const FullType(String)).toString());
    final _options = Options(
      method: r'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(BrandAccountsCreateRequest);
      _bodyData = _serializers.serialize(brandAccountsCreateRequest, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BrandAccountsCreate200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BrandAccountsCreate200Response),
      ) as BrandAccountsCreate200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BrandAccountsCreate200Response>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Update a Brand Account
  /// Update an existing Brand Account
  ///
  /// Parameters:
  /// * [businessHierarchyId] - business hierarchy node id
  /// * [brandAccountId] - Unique identifier of a brand account.
  /// * [brandAccountsUpdateRequest] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BrandAccountsCreate200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BrandAccountsCreate200Response>> brandAccountsUpdate({ 
    required String businessHierarchyId,
    required String brandAccountId,
    required BrandAccountsUpdateRequest brandAccountsUpdateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}'.replaceAll('{' r'business_hierarchy_id' '}', encodeQueryParameter(_serializers, businessHierarchyId, const FullType(String)).toString()).replaceAll('{' r'brand_account_id' '}', encodeQueryParameter(_serializers, brandAccountId, const FullType(String)).toString());
    final _options = Options(
      method: r'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(BrandAccountsUpdateRequest);
      _bodyData = _serializers.serialize(brandAccountsUpdateRequest, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BrandAccountsCreate200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BrandAccountsCreate200Response),
      ) as BrandAccountsCreate200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BrandAccountsCreate200Response>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Terminate business memberships
  /// Terminate memberships between the specified members and your business.
  ///
  /// Parameters:
  /// * [businessId] - Business id
  /// * [membersToDeleteBody] - List of members with role to delete.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [DeletedMembersResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<DeletedMembersResponse>> deleteBusinessMembership({ 
    required String businessId,
    required MembersToDeleteBody membersToDeleteBody,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/{business_id}/members'.replaceAll('{' r'business_id' '}', encodeQueryParameter(_serializers, businessId, const FullType(String)).toString());
    final _options = Options(
      method: r'DELETE',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(MembersToDeleteBody);
      _bodyData = _serializers.serialize(membersToDeleteBody, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    DeletedMembersResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(DeletedMembersResponse),
      ) as DeletedMembersResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<DeletedMembersResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Terminate business partnerships
  /// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
  ///
  /// Parameters:
  /// * [businessId] - Unique identifier of the requesting business.
  /// * [deletePartnersRequest] - An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [DeletePartnersResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<DeletePartnersResponse>> deleteBusinessPartners({ 
    required String businessId,
    required DeletePartnersRequest deletePartnersRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/{business_id}/partners'.replaceAll('{' r'business_id' '}', encodeQueryParameter(_serializers, businessId, const FullType(String)).toString());
    final _options = Options(
      method: r'DELETE',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(DeletePartnersRequest);
      _bodyData = _serializers.serialize(deletePartnersRequest, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    DeletePartnersResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(DeletePartnersResponse),
      ) as DeletePartnersResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<DeletePartnersResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// List business employers for user
  /// Get all of the viewing user&#39;s business employers.
  ///
  /// Parameters:
  /// * [pageSize] - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [GetBusinessEmployers200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<GetBusinessEmployers200Response>> getBusinessEmployers({ 
    int? pageSize = 25,
    String? bookmark,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/employers';
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    GetBusinessEmployers200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(GetBusinessEmployers200Response),
      ) as GetBusinessEmployers200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<GetBusinessEmployers200Response>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get business members
  /// Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
  ///
  /// Parameters:
  /// * [businessId] - Unique identifier of the requesting business.
  /// * [fetchSystemUsers] - Fetches system users if True. Fetches regular user employees if False.
  /// * [assetsSummary] - Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  /// * [businessRoles] - A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
  /// * [memberIds] - A list of business members ids separated by comma.
  /// * [startIndex] - An index to start fetching the results from. Only the results starting from this index will be returned.
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [pageSize] - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [GetBusinessMembers200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<GetBusinessMembers200Response>> getBusinessMembers({ 
    required String businessId,
    bool? fetchSystemUsers = false,
    bool? assetsSummary = false,
    BuiltList<MemberBusinessRole>? businessRoles,
    String? memberIds,
    int? startIndex = 0,
    String? bookmark,
    int? pageSize = 25,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/{business_id}/members'.replaceAll('{' r'business_id' '}', encodeQueryParameter(_serializers, businessId, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (fetchSystemUsers != null) r'fetch_system_users': encodeQueryParameter(_serializers, fetchSystemUsers, const FullType(bool)),
      if (assetsSummary != null) r'assets_summary': encodeQueryParameter(_serializers, assetsSummary, const FullType(bool)),
      if (businessRoles != null) r'business_roles': encodeCollectionQueryParameter<MemberBusinessRole>(_serializers, businessRoles, const FullType(BuiltList, [FullType(MemberBusinessRole)]), format: ListFormat.multi,),
      if (memberIds != null) r'member_ids': encodeQueryParameter(_serializers, memberIds, const FullType(String)),
      if (startIndex != null) r'start_index': encodeQueryParameter(_serializers, startIndex, const FullType(int)),
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    GetBusinessMembers200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(GetBusinessMembers200Response),
      ) as GetBusinessMembers200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<GetBusinessMembers200Response>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get business partners
  /// Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
  ///
  /// Parameters:
  /// * [businessId] - Unique identifier of the requesting business.
  /// * [assetsSummary] - Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  /// * [partnerType] - Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  /// * [partnerIds] - A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
  /// * [startIndex] - An index to start fetching the results from. Only the results starting from this index will be returned.
  /// * [pageSize] - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [GetBusinessPartners200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<GetBusinessPartners200Response>> getBusinessPartners({ 
    required String businessId,
    bool? assetsSummary = false,
    PartnerType? partnerType,
    String? partnerIds,
    int? startIndex = 0,
    int? pageSize = 25,
    String? bookmark,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/{business_id}/partners'.replaceAll('{' r'business_id' '}', encodeQueryParameter(_serializers, businessId, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (assetsSummary != null) r'assets_summary': encodeQueryParameter(_serializers, assetsSummary, const FullType(bool)),
      if (partnerType != null) r'partner_type': encodeQueryParameter(_serializers, partnerType, const FullType(PartnerType)),
      if (partnerIds != null) r'partner_ids': encodeQueryParameter(_serializers, partnerIds, const FullType(String)),
      if (startIndex != null) r'start_index': encodeQueryParameter(_serializers, startIndex, const FullType(int)),
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    GetBusinessPartners200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(GetBusinessPartners200Response),
      ) as GetBusinessPartners200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<GetBusinessPartners200Response>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Update a system user information.
  /// Update a system user information such as name.
  ///
  /// Parameters:
  /// * [businessId] - Unique identifier of the requesting business.
  /// * [systemUserId] - Unique identifier of a system user.
  /// * [systemUserUpdateRequest] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future]
  /// Throws [DioException] if API call or serialization fails
  Future<Response<void>> systemUserUpdate({ 
    required String businessId,
    required String systemUserId,
    required SystemUserUpdateRequest systemUserUpdateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/{business_id}/system_users/{system_user_id}'.replaceAll('{' r'business_id' '}', encodeQueryParameter(_serializers, businessId, const FullType(String)).toString()).replaceAll('{' r'system_user_id' '}', encodeQueryParameter(_serializers, systemUserId, const FullType(String)).toString());
    final _options = Options(
      method: r'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(SystemUserUpdateRequest);
      _bodyData = _serializers.serialize(systemUserUpdateRequest, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    return _response;
  }

  /// Update member&#39;s business role
  /// Update a member&#39;s business role within the business.
  ///
  /// Parameters:
  /// * [businessId] - Business id
  /// * [updateMemberBusinessRoleBody] - List of objects with the member id and the business_role.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [UpdateMemberResultsResponseArray] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<UpdateMemberResultsResponseArray>> updateBusinessMemberships({ 
    required String businessId,
    required BuiltList<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/businesses/{business_id}/members'.replaceAll('{' r'business_id' '}', encodeQueryParameter(_serializers, businessId, const FullType(String)).toString());
    final _options = Options(
      method: r'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(BuiltList, [FullType(UpdateMemberBusinessRoleBody)]);
      _bodyData = _serializers.serialize(updateMemberBusinessRoleBody, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    UpdateMemberResultsResponseArray? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(UpdateMemberResultsResponseArray),
      ) as UpdateMemberResultsResponseArray;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<UpdateMemberResultsResponseArray>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

}
