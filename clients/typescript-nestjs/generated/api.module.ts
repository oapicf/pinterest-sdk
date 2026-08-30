import { DynamicModule, Module, Global, Provider } from '@nestjs/common';
import { HttpModule, HttpService } from '@nestjs/axios';
import { AsyncConfiguration, Configuration, ConfigurationFactory } from './configuration';

import { AdAccountsService } from './api/adAccounts.service';
import { AdGroupsService } from './api/adGroups.service';
import { AdsService } from './api/ads.service';
import { AdvancedAuctionService } from './api/advancedAuction.service';
import { AudienceInsightsService } from './api/audienceInsights.service';
import { AudienceSharingService } from './api/audienceSharing.service';
import { AudiencesService } from './api/audiences.service';
import { BillingService } from './api/billing.service';
import { BoardsService } from './api/boards.service';
import { BulkService } from './api/bulk.service';
import { BusinessAccessAssetsService } from './api/businessAccessAssets.service';
import { BusinessAccessInviteService } from './api/businessAccessInvite.service';
import { BusinessAccessRelationshipsService } from './api/businessAccessRelationships.service';
import { CampaignsService } from './api/campaigns.service';
import { CatalogFeedsService } from './api/catalogFeeds.service';
import { CatalogItemsService } from './api/catalogItems.service';
import { CatalogProductGroupsService } from './api/catalogProductGroups.service';
import { CatalogReportsService } from './api/catalogReports.service';
import { CatalogSupplementalService } from './api/catalogSupplemental.service';
import { CatalogsService } from './api/catalogs.service';
import { ConversionDeletionRequestsService } from './api/conversionDeletionRequests.service';
import { ConversionEqsService } from './api/conversionEqs.service';
import { ConversionEventsService } from './api/conversionEvents.service';
import { ConversionTagsService } from './api/conversionTags.service';
import { ConversionsService } from './api/conversions.service';
import { CustomerListUploadsService } from './api/customerListUploads.service';
import { CustomerListsService } from './api/customerLists.service';
import { CustomerSegmentService } from './api/customerSegment.service';
import { IntegrationsService } from './api/integrations.service';
import { KeywordsService } from './api/keywords.service';
import { LabelsService } from './api/labels.service';
import { LeadAdsService } from './api/leadAds.service';
import { LeadFormsService } from './api/leadForms.service';
import { LeadsExportService } from './api/leadsExport.service';
import { MediaService } from './api/media.service';
import { MsotEventsService } from './api/msotEvents.service';
import { NotificationService } from './api/notification.service';
import { OauthService } from './api/oauth.service';
import { OrderLinesService } from './api/orderLines.service';
import { PinsService } from './api/pins.service';
import { ProductGroupPromotionsService } from './api/productGroupPromotions.service';
import { ProductTagsService } from './api/productTags.service';
import { PromotionsService } from './api/promotions.service';
import { ResourcesService } from './api/resources.service';
import { SchedulesService } from './api/schedules.service';
import { SearchService } from './api/search.service';
import { TargetingTemplateService } from './api/targetingTemplate.service';
import { TermsService } from './api/terms.service';
import { TermsOfServiceService } from './api/termsOfService.service';
import { TrendsService } from './api/trends.service';
import { UserAccountService } from './api/userAccount.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    AdAccountsService,
    AdGroupsService,
    AdsService,
    AdvancedAuctionService,
    AudienceInsightsService,
    AudienceSharingService,
    AudiencesService,
    BillingService,
    BoardsService,
    BulkService,
    BusinessAccessAssetsService,
    BusinessAccessInviteService,
    BusinessAccessRelationshipsService,
    CampaignsService,
    CatalogFeedsService,
    CatalogItemsService,
    CatalogProductGroupsService,
    CatalogReportsService,
    CatalogSupplementalService,
    CatalogsService,
    ConversionDeletionRequestsService,
    ConversionEqsService,
    ConversionEventsService,
    ConversionTagsService,
    ConversionsService,
    CustomerListUploadsService,
    CustomerListsService,
    CustomerSegmentService,
    IntegrationsService,
    KeywordsService,
    LabelsService,
    LeadAdsService,
    LeadFormsService,
    LeadsExportService,
    MediaService,
    MsotEventsService,
    NotificationService,
    OauthService,
    OrderLinesService,
    PinsService,
    ProductGroupPromotionsService,
    ProductTagsService,
    PromotionsService,
    ResourcesService,
    SchedulesService,
    SearchService,
    TargetingTemplateService,
    TermsService,
    TermsOfServiceService,
    TrendsService,
    UserAccountService
  ],
  providers: [
    AdAccountsService,
    AdGroupsService,
    AdsService,
    AdvancedAuctionService,
    AudienceInsightsService,
    AudienceSharingService,
    AudiencesService,
    BillingService,
    BoardsService,
    BulkService,
    BusinessAccessAssetsService,
    BusinessAccessInviteService,
    BusinessAccessRelationshipsService,
    CampaignsService,
    CatalogFeedsService,
    CatalogItemsService,
    CatalogProductGroupsService,
    CatalogReportsService,
    CatalogSupplementalService,
    CatalogsService,
    ConversionDeletionRequestsService,
    ConversionEqsService,
    ConversionEventsService,
    ConversionTagsService,
    ConversionsService,
    CustomerListUploadsService,
    CustomerListsService,
    CustomerSegmentService,
    IntegrationsService,
    KeywordsService,
    LabelsService,
    LeadAdsService,
    LeadFormsService,
    LeadsExportService,
    MediaService,
    MsotEventsService,
    NotificationService,
    OauthService,
    OrderLinesService,
    PinsService,
    ProductGroupPromotionsService,
    ProductTagsService,
    PromotionsService,
    ResourcesService,
    SchedulesService,
    SearchService,
    TargetingTemplateService,
    TermsService,
    TermsOfServiceService,
    TrendsService,
    UserAccountService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    /**
     * Register the module asynchronously.
     */
    static forRootAsync(options: AsyncConfiguration): DynamicModule {
        const providers = [...this.createAsyncProviders(options)];
        return {
            module: ApiModule,
            imports: options.imports || [],
            providers,
            exports: providers,
        };
    }

    private static createAsyncProviders(options: AsyncConfiguration): Provider[] {
        if (options.useClass) {
            return [
                this.createAsyncConfigurationProvider(options),
                {
                    provide: options.useClass,
                    useClass: options.useClass,
                },
            ];
        }
        return [this.createAsyncConfigurationProvider(options)];
    }

    private static createAsyncConfigurationProvider(
        options: AsyncConfiguration,
    ): Provider {
        if (options.useFactory) {
            return {
                provide: Configuration,
                useFactory: options.useFactory,
                inject: options.inject || [],
            };
        }
        return {
            provide: Configuration,
            useFactory: async (optionsFactory: ConfigurationFactory) =>
                await optionsFactory.createConfiguration(),
            inject: (options.useExisting && [options.useExisting]) || (options.useClass && [options.useClass]) || [],
        };
    }

    constructor( httpService: HttpService) { }
}
