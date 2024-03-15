import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AdAccountsApiControllerImpInterface.class).to(AdAccountsApiControllerImp.class);
        bind(AdGroupsApiControllerImpInterface.class).to(AdGroupsApiControllerImp.class);
        bind(AdsApiControllerImpInterface.class).to(AdsApiControllerImp.class);
        bind(AudienceInsightsApiControllerImpInterface.class).to(AudienceInsightsApiControllerImp.class);
        bind(AudiencesApiControllerImpInterface.class).to(AudiencesApiControllerImp.class);
        bind(BillingApiControllerImpInterface.class).to(BillingApiControllerImp.class);
        bind(BoardsApiControllerImpInterface.class).to(BoardsApiControllerImp.class);
        bind(BulkApiControllerImpInterface.class).to(BulkApiControllerImp.class);
        bind(CampaignsApiControllerImpInterface.class).to(CampaignsApiControllerImp.class);
        bind(CatalogsApiControllerImpInterface.class).to(CatalogsApiControllerImp.class);
        bind(ConversionEventsApiControllerImpInterface.class).to(ConversionEventsApiControllerImp.class);
        bind(ConversionTagsApiControllerImpInterface.class).to(ConversionTagsApiControllerImp.class);
        bind(CustomerListsApiControllerImpInterface.class).to(CustomerListsApiControllerImp.class);
        bind(IntegrationsApiControllerImpInterface.class).to(IntegrationsApiControllerImp.class);
        bind(KeywordsApiControllerImpInterface.class).to(KeywordsApiControllerImp.class);
        bind(LeadAdsApiControllerImpInterface.class).to(LeadAdsApiControllerImp.class);
        bind(LeadFormsApiControllerImpInterface.class).to(LeadFormsApiControllerImp.class);
        bind(MediaApiControllerImpInterface.class).to(MediaApiControllerImp.class);
        bind(OauthApiControllerImpInterface.class).to(OauthApiControllerImp.class);
        bind(OrderLinesApiControllerImpInterface.class).to(OrderLinesApiControllerImp.class);
        bind(PinsApiControllerImpInterface.class).to(PinsApiControllerImp.class);
        bind(ProductGroupPromotionsApiControllerImpInterface.class).to(ProductGroupPromotionsApiControllerImp.class);
        bind(ProductGroupsApiControllerImpInterface.class).to(ProductGroupsApiControllerImp.class);
        bind(ResourcesApiControllerImpInterface.class).to(ResourcesApiControllerImp.class);
        bind(SearchApiControllerImpInterface.class).to(SearchApiControllerImp.class);
        bind(TermsApiControllerImpInterface.class).to(TermsApiControllerImp.class);
        bind(TermsOfServiceApiControllerImpInterface.class).to(TermsOfServiceApiControllerImp.class);
        bind(UserAccountApiControllerImpInterface.class).to(UserAccountApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}