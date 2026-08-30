import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CustomerListsApi } from '../api';
import { CustomerList, CustomerListCreate, CustomerListUpdateWithRequiredBody, CustomerListsList200Response, PinterestLibPaginationOrder,  } from '../models';

@Controller()
export class CustomerListsApiController {
  constructor(private readonly customerListsApi: CustomerListsApi) {}

  @Post('/ad_accounts/:ad_account_id/customer_lists')
  customerListsCreate(@Param('ad_account_id') adAccountId: string, @Body() customerListCreate: CustomerListCreate, @Req() request: Request): CustomerList | Promise<CustomerList> | Observable<CustomerList> {
    return this.customerListsApi.customerListsCreate(adAccountId, customerListCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/customer_lists/:customer_list_id')
  customerListsGet(@Param('ad_account_id') adAccountId: string, @Param('customer_list_id') customerListId: string, @Req() request: Request): CustomerList | Promise<CustomerList> | Observable<CustomerList> {
    return this.customerListsApi.customerListsGet(adAccountId, customerListId, request);
  }

  @Get('/ad_accounts/:ad_account_id/customer_lists')
  customerListsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('exclude_nca', new DefaultValuePipe(false)) excludeNca: boolean | undefined, @Req() request: Request): CustomerListsList200Response | Promise<CustomerListsList200Response> | Observable<CustomerListsList200Response> {
    return this.customerListsApi.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca, request);
  }

  @Patch('/ad_accounts/:ad_account_id/customer_lists/:customer_list_id')
  customerListsUpdate(@Param('ad_account_id') adAccountId: string, @Param('customer_list_id') customerListId: string, @Body() customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody, @Req() request: Request): CustomerList | Promise<CustomerList> | Observable<CustomerList> {
    return this.customerListsApi.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody, request);
  }

} 