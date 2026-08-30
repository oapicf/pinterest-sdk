import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdAccountsAudience, AdAccountsAudienceCreate, AdAccountsAudienceUpdate, AudienceOwnershipType, AudiencesList200Response, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class AudiencesApi {

  abstract audiencesCreate(adAccountId: string, adAccountsAudienceCreate: AdAccountsAudienceCreate,  request: Request): AdAccountsAudience | Promise<AdAccountsAudience> | Observable<AdAccountsAudience>;


  abstract audiencesGet(audienceId: string, adAccountId: string,  request: Request): AdAccountsAudience | Promise<AdAccountsAudience> | Observable<AdAccountsAudience>;


  abstract audiencesList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, ownershipType: AudienceOwnershipType | undefined, excludeNca: boolean | undefined,  request: Request): AudiencesList200Response | Promise<AudiencesList200Response> | Observable<AudiencesList200Response>;


  abstract audiencesUpdate(audienceId: string, adAccountId: string, adAccountsAudienceUpdate: AdAccountsAudienceUpdate,  request: Request): AdAccountsAudience | Promise<AdAccountsAudience> | Observable<AdAccountsAudience>;

} 