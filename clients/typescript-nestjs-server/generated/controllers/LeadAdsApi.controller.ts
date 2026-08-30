import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { LeadAdsApi } from '../api';
import { AdAccountsSubscriptionsGetList200Response, LeadSubscription, LeadSubscriptionPostParamsCreate,  } from '../models';

@Controller()
export class LeadAdsApiController {
  constructor(private readonly leadAdsApi: LeadAdsApi) {}

  @Delete('/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id')
  adAccountsSubscriptionsDelById(@Param('ad_account_id') adAccountId: string, @Param('subscription_id') subscriptionId: string, @Req() request: Request): LeadSubscription | Promise<LeadSubscription> | Observable<LeadSubscription> {
    return this.leadAdsApi.adAccountsSubscriptionsDelById(adAccountId, subscriptionId, request);
  }

  @Get('/ad_accounts/:ad_account_id/leads/subscriptions/:subscription_id')
  adAccountsSubscriptionsGetById(@Param('ad_account_id') adAccountId: string, @Param('subscription_id') subscriptionId: string, @Req() request: Request): LeadSubscription | Promise<LeadSubscription> | Observable<LeadSubscription> {
    return this.leadAdsApi.adAccountsSubscriptionsGetById(adAccountId, subscriptionId, request);
  }

  @Get('/ad_accounts/:ad_account_id/leads/subscriptions')
  adAccountsSubscriptionsGetList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): AdAccountsSubscriptionsGetList200Response | Promise<AdAccountsSubscriptionsGetList200Response> | Observable<AdAccountsSubscriptionsGetList200Response> {
    return this.leadAdsApi.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize, request);
  }

  @Post('/ad_accounts/:ad_account_id/leads/subscriptions')
  adAccountsSubscriptionsPost(@Param('ad_account_id') adAccountId: string, @Body() leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate, @Req() request: Request): LeadSubscription | Promise<LeadSubscription> | Observable<LeadSubscription> {
    return this.leadAdsApi.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate, request);
  }

} 