//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiClient {
  ApiClient({this.basePath = 'https://api.pinterest.com/v5', this.authentication,});

  final String basePath;
  final Authentication? authentication;

  var _client = Client();
  final _defaultHeaderMap = <String, String>{};

  /// Returns the current HTTP [Client] instance to use in this class.
  ///
  /// The return value is guaranteed to never be null.
  Client get client => _client;

  /// Requests to use a new HTTP [Client] in this class.
  set client(Client newClient) {
    _client = newClient;
  }

  Map<String, String> get defaultHeaderMap => _defaultHeaderMap;

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi', a key might appear multiple times.
  Future<Response> invokeAPI(
    String path,
    String method,
    List<QueryParam> queryParams,
    Object? body,
    Map<String, String> headerParams,
    Map<String, String> formParams,
    String? contentType,
  ) async {
    await authentication?.applyToParams(queryParams, headerParams);

    headerParams.addAll(_defaultHeaderMap);
    if (contentType != null) {
      headerParams['Content-Type'] = contentType;
    }

    final urlEncodedQueryParams = queryParams.map((param) => '$param');
    final queryString = urlEncodedQueryParams.isNotEmpty ? '?${urlEncodedQueryParams.join('&')}' : '';
    final uri = Uri.parse('$basePath$path$queryString');

    try {
      // Special case for uploading a single file which isn't a 'multipart/form-data'.
      if (
        body is MultipartFile && (contentType == null ||
        !contentType.toLowerCase().startsWith('multipart/form-data'))
      ) {
        final request = StreamedRequest(method, uri);
        request.headers.addAll(headerParams);
        request.contentLength = body.length;
        body.finalize().listen(
          request.sink.add,
          onDone: request.sink.close,
          // ignore: avoid_types_on_closure_parameters
          onError: (Object error, StackTrace trace) => request.sink.close(),
          cancelOnError: true,
        );
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      if (body is MultipartRequest) {
        final request = MultipartRequest(method, uri);
        request.fields.addAll(body.fields);
        request.files.addAll(body.files);
        request.headers.addAll(body.headers);
        request.headers.addAll(headerParams);
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      final msgBody = contentType == 'application/x-www-form-urlencoded'
        ? formParams
        : await serializeAsync(body);
      final nullableHeaderParams = headerParams.isEmpty ? null : headerParams;

      switch(method) {
        case 'POST': return await _client.post(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PUT': return await _client.put(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'DELETE': return await _client.delete(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PATCH': return await _client.patch(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'HEAD': return await _client.head(uri, headers: nullableHeaderParams,);
        case 'GET': return await _client.get(uri, headers: nullableHeaderParams,);
      }
    } on SocketException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Socket operation failed: $method $path',
        error,
        trace,
      );
    } on TlsException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'TLS/SSL communication failed: $method $path',
        error,
        trace,
      );
    } on IOException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'I/O operation failed: $method $path',
        error,
        trace,
      );
    } on ClientException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'HTTP connection failed: $method $path',
        error,
        trace,
      );
    } on Exception catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Exception occurred: $method $path',
        error,
        trace,
      );
    }

    throw ApiException(
      HttpStatus.badRequest,
      'Invalid HTTP operation: $method $path',
    );
  }

  Future<dynamic> deserializeAsync(String value, String targetType, {bool growable = false,}) async =>
    // ignore: deprecated_member_use_from_same_package
    deserialize(value, targetType, growable: growable);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use deserializeAsync() instead.')
  dynamic deserialize(String value, String targetType, {bool growable = false,}) {
    // Remove all spaces. Necessary for regular expressions as well.
    targetType = targetType.replaceAll(' ', ''); // ignore: parameter_assignments

    // If the expected target type is String, nothing to do...
    return targetType == 'String'
      ? value
      : fromJson(json.decode(value), targetType, growable: growable);
  }

  // ignore: deprecated_member_use_from_same_package
  Future<String> serializeAsync(Object? value) async => serialize(value);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use serializeAsync() instead.')
  String serialize(Object? value) => value == null ? '' : json.encode(value);

  /// Returns a native instance of an OpenAPI class matching the [specified type][targetType].
  static dynamic fromJson(dynamic value, String targetType, {bool growable = false,}) {
    try {
      switch (targetType) {
        case 'String':
          return value is String ? value : value.toString();
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'bool':
          if (value is bool) {
            return value;
          }
          final valueString = '$value'.toLowerCase();
          return valueString == 'true' || valueString == '1';
        case 'DateTime':
          return value is DateTime ? value : DateTime.tryParse(value);
        case 'Account':
          return Account.fromJson(value);
        case 'ActionType':
          return ActionTypeTypeTransformer().decode(value);
        case 'AdAccount':
          return AdAccount.fromJson(value);
        case 'AdAccountAnalyticsResponseInner':
          return AdAccountAnalyticsResponseInner.fromJson(value);
        case 'AdAccountCreate':
          return AdAccountCreate.fromJson(value);
        case 'AdAccountCreateSubscriptionRequest':
          return AdAccountCreateSubscriptionRequest.fromJson(value);
        case 'AdAccountCreateSubscriptionRequestPartnerMetadata':
          return AdAccountCreateSubscriptionRequestPartnerMetadata.fromJson(value);
        case 'AdAccountCreateSubscriptionResponse':
          return AdAccountCreateSubscriptionResponse.fromJson(value);
        case 'AdAccountGetSubscriptionResponse':
          return AdAccountGetSubscriptionResponse.fromJson(value);
        case 'AdAccountOwner':
          return AdAccountOwner.fromJson(value);
        case 'AdAccountsAudiencesSharedAccountsList200Response':
          return AdAccountsAudiencesSharedAccountsList200Response.fromJson(value);
        case 'AdAccountsCountryResponse':
          return AdAccountsCountryResponse.fromJson(value);
        case 'AdAccountsCountryResponseData':
          return AdAccountsCountryResponseData.fromJson(value);
        case 'AdAccountsList200Response':
          return AdAccountsList200Response.fromJson(value);
        case 'AdAccountsSubscriptionsGetList200Response':
          return AdAccountsSubscriptionsGetList200Response.fromJson(value);
        case 'AdArrayResponse':
          return AdArrayResponse.fromJson(value);
        case 'AdArrayResponseElement':
          return AdArrayResponseElement.fromJson(value);
        case 'AdCommon':
          return AdCommon.fromJson(value);
        case 'AdCountry':
          return AdCountryTypeTransformer().decode(value);
        case 'AdCreateRequest':
          return AdCreateRequest.fromJson(value);
        case 'AdGroupArrayResponse':
          return AdGroupArrayResponse.fromJson(value);
        case 'AdGroupArrayResponseElement':
          return AdGroupArrayResponseElement.fromJson(value);
        case 'AdGroupAudienceSizingRequest':
          return AdGroupAudienceSizingRequest.fromJson(value);
        case 'AdGroupAudienceSizingRequestKeywordsInner':
          return AdGroupAudienceSizingRequestKeywordsInner.fromJson(value);
        case 'AdGroupAudienceSizingResponse':
          return AdGroupAudienceSizingResponse.fromJson(value);
        case 'AdGroupCommon':
          return AdGroupCommon.fromJson(value);
        case 'AdGroupCreateRequest':
          return AdGroupCreateRequest.fromJson(value);
        case 'AdGroupIdFilter':
          return AdGroupIdFilter.fromJson(value);
        case 'AdGroupResponse':
          return AdGroupResponse.fromJson(value);
        case 'AdGroupSummaryStatus':
          return AdGroupSummaryStatusTypeTransformer().decode(value);
        case 'AdGroupUpdateRequest':
          return AdGroupUpdateRequest.fromJson(value);
        case 'AdGroupsAnalyticsResponseInner':
          return AdGroupsAnalyticsResponseInner.fromJson(value);
        case 'AdGroupsList200Response':
          return AdGroupsList200Response.fromJson(value);
        case 'AdPinAnalytics':
          return AdPinAnalytics.fromJson(value);
        case 'AdPinId':
          return AdPinId.fromJson(value);
        case 'AdPreviewCreateFromImage':
          return AdPreviewCreateFromImage.fromJson(value);
        case 'AdPreviewCreateFromPin':
          return AdPreviewCreateFromPin.fromJson(value);
        case 'AdPreviewRequest':
          return AdPreviewRequest.fromJson(value);
        case 'AdPreviewShopping':
          return AdPreviewShopping.fromJson(value);
        case 'AdPreviewURLResponse':
          return AdPreviewURLResponse.fromJson(value);
        case 'AdResponse':
          return AdResponse.fromJson(value);
        case 'AdUpdateRequest':
          return AdUpdateRequest.fromJson(value);
        case 'AdsAnalyticsAdGroupTargetingType':
          return AdsAnalyticsAdGroupTargetingTypeTypeTransformer().decode(value);
        case 'AdsAnalyticsAdTargetingType':
          return AdsAnalyticsAdTargetingTypeTypeTransformer().decode(value);
        case 'AdsAnalyticsCampaignTargetingType':
          return AdsAnalyticsCampaignTargetingTypeTypeTransformer().decode(value);
        case 'AdsAnalyticsCreateAsyncRequest':
          return AdsAnalyticsCreateAsyncRequest.fromJson(value);
        case 'AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics':
          return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.fromJson(value);
        case 'AdsAnalyticsCreateAsyncResponse':
          return AdsAnalyticsCreateAsyncResponse.fromJson(value);
        case 'AdsAnalyticsFilterColumn':
          return AdsAnalyticsFilterColumnTypeTransformer().decode(value);
        case 'AdsAnalyticsFilterOperator':
          return AdsAnalyticsFilterOperatorTypeTransformer().decode(value);
        case 'AdsAnalyticsGetAsyncResponse':
          return AdsAnalyticsGetAsyncResponse.fromJson(value);
        case 'AdsAnalyticsMetricsFilter':
          return AdsAnalyticsMetricsFilter.fromJson(value);
        case 'AdsAnalyticsResponseInner':
          return AdsAnalyticsResponseInner.fromJson(value);
        case 'AdsAnalyticsTargetingType':
          return AdsAnalyticsTargetingTypeTypeTransformer().decode(value);
        case 'AdsCreditDiscountsResponse':
          return AdsCreditDiscountsResponse.fromJson(value);
        case 'AdsCreditRedeemRequest':
          return AdsCreditRedeemRequest.fromJson(value);
        case 'AdsCreditRedeemResponse':
          return AdsCreditRedeemResponse.fromJson(value);
        case 'AdsCreditsDiscountsGet200Response':
          return AdsCreditsDiscountsGet200Response.fromJson(value);
        case 'AdsList200Response':
          return AdsList200Response.fromJson(value);
        case 'AdvancedAuctionBidOptions':
          return AdvancedAuctionBidOptions.fromJson(value);
        case 'AdvancedAuctionItem':
          return AdvancedAuctionItem.fromJson(value);
        case 'AdvancedAuctionItems':
          return AdvancedAuctionItems.fromJson(value);
        case 'AdvancedAuctionItemsGetRecord':
          return AdvancedAuctionItemsGetRecord.fromJson(value);
        case 'AdvancedAuctionItemsGetRequest':
          return AdvancedAuctionItemsGetRequest.fromJson(value);
        case 'AdvancedAuctionItemsSubmitDeleteRecord':
          return AdvancedAuctionItemsSubmitDeleteRecord.fromJson(value);
        case 'AdvancedAuctionItemsSubmitRecord':
          return AdvancedAuctionItemsSubmitRecord.fromJson(value);
        case 'AdvancedAuctionItemsSubmitRequest':
          return AdvancedAuctionItemsSubmitRequest.fromJson(value);
        case 'AdvancedAuctionItemsSubmitUpsertRecord':
          return AdvancedAuctionItemsSubmitUpsertRecord.fromJson(value);
        case 'AdvancedAuctionKey':
          return AdvancedAuctionKey.fromJson(value);
        case 'AdvancedAuctionOperation':
          return AdvancedAuctionOperationTypeTransformer().decode(value);
        case 'AdvancedAuctionOperationError':
          return AdvancedAuctionOperationError.fromJson(value);
        case 'AdvancedAuctionProcessedItems':
          return AdvancedAuctionProcessedItems.fromJson(value);
        case 'AdvertiserDefinedEvent':
          return AdvertiserDefinedEvent.fromJson(value);
        case 'AdvertiserDefinedEventsResponse':
          return AdvertiserDefinedEventsResponse.fromJson(value);
        case 'AgeTrendsBucket':
          return AgeTrendsBucketTypeTransformer().decode(value);
        case 'AllOf':
          return AllOf.fromJson(value);
        case 'AmazonConnectRequest':
          return AmazonConnectRequest.fromJson(value);
        case 'AnalyticsDailyMetrics':
          return AnalyticsDailyMetrics.fromJson(value);
        case 'AnalyticsMetricsResponse':
          return AnalyticsMetricsResponse.fromJson(value);
        case 'AnyOf':
          return AnyOf.fromJson(value);
        case 'AppTypeMultipliers':
          return AppTypeMultipliers.fromJson(value);
        case 'AssetGroupBinding':
          return AssetGroupBinding.fromJson(value);
        case 'AssetGroupType':
          return AssetGroupTypeTypeTransformer().decode(value);
        case 'AssetIdPermissions':
          return AssetIdPermissions.fromJson(value);
        case 'Audience':
          return Audience.fromJson(value);
        case 'AudienceAccountType':
          return AudienceAccountTypeTypeTransformer().decode(value);
        case 'AudienceCategory':
          return AudienceCategory.fromJson(value);
        case 'AudienceCommon':
          return AudienceCommon.fromJson(value);
        case 'AudienceCreateRequest':
          return AudienceCreateRequest.fromJson(value);
        case 'AudienceDefinition':
          return AudienceDefinition.fromJson(value);
        case 'AudienceDefinitionResponse':
          return AudienceDefinitionResponse.fromJson(value);
        case 'AudienceDefinitionScope':
          return AudienceDefinitionScope.fromJson(value);
        case 'AudienceDefinitionType':
          return AudienceDefinitionType.fromJson(value);
        case 'AudienceDemographicValue':
          return AudienceDemographicValue.fromJson(value);
        case 'AudienceDemographics':
          return AudienceDemographics.fromJson(value);
        case 'AudienceInsightCategoryArrayResponse':
          return AudienceInsightCategoryArrayResponse.fromJson(value);
        case 'AudienceInsightCategoryCommon':
          return AudienceInsightCategoryCommon.fromJson(value);
        case 'AudienceInsightType':
          return AudienceInsightTypeTypeTransformer().decode(value);
        case 'AudienceInsightsResponse':
          return AudienceInsightsResponse.fromJson(value);
        case 'AudienceRule':
          return AudienceRule.fromJson(value);
        case 'AudienceShareType':
          return AudienceShareTypeTypeTransformer().decode(value);
        case 'AudienceSubcategory':
          return AudienceSubcategory.fromJson(value);
        case 'AudienceType':
          return AudienceTypeTypeTransformer().decode(value);
        case 'AudienceUpdateOperationType':
          return AudienceUpdateOperationTypeTypeTransformer().decode(value);
        case 'AudienceUpdateRequest':
          return AudienceUpdateRequest.fromJson(value);
        case 'AudiencesList200Response':
          return AudiencesList200Response.fromJson(value);
        case 'AuthRespondInvitesBody':
          return AuthRespondInvitesBody.fromJson(value);
        case 'AuthRespondInvitesBodyInvitesInner':
          return AuthRespondInvitesBodyInvitesInner.fromJson(value);
        case 'AuthRespondInvitesBodyInvitesInnerAction':
          return AuthRespondInvitesBodyInvitesInnerAction.fromJson(value);
        case 'AvailabilityFilter':
          return AvailabilityFilter.fromJson(value);
        case 'BaseInviteDataResponse':
          return BaseInviteDataResponse.fromJson(value);
        case 'BaseInviteDataResponseInviteData':
          return BaseInviteDataResponseInviteData.fromJson(value);
        case 'BatchOperation':
          return BatchOperationTypeTransformer().decode(value);
        case 'BatchOperationStatus':
          return BatchOperationStatusTypeTransformer().decode(value);
        case 'BidFloor':
          return BidFloor.fromJson(value);
        case 'BidFloorRequest':
          return BidFloorRequest.fromJson(value);
        case 'BidFloorSpec':
          return BidFloorSpec.fromJson(value);
        case 'BillingInvoiceDownloadResponse':
          return BillingInvoiceDownloadResponse.fromJson(value);
        case 'BillingInvoiceResponse':
          return BillingInvoiceResponse.fromJson(value);
        case 'BillingInvoicesGet200Response':
          return BillingInvoicesGet200Response.fromJson(value);
        case 'BillingProfilesGet200Response':
          return BillingProfilesGet200Response.fromJson(value);
        case 'BillingProfilesResponse':
          return BillingProfilesResponse.fromJson(value);
        case 'Board':
          return Board.fromJson(value);
        case 'BoardBase':
          return BoardBase.fromJson(value);
        case 'BoardCreate':
          return BoardCreate.fromJson(value);
        case 'BoardMedia':
          return BoardMedia.fromJson(value);
        case 'BoardOwner':
          return BoardOwner.fromJson(value);
        case 'BoardPrivacy':
          return BoardPrivacyTypeTransformer().decode(value);
        case 'BoardPrivacyFilter':
          return BoardPrivacyFilterTypeTransformer().decode(value);
        case 'BoardSection':
          return BoardSection.fromJson(value);
        case 'BoardSectionsList200Response':
          return BoardSectionsList200Response.fromJson(value);
        case 'BoardUpdatePrivacy':
          return BoardUpdatePrivacyTypeTransformer().decode(value);
        case 'BoardWithUpdatePrivacy':
          return BoardWithUpdatePrivacy.fromJson(value);
        case 'BoardWithUpdatePrivacyUpdate':
          return BoardWithUpdatePrivacyUpdate.fromJson(value);
        case 'BoardsList200Response':
          return BoardsList200Response.fromJson(value);
        case 'BoardsListPins200Response':
          return BoardsListPins200Response.fromJson(value);
        case 'BoardsUserFollowsList200Response':
          return BoardsUserFollowsList200Response.fromJson(value);
        case 'BookClosedResponse':
          return BookClosedResponse.fromJson(value);
        case 'BrandAccountsCreate200Response':
          return BrandAccountsCreate200Response.fromJson(value);
        case 'BrandAccountsCreateRequest':
          return BrandAccountsCreateRequest.fromJson(value);
        case 'BrandAccountsUpdateRequest':
          return BrandAccountsUpdateRequest.fromJson(value);
        case 'BrandFilter':
          return BrandFilter.fromJson(value);
        case 'BudgetType':
          return BudgetTypeTypeTransformer().decode(value);
        case 'BulkDownloadRequest':
          return BulkDownloadRequest.fromJson(value);
        case 'BulkDownloadRequestCampaignFilter':
          return BulkDownloadRequestCampaignFilter.fromJson(value);
        case 'BulkDownloadResponse':
          return BulkDownloadResponse.fromJson(value);
        case 'BulkEntityType':
          return BulkEntityTypeTypeTransformer().decode(value);
        case 'BulkOutputFormat':
          return BulkOutputFormatTypeTransformer().decode(value);
        case 'BulkReportingJobStatus':
          return BulkReportingJobStatusTypeTransformer().decode(value);
        case 'BulkUpsertRequest':
          return BulkUpsertRequest.fromJson(value);
        case 'BulkUpsertRequestCreate':
          return BulkUpsertRequestCreate.fromJson(value);
        case 'BulkUpsertRequestUpdate':
          return BulkUpsertRequestUpdate.fromJson(value);
        case 'BulkUpsertResponse':
          return BulkUpsertResponse.fromJson(value);
        case 'BulkUpsertStatus':
          return BulkUpsertStatusTypeTransformer().decode(value);
        case 'BulkUpsertStatusResponse':
          return BulkUpsertStatusResponse.fromJson(value);
        case 'BusinessAccessError':
          return BusinessAccessError.fromJson(value);
        case 'BusinessAccessRole':
          return BusinessAccessRoleTypeTransformer().decode(value);
        case 'BusinessAccessUserSummary':
          return BusinessAccessUserSummary.fromJson(value);
        case 'BusinessAssetMembersGet200Response':
          return BusinessAssetMembersGet200Response.fromJson(value);
        case 'BusinessAssetPartnersGet200Response':
          return BusinessAssetPartnersGet200Response.fromJson(value);
        case 'BusinessAssetsGet200Response':
          return BusinessAssetsGet200Response.fromJson(value);
        case 'BusinessMemberAssetsGet200Response':
          return BusinessMemberAssetsGet200Response.fromJson(value);
        case 'BusinessMemberAssetsSummary':
          return BusinessMemberAssetsSummary.fromJson(value);
        case 'BusinessMemberAssetsSummaryAdAccountsInner':
          return BusinessMemberAssetsSummaryAdAccountsInner.fromJson(value);
        case 'BusinessMemberAssetsSummaryProfilesInner':
          return BusinessMemberAssetsSummaryProfilesInner.fromJson(value);
        case 'BusinessMembersAssetAccessDeleteRequest':
          return BusinessMembersAssetAccessDeleteRequest.fromJson(value);
        case 'BusinessMembersAssetAccessDeleteRequestAccessesInner':
          return BusinessMembersAssetAccessDeleteRequestAccessesInner.fromJson(value);
        case 'BusinessPartnerAssetAccessGet200Response':
          return BusinessPartnerAssetAccessGet200Response.fromJson(value);
        case 'BusinessRole':
          return BusinessRoleTypeTransformer().decode(value);
        case 'BusinessRoleCheckMode':
          return BusinessRoleCheckModeTypeTransformer().decode(value);
        case 'BusinessRoleForMembers':
          return BusinessRoleForMembersTypeTransformer().decode(value);
        case 'BusinessSharedAudience':
          return BusinessSharedAudience.fromJson(value);
        case 'BusinessSharedAudienceResponse':
          return BusinessSharedAudienceResponse.fromJson(value);
        case 'CampaignAudienceMultipliers':
          return CampaignAudienceMultipliers.fromJson(value);
        case 'CampaignBidOptions':
          return CampaignBidOptions.fromJson(value);
        case 'CampaignBidOptionsCreate':
          return CampaignBidOptionsCreate.fromJson(value);
        case 'CampaignBidOptionsUpdate':
          return CampaignBidOptionsUpdate.fromJson(value);
        case 'CampaignCommon':
          return CampaignCommon.fromJson(value);
        case 'CampaignCreateCommon':
          return CampaignCreateCommon.fromJson(value);
        case 'CampaignCreateRequest':
          return CampaignCreateRequest.fromJson(value);
        case 'CampaignCreateResponse':
          return CampaignCreateResponse.fromJson(value);
        case 'CampaignCreateResponseData':
          return CampaignCreateResponseData.fromJson(value);
        case 'CampaignCreateResponseItem':
          return CampaignCreateResponseItem.fromJson(value);
        case 'CampaignId':
          return CampaignId.fromJson(value);
        case 'CampaignIdFilter':
          return CampaignIdFilter.fromJson(value);
        case 'CampaignObjectivesFilter':
          return CampaignObjectivesFilter.fromJson(value);
        case 'CampaignResponse':
          return CampaignResponse.fromJson(value);
        case 'CampaignSummaryStatus':
          return CampaignSummaryStatusTypeTransformer().decode(value);
        case 'CampaignUpdateRequest':
          return CampaignUpdateRequest.fromJson(value);
        case 'CampaignUpdateResponse':
          return CampaignUpdateResponse.fromJson(value);
        case 'CampaignsAnalyticsResponseInner':
          return CampaignsAnalyticsResponseInner.fromJson(value);
        case 'CampaignsList200Response':
          return CampaignsList200Response.fromJson(value);
        case 'CancelInvitesBody':
          return CancelInvitesBody.fromJson(value);
        case 'CarouselSlot':
          return CarouselSlot.fromJson(value);
        case 'Catalog':
          return Catalog.fromJson(value);
        case 'CatalogsAvailableFilterValues':
          return CatalogsAvailableFilterValues.fromJson(value);
        case 'CatalogsCreateCreativeAssetsItem':
          return CatalogsCreateCreativeAssetsItem.fromJson(value);
        case 'CatalogsCreateHotelItem':
          return CatalogsCreateHotelItem.fromJson(value);
        case 'CatalogsCreateReportResponse':
          return CatalogsCreateReportResponse.fromJson(value);
        case 'CatalogsCreateRequest':
          return CatalogsCreateRequest.fromJson(value);
        case 'CatalogsCreateRetailItem':
          return CatalogsCreateRetailItem.fromJson(value);
        case 'CatalogsCreativeAssetsAttributes':
          return CatalogsCreativeAssetsAttributes.fromJson(value);
        case 'CatalogsCreativeAssetsAvailableFilterValues':
          return CatalogsCreativeAssetsAvailableFilterValues.fromJson(value);
        case 'CatalogsCreativeAssetsBatchItem':
          return CatalogsCreativeAssetsBatchItem.fromJson(value);
        case 'CatalogsCreativeAssetsBatchRequest':
          return CatalogsCreativeAssetsBatchRequest.fromJson(value);
        case 'CatalogsCreativeAssetsFeed':
          return CatalogsCreativeAssetsFeed.fromJson(value);
        case 'CatalogsCreativeAssetsFeedsCreateRequest':
          return CatalogsCreativeAssetsFeedsCreateRequest.fromJson(value);
        case 'CatalogsCreativeAssetsFeedsUpdateRequest':
          return CatalogsCreativeAssetsFeedsUpdateRequest.fromJson(value);
        case 'CatalogsCreativeAssetsFilterValuesMap':
          return CatalogsCreativeAssetsFilterValuesMap.fromJson(value);
        case 'CatalogsCreativeAssetsItemErrorResponse':
          return CatalogsCreativeAssetsItemErrorResponse.fromJson(value);
        case 'CatalogsCreativeAssetsItemResponse':
          return CatalogsCreativeAssetsItemResponse.fromJson(value);
        case 'CatalogsCreativeAssetsItemsBatch':
          return CatalogsCreativeAssetsItemsBatch.fromJson(value);
        case 'CatalogsCreativeAssetsItemsFilter':
          return CatalogsCreativeAssetsItemsFilter.fromJson(value);
        case 'CatalogsCreativeAssetsItemsPostFilter':
          return CatalogsCreativeAssetsItemsPostFilter.fromJson(value);
        case 'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest':
          return CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.fromJson(value);
        case 'CatalogsCreativeAssetsProduct':
          return CatalogsCreativeAssetsProduct.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroup':
          return CatalogsCreativeAssetsProductGroup.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupCreateRequest':
          return CatalogsCreativeAssetsProductGroupCreateRequest.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupFilterKeys':
          return CatalogsCreativeAssetsProductGroupFilterKeys.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupFilters':
          return CatalogsCreativeAssetsProductGroupFilters.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupFiltersAllOf':
          return CatalogsCreativeAssetsProductGroupFiltersAllOf.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupFiltersAnyOf':
          return CatalogsCreativeAssetsProductGroupFiltersAnyOf.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupProductCounts':
          return CatalogsCreativeAssetsProductGroupProductCounts.fromJson(value);
        case 'CatalogsCreativeAssetsProductGroupUpdateRequest':
          return CatalogsCreativeAssetsProductGroupUpdateRequest.fromJson(value);
        case 'CatalogsCreativeAssetsProductMetadata':
          return CatalogsCreativeAssetsProductMetadata.fromJson(value);
        case 'CatalogsDbItem':
          return CatalogsDbItem.fromJson(value);
        case 'CatalogsDeleteCreativeAssetsItem':
          return CatalogsDeleteCreativeAssetsItem.fromJson(value);
        case 'CatalogsDeleteHotelItem':
          return CatalogsDeleteHotelItem.fromJson(value);
        case 'CatalogsDeleteRetailItem':
          return CatalogsDeleteRetailItem.fromJson(value);
        case 'CatalogsFeed':
          return CatalogsFeed.fromJson(value);
        case 'CatalogsFeedCredentials':
          return CatalogsFeedCredentials.fromJson(value);
        case 'CatalogsFeedIngestion':
          return CatalogsFeedIngestion.fromJson(value);
        case 'CatalogsFeedIngestionDetails':
          return CatalogsFeedIngestionDetails.fromJson(value);
        case 'CatalogsFeedIngestionErrors':
          return CatalogsFeedIngestionErrors.fromJson(value);
        case 'CatalogsFeedIngestionInfo':
          return CatalogsFeedIngestionInfo.fromJson(value);
        case 'CatalogsFeedIngestionWarnings':
          return CatalogsFeedIngestionWarnings.fromJson(value);
        case 'CatalogsFeedProcessingResult':
          return CatalogsFeedProcessingResult.fromJson(value);
        case 'CatalogsFeedProcessingSchedule':
          return CatalogsFeedProcessingSchedule.fromJson(value);
        case 'CatalogsFeedProcessingStatus':
          return CatalogsFeedProcessingStatusTypeTransformer().decode(value);
        case 'CatalogsFeedProductCounts':
          return CatalogsFeedProductCounts.fromJson(value);
        case 'CatalogsFeedValidationDetails':
          return CatalogsFeedValidationDetails.fromJson(value);
        case 'CatalogsFeedValidationErrors':
          return CatalogsFeedValidationErrors.fromJson(value);
        case 'CatalogsFeedValidationWarnings':
          return CatalogsFeedValidationWarnings.fromJson(value);
        case 'CatalogsFeedVideoCounts':
          return CatalogsFeedVideoCounts.fromJson(value);
        case 'CatalogsFeedsCreateRequest':
          return CatalogsFeedsCreateRequest.fromJson(value);
        case 'CatalogsFeedsCreateRequestDefaultLocale':
          return CatalogsFeedsCreateRequestDefaultLocale.fromJson(value);
        case 'CatalogsFeedsUpdateRequest':
          return CatalogsFeedsUpdateRequest.fromJson(value);
        case 'CatalogsFormat':
          return CatalogsFormatTypeTransformer().decode(value);
        case 'CatalogsHotelAddress':
          return CatalogsHotelAddress.fromJson(value);
        case 'CatalogsHotelAttributes':
          return CatalogsHotelAttributes.fromJson(value);
        case 'CatalogsHotelAttributesAllOfMainImage':
          return CatalogsHotelAttributesAllOfMainImage.fromJson(value);
        case 'CatalogsHotelAvailableFilterValues':
          return CatalogsHotelAvailableFilterValues.fromJson(value);
        case 'CatalogsHotelBatchItem':
          return CatalogsHotelBatchItem.fromJson(value);
        case 'CatalogsHotelBatchRequest':
          return CatalogsHotelBatchRequest.fromJson(value);
        case 'CatalogsHotelFeed':
          return CatalogsHotelFeed.fromJson(value);
        case 'CatalogsHotelFeedsCreateRequest':
          return CatalogsHotelFeedsCreateRequest.fromJson(value);
        case 'CatalogsHotelFeedsUpdateRequest':
          return CatalogsHotelFeedsUpdateRequest.fromJson(value);
        case 'CatalogsHotelFilterValuesMap':
          return CatalogsHotelFilterValuesMap.fromJson(value);
        case 'CatalogsHotelGuestRatings':
          return CatalogsHotelGuestRatings.fromJson(value);
        case 'CatalogsHotelItemErrorResponse':
          return CatalogsHotelItemErrorResponse.fromJson(value);
        case 'CatalogsHotelItemResponse':
          return CatalogsHotelItemResponse.fromJson(value);
        case 'CatalogsHotelItemsBatch':
          return CatalogsHotelItemsBatch.fromJson(value);
        case 'CatalogsHotelItemsFilter':
          return CatalogsHotelItemsFilter.fromJson(value);
        case 'CatalogsHotelItemsPostFilter':
          return CatalogsHotelItemsPostFilter.fromJson(value);
        case 'CatalogsHotelListProductsByCatalogBasedFilterRequest':
          return CatalogsHotelListProductsByCatalogBasedFilterRequest.fromJson(value);
        case 'CatalogsHotelProduct':
          return CatalogsHotelProduct.fromJson(value);
        case 'CatalogsHotelProductGroup':
          return CatalogsHotelProductGroup.fromJson(value);
        case 'CatalogsHotelProductGroupCreateRequest':
          return CatalogsHotelProductGroupCreateRequest.fromJson(value);
        case 'CatalogsHotelProductGroupFilterKeys':
          return CatalogsHotelProductGroupFilterKeys.fromJson(value);
        case 'CatalogsHotelProductGroupFilters':
          return CatalogsHotelProductGroupFilters.fromJson(value);
        case 'CatalogsHotelProductGroupFiltersAllOf':
          return CatalogsHotelProductGroupFiltersAllOf.fromJson(value);
        case 'CatalogsHotelProductGroupFiltersAnyOf':
          return CatalogsHotelProductGroupFiltersAnyOf.fromJson(value);
        case 'CatalogsHotelProductGroupProductCounts':
          return CatalogsHotelProductGroupProductCounts.fromJson(value);
        case 'CatalogsHotelProductGroupType':
          return CatalogsHotelProductGroupTypeTypeTransformer().decode(value);
        case 'CatalogsHotelProductGroupUpdateRequest':
          return CatalogsHotelProductGroupUpdateRequest.fromJson(value);
        case 'CatalogsHotelProductMetadata':
          return CatalogsHotelProductMetadata.fromJson(value);
        case 'CatalogsHotelReportParameters':
          return CatalogsHotelReportParameters.fromJson(value);
        case 'CatalogsHotelReportParametersReport':
          return CatalogsHotelReportParametersReport.fromJson(value);
        case 'CatalogsHotelReportStatsParameters':
          return CatalogsHotelReportStatsParameters.fromJson(value);
        case 'CatalogsHotelReportStatsParametersReport':
          return CatalogsHotelReportStatsParametersReport.fromJson(value);
        case 'CatalogsItemValidationDetails':
          return CatalogsItemValidationDetails.fromJson(value);
        case 'CatalogsItemValidationErrors':
          return CatalogsItemValidationErrors.fromJson(value);
        case 'CatalogsItemValidationIssue':
          return CatalogsItemValidationIssueTypeTransformer().decode(value);
        case 'CatalogsItemValidationIssues':
          return CatalogsItemValidationIssues.fromJson(value);
        case 'CatalogsItemValidationWarnings':
          return CatalogsItemValidationWarnings.fromJson(value);
        case 'CatalogsItems':
          return CatalogsItems.fromJson(value);
        case 'CatalogsItemsBatch':
          return CatalogsItemsBatch.fromJson(value);
        case 'CatalogsItemsBatchRequest':
          return CatalogsItemsBatchRequest.fromJson(value);
        case 'CatalogsItemsCreateBatchRequest':
          return CatalogsItemsCreateBatchRequest.fromJson(value);
        case 'CatalogsItemsDeleteBatchRequest':
          return CatalogsItemsDeleteBatchRequest.fromJson(value);
        case 'CatalogsItemsDeleteDiscontinuedBatchRequest':
          return CatalogsItemsDeleteDiscontinuedBatchRequest.fromJson(value);
        case 'CatalogsItemsFilters':
          return CatalogsItemsFilters.fromJson(value);
        case 'CatalogsItemsPostFilters':
          return CatalogsItemsPostFilters.fromJson(value);
        case 'CatalogsItemsRequest':
          return CatalogsItemsRequest.fromJson(value);
        case 'CatalogsItemsUpdateBatchRequest':
          return CatalogsItemsUpdateBatchRequest.fromJson(value);
        case 'CatalogsItemsUpsertBatchRequest':
          return CatalogsItemsUpsertBatchRequest.fromJson(value);
        case 'CatalogsList200Response':
          return CatalogsList200Response.fromJson(value);
        case 'CatalogsListProductsByFeedBasedFilter':
          return CatalogsListProductsByFeedBasedFilter.fromJson(value);
        case 'CatalogsListProductsByFilterRequest':
          return CatalogsListProductsByFilterRequest.fromJson(value);
        case 'CatalogsLocale':
          return CatalogsLocaleTypeTransformer().decode(value);
        case 'CatalogsProduct':
          return CatalogsProduct.fromJson(value);
        case 'CatalogsProductGroupCreateRequest':
          return CatalogsProductGroupCreateRequest.fromJson(value);
        case 'CatalogsProductGroupCurrencyCriteria':
          return CatalogsProductGroupCurrencyCriteria.fromJson(value);
        case 'CatalogsProductGroupFilterKeys':
          return CatalogsProductGroupFilterKeys.fromJson(value);
        case 'CatalogsProductGroupFilterOperatorTypeCriteria':
          return CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(value);
        case 'CatalogsProductGroupFilters':
          return CatalogsProductGroupFilters.fromJson(value);
        case 'CatalogsProductGroupFiltersAllOf':
          return CatalogsProductGroupFiltersAllOf.fromJson(value);
        case 'CatalogsProductGroupFiltersAnyOf':
          return CatalogsProductGroupFiltersAnyOf.fromJson(value);
        case 'CatalogsProductGroupFiltersRequest':
          return CatalogsProductGroupFiltersRequest.fromJson(value);
        case 'CatalogsProductGroupMultipleCountriesCriteria':
          return CatalogsProductGroupMultipleCountriesCriteria.fromJson(value);
        case 'CatalogsProductGroupMultipleGenderCriteria':
          return CatalogsProductGroupMultipleGenderCriteria.fromJson(value);
        case 'CatalogsProductGroupMultipleMediaTypesCriteria':
          return CatalogsProductGroupMultipleMediaTypesCriteria.fromJson(value);
        case 'CatalogsProductGroupMultipleStringCriteria':
          return CatalogsProductGroupMultipleStringCriteria.fromJson(value);
        case 'CatalogsProductGroupMultipleStringListCriteria':
          return CatalogsProductGroupMultipleStringListCriteria.fromJson(value);
        case 'CatalogsProductGroupPinsList200Response':
          return CatalogsProductGroupPinsList200Response.fromJson(value);
        case 'CatalogsProductGroupPricingCriteria':
          return CatalogsProductGroupPricingCriteria.fromJson(value);
        case 'CatalogsProductGroupPricingCurrencyCriteria':
          return CatalogsProductGroupPricingCurrencyCriteria.fromJson(value);
        case 'CatalogsProductGroupProductCountsVertical':
          return CatalogsProductGroupProductCountsVertical.fromJson(value);
        case 'CatalogsProductGroupStatus':
          return CatalogsProductGroupStatusTypeTransformer().decode(value);
        case 'CatalogsProductGroupType':
          return CatalogsProductGroupTypeTypeTransformer().decode(value);
        case 'CatalogsProductGroupUint32Criteria':
          return CatalogsProductGroupUint32Criteria.fromJson(value);
        case 'CatalogsProductGroupUpdateRequest':
          return CatalogsProductGroupUpdateRequest.fromJson(value);
        case 'CatalogsProductGroupsList200Response':
          return CatalogsProductGroupsList200Response.fromJson(value);
        case 'CatalogsProductGroupsUpdateRequest':
          return CatalogsProductGroupsUpdateRequest.fromJson(value);
        case 'CatalogsReport':
          return CatalogsReport.fromJson(value);
        case 'CatalogsReportAllItemsFilter':
          return CatalogsReportAllItemsFilter.fromJson(value);
        case 'CatalogsReportDistributionIssueFilter':
          return CatalogsReportDistributionIssueFilter.fromJson(value);
        case 'CatalogsReportDistributionStats':
          return CatalogsReportDistributionStats.fromJson(value);
        case 'CatalogsReportFeedIngestionFilter':
          return CatalogsReportFeedIngestionFilter.fromJson(value);
        case 'CatalogsReportFeedIngestionStats':
          return CatalogsReportFeedIngestionStats.fromJson(value);
        case 'CatalogsReportParameters':
          return CatalogsReportParameters.fromJson(value);
        case 'CatalogsReportStats':
          return CatalogsReportStats.fromJson(value);
        case 'CatalogsRetailAvailableFilterValues':
          return CatalogsRetailAvailableFilterValues.fromJson(value);
        case 'CatalogsRetailBatchRequest':
          return CatalogsRetailBatchRequest.fromJson(value);
        case 'CatalogsRetailBatchRequestItemsInner':
          return CatalogsRetailBatchRequestItemsInner.fromJson(value);
        case 'CatalogsRetailFeed':
          return CatalogsRetailFeed.fromJson(value);
        case 'CatalogsRetailFeedsCreateRequest':
          return CatalogsRetailFeedsCreateRequest.fromJson(value);
        case 'CatalogsRetailFeedsUpdateRequest':
          return CatalogsRetailFeedsUpdateRequest.fromJson(value);
        case 'CatalogsRetailFilterValuesMap':
          return CatalogsRetailFilterValuesMap.fromJson(value);
        case 'CatalogsRetailItemErrorResponse':
          return CatalogsRetailItemErrorResponse.fromJson(value);
        case 'CatalogsRetailItemResponse':
          return CatalogsRetailItemResponse.fromJson(value);
        case 'CatalogsRetailItemsBatch':
          return CatalogsRetailItemsBatch.fromJson(value);
        case 'CatalogsRetailItemsFilter':
          return CatalogsRetailItemsFilter.fromJson(value);
        case 'CatalogsRetailItemsPostFilter':
          return CatalogsRetailItemsPostFilter.fromJson(value);
        case 'CatalogsRetailListProductsByCatalogBasedFilterRequest':
          return CatalogsRetailListProductsByCatalogBasedFilterRequest.fromJson(value);
        case 'CatalogsRetailProduct':
          return CatalogsRetailProduct.fromJson(value);
        case 'CatalogsRetailProductGroup':
          return CatalogsRetailProductGroup.fromJson(value);
        case 'CatalogsRetailProductGroupCreateRequest':
          return CatalogsRetailProductGroupCreateRequest.fromJson(value);
        case 'CatalogsRetailProductGroupProductCounts':
          return CatalogsRetailProductGroupProductCounts.fromJson(value);
        case 'CatalogsRetailProductGroupUpdateRequest':
          return CatalogsRetailProductGroupUpdateRequest.fromJson(value);
        case 'CatalogsRetailProductMetadata':
          return CatalogsRetailProductMetadata.fromJson(value);
        case 'CatalogsRetailReportParameters':
          return CatalogsRetailReportParameters.fromJson(value);
        case 'CatalogsRetailReportStatsParameters':
          return CatalogsRetailReportStatsParameters.fromJson(value);
        case 'CatalogsStatus':
          return CatalogsStatusTypeTransformer().decode(value);
        case 'CatalogsType':
          return CatalogsTypeTypeTransformer().decode(value);
        case 'CatalogsUpdatableCreativeAssetsAttributes':
          return CatalogsUpdatableCreativeAssetsAttributes.fromJson(value);
        case 'CatalogsUpdatableHotelAttributes':
          return CatalogsUpdatableHotelAttributes.fromJson(value);
        case 'CatalogsUpdateCreativeAssetsItem':
          return CatalogsUpdateCreativeAssetsItem.fromJson(value);
        case 'CatalogsUpdateHotelItem':
          return CatalogsUpdateHotelItem.fromJson(value);
        case 'CatalogsUpdateRetailItem':
          return CatalogsUpdateRetailItem.fromJson(value);
        case 'CatalogsUpsertCreativeAssetsItem':
          return CatalogsUpsertCreativeAssetsItem.fromJson(value);
        case 'CatalogsUpsertHotelItem':
          return CatalogsUpsertHotelItem.fromJson(value);
        case 'CatalogsUpsertRetailItem':
          return CatalogsUpsertRetailItem.fromJson(value);
        case 'CatalogsVerticalBatchRequest':
          return CatalogsVerticalBatchRequest.fromJson(value);
        case 'CatalogsVerticalFeedsCreateRequest':
          return CatalogsVerticalFeedsCreateRequest.fromJson(value);
        case 'CatalogsVerticalFeedsUpdateRequest':
          return CatalogsVerticalFeedsUpdateRequest.fromJson(value);
        case 'CatalogsVerticalProductGroup':
          return CatalogsVerticalProductGroup.fromJson(value);
        case 'CatalogsVerticalProductGroupCreateRequest':
          return CatalogsVerticalProductGroupCreateRequest.fromJson(value);
        case 'CatalogsVerticalProductGroupUpdateRequest':
          return CatalogsVerticalProductGroupUpdateRequest.fromJson(value);
        case 'CatalogsVerticalsListProductsByCatalogBasedFilterRequest':
          return CatalogsVerticalsListProductsByCatalogBasedFilterRequest.fromJson(value);
        case 'ConditionFilter':
          return ConditionFilter.fromJson(value);
        case 'ContentType':
          return ContentTypeTypeTransformer().decode(value);
        case 'ConversionAccessTokenResponse':
          return ConversionAccessTokenResponse.fromJson(value);
        case 'ConversionApiResponse':
          return ConversionApiResponse.fromJson(value);
        case 'ConversionApiResponseEventsInner':
          return ConversionApiResponseEventsInner.fromJson(value);
        case 'ConversionAttributionWindowDays':
          return ConversionAttributionWindowDaysTypeTransformer().decode(value);
        case 'ConversionEventAppInfo':
          return ConversionEventAppInfo.fromJson(value);
        case 'ConversionEventDeviceInfo':
          return ConversionEventDeviceInfo.fromJson(value);
        case 'ConversionEventResponse':
          return ConversionEventResponse.fromJson(value);
        case 'ConversionEvents':
          return ConversionEvents.fromJson(value);
        case 'ConversionEventsDataInner':
          return ConversionEventsDataInner.fromJson(value);
        case 'ConversionEventsDataInnerCustomData':
          return ConversionEventsDataInnerCustomData.fromJson(value);
        case 'ConversionEventsDataInnerCustomDataContentsInner':
          return ConversionEventsDataInnerCustomDataContentsInner.fromJson(value);
        case 'ConversionEventsUserData':
          return ConversionEventsUserData.fromJson(value);
        case 'ConversionEventsUserDataProperties':
          return ConversionEventsUserDataProperties.fromJson(value);
        case 'ConversionHealthSelectionItem':
          return ConversionHealthSelectionItem.fromJson(value);
        case 'ConversionMSOTEvents':
          return ConversionMSOTEvents.fromJson(value);
        case 'ConversionProductReportRequest':
          return ConversionProductReportRequest.fromJson(value);
        case 'ConversionProductReportingColumn':
          return ConversionProductReportingColumnTypeTransformer().decode(value);
        case 'ConversionReportAttributionType':
          return ConversionReportAttributionTypeTypeTransformer().decode(value);
        case 'ConversionReportTimeType':
          return ConversionReportTimeTypeTypeTransformer().decode(value);
        case 'ConversionTag':
          return ConversionTag.fromJson(value);
        case 'ConversionTagCommon':
          return ConversionTagCommon.fromJson(value);
        case 'ConversionTagConfigs':
          return ConversionTagConfigs.fromJson(value);
        case 'ConversionTagCreate':
          return ConversionTagCreate.fromJson(value);
        case 'ConversionTagListResponse':
          return ConversionTagListResponse.fromJson(value);
        case 'ConversionTagResponse':
          return ConversionTagResponse.fromJson(value);
        case 'ConversionTagType':
          return ConversionTagTypeTypeTransformer().decode(value);
        case 'ConversionTagsList200Response':
          return ConversionTagsList200Response.fromJson(value);
        case 'Country':
          return CountryTypeTransformer().decode(value);
        case 'CountryFilter':
          return CountryFilter.fromJson(value);
        case 'CreateAssetAccessRequestBody':
          return CreateAssetAccessRequestBody.fromJson(value);
        case 'CreateAssetAccessRequestBodyAssetRequestsInner':
          return CreateAssetAccessRequestBodyAssetRequestsInner.fromJson(value);
        case 'CreateAssetAccessRequestErrorMessageInner':
          return CreateAssetAccessRequestErrorMessageInner.fromJson(value);
        case 'CreateAssetAccessRequestResponse':
          return CreateAssetAccessRequestResponse.fromJson(value);
        case 'CreateAssetGroupBody':
          return CreateAssetGroupBody.fromJson(value);
        case 'CreateAssetGroupResponse':
          return CreateAssetGroupResponse.fromJson(value);
        case 'CreateAssetInvitesRequest':
          return CreateAssetInvitesRequest.fromJson(value);
        case 'CreateAssetInvitesRequestItem':
          return CreateAssetInvitesRequestItem.fromJson(value);
        case 'CreateInvitesResultsResponseArray':
          return CreateInvitesResultsResponseArray.fromJson(value);
        case 'CreateInvitesResultsResponseArrayItemsInner':
          return CreateInvitesResultsResponseArrayItemsInner.fromJson(value);
        case 'CreateInvitesResultsResponseArrayItemsInnerInvite':
          return CreateInvitesResultsResponseArrayItemsInnerInvite.fromJson(value);
        case 'CreateMMMReportRequest':
          return CreateMMMReportRequest.fromJson(value);
        case 'CreateMMMReportResponse':
          return CreateMMMReportResponse.fromJson(value);
        case 'CreateMMMReportResponseData':
          return CreateMMMReportResponseData.fromJson(value);
        case 'CreateMembershipOrPartnershipInvitesBody':
          return CreateMembershipOrPartnershipInvitesBody.fromJson(value);
        case 'CreativeAssetsIdFilter':
          return CreativeAssetsIdFilter.fromJson(value);
        case 'CreativeAssetsProcessingRecord':
          return CreativeAssetsProcessingRecord.fromJson(value);
        case 'CreativeAssetsVisibilityType':
          return CreativeAssetsVisibilityTypeTypeTransformer().decode(value);
        case 'CreativeType':
          return CreativeTypeTypeTransformer().decode(value);
        case 'Currency':
          return CurrencyTypeTransformer().decode(value);
        case 'CurrencyFilter':
          return CurrencyFilter.fromJson(value);
        case 'CustomLabel0Filter':
          return CustomLabel0Filter.fromJson(value);
        case 'CustomLabel1Filter':
          return CustomLabel1Filter.fromJson(value);
        case 'CustomLabel2Filter':
          return CustomLabel2Filter.fromJson(value);
        case 'CustomLabel3Filter':
          return CustomLabel3Filter.fromJson(value);
        case 'CustomLabel4Filter':
          return CustomLabel4Filter.fromJson(value);
        case 'CustomNumber0Filter':
          return CustomNumber0Filter.fromJson(value);
        case 'CustomNumber1Filter':
          return CustomNumber1Filter.fromJson(value);
        case 'CustomNumber2Filter':
          return CustomNumber2Filter.fromJson(value);
        case 'CustomNumber3Filter':
          return CustomNumber3Filter.fromJson(value);
        case 'CustomNumber4Filter':
          return CustomNumber4Filter.fromJson(value);
        case 'CustomerList':
          return CustomerList.fromJson(value);
        case 'CustomerListRequest':
          return CustomerListRequest.fromJson(value);
        case 'CustomerListUpdateRequest':
          return CustomerListUpdateRequest.fromJson(value);
        case 'CustomerListUpload':
          return CustomerListUpload.fromJson(value);
        case 'CustomerListUploadCreateRequest':
          return CustomerListUploadCreateRequest.fromJson(value);
        case 'CustomerListUploadCreateResponse':
          return CustomerListUploadCreateResponse.fromJson(value);
        case 'CustomerListUploadResponse':
          return CustomerListUploadResponse.fromJson(value);
        case 'CustomerListsList200Response':
          return CustomerListsList200Response.fromJson(value);
        case 'CustomizableCTAType':
          return CustomizableCTATypeTypeTransformer().decode(value);
        case 'DataOutputFormat':
          return DataOutputFormatTypeTransformer().decode(value);
        case 'DataStatus':
          return DataStatusTypeTransformer().decode(value);
        case 'DeleteAssetGroupBody':
          return DeleteAssetGroupBody.fromJson(value);
        case 'DeleteAssetGroupResponse':
          return DeleteAssetGroupResponse.fromJson(value);
        case 'DeleteAssetGroupResponseExceptionsInner':
          return DeleteAssetGroupResponseExceptionsInner.fromJson(value);
        case 'DeleteInvitesResultsResponseArray':
          return DeleteInvitesResultsResponseArray.fromJson(value);
        case 'DeleteInvitesResultsResponseArrayItemsInner':
          return DeleteInvitesResultsResponseArrayItemsInner.fromJson(value);
        case 'DeleteInvitesResultsResponseArrayItemsInnerException':
          return DeleteInvitesResultsResponseArrayItemsInnerException.fromJson(value);
        case 'DeleteMemberAccessResult':
          return DeleteMemberAccessResult.fromJson(value);
        case 'DeleteMemberAccessResultsResponseArray':
          return DeleteMemberAccessResultsResponseArray.fromJson(value);
        case 'DeletePartnerAssetAccessBody':
          return DeletePartnerAssetAccessBody.fromJson(value);
        case 'DeletePartnerAssetAccessBodyAccessesInner':
          return DeletePartnerAssetAccessBodyAccessesInner.fromJson(value);
        case 'DeletePartnerAssetsResult':
          return DeletePartnerAssetsResult.fromJson(value);
        case 'DeletePartnerAssetsResultsResponseArray':
          return DeletePartnerAssetsResultsResponseArray.fromJson(value);
        case 'DeletePartnersRequest':
          return DeletePartnersRequest.fromJson(value);
        case 'DeletePartnersResponse':
          return DeletePartnersResponse.fromJson(value);
        case 'DeletedMembersResponse':
          return DeletedMembersResponse.fromJson(value);
        case 'DeliveryMetricsResponse':
          return DeliveryMetricsResponse.fromJson(value);
        case 'DeliveryMetricsResponseItemsInner':
          return DeliveryMetricsResponseItemsInner.fromJson(value);
        case 'DetailedError':
          return DetailedError.fromJson(value);
        case 'DisclosureType':
          return DisclosureTypeTypeTransformer().decode(value);
        case 'EnhancedMatchStatusType':
          return EnhancedMatchStatusTypeTypeTransformer().decode(value);
        case 'EntityStatus':
          return EntityStatusTypeTransformer().decode(value);
        case 'Error':
          return Error.fromJson(value);
        case 'ErrorDetail':
          return ErrorDetail.fromJson(value);
        case 'EventData':
          return EventData.fromJson(value);
        case 'EventQualityScore':
          return EventQualityScore.fromJson(value);
        case 'Exception':
          return Exception.fromJson(value);
        case 'FeaturedTrend':
          return FeaturedTrend.fromJson(value);
        case 'FeedProcessingResultsList200Response':
          return FeedProcessingResultsList200Response.fromJson(value);
        case 'FeedsCreateRequest':
          return FeedsCreateRequest.fromJson(value);
        case 'FeedsList200Response':
          return FeedsList200Response.fromJson(value);
        case 'FeedsUpdateRequest':
          return FeedsUpdateRequest.fromJson(value);
        case 'FollowUserRequest':
          return FollowUserRequest.fromJson(value);
        case 'FollowersList200Response':
          return FollowersList200Response.fromJson(value);
        case 'Gender':
          return GenderTypeTransformer().decode(value);
        case 'GenderBucket':
          return GenderBucketTypeTransformer().decode(value);
        case 'GenderDemographics':
          return GenderDemographics.fromJson(value);
        case 'GenderFilter':
          return GenderFilter.fromJson(value);
        case 'GetAudiencesOrderBy':
          return GetAudiencesOrderByTypeTransformer().decode(value);
        case 'GetBusinessAssetTypeResponse':
          return GetBusinessAssetTypeResponseTypeTransformer().decode(value);
        case 'GetBusinessAssetsResponse':
          return GetBusinessAssetsResponse.fromJson(value);
        case 'GetBusinessAssetsResponseCatalogInfo':
          return GetBusinessAssetsResponseCatalogInfo.fromJson(value);
        case 'GetBusinessEmployers200Response':
          return GetBusinessEmployers200Response.fromJson(value);
        case 'GetBusinessMembers200Response':
          return GetBusinessMembers200Response.fromJson(value);
        case 'GetBusinessPartners200Response':
          return GetBusinessPartners200Response.fromJson(value);
        case 'GetInvites200Response':
          return GetInvites200Response.fromJson(value);
        case 'GetMMMReportResponse':
          return GetMMMReportResponse.fromJson(value);
        case 'GetMMMReportResponseData':
          return GetMMMReportResponseData.fromJson(value);
        case 'GetPartnerAssetsResponse':
          return GetPartnerAssetsResponse.fromJson(value);
        case 'GoogleProductCategory0Filter':
          return GoogleProductCategory0Filter.fromJson(value);
        case 'GoogleProductCategory1Filter':
          return GoogleProductCategory1Filter.fromJson(value);
        case 'GoogleProductCategory2Filter':
          return GoogleProductCategory2Filter.fromJson(value);
        case 'GoogleProductCategory3Filter':
          return GoogleProductCategory3Filter.fromJson(value);
        case 'GoogleProductCategory4Filter':
          return GoogleProductCategory4Filter.fromJson(value);
        case 'GoogleProductCategory5Filter':
          return GoogleProductCategory5Filter.fromJson(value);
        case 'GoogleProductCategory6Filter':
          return GoogleProductCategory6Filter.fromJson(value);
        case 'Granularity':
          return GranularityTypeTransformer().decode(value);
        case 'GridClickType':
          return GridClickTypeTypeTransformer().decode(value);
        case 'HotelIdFilter':
          return HotelIdFilter.fromJson(value);
        case 'HotelProcessingRecord':
          return HotelProcessingRecord.fromJson(value);
        case 'ImageBase64':
          return ImageBase64.fromJson(value);
        case 'ImageDetails':
          return ImageDetails.fromJson(value);
        case 'ImageMetadata':
          return ImageMetadata.fromJson(value);
        case 'ImageSize':
          return ImageSize.fromJson(value);
        case 'IngestionSourceOptions':
          return IngestionSourceOptionsTypeTransformer().decode(value);
        case 'InnerProductCategoriesMetricsHighlights':
          return InnerProductCategoriesMetricsHighlights.fromJson(value);
        case 'IntegrationLog':
          return IntegrationLog.fromJson(value);
        case 'IntegrationLogClientError':
          return IntegrationLogClientError.fromJson(value);
        case 'IntegrationLogClientRequest':
          return IntegrationLogClientRequest.fromJson(value);
        case 'IntegrationLogsInvalidLogResponse':
          return IntegrationLogsInvalidLogResponse.fromJson(value);
        case 'IntegrationLogsInvalidLogResponseRejectedLogsInner':
          return IntegrationLogsInvalidLogResponseRejectedLogsInner.fromJson(value);
        case 'IntegrationLogsRequest':
          return IntegrationLogsRequest.fromJson(value);
        case 'IntegrationLogsSuccessResponse':
          return IntegrationLogsSuccessResponse.fromJson(value);
        case 'IntegrationMetadata':
          return IntegrationMetadata.fromJson(value);
        case 'IntegrationRecord':
          return IntegrationRecord.fromJson(value);
        case 'IntegrationRequest':
          return IntegrationRequest.fromJson(value);
        case 'IntegrationRequestPatch':
          return IntegrationRequestPatch.fromJson(value);
        case 'IntegrationsGetList200Response':
          return IntegrationsGetList200Response.fromJson(value);
        case 'IntegrationsLogsPost400Response':
          return IntegrationsLogsPost400Response.fromJson(value);
        case 'Interest':
          return Interest.fromJson(value);
        case 'InterestsEnum':
          return InterestsEnumTypeTransformer().decode(value);
        case 'InviteAssetsSummary':
          return InviteAssetsSummary.fromJson(value);
        case 'InviteAssetsSummaryAdAccountsInner':
          return InviteAssetsSummaryAdAccountsInner.fromJson(value);
        case 'InviteAssetsSummaryProfilesInner':
          return InviteAssetsSummaryProfilesInner.fromJson(value);
        case 'InviteBusinessRoleBinding':
          return InviteBusinessRoleBinding.fromJson(value);
        case 'InviteExceptionResponse':
          return InviteExceptionResponse.fromJson(value);
        case 'InviteResponse':
          return InviteResponse.fromJson(value);
        case 'InviteStatus':
          return InviteStatusTypeTransformer().decode(value);
        case 'InviteType':
          return InviteTypeTypeTransformer().decode(value);
        case 'ItemAttributes':
          return ItemAttributes.fromJson(value);
        case 'ItemAttributesRequest':
          return ItemAttributesRequest.fromJson(value);
        case 'ItemAttributesRequestAllOfImageLink':
          return ItemAttributesRequestAllOfImageLink.fromJson(value);
        case 'ItemBatchRecord':
          return ItemBatchRecord.fromJson(value);
        case 'ItemCreateBatchRecord':
          return ItemCreateBatchRecord.fromJson(value);
        case 'ItemDeleteBatchRecord':
          return ItemDeleteBatchRecord.fromJson(value);
        case 'ItemDeleteDiscontinuedBatchRecord':
          return ItemDeleteDiscontinuedBatchRecord.fromJson(value);
        case 'ItemGroupIdFilter':
          return ItemGroupIdFilter.fromJson(value);
        case 'ItemIdFilter':
          return ItemIdFilter.fromJson(value);
        case 'ItemProcessingRecord':
          return ItemProcessingRecord.fromJson(value);
        case 'ItemProcessingStatus':
          return ItemProcessingStatusTypeTransformer().decode(value);
        case 'ItemResponse':
          return ItemResponse.fromJson(value);
        case 'ItemResponseOneOf':
          return ItemResponseOneOf.fromJson(value);
        case 'ItemResponseOneOf1':
          return ItemResponseOneOf1.fromJson(value);
        case 'ItemUpdateBatchRecord':
          return ItemUpdateBatchRecord.fromJson(value);
        case 'ItemUpsertBatchRecord':
          return ItemUpsertBatchRecord.fromJson(value);
        case 'ItemValidationEvent':
          return ItemValidationEvent.fromJson(value);
        case 'ItemsBatchPostRequest':
          return ItemsBatchPostRequest.fromJson(value);
        case 'ItemsIssuesList200Response':
          return ItemsIssuesList200Response.fromJson(value);
        case 'Keyword':
          return Keyword.fromJson(value);
        case 'KeywordError':
          return KeywordError.fromJson(value);
        case 'KeywordMetrics':
          return KeywordMetrics.fromJson(value);
        case 'KeywordMetricsResponse':
          return KeywordMetricsResponse.fromJson(value);
        case 'KeywordUpdate':
          return KeywordUpdate.fromJson(value);
        case 'KeywordUpdateBody':
          return KeywordUpdateBody.fromJson(value);
        case 'KeywordsCommon':
          return KeywordsCommon.fromJson(value);
        case 'KeywordsGet200Response':
          return KeywordsGet200Response.fromJson(value);
        case 'KeywordsMetricsArrayResponse':
          return KeywordsMetricsArrayResponse.fromJson(value);
        case 'KeywordsRequest':
          return KeywordsRequest.fromJson(value);
        case 'KeywordsResponse':
          return KeywordsResponse.fromJson(value);
        case 'Label':
          return Label.fromJson(value);
        case 'LabelBulkUpdateRequest':
          return LabelBulkUpdateRequest.fromJson(value);
        case 'LabelCreateRequest':
          return LabelCreateRequest.fromJson(value);
        case 'LabelCreateRequestLabelsInner':
          return LabelCreateRequestLabelsInner.fromJson(value);
        case 'LabelError':
          return LabelError.fromJson(value);
        case 'LabelParentType':
          return LabelParentTypeTypeTransformer().decode(value);
        case 'LabelStatus':
          return LabelStatusTypeTransformer().decode(value);
        case 'LabelType':
          return LabelTypeTypeTransformer().decode(value);
        case 'LabelUpdateRequest':
          return LabelUpdateRequest.fromJson(value);
        case 'LabelUpdateRequestLabelsInner':
          return LabelUpdateRequestLabelsInner.fromJson(value);
        case 'LabelsList200Response':
          return LabelsList200Response.fromJson(value);
        case 'LabelsResponse':
          return LabelsResponse.fromJson(value);
        case 'Language':
          return LanguageTypeTransformer().decode(value);
        case 'LeadFormArrayResponse':
          return LeadFormArrayResponse.fromJson(value);
        case 'LeadFormArrayResponseItemsInner':
          return LeadFormArrayResponseItemsInner.fromJson(value);
        case 'LeadFormCommon':
          return LeadFormCommon.fromJson(value);
        case 'LeadFormCommonPolicyLinksInner':
          return LeadFormCommonPolicyLinksInner.fromJson(value);
        case 'LeadFormCreateRequest':
          return LeadFormCreateRequest.fromJson(value);
        case 'LeadFormQuestion':
          return LeadFormQuestion.fromJson(value);
        case 'LeadFormQuestionFieldType':
          return LeadFormQuestionFieldTypeTypeTransformer().decode(value);
        case 'LeadFormQuestionType':
          return LeadFormQuestionTypeTypeTransformer().decode(value);
        case 'LeadFormResponse':
          return LeadFormResponse.fromJson(value);
        case 'LeadFormStatus':
          return LeadFormStatusTypeTransformer().decode(value);
        case 'LeadFormTestRequest':
          return LeadFormTestRequest.fromJson(value);
        case 'LeadFormTestResponse':
          return LeadFormTestResponse.fromJson(value);
        case 'LeadFormUpdateRequest':
          return LeadFormUpdateRequest.fromJson(value);
        case 'LeadFormsList200Response':
          return LeadFormsList200Response.fromJson(value);
        case 'LeadSubscription':
          return LeadSubscription.fromJson(value);
        case 'LeadSubscriptionPostParamsCreate':
          return LeadSubscriptionPostParamsCreate.fromJson(value);
        case 'LeadSubscriptionPostParamsCreateAllOfPartnerMetadata':
          return LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.fromJson(value);
        case 'LeadsExportCreateRequest':
          return LeadsExportCreateRequest.fromJson(value);
        case 'LeadsExportCreateResponse':
          return LeadsExportCreateResponse.fromJson(value);
        case 'LeadsExportResponseData':
          return LeadsExportResponseData.fromJson(value);
        case 'LeadsExportStatus':
          return LeadsExportStatusTypeTransformer().decode(value);
        case 'LineItem':
          return LineItem.fromJson(value);
        case 'LinkedBusiness':
          return LinkedBusiness.fromJson(value);
        case 'LocalStoreUpdate':
          return LocalStoreUpdate.fromJson(value);
        case 'LookbackPeriodOptions':
          return LookbackPeriodOptionsTypeTransformer().decode(value);
        case 'MMMReportingColumn':
          return MMMReportingColumnTypeTransformer().decode(value);
        case 'MMMReportingTargetingType':
          return MMMReportingTargetingTypeTypeTransformer().decode(value);
        case 'MatchType':
          return MatchTypeTypeTransformer().decode(value);
        case 'MatchTypeResponse':
          return MatchTypeResponseTypeTransformer().decode(value);
        case 'MaxPriceFilter':
          return MaxPriceFilter.fromJson(value);
        case 'Media':
          return Media.fromJson(value);
        case 'MediaList200Response':
          return MediaList200Response.fromJson(value);
        case 'MediaType':
          return MediaTypeTypeTransformer().decode(value);
        case 'MediaTypeFilter':
          return MediaTypeFilter.fromJson(value);
        case 'MediaUpload':
          return MediaUpload.fromJson(value);
        case 'MediaUploadCreate':
          return MediaUploadCreate.fromJson(value);
        case 'MediaUploadParameters':
          return MediaUploadParameters.fromJson(value);
        case 'MediaUploadStatus':
          return MediaUploadStatusTypeTransformer().decode(value);
        case 'MediaUploadType':
          return MediaUploadTypeTypeTransformer().decode(value);
        case 'MemberBusinessRole':
          return MemberBusinessRoleTypeTransformer().decode(value);
        case 'MembersToDeleteBody':
          return MembersToDeleteBody.fromJson(value);
        case 'MembersToDeleteBodyMembersInner':
          return MembersToDeleteBodyMembersInner.fromJson(value);
        case 'MetricsReportingLevel':
          return MetricsReportingLevelTypeTransformer().decode(value);
        case 'MetricsResponse':
          return MetricsResponse.fromJson(value);
        case 'MinPriceFilter':
          return MinPriceFilter.fromJson(value);
        case 'MultipleProductGroupsInner':
          return MultipleProductGroupsInner.fromJson(value);
        case 'NonDraftEntityStatus':
          return NonDraftEntityStatusTypeTransformer().decode(value);
        case 'NonNullableCatalogsCurrency':
          return NonNullableCatalogsCurrencyTypeTransformer().decode(value);
        case 'NonNullableProductAvailabilityType':
          return NonNullableProductAvailabilityTypeTypeTransformer().decode(value);
        case 'NotificationPostRequest':
          return NotificationPostRequest.fromJson(value);
        case 'NotificationResponse':
          return NotificationResponse.fromJson(value);
        case 'NullableCatalogsItemFieldType':
          return NullableCatalogsItemFieldTypeTypeTransformer().decode(value);
        case 'NullableCurrency':
          return NullableCurrencyTypeTransformer().decode(value);
        case 'OauthAccessTokenRequestClientCredentials':
          return OauthAccessTokenRequestClientCredentials.fromJson(value);
        case 'OauthAccessTokenRequestCode':
          return OauthAccessTokenRequestCode.fromJson(value);
        case 'OauthAccessTokenRequestRefresh':
          return OauthAccessTokenRequestRefresh.fromJson(value);
        case 'OauthAccessTokenResponse':
          return OauthAccessTokenResponse.fromJson(value);
        case 'OauthAccessTokenResponseClientCredentials':
          return OauthAccessTokenResponseClientCredentials.fromJson(value);
        case 'OauthAccessTokenResponseCode':
          return OauthAccessTokenResponseCode.fromJson(value);
        case 'OauthAccessTokenResponseIntegrationRefresh':
          return OauthAccessTokenResponseIntegrationRefresh.fromJson(value);
        case 'OauthAccessTokenResponseRefresh':
          return OauthAccessTokenResponseRefresh.fromJson(value);
        case 'ObjectiveType':
          return ObjectiveTypeTypeTransformer().decode(value);
        case 'OperationType':
          return OperationTypeTypeTransformer().decode(value);
        case 'OptimizationGoalMetadata':
          return OptimizationGoalMetadata.fromJson(value);
        case 'OptimizationGoalMetadataConversionTagV3GoalMetadata':
          return OptimizationGoalMetadataConversionTagV3GoalMetadata.fromJson(value);
        case 'OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows':
          return OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.fromJson(value);
        case 'OptimizationGoalMetadataFrequencyGoalMetadata':
          return OptimizationGoalMetadataFrequencyGoalMetadata.fromJson(value);
        case 'OptimizationGoalMetadataScrollupGoalMetadata':
          return OptimizationGoalMetadataScrollupGoalMetadata.fromJson(value);
        case 'OrderLine':
          return OrderLine.fromJson(value);
        case 'OrderLineError':
          return OrderLineError.fromJson(value);
        case 'OrderLinePaidType':
          return OrderLinePaidTypeTypeTransformer().decode(value);
        case 'OrderLineResponse':
          return OrderLineResponse.fromJson(value);
        case 'OrderLineSingleResponse':
          return OrderLineSingleResponse.fromJson(value);
        case 'OrderLineStatus':
          return OrderLineStatusTypeTransformer().decode(value);
        case 'OrderLines':
          return OrderLines.fromJson(value);
        case 'OrderLinesArrayResponse':
          return OrderLinesArrayResponse.fromJson(value);
        case 'OrderLinesList200Response':
          return OrderLinesList200Response.fromJson(value);
        case 'OverallStatusOptions':
          return OverallStatusOptionsTypeTransformer().decode(value);
        case 'PacingDeliveryType':
          return PacingDeliveryTypeTypeTransformer().decode(value);
        case 'PageVisitConversionTagsGet200Response':
          return PageVisitConversionTagsGet200Response.fromJson(value);
        case 'Paginated':
          return Paginated.fromJson(value);
        case 'PartnerType':
          return PartnerTypeTypeTransformer().decode(value);
        case 'Permissions':
          return PermissionsTypeTransformer().decode(value);
        case 'PermissionsWithOwner':
          return PermissionsWithOwnerTypeTransformer().decode(value);
        case 'Pin':
          return Pin.fromJson(value);
        case 'PinAnalyticsMetricsResponse':
          return PinAnalyticsMetricsResponse.fromJson(value);
        case 'PinAnalyticsMetricsResponseDailyMetricsInner':
          return PinAnalyticsMetricsResponseDailyMetricsInner.fromJson(value);
        case 'PinCreate':
          return PinCreate.fromJson(value);
        case 'PinMedia':
          return PinMedia.fromJson(value);
        case 'PinMediaMetadata':
          return PinMediaMetadata.fromJson(value);
        case 'PinMediaSource':
          return PinMediaSource.fromJson(value);
        case 'PinMediaSourceImageBase64':
          return PinMediaSourceImageBase64.fromJson(value);
        case 'PinMediaSourceImageURL':
          return PinMediaSourceImageURL.fromJson(value);
        case 'PinMediaSourceImagesBase64':
          return PinMediaSourceImagesBase64.fromJson(value);
        case 'PinMediaSourceImagesBase64Item':
          return PinMediaSourceImagesBase64Item.fromJson(value);
        case 'PinMediaSourceImagesURL':
          return PinMediaSourceImagesURL.fromJson(value);
        case 'PinMediaSourceImagesURLItem':
          return PinMediaSourceImagesURLItem.fromJson(value);
        case 'PinMediaSourcePinURL':
          return PinMediaSourcePinURL.fromJson(value);
        case 'PinMediaSourceVideoID':
          return PinMediaSourceVideoID.fromJson(value);
        case 'PinMediaWithImage':
          return PinMediaWithImage.fromJson(value);
        case 'PinMediaWithImageAndVideo':
          return PinMediaWithImageAndVideo.fromJson(value);
        case 'PinMediaWithImages':
          return PinMediaWithImages.fromJson(value);
        case 'PinMediaWithVideo':
          return PinMediaWithVideo.fromJson(value);
        case 'PinMediaWithVideos':
          return PinMediaWithVideos.fromJson(value);
        case 'PinPromotionSummaryStatus':
          return PinPromotionSummaryStatusTypeTransformer().decode(value);
        case 'PinUpdate':
          return PinUpdate.fromJson(value);
        case 'PinsList200Response':
          return PinsList200Response.fromJson(value);
        case 'PinsSaveRequest':
          return PinsSaveRequest.fromJson(value);
        case 'PinterestLibError':
          return PinterestLibError.fromJson(value);
        case 'PinterestLibPaginationOrder':
          return PinterestLibPaginationOrderTypeTransformer().decode(value);
        case 'PinterestLibStatus204':
          return PinterestLibStatus204.fromJson(value);
        case 'PlacementGroupType':
          return PlacementGroupTypeTypeTransformer().decode(value);
        case 'PlacementMultipliers':
          return PlacementMultipliers.fromJson(value);
        case 'PredictedTimeSeries':
          return PredictedTimeSeries.fromJson(value);
        case 'PriceFilter':
          return PriceFilter.fromJson(value);
        case 'ProductAvailabilityType':
          return ProductAvailabilityTypeTypeTransformer().decode(value);
        case 'ProductCategoriesDemographic':
          return ProductCategoriesDemographic.fromJson(value);
        case 'ProductCategoriesEngagementType':
          return ProductCategoriesEngagementTypeTypeTransformer().decode(value);
        case 'ProductCategoriesMetricsHighlights':
          return ProductCategoriesMetricsHighlights.fromJson(value);
        case 'ProductCategoryDetailLookbackWindow':
          return ProductCategoryDetailLookbackWindowTypeTransformer().decode(value);
        case 'ProductCategoryDetails':
          return ProductCategoryDetails.fromJson(value);
        case 'ProductCategoryEnum':
          return ProductCategoryEnumTypeTransformer().decode(value);
        case 'ProductCategoryRegion':
          return ProductCategoryRegionTypeTransformer().decode(value);
        case 'ProductGroupAnalyticsResponseInner':
          return ProductGroupAnalyticsResponseInner.fromJson(value);
        case 'ProductGroupPromotion':
          return ProductGroupPromotion.fromJson(value);
        case 'ProductGroupPromotionCreateRequest':
          return ProductGroupPromotionCreateRequest.fromJson(value);
        case 'ProductGroupPromotionResponse':
          return ProductGroupPromotionResponse.fromJson(value);
        case 'ProductGroupPromotionResponseItem':
          return ProductGroupPromotionResponseItem.fromJson(value);
        case 'ProductGroupPromotionUpdateRequest':
          return ProductGroupPromotionUpdateRequest.fromJson(value);
        case 'ProductGroupPromotionsList200Response':
          return ProductGroupPromotionsList200Response.fromJson(value);
        case 'ProductGroupReferenceFilter':
          return ProductGroupReferenceFilter.fromJson(value);
        case 'ProductGroupSummaryStatus':
          return ProductGroupSummaryStatusTypeTransformer().decode(value);
        case 'ProductType0Filter':
          return ProductType0Filter.fromJson(value);
        case 'ProductType1Filter':
          return ProductType1Filter.fromJson(value);
        case 'ProductType2Filter':
          return ProductType2Filter.fromJson(value);
        case 'ProductType3Filter':
          return ProductType3Filter.fromJson(value);
        case 'ProductType4Filter':
          return ProductType4Filter.fromJson(value);
        case 'PromotionArrayElement':
          return PromotionArrayElement.fromJson(value);
        case 'PromotionCommon':
          return PromotionCommon.fromJson(value);
        case 'PromotionCreateRequest':
          return PromotionCreateRequest.fromJson(value);
        case 'PromotionResponse':
          return PromotionResponse.fromJson(value);
        case 'PromotionTemplateValue':
          return PromotionTemplateValue.fromJson(value);
        case 'PromotionType':
          return PromotionTypeTypeTransformer().decode(value);
        case 'PromotionUpdateRequest':
          return PromotionUpdateRequest.fromJson(value);
        case 'PromotionsList200Response':
          return PromotionsList200Response.fromJson(value);
        case 'PromotionsResponse':
          return PromotionsResponse.fromJson(value);
        case 'QualityComponentDetails':
          return QualityComponentDetails.fromJson(value);
        case 'QualityComponentIssue':
          return QualityComponentIssue.fromJson(value);
        case 'QualityComponents':
          return QualityComponents.fromJson(value);
        case 'QuizPinData':
          return QuizPinData.fromJson(value);
        case 'QuizPinOption':
          return QuizPinOption.fromJson(value);
        case 'QuizPinQuestion':
          return QuizPinQuestion.fromJson(value);
        case 'QuizPinResult':
          return QuizPinResult.fromJson(value);
        case 'RecordCounts':
          return RecordCounts.fromJson(value);
        case 'RelatedTerms':
          return RelatedTerms.fromJson(value);
        case 'RelatedTermsRelatedTermsListInner':
          return RelatedTermsRelatedTermsListInner.fromJson(value);
        case 'ReportingColumnAsync':
          return ReportingColumnAsyncTypeTransformer().decode(value);
        case 'ReportingTimeZone':
          return ReportingTimeZoneTypeTransformer().decode(value);
        case 'ReportsStats200Response':
          return ReportsStats200Response.fromJson(value);
        case 'ReportsStatsParametersParameter':
          return ReportsStatsParametersParameter.fromJson(value);
        case 'RespondToInvitesResponseArray':
          return RespondToInvitesResponseArray.fromJson(value);
        case 'RespondToInvitesResponseArrayItemsInner':
          return RespondToInvitesResponseArrayItemsInner.fromJson(value);
        case 'Role':
          return RoleTypeTransformer().decode(value);
        case 'S3FilePart':
          return S3FilePart.fromJson(value);
        case 'S3MultipartUploadData':
          return S3MultipartUploadData.fromJson(value);
        case 'SSIOAccountAddress':
          return SSIOAccountAddress.fromJson(value);
        case 'SSIOAccountItem':
          return SSIOAccountItem.fromJson(value);
        case 'SSIOAccountPMPName':
          return SSIOAccountPMPName.fromJson(value);
        case 'SSIOAccountResponse':
          return SSIOAccountResponse.fromJson(value);
        case 'SSIOCreateInsertionOrderRequest':
          return SSIOCreateInsertionOrderRequest.fromJson(value);
        case 'SSIOCreateInsertionOrderResponse':
          return SSIOCreateInsertionOrderResponse.fromJson(value);
        case 'SSIOEditInsertionOrderRequest':
          return SSIOEditInsertionOrderRequest.fromJson(value);
        case 'SSIOEditInsertionOrderResponse':
          return SSIOEditInsertionOrderResponse.fromJson(value);
        case 'SSIOInsertionOrderCommon':
          return SSIOInsertionOrderCommon.fromJson(value);
        case 'SSIOInsertionOrderStatus':
          return SSIOInsertionOrderStatus.fromJson(value);
        case 'SSIOInsertionOrderStatusResponse':
          return SSIOInsertionOrderStatusResponse.fromJson(value);
        case 'SSIOOrderLine':
          return SSIOOrderLine.fromJson(value);
        case 'SearchPartnerPins200Response':
          return SearchPartnerPins200Response.fromJson(value);
        case 'SearchUserBoardsGet200Response':
          return SearchUserBoardsGet200Response.fromJson(value);
        case 'SearchUserPinsList200Response':
          return SearchUserPinsList200Response.fromJson(value);
        case 'SharedAudience':
          return SharedAudience.fromJson(value);
        case 'SharedAudienceAccount':
          return SharedAudienceAccount.fromJson(value);
        case 'SharedAudienceCommon':
          return SharedAudienceCommon.fromJson(value);
        case 'SharedAudienceResponse':
          return SharedAudienceResponse.fromJson(value);
        case 'SharedAudienceResponseCommon':
          return SharedAudienceResponseCommon.fromJson(value);
        case 'SingleInterestTargetingOptionResponse':
          return SingleInterestTargetingOptionResponse.fromJson(value);
        case 'SourcePlatformOptions':
          return SourcePlatformOptionsTypeTransformer().decode(value);
        case 'SsioInsertionOrdersStatusGetByAdAccount200Response':
          return SsioInsertionOrdersStatusGetByAdAccount200Response.fromJson(value);
        case 'SsioOrderLinesGetByAdAccount200Response':
          return SsioOrderLinesGetByAdAccount200Response.fromJson(value);
        case 'SummaryPin':
          return SummaryPin.fromJson(value);
        case 'SystemUserUpdateRequest':
          return SystemUserUpdateRequest.fromJson(value);
        case 'TargetingAdvertiserCountry':
          return TargetingAdvertiserCountryTypeTransformer().decode(value);
        case 'TargetingSpec':
          return TargetingSpec.fromJson(value);
        case 'TargetingSpecAgeBucket':
          return TargetingSpecAgeBucketTypeTransformer().decode(value);
        case 'TargetingSpecAppType':
          return TargetingSpecAppTypeTypeTransformer().decode(value);
        case 'TargetingSpecGender':
          return TargetingSpecGenderTypeTransformer().decode(value);
        case 'TargetingSpecOperationAgeBucket':
          return TargetingSpecOperationAgeBucket.fromJson(value);
        case 'TargetingSpecOperationAppType':
          return TargetingSpecOperationAppType.fromJson(value);
        case 'TargetingSpecOperationGender':
          return TargetingSpecOperationGender.fromJson(value);
        case 'TargetingSpecOperationList':
          return TargetingSpecOperationList.fromJson(value);
        case 'TargetingSpecOperationMinMaxAge':
          return TargetingSpecOperationMinMaxAge.fromJson(value);
        case 'TargetingSpecOperationShoppingRetargeting':
          return TargetingSpecOperationShoppingRetargeting.fromJson(value);
        case 'TargetingSpecOperationString':
          return TargetingSpecOperationString.fromJson(value);
        case 'TargetingSpecShoppingRetargeting':
          return TargetingSpecShoppingRetargeting.fromJson(value);
        case 'TargetingTemplateAudienceSizing':
          return TargetingTemplateAudienceSizing.fromJson(value);
        case 'TargetingTemplateAudienceSizingReachEstimate':
          return TargetingTemplateAudienceSizingReachEstimate.fromJson(value);
        case 'TargetingTemplateCommon':
          return TargetingTemplateCommon.fromJson(value);
        case 'TargetingTemplateCreate':
          return TargetingTemplateCreate.fromJson(value);
        case 'TargetingTemplateGetResponseData':
          return TargetingTemplateGetResponseData.fromJson(value);
        case 'TargetingTemplateKeyword':
          return TargetingTemplateKeyword.fromJson(value);
        case 'TargetingTemplateList200Response':
          return TargetingTemplateList200Response.fromJson(value);
        case 'TargetingTemplateResponseData':
          return TargetingTemplateResponseData.fromJson(value);
        case 'TargetingTemplateUpdateRequest':
          return TargetingTemplateUpdateRequest.fromJson(value);
        case 'TargetingTypeFilter':
          return TargetingTypeFilter.fromJson(value);
        case 'TemplateBasedReport':
          return TemplateBasedReport.fromJson(value);
        case 'TemplateResponse':
          return TemplateResponse.fromJson(value);
        case 'TemplateResponseDateRange':
          return TemplateResponseDateRange.fromJson(value);
        case 'TemplateResponseDateRangeAbsoluteDateRange':
          return TemplateResponseDateRangeAbsoluteDateRange.fromJson(value);
        case 'TemplateResponseDateRangeDynamicDateRange':
          return TemplateResponseDateRangeDynamicDateRange.fromJson(value);
        case 'TemplateResponseDateRangeRelativeDateRange':
          return TemplateResponseDateRangeRelativeDateRange.fromJson(value);
        case 'TemplatesList200Response':
          return TemplatesList200Response.fromJson(value);
        case 'TermsOfService':
          return TermsOfService.fromJson(value);
        case 'TimeSeries':
          return TimeSeries.fromJson(value);
        case 'TitleKeywordsFilter':
          return TitleKeywordsFilter.fromJson(value);
        case 'TopPinsAnalyticsResponse':
          return TopPinsAnalyticsResponse.fromJson(value);
        case 'TopPinsAnalyticsResponseDateAvailability':
          return TopPinsAnalyticsResponseDateAvailability.fromJson(value);
        case 'TopPinsAnalyticsResponsePinsInner':
          return TopPinsAnalyticsResponsePinsInner.fromJson(value);
        case 'TopVideoPinsAnalyticsResponse':
          return TopVideoPinsAnalyticsResponse.fromJson(value);
        case 'TopVideoPinsAnalyticsResponsePinsInner':
          return TopVideoPinsAnalyticsResponsePinsInner.fromJson(value);
        case 'TrackingUrls':
          return TrackingUrls.fromJson(value);
        case 'TrendType':
          return TrendTypeTypeTransformer().decode(value);
        case 'TrendingKeyword':
          return TrendingKeyword.fromJson(value);
        case 'TrendingKeywordDemographics':
          return TrendingKeywordDemographics.fromJson(value);
        case 'TrendingKeywordDemographicsAgeDistribution':
          return TrendingKeywordDemographicsAgeDistribution.fromJson(value);
        case 'TrendingKeywordDemographicsGenderDistribution':
          return TrendingKeywordDemographicsGenderDistribution.fromJson(value);
        case 'TrendingKeywordsResponse':
          return TrendingKeywordsResponse.fromJson(value);
        case 'TrendingPin':
          return TrendingPin.fromJson(value);
        case 'TrendingProductCategory':
          return TrendingProductCategory.fromJson(value);
        case 'TrendingTopic':
          return TrendingTopic.fromJson(value);
        case 'TrendsSupportedRegion':
          return TrendsSupportedRegionTypeTransformer().decode(value);
        case 'UpdatableItemAttributes':
          return UpdatableItemAttributes.fromJson(value);
        case 'UpdatableItemAttributesGtin':
          return UpdatableItemAttributesGtin.fromJson(value);
        case 'UpdateAssetGroupBody':
          return UpdateAssetGroupBody.fromJson(value);
        case 'UpdateAssetGroupBodyAssetGroupsToUpdateInner':
          return UpdateAssetGroupBodyAssetGroupsToUpdateInner.fromJson(value);
        case 'UpdateAssetGroupResponse':
          return UpdateAssetGroupResponse.fromJson(value);
        case 'UpdateAssetGroupResponseExceptionsInner':
          return UpdateAssetGroupResponseExceptionsInner.fromJson(value);
        case 'UpdateInvitesResultsResponseArray':
          return UpdateInvitesResultsResponseArray.fromJson(value);
        case 'UpdateInvitesResultsResponseArrayItemsInner':
          return UpdateInvitesResultsResponseArrayItemsInner.fromJson(value);
        case 'UpdateMaskBidOptionField':
          return UpdateMaskBidOptionFieldTypeTransformer().decode(value);
        case 'UpdateMaskFieldType':
          return UpdateMaskFieldTypeTypeTransformer().decode(value);
        case 'UpdateMemberAssetAccessBody':
          return UpdateMemberAssetAccessBody.fromJson(value);
        case 'UpdateMemberAssetAccessBodyAccessesInner':
          return UpdateMemberAssetAccessBodyAccessesInner.fromJson(value);
        case 'UpdateMemberAssetsResultsResponseArray':
          return UpdateMemberAssetsResultsResponseArray.fromJson(value);
        case 'UpdateMemberAssetsResultsResponseArrayItemsInner':
          return UpdateMemberAssetsResultsResponseArrayItemsInner.fromJson(value);
        case 'UpdateMemberBusinessRoleBody':
          return UpdateMemberBusinessRoleBody.fromJson(value);
        case 'UpdateMemberResult':
          return UpdateMemberResult.fromJson(value);
        case 'UpdateMemberResultsResponseArray':
          return UpdateMemberResultsResponseArray.fromJson(value);
        case 'UpdatePartnerAssetAccessBody':
          return UpdatePartnerAssetAccessBody.fromJson(value);
        case 'UpdatePartnerAssetAccessBodyAccessesInner':
          return UpdatePartnerAssetAccessBodyAccessesInner.fromJson(value);
        case 'UpdatePartnerAssetsResult':
          return UpdatePartnerAssetsResult.fromJson(value);
        case 'UpdatePartnerAssetsResultsResponseArray':
          return UpdatePartnerAssetsResultsResponseArray.fromJson(value);
        case 'UpdatePartnerResultsResponseArray':
          return UpdatePartnerResultsResponseArray.fromJson(value);
        case 'UpdatePartnerResultsResponseArrayItemsInner':
          return UpdatePartnerResultsResponseArrayItemsInner.fromJson(value);
        case 'UserAccountFollowedInterests200Response':
          return UserAccountFollowedInterests200Response.fromJson(value);
        case 'UserBusinessRoleBinding':
          return UserBusinessRoleBinding.fromJson(value);
        case 'UserFollowingFeedType':
          return UserFollowingFeedTypeTypeTransformer().decode(value);
        case 'UserFollowingGet200Response':
          return UserFollowingGet200Response.fromJson(value);
        case 'UserListOperationType':
          return UserListOperationTypeTypeTransformer().decode(value);
        case 'UserListType':
          return UserListTypeTypeTransformer().decode(value);
        case 'UserSingleAssetBinding':
          return UserSingleAssetBinding.fromJson(value);
        case 'UserSummary':
          return UserSummary.fromJson(value);
        case 'UserWebsiteSummary':
          return UserWebsiteSummary.fromJson(value);
        case 'UserWebsiteVerificationCode':
          return UserWebsiteVerificationCode.fromJson(value);
        case 'UserWebsiteVerifyRequest':
          return UserWebsiteVerifyRequest.fromJson(value);
        case 'UserWebsitesGet200Response':
          return UserWebsitesGet200Response.fromJson(value);
        case 'UsersForIndividualAssetResponse':
          return UsersForIndividualAssetResponse.fromJson(value);
        case 'VerticalProductCategory':
          return VerticalProductCategoryTypeTransformer().decode(value);
        case 'VideoMetadataWithItemType':
          return VideoMetadataWithItemType.fromJson(value);
        default:
          dynamic match;
          if (value is List && (match = _regList.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toList(growable: growable);
          }
          if (value is Set && (match = _regSet.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toSet();
          }
          if (value is Map && (match = _regMap.firstMatch(targetType)?.group(1)) != null) {
            return Map<String, dynamic>.fromIterables(
              value.keys.cast<String>(),
              value.values.map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,)),
            );
          }
      }
    } on Exception catch (error, trace) {
      throw ApiException.withInner(HttpStatus.internalServerError, 'Exception during deserialization.', error, trace,);
    }
    throw ApiException(HttpStatus.internalServerError, 'Could not find a suitable class for deserialization',);
  }
}

/// Primarily intended for use in an isolate.
class DeserializationMessage {
  const DeserializationMessage({
    required this.json,
    required this.targetType,
    this.growable = false,
  });

  /// The JSON value to deserialize.
  final String json;

  /// Target type to deserialize to.
  final String targetType;

  /// Whether to make deserialized lists or maps growable.
  final bool growable;
}

/// Primarily intended for use in an isolate.
Future<dynamic> decodeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : json.decode(message.json);
}

/// Primarily intended for use in an isolate.
Future<dynamic> deserializeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : ApiClient.fromJson(
        json.decode(message.json),
        targetType,
        growable: message.growable,
      );
}

/// Primarily intended for use in an isolate.
Future<String> serializeAsync(Object? value) async => value == null ? '' : json.encode(value);
