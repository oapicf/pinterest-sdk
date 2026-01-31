import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AdAccountsApiControllerImpInterface.class).to(AdAccountsApiControllerImp.class);
        bind(AdGroupsApiControllerImpInterface.class).to(AdGroupsApiControllerImp.class);
        bind(AdsApiControllerImpInterface.class).to(AdsApiControllerImp.class);
        bind(AdvancedAuctionApiControllerImpInterface.class).to(AdvancedAuctionApiControllerImp.class);
        bind(AudienceInsightsApiControllerImpInterface.class).to(AudienceInsightsApiControllerImp.class);
        bind(AudienceSharingApiControllerImpInterface.class).to(AudienceSharingApiControllerImp.class);
        bind(AudiencesApiControllerImpInterface.class).to(AudiencesApiControllerImp.class);
        bind(BillingApiControllerImpInterface.class).to(BillingApiControllerImp.class);
        bind(BoardsApiControllerImpInterface.class).to(BoardsApiControllerImp.class);
        bind(BulkApiControllerImpInterface.class).to(BulkApiControllerImp.class);
        bind(BusinessAccessAssetsApiControllerImpInterface.class).to(BusinessAccessAssetsApiControllerImp.class);
        bind(BusinessAccessInviteApiControllerImpInterface.class).to(BusinessAccessInviteApiControllerImp.class);
        bind(BusinessAccessRelationshipsApiControllerImpInterface.class).to(BusinessAccessRelationshipsApiControllerImp.class);
        bind(CampaignsApiControllerImpInterface.class).to(CampaignsApiControllerImp.class);
        bind(CatalogFeedsApiControllerImpInterface.class).to(CatalogFeedsApiControllerImp.class);
        bind(CatalogItemsApiControllerImpInterface.class).to(CatalogItemsApiControllerImp.class);
        bind(CatalogProductGroupsApiControllerImpInterface.class).to(CatalogProductGroupsApiControllerImp.class);
        bind(CatalogReportsApiControllerImpInterface.class).to(CatalogReportsApiControllerImp.class);
        bind(CatalogsApiControllerImpInterface.class).to(CatalogsApiControllerImp.class);
        bind(ConversionEqsApiControllerImpInterface.class).to(ConversionEqsApiControllerImp.class);
        bind(ConversionEventsApiControllerImpInterface.class).to(ConversionEventsApiControllerImp.class);
        bind(ConversionTagsApiControllerImpInterface.class).to(ConversionTagsApiControllerImp.class);
        bind(ConversionsApiControllerImpInterface.class).to(ConversionsApiControllerImp.class);
        bind(CustomerListUploadsApiControllerImpInterface.class).to(CustomerListUploadsApiControllerImp.class);
        bind(CustomerListsApiControllerImpInterface.class).to(CustomerListsApiControllerImp.class);
        bind(IntegrationsApiControllerImpInterface.class).to(IntegrationsApiControllerImp.class);
        bind(KeywordsApiControllerImpInterface.class).to(KeywordsApiControllerImp.class);
        bind(LabelsApiControllerImpInterface.class).to(LabelsApiControllerImp.class);
        bind(LeadAdsApiControllerImpInterface.class).to(LeadAdsApiControllerImp.class);
        bind(LeadFormsApiControllerImpInterface.class).to(LeadFormsApiControllerImp.class);
        bind(LeadsExportApiControllerImpInterface.class).to(LeadsExportApiControllerImp.class);
        bind(MediaApiControllerImpInterface.class).to(MediaApiControllerImp.class);
        bind(MsotEventsApiControllerImpInterface.class).to(MsotEventsApiControllerImp.class);
        bind(NotificationApiControllerImpInterface.class).to(NotificationApiControllerImp.class);
        bind(OauthApiControllerImpInterface.class).to(OauthApiControllerImp.class);
        bind(OrderLinesApiControllerImpInterface.class).to(OrderLinesApiControllerImp.class);
        bind(PinsApiControllerImpInterface.class).to(PinsApiControllerImp.class);
        bind(ProductCategoriesApiControllerImpInterface.class).to(ProductCategoriesApiControllerImp.class);
        bind(ProductGroupPromotionsApiControllerImpInterface.class).to(ProductGroupPromotionsApiControllerImp.class);
        bind(PromotionsApiControllerImpInterface.class).to(PromotionsApiControllerImp.class);
        bind(ResourcesApiControllerImpInterface.class).to(ResourcesApiControllerImp.class);
        bind(SearchApiControllerImpInterface.class).to(SearchApiControllerImp.class);
        bind(TargetingTemplateApiControllerImpInterface.class).to(TargetingTemplateApiControllerImp.class);
        bind(TermsApiControllerImpInterface.class).to(TermsApiControllerImp.class);
        bind(TermsOfServiceApiControllerImpInterface.class).to(TermsOfServiceApiControllerImp.class);
        bind(UserAccountApiControllerImpInterface.class).to(UserAccountApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}