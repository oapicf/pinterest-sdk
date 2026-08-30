//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:dio/dio.dart';
import 'package:built_value/serializer.dart';
import 'package:openapi/src/serializers.dart';
import 'package:openapi/src/auth/api_key_auth.dart';
import 'package:openapi/src/auth/basic_auth.dart';
import 'package:openapi/src/auth/bearer_auth.dart';
import 'package:openapi/src/auth/oauth.dart';
import 'package:openapi/src/api/ad_accounts_api.dart';
import 'package:openapi/src/api/ad_groups_api.dart';
import 'package:openapi/src/api/ads_api.dart';
import 'package:openapi/src/api/advanced_auction_api.dart';
import 'package:openapi/src/api/audience_insights_api.dart';
import 'package:openapi/src/api/audience_sharing_api.dart';
import 'package:openapi/src/api/audiences_api.dart';
import 'package:openapi/src/api/billing_api.dart';
import 'package:openapi/src/api/boards_api.dart';
import 'package:openapi/src/api/bulk_api.dart';
import 'package:openapi/src/api/business_access_assets_api.dart';
import 'package:openapi/src/api/business_access_invite_api.dart';
import 'package:openapi/src/api/business_access_relationships_api.dart';
import 'package:openapi/src/api/campaigns_api.dart';
import 'package:openapi/src/api/catalog_feeds_api.dart';
import 'package:openapi/src/api/catalog_items_api.dart';
import 'package:openapi/src/api/catalog_product_groups_api.dart';
import 'package:openapi/src/api/catalog_reports_api.dart';
import 'package:openapi/src/api/catalog_supplemental_api.dart';
import 'package:openapi/src/api/catalogs_api.dart';
import 'package:openapi/src/api/conversion_deletion_requests_api.dart';
import 'package:openapi/src/api/conversion_eqs_api.dart';
import 'package:openapi/src/api/conversion_events_api.dart';
import 'package:openapi/src/api/conversion_tags_api.dart';
import 'package:openapi/src/api/conversions_api.dart';
import 'package:openapi/src/api/customer_list_uploads_api.dart';
import 'package:openapi/src/api/customer_lists_api.dart';
import 'package:openapi/src/api/customer_segment_api.dart';
import 'package:openapi/src/api/integrations_api.dart';
import 'package:openapi/src/api/keywords_api.dart';
import 'package:openapi/src/api/labels_api.dart';
import 'package:openapi/src/api/lead_ads_api.dart';
import 'package:openapi/src/api/lead_forms_api.dart';
import 'package:openapi/src/api/leads_export_api.dart';
import 'package:openapi/src/api/media_api.dart';
import 'package:openapi/src/api/msot_events_api.dart';
import 'package:openapi/src/api/notification_api.dart';
import 'package:openapi/src/api/oauth_api.dart';
import 'package:openapi/src/api/order_lines_api.dart';
import 'package:openapi/src/api/pins_api.dart';
import 'package:openapi/src/api/product_group_promotions_api.dart';
import 'package:openapi/src/api/product_tags_api.dart';
import 'package:openapi/src/api/promotions_api.dart';
import 'package:openapi/src/api/resources_api.dart';
import 'package:openapi/src/api/schedules_api.dart';
import 'package:openapi/src/api/search_api.dart';
import 'package:openapi/src/api/targeting_template_api.dart';
import 'package:openapi/src/api/terms_api.dart';
import 'package:openapi/src/api/terms_of_service_api.dart';
import 'package:openapi/src/api/trends_api.dart';
import 'package:openapi/src/api/user_account_api.dart';

class Openapi {
  static const String basePath = r'https://api.pinterest.com/v5';

  final Dio dio;
  final Serializers serializers;

  Openapi({
    Dio? dio,
    Serializers? serializers,
    String? basePathOverride,
    List<Interceptor>? interceptors,
  })  : this.serializers = serializers ?? standardSerializers,
        this.dio = dio ??
            Dio(BaseOptions(
              baseUrl: basePathOverride ?? basePath,
              connectTimeout: const Duration(milliseconds: 5000),
              receiveTimeout: const Duration(milliseconds: 3000),
            )) {
    if (interceptors == null) {
      this.dio.interceptors.addAll([
        OAuthInterceptor(),
        BasicAuthInterceptor(),
        BearerAuthInterceptor(),
        ApiKeyAuthInterceptor(),
      ]);
    } else {
      this.dio.interceptors.addAll(interceptors);
    }
  }

  void setOAuthToken(String name, String token) {
    if (this.dio.interceptors.any((i) => i is OAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is OAuthInterceptor) as OAuthInterceptor).tokens[name] = token;
    }
  }

  /// Removes the OAuth token associated with the given [name].
  ///
  /// If no [OAuthInterceptor] is registered or no token exists for the given
  /// [name], this method has no effect.
  void removeOAuthToken(String name) {
    if (this.dio.interceptors.any((i) => i is OAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is OAuthInterceptor) as OAuthInterceptor).tokens.remove(name);
    }
  }

  void setBearerAuth(String name, String token) {
    if (this.dio.interceptors.any((i) => i is BearerAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is BearerAuthInterceptor) as BearerAuthInterceptor).tokens[name] = token;
    }
  }

  /// Removes the bearer authentication token associated with the given [name].
  ///
  /// If no [BearerAuthInterceptor] is registered or no token exists for the
  /// given [name], this method has no effect.
  void removeBearerAuth(String name) {
    if (this.dio.interceptors.any((i) => i is BearerAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is BearerAuthInterceptor) as BearerAuthInterceptor).tokens.remove(name);
    }
  }

  void setBasicAuth(String name, String username, String password) {
    if (this.dio.interceptors.any((i) => i is BasicAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is BasicAuthInterceptor) as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }
  }

  /// Removes the basic authentication credentials associated with the given [name].
  ///
  /// If no [BasicAuthInterceptor] is registered or no credentials exist for the
  /// given [name], this method has no effect.
  void removeBasicAuth(String name) {
    if (this.dio.interceptors.any((i) => i is BasicAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is BasicAuthInterceptor) as BasicAuthInterceptor).authInfo.remove(name);
    }
  }

  void setApiKey(String name, String apiKey) {
    if (this.dio.interceptors.any((i) => i is ApiKeyAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((element) => element is ApiKeyAuthInterceptor) as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }
  }

  /// Removes the API key associated with the given [name].
  ///
  /// If no [ApiKeyAuthInterceptor] is registered or no API key exists for the
  /// given [name], this method has no effect.
  void removeApiKey(String name) {
    if (this.dio.interceptors.any((i) => i is ApiKeyAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((element) => element is ApiKeyAuthInterceptor) as ApiKeyAuthInterceptor).apiKeys.remove(name);
    }
  }

  /// Get AdAccountsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AdAccountsApi getAdAccountsApi() {
    return AdAccountsApi(dio, serializers);
  }

  /// Get AdGroupsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AdGroupsApi getAdGroupsApi() {
    return AdGroupsApi(dio, serializers);
  }

  /// Get AdsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AdsApi getAdsApi() {
    return AdsApi(dio, serializers);
  }

  /// Get AdvancedAuctionApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AdvancedAuctionApi getAdvancedAuctionApi() {
    return AdvancedAuctionApi(dio, serializers);
  }

  /// Get AudienceInsightsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AudienceInsightsApi getAudienceInsightsApi() {
    return AudienceInsightsApi(dio, serializers);
  }

  /// Get AudienceSharingApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AudienceSharingApi getAudienceSharingApi() {
    return AudienceSharingApi(dio, serializers);
  }

  /// Get AudiencesApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  AudiencesApi getAudiencesApi() {
    return AudiencesApi(dio, serializers);
  }

  /// Get BillingApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  BillingApi getBillingApi() {
    return BillingApi(dio, serializers);
  }

  /// Get BoardsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  BoardsApi getBoardsApi() {
    return BoardsApi(dio, serializers);
  }

  /// Get BulkApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  BulkApi getBulkApi() {
    return BulkApi(dio, serializers);
  }

  /// Get BusinessAccessAssetsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  BusinessAccessAssetsApi getBusinessAccessAssetsApi() {
    return BusinessAccessAssetsApi(dio, serializers);
  }

  /// Get BusinessAccessInviteApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  BusinessAccessInviteApi getBusinessAccessInviteApi() {
    return BusinessAccessInviteApi(dio, serializers);
  }

  /// Get BusinessAccessRelationshipsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  BusinessAccessRelationshipsApi getBusinessAccessRelationshipsApi() {
    return BusinessAccessRelationshipsApi(dio, serializers);
  }

  /// Get CampaignsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CampaignsApi getCampaignsApi() {
    return CampaignsApi(dio, serializers);
  }

  /// Get CatalogFeedsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CatalogFeedsApi getCatalogFeedsApi() {
    return CatalogFeedsApi(dio, serializers);
  }

  /// Get CatalogItemsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CatalogItemsApi getCatalogItemsApi() {
    return CatalogItemsApi(dio, serializers);
  }

  /// Get CatalogProductGroupsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CatalogProductGroupsApi getCatalogProductGroupsApi() {
    return CatalogProductGroupsApi(dio, serializers);
  }

  /// Get CatalogReportsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CatalogReportsApi getCatalogReportsApi() {
    return CatalogReportsApi(dio, serializers);
  }

  /// Get CatalogSupplementalApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CatalogSupplementalApi getCatalogSupplementalApi() {
    return CatalogSupplementalApi(dio, serializers);
  }

  /// Get CatalogsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CatalogsApi getCatalogsApi() {
    return CatalogsApi(dio, serializers);
  }

  /// Get ConversionDeletionRequestsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ConversionDeletionRequestsApi getConversionDeletionRequestsApi() {
    return ConversionDeletionRequestsApi(dio, serializers);
  }

  /// Get ConversionEqsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ConversionEqsApi getConversionEqsApi() {
    return ConversionEqsApi(dio, serializers);
  }

  /// Get ConversionEventsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ConversionEventsApi getConversionEventsApi() {
    return ConversionEventsApi(dio, serializers);
  }

  /// Get ConversionTagsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ConversionTagsApi getConversionTagsApi() {
    return ConversionTagsApi(dio, serializers);
  }

  /// Get ConversionsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ConversionsApi getConversionsApi() {
    return ConversionsApi(dio, serializers);
  }

  /// Get CustomerListUploadsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CustomerListUploadsApi getCustomerListUploadsApi() {
    return CustomerListUploadsApi(dio, serializers);
  }

  /// Get CustomerListsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CustomerListsApi getCustomerListsApi() {
    return CustomerListsApi(dio, serializers);
  }

  /// Get CustomerSegmentApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  CustomerSegmentApi getCustomerSegmentApi() {
    return CustomerSegmentApi(dio, serializers);
  }

  /// Get IntegrationsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  IntegrationsApi getIntegrationsApi() {
    return IntegrationsApi(dio, serializers);
  }

  /// Get KeywordsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  KeywordsApi getKeywordsApi() {
    return KeywordsApi(dio, serializers);
  }

  /// Get LabelsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  LabelsApi getLabelsApi() {
    return LabelsApi(dio, serializers);
  }

  /// Get LeadAdsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  LeadAdsApi getLeadAdsApi() {
    return LeadAdsApi(dio, serializers);
  }

  /// Get LeadFormsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  LeadFormsApi getLeadFormsApi() {
    return LeadFormsApi(dio, serializers);
  }

  /// Get LeadsExportApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  LeadsExportApi getLeadsExportApi() {
    return LeadsExportApi(dio, serializers);
  }

  /// Get MediaApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  MediaApi getMediaApi() {
    return MediaApi(dio, serializers);
  }

  /// Get MsotEventsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  MsotEventsApi getMsotEventsApi() {
    return MsotEventsApi(dio, serializers);
  }

  /// Get NotificationApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  NotificationApi getNotificationApi() {
    return NotificationApi(dio, serializers);
  }

  /// Get OauthApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  OauthApi getOauthApi() {
    return OauthApi(dio, serializers);
  }

  /// Get OrderLinesApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  OrderLinesApi getOrderLinesApi() {
    return OrderLinesApi(dio, serializers);
  }

  /// Get PinsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  PinsApi getPinsApi() {
    return PinsApi(dio, serializers);
  }

  /// Get ProductGroupPromotionsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ProductGroupPromotionsApi getProductGroupPromotionsApi() {
    return ProductGroupPromotionsApi(dio, serializers);
  }

  /// Get ProductTagsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ProductTagsApi getProductTagsApi() {
    return ProductTagsApi(dio, serializers);
  }

  /// Get PromotionsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  PromotionsApi getPromotionsApi() {
    return PromotionsApi(dio, serializers);
  }

  /// Get ResourcesApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ResourcesApi getResourcesApi() {
    return ResourcesApi(dio, serializers);
  }

  /// Get SchedulesApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  SchedulesApi getSchedulesApi() {
    return SchedulesApi(dio, serializers);
  }

  /// Get SearchApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  SearchApi getSearchApi() {
    return SearchApi(dio, serializers);
  }

  /// Get TargetingTemplateApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  TargetingTemplateApi getTargetingTemplateApi() {
    return TargetingTemplateApi(dio, serializers);
  }

  /// Get TermsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  TermsApi getTermsApi() {
    return TermsApi(dio, serializers);
  }

  /// Get TermsOfServiceApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  TermsOfServiceApi getTermsOfServiceApi() {
    return TermsOfServiceApi(dio, serializers);
  }

  /// Get TrendsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  TrendsApi getTrendsApi() {
    return TrendsApi(dio, serializers);
  }

  /// Get UserAccountApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  UserAccountApi getUserAccountApi() {
    return UserAccountApi(dio, serializers);
  }
}
