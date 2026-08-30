import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { BoardsList200Response, PinsList200Response, SearchPartnerPins200Response,  } from '../models';


@Injectable()
export abstract class SearchApi {

  abstract searchPartnerPins(term: string, countryCode: string, bookmark: string | undefined, locale: string | undefined, limit: number | undefined,  request: Request): SearchPartnerPins200Response | Promise<SearchPartnerPins200Response> | Observable<SearchPartnerPins200Response>;


  abstract searchUserBoardsGet(adAccountId: string | undefined, query: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BoardsList200Response | Promise<BoardsList200Response> | Observable<BoardsList200Response>;


  abstract searchUserPinsList(query: string, adAccountId: string | undefined, bookmark: string | undefined,  request: Request): PinsList200Response | Promise<PinsList200Response> | Observable<PinsList200Response>;

} 