import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CustomerSegmentApi } from '../api';
import { CustomerSegment, CustomerSegmentCreate, CustomerSegmentList200Response, CustomerSegmentUpdateRequestUpdateWithRequiredBody, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class CustomerSegmentApiController {
  constructor(private readonly customerSegmentApi: CustomerSegmentApi) {}

  @Post('/ad_accounts/:ad_account_id/customer_segments')
  customerSegmentCreate(@Param('ad_account_id') adAccountId: string, @Body() customerSegmentCreate: CustomerSegmentCreate, @Req() request: Request): CustomerSegment | Promise<CustomerSegment> | Observable<CustomerSegment> {
    return this.customerSegmentApi.customerSegmentCreate(adAccountId, customerSegmentCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/customer_segments')
  customerSegmentList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('include_sizing', new DefaultValuePipe(false)) includeSizing: boolean | undefined, @Query('search_query') searchQuery: string | undefined, @Req() request: Request): CustomerSegmentList200Response | Promise<CustomerSegmentList200Response> | Observable<CustomerSegmentList200Response> {
    return this.customerSegmentApi.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery, request);
  }

  @Patch('/ad_accounts/:ad_account_id/customer_segments')
  customerSegmentUpdate(@Param('ad_account_id') adAccountId: string, @Body() customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.customerSegmentApi.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody, request);
  }

} 