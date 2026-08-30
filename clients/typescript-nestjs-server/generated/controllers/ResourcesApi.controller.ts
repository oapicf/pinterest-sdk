import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ResourcesApi } from '../api';
import { AdAccountCountriesGet200Response, BookClosed, DeliveryMetricsGet200Response, PublicTargetingType, ReportType, SingleInterestTargetingOption,  } from '../models';

@Controller()
export class ResourcesApiController {
  constructor(private readonly resourcesApi: ResourcesApi) {}

  @Get('/resources/ad_account_countries')
  adAccountCountriesGet(@Req() request: Request): AdAccountCountriesGet200Response | Promise<AdAccountCountriesGet200Response> | Observable<AdAccountCountriesGet200Response> {
    return this.resourcesApi.adAccountCountriesGet(request);
  }

  @Get('/resources/delivery_metrics')
  deliveryMetricsGet(@Query('report_type') reportType: ReportType | undefined, @Req() request: Request): DeliveryMetricsGet200Response | Promise<DeliveryMetricsGet200Response> | Observable<DeliveryMetricsGet200Response> {
    return this.resourcesApi.deliveryMetricsGet(reportType, request);
  }

  @Get('/resources/targeting/interests/:interest_id')
  interestTargetingOptionsGet(@Param('interest_id') interestId: string, @Req() request: Request): SingleInterestTargetingOption | Promise<SingleInterestTargetingOption> | Observable<SingleInterestTargetingOption> {
    return this.resourcesApi.interestTargetingOptionsGet(interestId, request);
  }

  @Get('/resources/lead_form_questions')
  leadFormQuestionsGet(@Req() request: Request): void | Promise<void> | Observable<void> {
    return this.resourcesApi.leadFormQuestionsGet(request);
  }

  @Get('/resources/metrics_ready_state')
  metricsReadyStateGet(@Query('date') date: string, @Req() request: Request): BookClosed | Promise<BookClosed> | Observable<BookClosed> {
    return this.resourcesApi.metricsReadyStateGet(date, request);
  }

  @Get('/resources/targeting/:targeting_type')
  targetingOptionsGet(@Param('targeting_type') targetingType: PublicTargetingType, @Query('ad_account_id') adAccountId: string | undefined, @Query('client_id') clientId: string | undefined, @Query('oauth_signature') oauthSignature: string | undefined, @Query('timestamp') timestamp: string | undefined, @Req() request: Request): Array<object> | Promise<Array<object>> | Observable<Array<object>> {
    return this.resourcesApi.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp, request);
  }

} 