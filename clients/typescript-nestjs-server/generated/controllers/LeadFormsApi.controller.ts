import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { LeadFormsApi } from '../api';
import { LeadForm, LeadFormBatchUpdate, LeadFormCreate, LeadFormTest, LeadFormTestCreate, LeadFormsCreate200Response, LeadFormsList200Response, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class LeadFormsApiController {
  constructor(private readonly leadFormsApi: LeadFormsApi) {}

  @Get('/ad_accounts/:ad_account_id/lead_forms/:lead_form_id')
  leadFormGet(@Param('lead_form_id') leadFormId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): LeadForm | Promise<LeadForm> | Observable<LeadForm> {
    return this.leadFormsApi.leadFormGet(leadFormId, adAccountId, request);
  }

  @Post('/ad_accounts/:ad_account_id/lead_forms/:lead_form_id/test')
  leadFormTestCreate(@Param('ad_account_id') adAccountId: string, @Param('lead_form_id') leadFormId: string, @Body() leadFormTestCreate: LeadFormTestCreate, @Req() request: Request): LeadFormTest | Promise<LeadFormTest> | Observable<LeadFormTest> {
    return this.leadFormsApi.leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate, request);
  }

  @Post('/ad_accounts/:ad_account_id/lead_forms')
  leadFormsCreate(@Param('ad_account_id') adAccountId: string, @Body() leadFormCreate: Array<LeadFormCreate>, @Req() request: Request): LeadFormsCreate200Response | Promise<LeadFormsCreate200Response> | Observable<LeadFormsCreate200Response> {
    return this.leadFormsApi.leadFormsCreate(adAccountId, leadFormCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/lead_forms')
  leadFormsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): LeadFormsList200Response | Promise<LeadFormsList200Response> | Observable<LeadFormsList200Response> {
    return this.leadFormsApi.leadFormsList(adAccountId, bookmark, pageSize, order, request);
  }

  @Patch('/ad_accounts/:ad_account_id/lead_forms')
  leadFormsUpdate(@Param('ad_account_id') adAccountId: string, @Body() leadFormBatchUpdate: Array<LeadFormBatchUpdate>, @Req() request: Request): LeadFormsCreate200Response | Promise<LeadFormsCreate200Response> | Observable<LeadFormsCreate200Response> {
    return this.leadFormsApi.leadFormsUpdate(adAccountId, leadFormBatchUpdate, request);
  }

} 