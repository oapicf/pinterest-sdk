import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { TermsOfService,  } from '../models';


@Injectable()
export abstract class TermsOfServiceApi {

  abstract termsOfServiceGet(adAccountId: string, includeHtml: boolean | undefined, tosType: string | undefined,  request: Request): TermsOfService | Promise<TermsOfService> | Observable<TermsOfService>;

} 