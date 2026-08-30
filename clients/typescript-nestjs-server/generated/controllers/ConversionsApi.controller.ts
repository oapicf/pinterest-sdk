import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ConversionsApi } from '../api';
import { AdvertiserDefinedEventsCreate200Response, AdvertiserDefinedEventsCreateRequest, AdvertiserDefinedEventsGet200Response,  } from '../models';

@Controller()
export class ConversionsApiController {
  constructor(private readonly conversionsApi: ConversionsApi) {}

  @Post('/ad_accounts/:ad_account_id/advertiser_defined_events')
  advertiserDefinedEventsCreate(@Param('ad_account_id') adAccountId: string, @Body() advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest, @Req() request: Request): AdvertiserDefinedEventsCreate200Response | Promise<AdvertiserDefinedEventsCreate200Response> | Observable<AdvertiserDefinedEventsCreate200Response> {
    return this.conversionsApi.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest, request);
  }

  @Delete('/ad_accounts/:ad_account_id/advertiser_defined_events')
  advertiserDefinedEventsDelete(@Param('ad_account_id') adAccountId: string, @Query('event_names') eventNames: Array<string>, @Req() request: Request): AdvertiserDefinedEventsCreate200Response | Promise<AdvertiserDefinedEventsCreate200Response> | Observable<AdvertiserDefinedEventsCreate200Response> {
    return this.conversionsApi.advertiserDefinedEventsDelete(adAccountId, eventNames, request);
  }

  @Get('/ad_accounts/:ad_account_id/advertiser_defined_events')
  advertiserDefinedEventsGet(@Param('ad_account_id') adAccountId: string, @Req() request: Request): AdvertiserDefinedEventsGet200Response | Promise<AdvertiserDefinedEventsGet200Response> | Observable<AdvertiserDefinedEventsGet200Response> {
    return this.conversionsApi.advertiserDefinedEventsGet(adAccountId, request);
  }

  @Patch('/ad_accounts/:ad_account_id/advertiser_defined_events')
  advertiserDefinedEventsUpdate(@Param('ad_account_id') adAccountId: string, @Body() advertiserDefinedEventsCreateRequest: AdvertiserDefinedEventsCreateRequest, @Req() request: Request): AdvertiserDefinedEventsCreate200Response | Promise<AdvertiserDefinedEventsCreate200Response> | Observable<AdvertiserDefinedEventsCreate200Response> {
    return this.conversionsApi.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest, request);
  }

} 