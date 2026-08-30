import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ConversionTag, ConversionTagCreate, ConversionTagsList200Response, PageVisitConversionTagsGet200Response, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class ConversionTagsApi {

  abstract conversionTagsCreate(adAccountId: string, conversionTagCreate: ConversionTagCreate,  request: Request): ConversionTag | Promise<ConversionTag> | Observable<ConversionTag>;


  abstract conversionTagsGet(adAccountId: string, conversionTagId: string,  request: Request): ConversionTag | Promise<ConversionTag> | Observable<ConversionTag>;


  abstract conversionTagsList(adAccountId: string, filterDeleted: boolean | undefined,  request: Request): ConversionTagsList200Response | Promise<ConversionTagsList200Response> | Observable<ConversionTagsList200Response>;


  abstract ocpmEligibleConversionTagsGet(adAccountId: string,  request: Request): { [key: string]: Array<ConversionEventResponse>; } | Promise<{ [key: string]: Array<ConversionEventResponse>; }> | Observable<{ [key: string]: Array<ConversionEventResponse>; }>;


  abstract pageVisitConversionTagsGet(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): PageVisitConversionTagsGet200Response | Promise<PageVisitConversionTagsGet200Response> | Observable<PageVisitConversionTagsGet200Response>;

} 