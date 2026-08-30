import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { ConversionDeletionRequest, ConversionDeletionRequestCreate, ConversionDeletionRequestList200Response, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class ConversionDeletionRequestsApi {

  abstract conversionDeletionRequestCreate(adAccountId: string, conversionDeletionRequestCreate: ConversionDeletionRequestCreate,  request: Request): ConversionDeletionRequest | Promise<ConversionDeletionRequest> | Observable<ConversionDeletionRequest>;


  abstract conversionDeletionRequestDelete(requestId: string, adAccountId: string,  request: Request): ConversionDeletionRequest | Promise<ConversionDeletionRequest> | Observable<ConversionDeletionRequest>;


  abstract conversionDeletionRequestGet(requestId: string, adAccountId: string,  request: Request): ConversionDeletionRequest | Promise<ConversionDeletionRequest> | Observable<ConversionDeletionRequest>;


  abstract conversionDeletionRequestList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): ConversionDeletionRequestList200Response | Promise<ConversionDeletionRequestList200Response> | Observable<ConversionDeletionRequestList200Response>;

} 