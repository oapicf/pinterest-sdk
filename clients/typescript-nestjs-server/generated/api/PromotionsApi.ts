import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { PinterestLibPaginationOrder, Promotion, PromotionBatchUpdate, PromotionCreate, PromotionsList200Response, PromotionsResponse,  } from '../models';


@Injectable()
export abstract class PromotionsApi {

  abstract promotionsCreate(adAccountId: string, promotionCreate: Array<PromotionCreate>,  request: Request): PromotionsResponse | Promise<PromotionsResponse> | Observable<PromotionsResponse>;


  abstract promotionsDelete(promotionId: string, adAccountId: string,  request: Request): Promotion | Promise<Promotion> | Observable<Promotion>;


  abstract promotionsGet(promotionId: string, adAccountId: string,  request: Request): Promotion | Promise<Promotion> | Observable<Promotion>;


  abstract promotionsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): PromotionsList200Response | Promise<PromotionsList200Response> | Observable<PromotionsList200Response>;


  abstract promotionsUpdate(adAccountId: string, promotionBatchUpdate: Array<PromotionBatchUpdate>,  request: Request): PromotionsResponse | Promise<PromotionsResponse> | Observable<PromotionsResponse>;

} 