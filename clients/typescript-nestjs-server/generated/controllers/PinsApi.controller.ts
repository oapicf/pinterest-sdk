import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { PinsApi } from '../api';
import { CreativeType, MultiPinsAnalyticsMetricTypesItem, Pin, PinCreate, PinFilter, PinType, PinUpdate, PinsList200Response, PinsSaveRequestCreate, QuerypinanalyticsmetrictypesItems,  } from '../models';

@Controller()
export class PinsApiController {
  constructor(private readonly pinsApi: PinsApi) {}

  @Get('/pins/analytics')
  multiPinsAnalytics(@Query('pin_ids') pinIds: Array<string>, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('metric_types') metricTypes: Array<MultiPinsAnalyticsMetricTypesItem>, @Query('app_types', new DefaultValuePipe('ALL')) appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): { [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; } | Promise<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }> | Observable<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }> {
    return this.pinsApi.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId, request);
  }

  @Get('/pins/:pin_id/analytics')
  pinsAnalytics(@Param('pin_id') pinId: string, @Query('start_date') startDate: string, @Query('end_date') endDate: string, @Query('metric_types') metricTypes: Array<QuerypinanalyticsmetrictypesItems>, @Query('app_types', new DefaultValuePipe('ALL')) appTypes: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB' | undefined, @Query('split_field', new DefaultValuePipe('NO_SPLIT')) splitField: 'NO_SPLIT' | 'APP_TYPE' | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): { [key: string]: PinAnalyticsMetricsResponse; } | Promise<{ [key: string]: PinAnalyticsMetricsResponse; }> | Observable<{ [key: string]: PinAnalyticsMetricsResponse; }> {
    return this.pinsApi.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, request);
  }

  @Post('/pins')
  pinsCreate(@Body() pinCreate: PinCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Pin | Promise<Pin> | Observable<Pin> {
    return this.pinsApi.pinsCreate(pinCreate, adAccountId, request);
  }

  @Delete('/pins/:pin_id')
  pinsDelete(@Param('pin_id') pinId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Pin | Promise<Pin> | Observable<Pin> {
    return this.pinsApi.pinsDelete(pinId, adAccountId, request);
  }

  @Get('/pins/:pin_id')
  pinsGet(@Param('pin_id') pinId: string, @Query('ad_account_id') adAccountId: string | undefined, @Query('pin_metrics', new DefaultValuePipe(false)) pinMetrics: boolean | undefined, @Req() request: Request): Pin | Promise<Pin> | Observable<Pin> {
    return this.pinsApi.pinsGet(pinId, adAccountId, pinMetrics, request);
  }

  @Get('/pins')
  pinsList(@Query('pin_filter') pinFilter: PinFilter | undefined, @Query('pin_metrics', new DefaultValuePipe(false)) pinMetrics: boolean | undefined, @Query('include_protected_pins', new DefaultValuePipe(false)) includeProtectedPins: boolean | undefined, @Query('pin_type') pinType: PinType | undefined, @Query('creative_types') creativeTypes: Array<CreativeType> | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('domain') domain: string | undefined, @Query('domains') domains: Array<string> | undefined, @Query('include_product_tag_obj') includeProductTagObj: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): PinsList200Response | Promise<PinsList200Response> | Observable<PinsList200Response> {
    return this.pinsApi.pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize, request);
  }

  @Post('/pins/:pin_id/save')
  pinsSave(@Param('pin_id') pinId: string, @Body() pinsSaveRequestCreate: PinsSaveRequestCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Pin | Promise<Pin> | Observable<Pin> {
    return this.pinsApi.pinsSave(pinId, pinsSaveRequestCreate, adAccountId, request);
  }

  @Patch('/pins/:pin_id')
  pinsUpdate(@Param('pin_id') pinId: string, @Body() pinUpdate: PinUpdate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Pin | Promise<Pin> | Observable<Pin> {
    return this.pinsApi.pinsUpdate(pinId, pinUpdate, adAccountId, request);
  }

} 