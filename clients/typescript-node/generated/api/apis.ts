export * from './adAccountsApi';
import { AdAccountsApi } from './adAccountsApi';
export * from './adGroupsApi';
import { AdGroupsApi } from './adGroupsApi';
export * from './adsApi';
import { AdsApi } from './adsApi';
export * from './audienceInsightsApi';
import { AudienceInsightsApi } from './audienceInsightsApi';
export * from './audiencesApi';
import { AudiencesApi } from './audiencesApi';
export * from './billingApi';
import { BillingApi } from './billingApi';
export * from './boardsApi';
import { BoardsApi } from './boardsApi';
export * from './bulkApi';
import { BulkApi } from './bulkApi';
export * from './campaignsApi';
import { CampaignsApi } from './campaignsApi';
export * from './catalogsApi';
import { CatalogsApi } from './catalogsApi';
export * from './conversionEventsApi';
import { ConversionEventsApi } from './conversionEventsApi';
export * from './conversionTagsApi';
import { ConversionTagsApi } from './conversionTagsApi';
export * from './customerListsApi';
import { CustomerListsApi } from './customerListsApi';
export * from './integrationsApi';
import { IntegrationsApi } from './integrationsApi';
export * from './keywordsApi';
import { KeywordsApi } from './keywordsApi';
export * from './leadAdsApi';
import { LeadAdsApi } from './leadAdsApi';
export * from './leadFormsApi';
import { LeadFormsApi } from './leadFormsApi';
export * from './mediaApi';
import { MediaApi } from './mediaApi';
export * from './oauthApi';
import { OauthApi } from './oauthApi';
export * from './orderLinesApi';
import { OrderLinesApi } from './orderLinesApi';
export * from './pinsApi';
import { PinsApi } from './pinsApi';
export * from './productGroupPromotionsApi';
import { ProductGroupPromotionsApi } from './productGroupPromotionsApi';
export * from './productGroupsApi';
import { ProductGroupsApi } from './productGroupsApi';
export * from './resourcesApi';
import { ResourcesApi } from './resourcesApi';
export * from './searchApi';
import { SearchApi } from './searchApi';
export * from './termsApi';
import { TermsApi } from './termsApi';
export * from './termsOfServiceApi';
import { TermsOfServiceApi } from './termsOfServiceApi';
export * from './userAccountApi';
import { UserAccountApi } from './userAccountApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AdAccountsApi, AdGroupsApi, AdsApi, AudienceInsightsApi, AudiencesApi, BillingApi, BoardsApi, BulkApi, CampaignsApi, CatalogsApi, ConversionEventsApi, ConversionTagsApi, CustomerListsApi, IntegrationsApi, KeywordsApi, LeadAdsApi, LeadFormsApi, MediaApi, OauthApi, OrderLinesApi, PinsApi, ProductGroupPromotionsApi, ProductGroupsApi, ResourcesApi, SearchApi, TermsApi, TermsOfServiceApi, UserAccountApi];
