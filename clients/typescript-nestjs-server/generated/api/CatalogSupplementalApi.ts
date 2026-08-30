import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CatalogsLocalStoresCreate200ResponseInner, CatalogsLocalStoresDelete200ResponseInner, CatalogsLocalStoresList200Response, LocalInventoryItemsBatchCreate, LocalInventoryItemsGet, LocalInventoryItemsGetCreate, LocalStoreBatchUpdate, LocalStoreCreate, SupplementalItemsBatchResponse,  } from '../models';


@Injectable()
export abstract class CatalogSupplementalApi {

  abstract catalogsLocalInventoryItemsBatchOperate(catalogId: string, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: string | undefined,  request: Request): SupplementalItemsBatchResponse | Promise<SupplementalItemsBatchResponse> | Observable<SupplementalItemsBatchResponse>;


  abstract catalogsLocalInventoryItemsPost(catalogId: string, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: string | undefined,  request: Request): LocalInventoryItemsGet | Promise<LocalInventoryItemsGet> | Observable<LocalInventoryItemsGet>;


  abstract catalogsLocalStoresCreate(catalogId: string, localStoreCreate: Array<LocalStoreCreate>, adAccountId: string | undefined,  request: Request): Array<CatalogsLocalStoresCreate200ResponseInner> | Promise<Array<CatalogsLocalStoresCreate200ResponseInner>> | Observable<Array<CatalogsLocalStoresCreate200ResponseInner>>;


  abstract catalogsLocalStoresDelete(catalogId: string, ids: Array<string>, adAccountId: string | undefined,  request: Request): Array<CatalogsLocalStoresDelete200ResponseInner> | Promise<Array<CatalogsLocalStoresDelete200ResponseInner>> | Observable<Array<CatalogsLocalStoresDelete200ResponseInner>>;


  abstract catalogsLocalStoresList(catalogId: string, ids: Array<string> | undefined, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): CatalogsLocalStoresList200Response | Promise<CatalogsLocalStoresList200Response> | Observable<CatalogsLocalStoresList200Response>;


  abstract catalogsLocalStoresUpdate(catalogId: string, localStoreBatchUpdate: Array<LocalStoreBatchUpdate>, adAccountId: string | undefined,  request: Request): Array<CatalogsLocalStoresCreate200ResponseInner> | Promise<Array<CatalogsLocalStoresCreate200ResponseInner>> | Observable<Array<CatalogsLocalStoresCreate200ResponseInner>>;


  abstract catalogsSupplementalItemsBatchGet(catalogId: string, batchId: string, adAccountId: string | undefined,  request: Request): SupplementalItemsBatchResponse | Promise<SupplementalItemsBatchResponse> | Observable<SupplementalItemsBatchResponse>;

} 