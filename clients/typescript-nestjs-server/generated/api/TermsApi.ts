import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { RelatedTerms,  } from '../models';


@Injectable()
export abstract class TermsApi {

  abstract termsRelatedList(terms: Array<string>,  request: Request): RelatedTerms | Promise<RelatedTerms> | Observable<RelatedTerms>;


  abstract termsSuggestedList(term: string, limit: number | undefined,  request: Request): Array<string> | Promise<Array<string>> | Observable<Array<string>>;

} 