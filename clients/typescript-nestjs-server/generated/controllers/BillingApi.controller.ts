import { Body, Controller, DefaultValuePipe, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BillingApi } from '../api';
import { AdsCreditRedeem, AdsCreditRedeemCreate, AdsCreditsDiscountsGet200Response, BillingInvoiceDocumentType, BillingInvoiceDownloadResponse, BillingInvoiceSortField, BillingInvoiceStatus, BillingInvoicesGet200Response, BillingProfilesGet200Response, PinterestLibPaginationOrder, SSIOAccount, SSIOInsertionOrder, SSIOInsertionOrderCreate, SSIOInsertionOrderStatusResponse, SSIOInsertionOrderUpdate, SsioInsertionOrdersStatusGetByAdAccount200Response, SsioOrderLinesGetByAdAccount200Response,  } from '../models';

@Controller()
export class BillingApiController {
  constructor(private readonly billingApi: BillingApi) {}

  @Post('/ad_accounts/:ad_account_id/ads_credit/redeem')
  adsCreditRedeem(@Param('ad_account_id') adAccountId: string, @Body() adsCreditRedeemCreate: AdsCreditRedeemCreate, @Req() request: Request): AdsCreditRedeem | Promise<AdsCreditRedeem> | Observable<AdsCreditRedeem> {
    return this.billingApi.adsCreditRedeem(adAccountId, adsCreditRedeemCreate, request);
  }

  @Get('/ad_accounts/:ad_account_id/ads_credit/discounts')
  adsCreditsDiscountsGet(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): AdsCreditsDiscountsGet200Response | Promise<AdsCreditsDiscountsGet200Response> | Observable<AdsCreditsDiscountsGet200Response> {
    return this.billingApi.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize, request);
  }

  @Get('/ad_accounts/:ad_account_id/billing_invoice/:billing_invoice_id/download')
  billingInvoiceDownloadGet(@Param('ad_account_id') adAccountId: string, @Param('billing_invoice_id') billingInvoiceId: string, @Req() request: Request): BillingInvoiceDownloadResponse | Promise<BillingInvoiceDownloadResponse> | Observable<BillingInvoiceDownloadResponse> {
    return this.billingApi.billingInvoiceDownloadGet(adAccountId, billingInvoiceId, request);
  }

  @Get('/ad_accounts/:ad_account_id/billing_invoices')
  billingInvoicesGet(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Query('sort') sort: BillingInvoiceSortField | undefined, @Query('status') status: BillingInvoiceStatus | undefined, @Query('document_type') documentType: BillingInvoiceDocumentType | undefined, @Query('start_due_date') startDueDate: string | undefined, @Query('end_due_date') endDueDate: string | undefined, @Req() request: Request): BillingInvoicesGet200Response | Promise<BillingInvoicesGet200Response> | Observable<BillingInvoicesGet200Response> {
    return this.billingApi.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate, request);
  }

  @Get('/ad_accounts/:ad_account_id/billing_profiles')
  billingProfilesGet(@Query('is_active') isActive: boolean, @Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BillingProfilesGet200Response | Promise<BillingProfilesGet200Response> | Observable<BillingProfilesGet200Response> {
    return this.billingApi.billingProfilesGet(isActive, adAccountId, bookmark, pageSize, request);
  }

  @Get('/ad_accounts/:ad_account_id/ssio/accounts')
  ssioAccountsGet(@Param('ad_account_id') adAccountId: string, @Req() request: Request): SSIOAccount | Promise<SSIOAccount> | Observable<SSIOAccount> {
    return this.billingApi.ssioAccountsGet(adAccountId, request);
  }

  @Post('/ad_accounts/:ad_account_id/ssio/insertion_orders')
  ssioInsertionOrderCreate(@Param('ad_account_id') adAccountId: string, @Body() sSIOInsertionOrderCreate: SSIOInsertionOrderCreate, @Req() request: Request): SSIOInsertionOrder | Promise<SSIOInsertionOrder> | Observable<SSIOInsertionOrder> {
    return this.billingApi.ssioInsertionOrderCreate(adAccountId, sSIOInsertionOrderCreate, request);
  }

  @Patch('/ad_accounts/:ad_account_id/ssio/insertion_orders')
  ssioInsertionOrderEdit(@Param('ad_account_id') adAccountId: string, @Body() sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate, @Req() request: Request): SSIOInsertionOrder | Promise<SSIOInsertionOrder> | Observable<SSIOInsertionOrder> {
    return this.billingApi.ssioInsertionOrderEdit(adAccountId, sSIOInsertionOrderUpdate, request);
  }

  @Get('/ad_accounts/:ad_account_id/ssio/insertion_orders/status')
  ssioInsertionOrdersStatusGetByAdAccount(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): SsioInsertionOrdersStatusGetByAdAccount200Response | Promise<SsioInsertionOrdersStatusGetByAdAccount200Response> | Observable<SsioInsertionOrdersStatusGetByAdAccount200Response> {
    return this.billingApi.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize, request);
  }

  @Get('/ad_accounts/:ad_account_id/ssio/insertion_orders/:pin_order_id/status')
  ssioInsertionOrdersStatusGetByPinOrderId(@Param('ad_account_id') adAccountId: string, @Param('pin_order_id') pinOrderId: string, @Req() request: Request): SSIOInsertionOrderStatusResponse | Promise<SSIOInsertionOrderStatusResponse> | Observable<SSIOInsertionOrderStatusResponse> {
    return this.billingApi.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId, request);
  }

  @Get('/ad_accounts/:ad_account_id/ssio/order_lines')
  ssioOrderLinesGetByAdAccount(@Param('ad_account_id') adAccountId: string, @Query('pin_order_id') pinOrderId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): SsioOrderLinesGetByAdAccount200Response | Promise<SsioOrderLinesGetByAdAccount200Response> | Observable<SsioOrderLinesGetByAdAccount200Response> {
    return this.billingApi.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize, request);
  }

} 