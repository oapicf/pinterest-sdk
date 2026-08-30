import { Type } from '@nestjs/common';
import { AdAccountsApi } from './api';
import { AdGroupsApi } from './api';
import { AdsApi } from './api';
import { AdvancedAuctionApi } from './api';
import { AudienceInsightsApi } from './api';
import { AudienceSharingApi } from './api';
import { AudiencesApi } from './api';
import { BillingApi } from './api';
import { BoardsApi } from './api';
import { BulkApi } from './api';
import { BusinessAccessAssetsApi } from './api';
import { BusinessAccessInviteApi } from './api';
import { BusinessAccessRelationshipsApi } from './api';
import { CampaignsApi } from './api';
import { CatalogFeedsApi } from './api';
import { CatalogItemsApi } from './api';
import { CatalogProductGroupsApi } from './api';
import { CatalogReportsApi } from './api';
import { CatalogSupplementalApi } from './api';
import { CatalogsApi } from './api';
import { ConversionDeletionRequestsApi } from './api';
import { ConversionEqsApi } from './api';
import { ConversionEventsApi } from './api';
import { ConversionTagsApi } from './api';
import { ConversionsApi } from './api';
import { CustomerListUploadsApi } from './api';
import { CustomerListsApi } from './api';
import { CustomerSegmentApi } from './api';
import { IntegrationsApi } from './api';
import { KeywordsApi } from './api';
import { LabelsApi } from './api';
import { LeadAdsApi } from './api';
import { LeadFormsApi } from './api';
import { LeadsExportApi } from './api';
import { MediaApi } from './api';
import { MsotEventsApi } from './api';
import { NotificationApi } from './api';
import { OauthApi } from './api';
import { OrderLinesApi } from './api';
import { PinsApi } from './api';
import { ProductGroupPromotionsApi } from './api';
import { ProductTagsApi } from './api';
import { PromotionsApi } from './api';
import { ResourcesApi } from './api';
import { SchedulesApi } from './api';
import { SearchApi } from './api';
import { TargetingTemplateApi } from './api';
import { TermsApi } from './api';
import { TermsOfServiceApi } from './api';
import { TrendsApi } from './api';
import { UserAccountApi } from './api';

/**
 * Provide this type to {@link ApiModule} to provide your API implementations
**/
export type ApiImplementations = {
  adAccountsApi: Type<AdAccountsApi>
  adGroupsApi: Type<AdGroupsApi>
  adsApi: Type<AdsApi>
  advancedAuctionApi: Type<AdvancedAuctionApi>
  audienceInsightsApi: Type<AudienceInsightsApi>
  audienceSharingApi: Type<AudienceSharingApi>
  audiencesApi: Type<AudiencesApi>
  billingApi: Type<BillingApi>
  boardsApi: Type<BoardsApi>
  bulkApi: Type<BulkApi>
  businessAccessAssetsApi: Type<BusinessAccessAssetsApi>
  businessAccessInviteApi: Type<BusinessAccessInviteApi>
  businessAccessRelationshipsApi: Type<BusinessAccessRelationshipsApi>
  campaignsApi: Type<CampaignsApi>
  catalogFeedsApi: Type<CatalogFeedsApi>
  catalogItemsApi: Type<CatalogItemsApi>
  catalogProductGroupsApi: Type<CatalogProductGroupsApi>
  catalogReportsApi: Type<CatalogReportsApi>
  catalogSupplementalApi: Type<CatalogSupplementalApi>
  catalogsApi: Type<CatalogsApi>
  conversionDeletionRequestsApi: Type<ConversionDeletionRequestsApi>
  conversionEqsApi: Type<ConversionEqsApi>
  conversionEventsApi: Type<ConversionEventsApi>
  conversionTagsApi: Type<ConversionTagsApi>
  conversionsApi: Type<ConversionsApi>
  customerListUploadsApi: Type<CustomerListUploadsApi>
  customerListsApi: Type<CustomerListsApi>
  customerSegmentApi: Type<CustomerSegmentApi>
  integrationsApi: Type<IntegrationsApi>
  keywordsApi: Type<KeywordsApi>
  labelsApi: Type<LabelsApi>
  leadAdsApi: Type<LeadAdsApi>
  leadFormsApi: Type<LeadFormsApi>
  leadsExportApi: Type<LeadsExportApi>
  mediaApi: Type<MediaApi>
  msotEventsApi: Type<MsotEventsApi>
  notificationApi: Type<NotificationApi>
  oauthApi: Type<OauthApi>
  orderLinesApi: Type<OrderLinesApi>
  pinsApi: Type<PinsApi>
  productGroupPromotionsApi: Type<ProductGroupPromotionsApi>
  productTagsApi: Type<ProductTagsApi>
  promotionsApi: Type<PromotionsApi>
  resourcesApi: Type<ResourcesApi>
  schedulesApi: Type<SchedulesApi>
  searchApi: Type<SearchApi>
  targetingTemplateApi: Type<TargetingTemplateApi>
  termsApi: Type<TermsApi>
  termsOfServiceApi: Type<TermsOfServiceApi>
  trendsApi: Type<TrendsApi>
  userAccountApi: Type<UserAccountApi>
};
