import { DynamicModule, Module, Provider } from '@nestjs/common';
import { ApiImplementations } from './api-implementations'
import { AdAccountsApi } from './api';
import { AdAccountsApiController } from './controllers';
import { AdGroupsApi } from './api';
import { AdGroupsApiController } from './controllers';
import { AdsApi } from './api';
import { AdsApiController } from './controllers';
import { AdvancedAuctionApi } from './api';
import { AdvancedAuctionApiController } from './controllers';
import { AudienceInsightsApi } from './api';
import { AudienceInsightsApiController } from './controllers';
import { AudienceSharingApi } from './api';
import { AudienceSharingApiController } from './controllers';
import { AudiencesApi } from './api';
import { AudiencesApiController } from './controllers';
import { BillingApi } from './api';
import { BillingApiController } from './controllers';
import { BoardsApi } from './api';
import { BoardsApiController } from './controllers';
import { BulkApi } from './api';
import { BulkApiController } from './controllers';
import { BusinessAccessAssetsApi } from './api';
import { BusinessAccessAssetsApiController } from './controllers';
import { BusinessAccessInviteApi } from './api';
import { BusinessAccessInviteApiController } from './controllers';
import { BusinessAccessRelationshipsApi } from './api';
import { BusinessAccessRelationshipsApiController } from './controllers';
import { CampaignsApi } from './api';
import { CampaignsApiController } from './controllers';
import { CatalogFeedsApi } from './api';
import { CatalogFeedsApiController } from './controllers';
import { CatalogItemsApi } from './api';
import { CatalogItemsApiController } from './controllers';
import { CatalogProductGroupsApi } from './api';
import { CatalogProductGroupsApiController } from './controllers';
import { CatalogReportsApi } from './api';
import { CatalogReportsApiController } from './controllers';
import { CatalogSupplementalApi } from './api';
import { CatalogSupplementalApiController } from './controllers';
import { CatalogsApi } from './api';
import { CatalogsApiController } from './controllers';
import { ConversionDeletionRequestsApi } from './api';
import { ConversionDeletionRequestsApiController } from './controllers';
import { ConversionEqsApi } from './api';
import { ConversionEqsApiController } from './controllers';
import { ConversionEventsApi } from './api';
import { ConversionEventsApiController } from './controllers';
import { ConversionTagsApi } from './api';
import { ConversionTagsApiController } from './controllers';
import { ConversionsApi } from './api';
import { ConversionsApiController } from './controllers';
import { CustomerListUploadsApi } from './api';
import { CustomerListUploadsApiController } from './controllers';
import { CustomerListsApi } from './api';
import { CustomerListsApiController } from './controllers';
import { CustomerSegmentApi } from './api';
import { CustomerSegmentApiController } from './controllers';
import { IntegrationsApi } from './api';
import { IntegrationsApiController } from './controllers';
import { KeywordsApi } from './api';
import { KeywordsApiController } from './controllers';
import { LabelsApi } from './api';
import { LabelsApiController } from './controllers';
import { LeadAdsApi } from './api';
import { LeadAdsApiController } from './controllers';
import { LeadFormsApi } from './api';
import { LeadFormsApiController } from './controllers';
import { LeadsExportApi } from './api';
import { LeadsExportApiController } from './controllers';
import { MediaApi } from './api';
import { MediaApiController } from './controllers';
import { MsotEventsApi } from './api';
import { MsotEventsApiController } from './controllers';
import { NotificationApi } from './api';
import { NotificationApiController } from './controllers';
import { OauthApi } from './api';
import { OauthApiController } from './controllers';
import { OrderLinesApi } from './api';
import { OrderLinesApiController } from './controllers';
import { PinsApi } from './api';
import { PinsApiController } from './controllers';
import { ProductGroupPromotionsApi } from './api';
import { ProductGroupPromotionsApiController } from './controllers';
import { ProductTagsApi } from './api';
import { ProductTagsApiController } from './controllers';
import { PromotionsApi } from './api';
import { PromotionsApiController } from './controllers';
import { ResourcesApi } from './api';
import { ResourcesApiController } from './controllers';
import { SchedulesApi } from './api';
import { SchedulesApiController } from './controllers';
import { SearchApi } from './api';
import { SearchApiController } from './controllers';
import { TargetingTemplateApi } from './api';
import { TargetingTemplateApiController } from './controllers';
import { TermsApi } from './api';
import { TermsApiController } from './controllers';
import { TermsOfServiceApi } from './api';
import { TermsOfServiceApiController } from './controllers';
import { TrendsApi } from './api';
import { TrendsApiController } from './controllers';
import { UserAccountApi } from './api';
import { UserAccountApiController } from './controllers';

export type ApiModuleConfiguration = {
  /**
  * your Api implementations
  */
  apiImplementations: ApiImplementations,
  /**
  * additional Providers that may be used by your implementations
  */
  providers?: Provider[],
}

@Module({})
export class ApiModule {
  static forRoot(configuration: ApiModuleConfiguration): DynamicModule {
      const providers: Provider[] = [
        {
          provide: AdAccountsApi,
          useClass: configuration.apiImplementations.adAccountsApi
        },
        {
          provide: AdGroupsApi,
          useClass: configuration.apiImplementations.adGroupsApi
        },
        {
          provide: AdsApi,
          useClass: configuration.apiImplementations.adsApi
        },
        {
          provide: AdvancedAuctionApi,
          useClass: configuration.apiImplementations.advancedAuctionApi
        },
        {
          provide: AudienceInsightsApi,
          useClass: configuration.apiImplementations.audienceInsightsApi
        },
        {
          provide: AudienceSharingApi,
          useClass: configuration.apiImplementations.audienceSharingApi
        },
        {
          provide: AudiencesApi,
          useClass: configuration.apiImplementations.audiencesApi
        },
        {
          provide: BillingApi,
          useClass: configuration.apiImplementations.billingApi
        },
        {
          provide: BoardsApi,
          useClass: configuration.apiImplementations.boardsApi
        },
        {
          provide: BulkApi,
          useClass: configuration.apiImplementations.bulkApi
        },
        {
          provide: BusinessAccessAssetsApi,
          useClass: configuration.apiImplementations.businessAccessAssetsApi
        },
        {
          provide: BusinessAccessInviteApi,
          useClass: configuration.apiImplementations.businessAccessInviteApi
        },
        {
          provide: BusinessAccessRelationshipsApi,
          useClass: configuration.apiImplementations.businessAccessRelationshipsApi
        },
        {
          provide: CampaignsApi,
          useClass: configuration.apiImplementations.campaignsApi
        },
        {
          provide: CatalogFeedsApi,
          useClass: configuration.apiImplementations.catalogFeedsApi
        },
        {
          provide: CatalogItemsApi,
          useClass: configuration.apiImplementations.catalogItemsApi
        },
        {
          provide: CatalogProductGroupsApi,
          useClass: configuration.apiImplementations.catalogProductGroupsApi
        },
        {
          provide: CatalogReportsApi,
          useClass: configuration.apiImplementations.catalogReportsApi
        },
        {
          provide: CatalogSupplementalApi,
          useClass: configuration.apiImplementations.catalogSupplementalApi
        },
        {
          provide: CatalogsApi,
          useClass: configuration.apiImplementations.catalogsApi
        },
        {
          provide: ConversionDeletionRequestsApi,
          useClass: configuration.apiImplementations.conversionDeletionRequestsApi
        },
        {
          provide: ConversionEqsApi,
          useClass: configuration.apiImplementations.conversionEqsApi
        },
        {
          provide: ConversionEventsApi,
          useClass: configuration.apiImplementations.conversionEventsApi
        },
        {
          provide: ConversionTagsApi,
          useClass: configuration.apiImplementations.conversionTagsApi
        },
        {
          provide: ConversionsApi,
          useClass: configuration.apiImplementations.conversionsApi
        },
        {
          provide: CustomerListUploadsApi,
          useClass: configuration.apiImplementations.customerListUploadsApi
        },
        {
          provide: CustomerListsApi,
          useClass: configuration.apiImplementations.customerListsApi
        },
        {
          provide: CustomerSegmentApi,
          useClass: configuration.apiImplementations.customerSegmentApi
        },
        {
          provide: IntegrationsApi,
          useClass: configuration.apiImplementations.integrationsApi
        },
        {
          provide: KeywordsApi,
          useClass: configuration.apiImplementations.keywordsApi
        },
        {
          provide: LabelsApi,
          useClass: configuration.apiImplementations.labelsApi
        },
        {
          provide: LeadAdsApi,
          useClass: configuration.apiImplementations.leadAdsApi
        },
        {
          provide: LeadFormsApi,
          useClass: configuration.apiImplementations.leadFormsApi
        },
        {
          provide: LeadsExportApi,
          useClass: configuration.apiImplementations.leadsExportApi
        },
        {
          provide: MediaApi,
          useClass: configuration.apiImplementations.mediaApi
        },
        {
          provide: MsotEventsApi,
          useClass: configuration.apiImplementations.msotEventsApi
        },
        {
          provide: NotificationApi,
          useClass: configuration.apiImplementations.notificationApi
        },
        {
          provide: OauthApi,
          useClass: configuration.apiImplementations.oauthApi
        },
        {
          provide: OrderLinesApi,
          useClass: configuration.apiImplementations.orderLinesApi
        },
        {
          provide: PinsApi,
          useClass: configuration.apiImplementations.pinsApi
        },
        {
          provide: ProductGroupPromotionsApi,
          useClass: configuration.apiImplementations.productGroupPromotionsApi
        },
        {
          provide: ProductTagsApi,
          useClass: configuration.apiImplementations.productTagsApi
        },
        {
          provide: PromotionsApi,
          useClass: configuration.apiImplementations.promotionsApi
        },
        {
          provide: ResourcesApi,
          useClass: configuration.apiImplementations.resourcesApi
        },
        {
          provide: SchedulesApi,
          useClass: configuration.apiImplementations.schedulesApi
        },
        {
          provide: SearchApi,
          useClass: configuration.apiImplementations.searchApi
        },
        {
          provide: TargetingTemplateApi,
          useClass: configuration.apiImplementations.targetingTemplateApi
        },
        {
          provide: TermsApi,
          useClass: configuration.apiImplementations.termsApi
        },
        {
          provide: TermsOfServiceApi,
          useClass: configuration.apiImplementations.termsOfServiceApi
        },
        {
          provide: TrendsApi,
          useClass: configuration.apiImplementations.trendsApi
        },
        {
          provide: UserAccountApi,
          useClass: configuration.apiImplementations.userAccountApi
        },
        ...(configuration.providers || []),
      ];

      return {
        module: ApiModule,
        controllers: [
          AdAccountsApiController,
          AdGroupsApiController,
          AdsApiController,
          AdvancedAuctionApiController,
          AudienceInsightsApiController,
          AudienceSharingApiController,
          AudiencesApiController,
          BillingApiController,
          BoardsApiController,
          BulkApiController,
          BusinessAccessAssetsApiController,
          BusinessAccessInviteApiController,
          BusinessAccessRelationshipsApiController,
          CampaignsApiController,
          CatalogFeedsApiController,
          CatalogItemsApiController,
          CatalogProductGroupsApiController,
          CatalogReportsApiController,
          CatalogSupplementalApiController,
          CatalogsApiController,
          ConversionDeletionRequestsApiController,
          ConversionEqsApiController,
          ConversionEventsApiController,
          ConversionTagsApiController,
          ConversionsApiController,
          CustomerListUploadsApiController,
          CustomerListsApiController,
          CustomerSegmentApiController,
          IntegrationsApiController,
          KeywordsApiController,
          LabelsApiController,
          LeadAdsApiController,
          LeadFormsApiController,
          LeadsExportApiController,
          MediaApiController,
          MsotEventsApiController,
          NotificationApiController,
          OauthApiController,
          OrderLinesApiController,
          PinsApiController,
          ProductGroupPromotionsApiController,
          ProductTagsApiController,
          PromotionsApiController,
          ResourcesApiController,
          SchedulesApiController,
          SearchApiController,
          TargetingTemplateApiController,
          TermsApiController,
          TermsOfServiceApiController,
          TrendsApiController,
          UserAccountApiController,
        ],
        providers: [...providers],
        exports: [...providers]
      }
    }
}