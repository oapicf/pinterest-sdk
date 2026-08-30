import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CatalogProductGroupsApi } from '../api';
import { CatalogsListProductsByFilterRequest, CatalogsProductGroupPinsList200Response, CatalogsProductGroupProductCountsVertical, CatalogsProductGroupsCreateManyRequestItems, CatalogsProductGroupsCreateRequestSchema, CatalogsProductGroupsList200Response, CatalogsProductGroupsUpdateRequestSchema, CatalogsVerticalProductGroup,  } from '../models';

@Controller()
export class CatalogProductGroupsApiController {
  constructor(private readonly catalogProductGroupsApi: CatalogProductGroupsApi) {}

  @Get('/catalogs/product_groups/:product_group_id/products')
  catalogsProductGroupPinsList(@Param('product_group_id') productGroupId: string, @Query('ad_account_id') adAccountId: string | undefined, @Query('pin_metrics', new DefaultValuePipe(false)) pinMetrics: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): CatalogsProductGroupPinsList200Response | Promise<CatalogsProductGroupPinsList200Response> | Observable<CatalogsProductGroupPinsList200Response> {
    return this.catalogProductGroupsApi.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize, request);
  }

  @Post('/catalogs/product_groups')
  catalogsProductGroupsCreate(@Body() catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup> {
    return this.catalogProductGroupsApi.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId, request);
  }

  @Post('/catalogs/product_groups/multiple')
  catalogsProductGroupsCreateMany(@Body() catalogsProductGroupsCreateManyRequestItems: Array<CatalogsProductGroupsCreateManyRequestItems>, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Array<string> | Promise<Array<string>> | Observable<Array<string>> {
    return this.catalogProductGroupsApi.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId, request);
  }

  @Delete('/catalogs/product_groups/:product_group_id')
  catalogsProductGroupsDelete(@Param('product_group_id') productGroupId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup> {
    return this.catalogProductGroupsApi.catalogsProductGroupsDelete(productGroupId, adAccountId, request);
  }

  @Delete('/catalogs/product_groups/multiple')
  catalogsProductGroupsDeleteMany(@Query('id') id: Array<number>, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.catalogProductGroupsApi.catalogsProductGroupsDeleteMany(id, adAccountId, request);
  }

  @Get('/catalogs/product_groups/:product_group_id')
  catalogsProductGroupsGet(@Param('product_group_id') productGroupId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup> {
    return this.catalogProductGroupsApi.catalogsProductGroupsGet(productGroupId, adAccountId, request);
  }

  @Get('/catalogs/product_groups')
  catalogsProductGroupsList(@Query('id') id: Array<number> | undefined, @Query('feed_id') feedId: string | undefined, @Query('catalog_id') catalogId: string | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): CatalogsProductGroupsList200Response | Promise<CatalogsProductGroupsList200Response> | Observable<CatalogsProductGroupsList200Response> {
    return this.catalogProductGroupsApi.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize, request);
  }

  @Get('/catalogs/product_groups/:product_group_id/product_counts')
  catalogsProductGroupsProductCountsGet(@Param('product_group_id') productGroupId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsProductGroupProductCountsVertical | Promise<CatalogsProductGroupProductCountsVertical> | Observable<CatalogsProductGroupProductCountsVertical> {
    return this.catalogProductGroupsApi.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId, request);
  }

  @Patch('/catalogs/product_groups/:product_group_id')
  catalogsProductGroupsUpdate(@Param('product_group_id') productGroupId: string, @Body() catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup> {
    return this.catalogProductGroupsApi.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId, request);
  }

  @Post('/catalogs/products/get_by_product_group_filters')
  productsByProductGroupFilterList(@Body() catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('pin_metrics', new DefaultValuePipe(false)) pinMetrics: boolean | undefined, @Req() request: Request): CatalogsProductGroupPinsList200Response | Promise<CatalogsProductGroupPinsList200Response> | Observable<CatalogsProductGroupPinsList200Response> {
    return this.catalogProductGroupsApi.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics, request);
  }

} 