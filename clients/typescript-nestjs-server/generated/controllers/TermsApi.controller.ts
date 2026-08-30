import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { TermsApi } from '../api';
import { RelatedTerms,  } from '../models';

@Controller()
export class TermsApiController {
  constructor(private readonly termsApi: TermsApi) {}

  @Get('/terms/related')
  termsRelatedList(@Query('terms') terms: Array<string>, @Req() request: Request): RelatedTerms | Promise<RelatedTerms> | Observable<RelatedTerms> {
    return this.termsApi.termsRelatedList(terms, request);
  }

  @Get('/terms/suggested')
  termsSuggestedList(@Query('term') term: string, @Query('limit', new DefaultValuePipe(4)) limit: number | undefined, @Req() request: Request): Array<string> | Promise<Array<string>> | Observable<Array<string>> {
    return this.termsApi.termsSuggestedList(term, limit, request);
  }

} 