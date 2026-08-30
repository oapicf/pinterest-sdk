import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { TargetingTemplateApi } from '../api';
import { PinterestLibPaginationOrder, TargetingTemplate, TargetingTemplateCreate, TargetingTemplateList200Response, TargetingTemplateUpdateRequestReadOrUpdate,  } from '../models';

@Controller()
export class TargetingTemplateApiController {
  constructor(private readonly targetingTemplateApi: TargetingTemplateApi) {}

  @Post('/ad_accounts/:ad_account_id/targeting_templates')
  targetingTemplateCreate(@Param('ad_account_id') adAccountId: string, @Body() targetingTemplateCreate: TargetingTemplateCreate, @Req() request: Request): TargetingTemplate | Promise<TargetingTemplate> | Observable<TargetingTemplate> {
    return this.targetingTemplateApi.targetingTemplateCreate(adAccountId, targetingTemplateCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/targeting_templates')
  targetingTemplateList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('include_sizing', new DefaultValuePipe(false)) includeSizing: boolean | undefined, @Query('search_query') searchQuery: string | undefined, @Req() request: Request): TargetingTemplateList200Response | Promise<TargetingTemplateList200Response> | Observable<TargetingTemplateList200Response> {
    return this.targetingTemplateApi.targetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery, request);
  }

  @Patch('/ad_accounts/:ad_account_id/targeting_templates')
  targetingTemplateUpdate(@Param('ad_account_id') adAccountId: string, @Body() targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.targetingTemplateApi.targetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate, request);
  }

} 