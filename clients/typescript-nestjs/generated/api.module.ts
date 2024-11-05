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
import { CatalogsService } from './api/catalogs.service';
import { ConversionEventsService } from './api/conversionEvents.service';
import { ConversionTagsService } from './api/conversionTags.service';
import { CustomerListsService } from './api/customerLists.service';
import { IntegrationsService } from './api/integrations.service';
import { KeywordsService } from './api/keywords.service';
import { LeadAdsService } from './api/leadAds.service';
import { LeadFormsService } from './api/leadForms.service';
import { LeadsExportService } from './api/leadsExport.service';
import { MediaService } from './api/media.service';
import { OauthService } from './api/oauth.service';
import { OrderLinesService } from './api/orderLines.service';
import { PinsService } from './api/pins.service';
import { ProductGroupPromotionsService } from './api/productGroupPromotions.service';
import { ResourcesService } from './api/resources.service';
import { SearchService } from './api/search.service';
import { TargetingTemplateService } from './api/targetingTemplate.service';
import { TermsService } from './api/terms.service';
import { TermsOfServiceService } from './api/termsOfService.service';
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
    CatalogsService,
    ConversionEventsService,
    ConversionTagsService,
    CustomerListsService,
    IntegrationsService,
    KeywordsService,
    LeadAdsService,
    LeadFormsService,
    LeadsExportService,
    MediaService,
    OauthService,
    OrderLinesService,
    PinsService,
    ProductGroupPromotionsService,
    ResourcesService,
    SearchService,
    TargetingTemplateService,
    TermsService,
    TermsOfServiceService,
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
    CatalogsService,
    ConversionEventsService,
    ConversionTagsService,
    CustomerListsService,
    IntegrationsService,
    KeywordsService,
    LeadAdsService,
    LeadFormsService,
    LeadsExportService,
    MediaService,
    OauthService,
    OrderLinesService,
    PinsService,
    ProductGroupPromotionsService,
    ResourcesService,
    SearchService,
    TargetingTemplateService,
    TermsService,
    TermsOfServiceService,
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
