import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ConversionTagsApi } from '../api';
import { ConversionTag, ConversionTagCreate, ConversionTagsList200Response, PageVisitConversionTagsGet200Response, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class ConversionTagsApiController {
  constructor(private readonly conversionTagsApi: ConversionTagsApi) {}

  @Post('/ad_accounts/:ad_account_id/conversion_tags')
  conversionTagsCreate(@Param('ad_account_id') adAccountId: string, @Body() conversionTagCreate: ConversionTagCreate, @Req() request: Request): ConversionTag | Promise<ConversionTag> | Observable<ConversionTag> {
    return this.conversionTagsApi.conversionTagsCreate(adAccountId, conversionTagCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/conversion_tags/:conversion_tag_id')
  conversionTagsGet(@Param('ad_account_id') adAccountId: string, @Param('conversion_tag_id') conversionTagId: string, @Req() request: Request): ConversionTag | Promise<ConversionTag> | Observable<ConversionTag> {
    return this.conversionTagsApi.conversionTagsGet(adAccountId, conversionTagId, request);
  }

  @Get('/ad_accounts/:ad_account_id/conversion_tags')
  conversionTagsList(@Param('ad_account_id') adAccountId: string, @Query('filter_deleted', new DefaultValuePipe(false)) filterDeleted: boolean | undefined, @Req() request: Request): ConversionTagsList200Response | Promise<ConversionTagsList200Response> | Observable<ConversionTagsList200Response> {
    return this.conversionTagsApi.conversionTagsList(adAccountId, filterDeleted, request);
  }

  @Get('/ad_accounts/:ad_account_id/conversion_tags/ocpm_eligible')
  ocpmEligibleConversionTagsGet(@Param('ad_account_id') adAccountId: string, @Req() request: Request): { [key: string]: Array<ConversionEventResponse>; } | Promise<{ [key: string]: Array<ConversionEventResponse>; }> | Observable<{ [key: string]: Array<ConversionEventResponse>; }> {
    return this.conversionTagsApi.ocpmEligibleConversionTagsGet(adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/conversion_tags/page_visit')
  pageVisitConversionTagsGet(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): PageVisitConversionTagsGet200Response | Promise<PageVisitConversionTagsGet200Response> | Observable<PageVisitConversionTagsGet200Response> {
    return this.conversionTagsApi.pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order, request);
  }

} 