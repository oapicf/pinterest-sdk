import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CatalogsListProductsByFilterRequest, CatalogsProductGroupPinsList200Response, CatalogsProductGroupProductCountsVertical, CatalogsProductGroupsCreateManyRequestItems, CatalogsProductGroupsCreateRequestSchema, CatalogsProductGroupsList200Response, CatalogsProductGroupsUpdateRequestSchema, CatalogsVerticalProductGroup,  } from '../models';


@Injectable()
export abstract class CatalogProductGroupsApi {

  abstract catalogsProductGroupPinsList(productGroupId: string, adAccountId: string | undefined, pinMetrics: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): CatalogsProductGroupPinsList200Response | Promise<CatalogsProductGroupPinsList200Response> | Observable<CatalogsProductGroupPinsList200Response>;


  abstract catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema, adAccountId: string | undefined,  request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup>;


  abstract catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems: Array<CatalogsProductGroupsCreateManyRequestItems>, adAccountId: string | undefined,  request: Request): Array<string> | Promise<Array<string>> | Observable<Array<string>>;


  abstract catalogsProductGroupsDelete(productGroupId: string, adAccountId: string | undefined,  request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup>;


  abstract catalogsProductGroupsDeleteMany(id: Array<number>, adAccountId: string | undefined,  request: Request): void | Promise<void> | Observable<void>;


  abstract catalogsProductGroupsGet(productGroupId: string, adAccountId: string | undefined,  request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup>;


  abstract catalogsProductGroupsList(id: Array<number> | undefined, feedId: string | undefined, catalogId: string | undefined, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): CatalogsProductGroupsList200Response | Promise<CatalogsProductGroupsList200Response> | Observable<CatalogsProductGroupsList200Response>;


  abstract catalogsProductGroupsProductCountsGet(productGroupId: string, adAccountId: string | undefined,  request: Request): CatalogsProductGroupProductCountsVertical | Promise<CatalogsProductGroupProductCountsVertical> | Observable<CatalogsProductGroupProductCountsVertical>;


  abstract catalogsProductGroupsUpdate(productGroupId: string, catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema, adAccountId: string | undefined,  request: Request): CatalogsVerticalProductGroup | Promise<CatalogsVerticalProductGroup> | Observable<CatalogsVerticalProductGroup>;


  abstract productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: string | undefined, pageSize: number | undefined, adAccountId: string | undefined, pinMetrics: boolean | undefined,  request: Request): CatalogsProductGroupPinsList200Response | Promise<CatalogsProductGroupPinsList200Response> | Observable<CatalogsProductGroupPinsList200Response>;

} 