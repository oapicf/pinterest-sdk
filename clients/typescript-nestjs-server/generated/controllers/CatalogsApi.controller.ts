import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { CatalogsApi } from '../api';
import { Catalog, CatalogCreate, CatalogsAvailableFilterValues, CatalogsList200Response, CatalogsLocale, Country,  } from '../models';

@Controller()
export class CatalogsApiController {
  constructor(private readonly catalogsApi: CatalogsApi) {}

  @Get('/catalogs/available_filter_values')
  catalogsAvailableFilterValues(@Query('catalog_id') catalogId: string, @Query('feed_id') feedId: string | undefined, @Query('country') country: Country | undefined, @Query('language') language: CatalogsLocale | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): CatalogsAvailableFilterValues | Promise<CatalogsAvailableFilterValues> | Observable<CatalogsAvailableFilterValues> {
    return this.catalogsApi.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId, request);
  }

  @Post('/catalogs')
  catalogsCreate(@Body() catalogCreate: CatalogCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Catalog | Promise<Catalog> | Observable<Catalog> {
    return this.catalogsApi.catalogsCreate(catalogCreate, adAccountId, request);
  }

  @Get('/catalogs')
  catalogsList(@Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): CatalogsList200Response | Promise<CatalogsList200Response> | Observable<CatalogsList200Response> {
    return this.catalogsApi.catalogsList(adAccountId, bookmark, pageSize, request);
  }

} 