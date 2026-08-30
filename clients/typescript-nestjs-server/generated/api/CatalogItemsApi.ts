import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CatalogsItemsBatch, CatalogsItemsRequest, CatalogsVerticalBatchRequest | CatalogsItemsBatchRequest, ItemsPost200Response,  } from '../models';


@Injectable()
export abstract class CatalogItemsApi {

  abstract itemsBatchGet(batchId: string, adAccountId: string | undefined,  request: Request): CatalogsItemsBatch | Promise<CatalogsItemsBatch> | Observable<CatalogsItemsBatch>;


  abstract itemsBatchPost(catalogsVerticalBatchRequestCatalogsItemsBatchRequest: CatalogsVerticalBatchRequest | CatalogsItemsBatchRequest | null, adAccountId: string | undefined,  request: Request): CatalogsItemsBatch | Promise<CatalogsItemsBatch> | Observable<CatalogsItemsBatch>;


  abstract itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: string | undefined,  request: Request): ItemsPost200Response | Promise<ItemsPost200Response> | Observable<ItemsPost200Response>;

} 