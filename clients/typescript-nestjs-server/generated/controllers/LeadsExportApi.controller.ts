import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { LeadsExportApi } from '../api';
import { LeadsExportResponseData, LeadsExports, LeadsExportsCreate,  } from '../models';

@Controller()
export class LeadsExportApiController {
  constructor(private readonly leadsExportApi: LeadsExportApi) {}

  @Post('/ad_accounts/:ad_account_id/leads_export')
  leadsExportCreate(@Param('ad_account_id') adAccountId: string, @Body() leadsExportsCreate: LeadsExportsCreate, @Req() request: Request): LeadsExports | Promise<LeadsExports> | Observable<LeadsExports> {
    return this.leadsExportApi.leadsExportCreate(adAccountId, leadsExportsCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/leads_export/:leads_export_id')
  leadsExportGet(@Param('ad_account_id') adAccountId: string, @Param('leads_export_id') leadsExportId: string, @Req() request: Request): LeadsExportResponseData | Promise<LeadsExportResponseData> | Observable<LeadsExportResponseData> {
    return this.leadsExportApi.leadsExportGet(adAccountId, leadsExportId, request);
  }

} 