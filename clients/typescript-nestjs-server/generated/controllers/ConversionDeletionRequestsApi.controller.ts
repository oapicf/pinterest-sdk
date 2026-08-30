import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ConversionDeletionRequestsApi } from '../api';
import { ConversionDeletionRequest, ConversionDeletionRequestCreate, ConversionDeletionRequestList200Response, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class ConversionDeletionRequestsApiController {
  constructor(private readonly conversionDeletionRequestsApi: ConversionDeletionRequestsApi) {}

  @Post('/ad_accounts/:ad_account_id/conversion_deletion_requests')
  conversionDeletionRequestCreate(@Param('ad_account_id') adAccountId: string, @Body() conversionDeletionRequestCreate: ConversionDeletionRequestCreate, @Req() request: Request): ConversionDeletionRequest | Promise<ConversionDeletionRequest> | Observable<ConversionDeletionRequest> {
    return this.conversionDeletionRequestsApi.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate, request);
  }

  @Delete('/ad_accounts/:ad_account_id/conversion_deletion_requests/:request_id')
  conversionDeletionRequestDelete(@Param('request_id') requestId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): ConversionDeletionRequest | Promise<ConversionDeletionRequest> | Observable<ConversionDeletionRequest> {
    return this.conversionDeletionRequestsApi.conversionDeletionRequestDelete(requestId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/conversion_deletion_requests/:request_id')
  conversionDeletionRequestGet(@Param('request_id') requestId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): ConversionDeletionRequest | Promise<ConversionDeletionRequest> | Observable<ConversionDeletionRequest> {
    return this.conversionDeletionRequestsApi.conversionDeletionRequestGet(requestId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/conversion_deletion_requests')
  conversionDeletionRequestList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): ConversionDeletionRequestList200Response | Promise<ConversionDeletionRequestList200Response> | Observable<ConversionDeletionRequestList200Response> {
    return this.conversionDeletionRequestsApi.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order, request);
  }

} 