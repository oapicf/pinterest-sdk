import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { SearchApi } from '../api';
import { BoardsList200Response, PinsList200Response, SearchPartnerPins200Response,  } from '../models';

@Controller()
export class SearchApiController {
  constructor(private readonly searchApi: SearchApi) {}

  @Get('/search/partner/pins')
  searchPartnerPins(@Query('term') term: string, @Query('country_code') countryCode: string, @Query('bookmark') bookmark: string | undefined, @Query('locale') locale: string | undefined, @Query('limit', new DefaultValuePipe(10)) limit: number | undefined, @Req() request: Request): SearchPartnerPins200Response | Promise<SearchPartnerPins200Response> | Observable<SearchPartnerPins200Response> {
    return this.searchApi.searchPartnerPins(term, countryCode, bookmark, locale, limit, request);
  }

  @Get('/search/boards')
  searchUserBoardsGet(@Query('ad_account_id') adAccountId: string | undefined, @Query('query') query: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BoardsList200Response | Promise<BoardsList200Response> | Observable<BoardsList200Response> {
    return this.searchApi.searchUserBoardsGet(adAccountId, query, bookmark, pageSize, request);
  }

  @Get('/search/pins')
  searchUserPinsList(@Query('query') query: string, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Req() request: Request): PinsList200Response | Promise<PinsList200Response> | Observable<PinsList200Response> {
    return this.searchApi.searchUserPinsList(query, adAccountId, bookmark, request);
  }

} 