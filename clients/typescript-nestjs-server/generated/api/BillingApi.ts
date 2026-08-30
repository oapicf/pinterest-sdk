import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdsCreditRedeem, AdsCreditRedeemCreate, AdsCreditsDiscountsGet200Response, BillingInvoiceDocumentType, BillingInvoiceDownloadResponse, BillingInvoiceSortField, BillingInvoiceStatus, BillingInvoicesGet200Response, BillingProfilesGet200Response, PinterestLibPaginationOrder, SSIOAccount, SSIOInsertionOrder, SSIOInsertionOrderCreate, SSIOInsertionOrderStatusResponse, SSIOInsertionOrderUpdate, SsioInsertionOrdersStatusGetByAdAccount200Response, SsioOrderLinesGetByAdAccount200Response,  } from '../models';


@Injectable()
export abstract class BillingApi {

  abstract adsCreditRedeem(adAccountId: string, adsCreditRedeemCreate: AdsCreditRedeemCreate,  request: Request): AdsCreditRedeem | Promise<AdsCreditRedeem> | Observable<AdsCreditRedeem>;


  abstract adsCreditsDiscountsGet(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined,  request: Request): AdsCreditsDiscountsGet200Response | Promise<AdsCreditsDiscountsGet200Response> | Observable<AdsCreditsDiscountsGet200Response>;


  abstract billingInvoiceDownloadGet(adAccountId: string, billingInvoiceId: string,  request: Request): BillingInvoiceDownloadResponse | Promise<BillingInvoiceDownloadResponse> | Observable<BillingInvoiceDownloadResponse>;


  abstract billingInvoicesGet(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, sort: BillingInvoiceSortField | undefined, status: BillingInvoiceStatus | undefined, documentType: BillingInvoiceDocumentType | undefined, startDueDate: string | undefined, endDueDate: string | undefined,  request: Request): BillingInvoicesGet200Response | Promise<BillingInvoicesGet200Response> | Observable<BillingInvoicesGet200Response>;


  abstract billingProfilesGet(isActive: boolean, adAccountId: string, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BillingProfilesGet200Response | Promise<BillingProfilesGet200Response> | Observable<BillingProfilesGet200Response>;


  abstract ssioAccountsGet(adAccountId: string,  request: Request): SSIOAccount | Promise<SSIOAccount> | Observable<SSIOAccount>;


  abstract ssioInsertionOrderCreate(adAccountId: string, sSIOInsertionOrderCreate: SSIOInsertionOrderCreate,  request: Request): SSIOInsertionOrder | Promise<SSIOInsertionOrder> | Observable<SSIOInsertionOrder>;


  abstract ssioInsertionOrderEdit(adAccountId: string, sSIOInsertionOrderUpdate: SSIOInsertionOrderUpdate,  request: Request): SSIOInsertionOrder | Promise<SSIOInsertionOrder> | Observable<SSIOInsertionOrder>;


  abstract ssioInsertionOrdersStatusGetByAdAccount(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined,  request: Request): SsioInsertionOrdersStatusGetByAdAccount200Response | Promise<SsioInsertionOrdersStatusGetByAdAccount200Response> | Observable<SsioInsertionOrdersStatusGetByAdAccount200Response>;


  abstract ssioInsertionOrdersStatusGetByPinOrderId(adAccountId: string, pinOrderId: string,  request: Request): SSIOInsertionOrderStatusResponse | Promise<SSIOInsertionOrderStatusResponse> | Observable<SSIOInsertionOrderStatusResponse>;


  abstract ssioOrderLinesGetByAdAccount(adAccountId: string, pinOrderId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): SsioOrderLinesGetByAdAccount200Response | Promise<SsioOrderLinesGetByAdAccount200Response> | Observable<SsioOrderLinesGetByAdAccount200Response>;

} 