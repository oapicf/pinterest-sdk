import { Body, Controller, DefaultValuePipe, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AdvancedAuctionApi } from '../api';
import { AdvancedAuctionItems, AdvancedAuctionItemsGetRequest, AdvancedAuctionItemsSubmitRequest, AdvancedAuctionProcessedItems,  } from '../models';

@Controller()
export class AdvancedAuctionApiController {
  constructor(private readonly advancedAuctionApi: AdvancedAuctionApi) {}

  @Post('/advanced_auction/items/get')
  advancedAuctionItemsGetPost(@Body() advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): AdvancedAuctionItems | Promise<AdvancedAuctionItems> | Observable<AdvancedAuctionItems> {
    return this.advancedAuctionApi.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId, request);
  }

  @Post('/advanced_auction/items/submit')
  advancedAuctionItemsSubmitPost(@Body() advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): AdvancedAuctionProcessedItems | Promise<AdvancedAuctionProcessedItems> | Observable<AdvancedAuctionProcessedItems> {
    return this.advancedAuctionApi.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId, request);
  }

} 