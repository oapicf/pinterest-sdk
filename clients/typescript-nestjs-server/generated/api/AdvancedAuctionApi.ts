import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdvancedAuctionItems, AdvancedAuctionItemsGetRequest, AdvancedAuctionItemsSubmitRequest, AdvancedAuctionProcessedItems,  } from '../models';


@Injectable()
export abstract class AdvancedAuctionApi {

  abstract advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: string | undefined,  request: Request): AdvancedAuctionItems | Promise<AdvancedAuctionItems> | Observable<AdvancedAuctionItems>;


  abstract advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: string | undefined,  request: Request): AdvancedAuctionProcessedItems | Promise<AdvancedAuctionProcessedItems> | Observable<AdvancedAuctionProcessedItems>;

} 