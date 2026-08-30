import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BulkApi } from '../api';
import { BulkDownload, BulkDownloadCreate, BulkJobData, BulkUpsertRequest, BulkUpsertResponse,  } from '../models';

@Controller()
export class BulkApiController {
  constructor(private readonly bulkApi: BulkApi) {}

  @Post('/ad_accounts/:ad_account_id/bulk/download')
  bulkDownloadCreate(@Param('ad_account_id') adAccountId: string, @Body() bulkDownloadCreate: BulkDownloadCreate, @Req() request: Request): BulkDownload | Promise<BulkDownload> | Observable<BulkDownload> {
    return this.bulkApi.bulkDownloadCreate(adAccountId, bulkDownloadCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/bulk/:bulk_request_id')
  bulkRequestGet(@Param('ad_account_id') adAccountId: string, @Param('bulk_request_id') bulkRequestId: string, @Query('include_details', new DefaultValuePipe(false)) includeDetails: boolean | undefined, @Req() request: Request): BulkJobData | Promise<BulkJobData> | Observable<BulkJobData> {
    return this.bulkApi.bulkRequestGet(adAccountId, bulkRequestId, includeDetails, request);
  }

  @Post('/ad_accounts/:ad_account_id/bulk/upsert')
  bulkUpsertCreate(@Param('ad_account_id') adAccountId: string, @Body() bulkUpsertRequest: BulkUpsertRequest, @Req() request: Request): BulkUpsertResponse | Promise<BulkUpsertResponse> | Observable<BulkUpsertResponse> {
    return this.bulkApi.bulkUpsertCreate(adAccountId, bulkUpsertRequest, request);
  }

} 