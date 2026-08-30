import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Catalog, CatalogCreate, CatalogsAvailableFilterValues, CatalogsList200Response, CatalogsLocale, Country,  } from '../models';


@Injectable()
export abstract class CatalogsApi {

  abstract catalogsAvailableFilterValues(catalogId: string, feedId: string | undefined, country: Country | undefined, language: CatalogsLocale | undefined, adAccountId: string | undefined,  request: Request): CatalogsAvailableFilterValues | Promise<CatalogsAvailableFilterValues> | Observable<CatalogsAvailableFilterValues>;


  abstract catalogsCreate(catalogCreate: CatalogCreate, adAccountId: string | undefined,  request: Request): Catalog | Promise<Catalog> | Observable<Catalog>;


  abstract catalogsList(adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): CatalogsList200Response | Promise<CatalogsList200Response> | Observable<CatalogsList200Response>;

} 