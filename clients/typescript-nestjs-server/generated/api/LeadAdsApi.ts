import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdAccountsSubscriptionsGetList200Response, LeadSubscription, LeadSubscriptionPostParamsCreate,  } from '../models';


@Injectable()
export abstract class LeadAdsApi {

  abstract adAccountsSubscriptionsDelById(adAccountId: string, subscriptionId: string,  request: Request): LeadSubscription | Promise<LeadSubscription> | Observable<LeadSubscription>;


  abstract adAccountsSubscriptionsGetById(adAccountId: string, subscriptionId: string,  request: Request): LeadSubscription | Promise<LeadSubscription> | Observable<LeadSubscription>;


  abstract adAccountsSubscriptionsGetList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined,  request: Request): AdAccountsSubscriptionsGetList200Response | Promise<AdAccountsSubscriptionsGetList200Response> | Observable<AdAccountsSubscriptionsGetList200Response>;


  abstract adAccountsSubscriptionsPost(adAccountId: string, leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate,  request: Request): LeadSubscription | Promise<LeadSubscription> | Observable<LeadSubscription>;

} 