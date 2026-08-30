import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CustomerListUploadsApi } from '../api';
import { CustomerListUpload, CustomerListUploadCreateRequest, CustomerListUploadCreateResponse,  } from '../models';

@Controller()
export class CustomerListUploadsApiController {
  constructor(private readonly customerListUploadsApi: CustomerListUploadsApi) {}

  @Post('/ad_accounts/:ad_account_id/customer_lists/:customer_list_id/uploads')
  customerListUploadsCreate(@Param('ad_account_id') adAccountId: string, @Param('customer_list_id') customerListId: string, @Body() customerListUploadCreateRequest: CustomerListUploadCreateRequest, @Req() request: Request): CustomerListUploadCreateResponse | Promise<CustomerListUploadCreateResponse> | Observable<CustomerListUploadCreateResponse> {
    return this.customerListUploadsApi.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest, request);
  }

  @Get('/ad_accounts/:ad_account_id/customer_lists/:customer_list_id/uploads/:customer_list_upload_id')
  customerListUploadsGet(@Param('ad_account_id') adAccountId: string, @Param('customer_list_id') customerListId: string, @Param('customer_list_upload_id') customerListUploadId: string, @Req() request: Request): CustomerListUpload | Promise<CustomerListUpload> | Observable<CustomerListUpload> {
    return this.customerListUploadsApi.customerListUploadsGet(adAccountId, customerListId, customerListUploadId, request);
  }

  @Post('/ad_accounts/:ad_account_id/customer_lists/:customer_list_id/uploads/:customer_list_upload_id/run')
  customerListUploadsRun(@Param('ad_account_id') adAccountId: string, @Param('customer_list_id') customerListId: string, @Param('customer_list_upload_id') customerListUploadId: string, @Req() request: Request): CustomerListUpload | Promise<CustomerListUpload> | Observable<CustomerListUpload> {
    return this.customerListUploadsApi.customerListUploadsRun(adAccountId, customerListId, customerListUploadId, request);
  }

} 