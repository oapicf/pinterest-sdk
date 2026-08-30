import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CatalogSupplementalApi } from '../api';
import { CatalogsLocalStoresCreate200ResponseInner, CatalogsLocalStoresDelete200ResponseInner, CatalogsLocalStoresList200Response, LocalInventoryItemsBatchCreate, LocalInventoryItemsGet, LocalInventoryItemsGetCreate, LocalStoreBatchUpdate, LocalStoreCreate, SupplementalItemsBatchResponse,  } from '../models';

@Controller()
export class CatalogSupplementalApiController {
  constructor(private readonly catalogSupplementalApi: CatalogSupplementalApi) {}

  @Post('/catalogs/:catalog_id/local_inventory_items/batch')
  catalogsLocalInventoryItemsBatchOperate(@Param('catalog_id') catalogId: string, @Body() localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): SupplementalItemsBatchResponse | Promise<SupplementalItemsBatchResponse> | Observable<SupplementalItemsBatchResponse> {
    return this.catalogSupplementalApi.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId, request);
  }

  @Post('/catalogs/:catalog_id/local_inventory_items/query')
  catalogsLocalInventoryItemsPost(@Param('catalog_id') catalogId: string, @Body() localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): LocalInventoryItemsGet | Promise<LocalInventoryItemsGet> | Observable<LocalInventoryItemsGet> {
    return this.catalogSupplementalApi.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId, request);
  }

  @Post('/catalogs/:catalog_id/local_stores')
  catalogsLocalStoresCreate(@Param('catalog_id') catalogId: string, @Body() localStoreCreate: Array<LocalStoreCreate>, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Array<CatalogsLocalStoresCreate200ResponseInner> | Promise<Array<CatalogsLocalStoresCreate200ResponseInner>> | Observable<Array<CatalogsLocalStoresCreate200ResponseInner>> {
    return this.catalogSupplementalApi.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId, request);
  }

  @Delete('/catalogs/:catalog_id/local_stores')
  catalogsLocalStoresDelete(@Param('catalog_id') catalogId: string, @Query('ids') ids: Array<string>, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Array<CatalogsLocalStoresDelete200ResponseInner> | Promise<Array<CatalogsLocalStoresDelete200ResponseInner>> | Observable<Array<CatalogsLocalStoresDelete200ResponseInner>> {
    return this.catalogSupplementalApi.catalogsLocalStoresDelete(catalogId, ids, adAccountId, request);
  }

  @Get('/catalogs/:catalog_id/local_stores')
  catalogsLocalStoresList(@Param('catalog_id') catalogId: string, @Query('ids') ids: Array<string> | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): CatalogsLocalStoresList200Response | Promise<CatalogsLocalStoresList200Response> | Observable<CatalogsLocalStoresList200Response> {
    return this.catalogSupplementalApi.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize, request);
  }

  @Patch('/catalogs/:catalog_id/local_stores')
  catalogsLocalStoresUpdate(@Param('catalog_id') catalogId: string, @Body() localStoreBatchUpdate: Array<LocalStoreBatchUpdate>, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Array<CatalogsLocalStoresCreate200ResponseInner> | Promise<Array<CatalogsLocalStoresCreate200ResponseInner>> | Observable<Array<CatalogsLocalStoresCreate200ResponseInner>> {
    return this.catalogSupplementalApi.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId, request);
  }

  @Get('/catalogs/:catalog_id/supplemental_items/batch/:batch_id')
  catalogsSupplementalItemsBatchGet(@Param('catalog_id') catalogId: string, @Param('batch_id') batchId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): SupplementalItemsBatchResponse | Promise<SupplementalItemsBatchResponse> | Observable<SupplementalItemsBatchResponse> {
    return this.catalogSupplementalApi.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId, request);
  }

} 