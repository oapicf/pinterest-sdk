import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { PromotionsApi } from '../api';
import { PinterestLibPaginationOrder, Promotion, PromotionBatchUpdate, PromotionCreate, PromotionsList200Response, PromotionsResponse,  } from '../models';

@Controller()
export class PromotionsApiController {
  constructor(private readonly promotionsApi: PromotionsApi) {}

  @Post('/ad_accounts/:ad_account_id/promotions')
  promotionsCreate(@Param('ad_account_id') adAccountId: string, @Body() promotionCreate: Array<PromotionCreate>, @Req() request: Request): PromotionsResponse | Promise<PromotionsResponse> | Observable<PromotionsResponse> {
    return this.promotionsApi.promotionsCreate(adAccountId, promotionCreate, request);
  }

  @Delete('/ad_accounts/:ad_account_id/promotions/:promotion_id')
  promotionsDelete(@Param('promotion_id') promotionId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): Promotion | Promise<Promotion> | Observable<Promotion> {
    return this.promotionsApi.promotionsDelete(promotionId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/promotions/:promotion_id')
  promotionsGet(@Param('promotion_id') promotionId: string, @Param('ad_account_id') adAccountId: string, @Req() request: Request): Promotion | Promise<Promotion> | Observable<Promotion> {
    return this.promotionsApi.promotionsGet(promotionId, adAccountId, request);
  }

  @Get('/ad_accounts/:ad_account_id/promotions')
  promotionsList(@Param('ad_account_id') adAccountId: string, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('order') order: PinterestLibPaginationOrder | undefined, @Req() request: Request): PromotionsList200Response | Promise<PromotionsList200Response> | Observable<PromotionsList200Response> {
    return this.promotionsApi.promotionsList(adAccountId, bookmark, pageSize, order, request);
  }

  @Patch('/ad_accounts/:ad_account_id/promotions')
  promotionsUpdate(@Param('ad_account_id') adAccountId: string, @Body() promotionBatchUpdate: Array<PromotionBatchUpdate>, @Req() request: Request): PromotionsResponse | Promise<PromotionsResponse> | Observable<PromotionsResponse> {
    return this.promotionsApi.promotionsUpdate(adAccountId, promotionBatchUpdate, request);
  }

} 