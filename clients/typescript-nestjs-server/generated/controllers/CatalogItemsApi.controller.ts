import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CatalogItemsApi } from '../api';
import { CatalogsItemsBatch, CatalogsItemsRequest, CatalogsVerticalBatchRequest | CatalogsItemsBatchRequest, ItemsPost200Response,  } from '../models';

@Controller()
export class CatalogItemsApiController {
  constructor(private readonly catalogItemsApi: CatalogItemsApi) {}

  @Get('/catalogs/items/batch/:batch_id')
  itemsBatchGet(@Param('batch_id') batchId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsItemsBatch | Promise<CatalogsItemsBatch> | Observable<CatalogsItemsBatch> {
    return this.catalogItemsApi.itemsBatchGet(batchId, adAccountId, request);
  }

  @Post('/catalogs/items/batch')
  itemsBatchPost(@Body() catalogsVerticalBatchRequestCatalogsItemsBatchRequest: CatalogsVerticalBatchRequest | CatalogsItemsBatchRequest | null, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsItemsBatch | Promise<CatalogsItemsBatch> | Observable<CatalogsItemsBatch> {
    return this.catalogItemsApi.itemsBatchPost(catalogsVerticalBatchRequestCatalogsItemsBatchRequest, adAccountId, request);
  }

  @Post('/catalogs/items')
  itemsPost(@Body() catalogsItemsRequest: CatalogsItemsRequest, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): ItemsPost200Response | Promise<ItemsPost200Response> | Observable<ItemsPost200Response> {
    return this.catalogItemsApi.itemsPost(catalogsItemsRequest, adAccountId, request);
  }

} 