import {interfaces} from 'inversify';

import { AdAccountsService } from './api/adAccounts.service';
import { AdGroupsService } from './api/adGroups.service';
import { AdsService } from './api/ads.service';
import { AudienceInsightsService } from './api/audienceInsights.service';
import { AudiencesService } from './api/audiences.service';
import { BillingService } from './api/billing.service';
import { BoardsService } from './api/boards.service';
import { BulkService } from './api/bulk.service';
import { CampaignsService } from './api/campaigns.service';
import { CatalogsService } from './api/catalogs.service';
import { ConversionEventsService } from './api/conversionEvents.service';
import { ConversionTagsService } from './api/conversionTags.service';
import { CustomerListsService } from './api/customerLists.service';
import { IntegrationsService } from './api/integrations.service';
import { KeywordsService } from './api/keywords.service';
import { LeadAdsService } from './api/leadAds.service';
import { LeadFormsService } from './api/leadForms.service';
import { MediaService } from './api/media.service';
import { OauthService } from './api/oauth.service';
import { OrderLinesService } from './api/orderLines.service';
import { PinsService } from './api/pins.service';
import { ProductGroupPromotionsService } from './api/productGroupPromotions.service';
import { ProductGroupsService } from './api/productGroups.service';
import { ResourcesService } from './api/resources.service';
import { SearchService } from './api/search.service';
import { TermsService } from './api/terms.service';
import { TermsOfServiceService } from './api/termsOfService.service';
import { UserAccountService } from './api/userAccount.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AdAccountsService>('AdAccountsService').to(AdAccountsService).inSingletonScope();
        container.bind<AdGroupsService>('AdGroupsService').to(AdGroupsService).inSingletonScope();
        container.bind<AdsService>('AdsService').to(AdsService).inSingletonScope();
        container.bind<AudienceInsightsService>('AudienceInsightsService').to(AudienceInsightsService).inSingletonScope();
        container.bind<AudiencesService>('AudiencesService').to(AudiencesService).inSingletonScope();
        container.bind<BillingService>('BillingService').to(BillingService).inSingletonScope();
        container.bind<BoardsService>('BoardsService').to(BoardsService).inSingletonScope();
        container.bind<BulkService>('BulkService').to(BulkService).inSingletonScope();
        container.bind<CampaignsService>('CampaignsService').to(CampaignsService).inSingletonScope();
        container.bind<CatalogsService>('CatalogsService').to(CatalogsService).inSingletonScope();
        container.bind<ConversionEventsService>('ConversionEventsService').to(ConversionEventsService).inSingletonScope();
        container.bind<ConversionTagsService>('ConversionTagsService').to(ConversionTagsService).inSingletonScope();
        container.bind<CustomerListsService>('CustomerListsService').to(CustomerListsService).inSingletonScope();
        container.bind<IntegrationsService>('IntegrationsService').to(IntegrationsService).inSingletonScope();
        container.bind<KeywordsService>('KeywordsService').to(KeywordsService).inSingletonScope();
        container.bind<LeadAdsService>('LeadAdsService').to(LeadAdsService).inSingletonScope();
        container.bind<LeadFormsService>('LeadFormsService').to(LeadFormsService).inSingletonScope();
        container.bind<MediaService>('MediaService').to(MediaService).inSingletonScope();
        container.bind<OauthService>('OauthService').to(OauthService).inSingletonScope();
        container.bind<OrderLinesService>('OrderLinesService').to(OrderLinesService).inSingletonScope();
        container.bind<PinsService>('PinsService').to(PinsService).inSingletonScope();
        container.bind<ProductGroupPromotionsService>('ProductGroupPromotionsService').to(ProductGroupPromotionsService).inSingletonScope();
        container.bind<ProductGroupsService>('ProductGroupsService').to(ProductGroupsService).inSingletonScope();
        container.bind<ResourcesService>('ResourcesService').to(ResourcesService).inSingletonScope();
        container.bind<SearchService>('SearchService').to(SearchService).inSingletonScope();
        container.bind<TermsService>('TermsService').to(TermsService).inSingletonScope();
        container.bind<TermsOfServiceService>('TermsOfServiceService').to(TermsOfServiceService).inSingletonScope();
        container.bind<UserAccountService>('UserAccountService').to(UserAccountService).inSingletonScope();
    }
}
