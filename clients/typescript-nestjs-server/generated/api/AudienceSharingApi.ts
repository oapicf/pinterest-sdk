import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AdAccountToAdAccountSharedAudience, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody, AdAccountToBusinessSharedAudience, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody, AdAccountsAudiencesSharedAccountsList200Response, AudienceAccountType, BusinessToAdAccountSharedAudience, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody, BusinessToBusinessSharedAudience, BusinessToBusinessSharedAudienceUpdateWithRequiredBody, Order, SharedAudiencesForBusinessList200Response,  } from '../models';


@Injectable()
export abstract class AudienceSharingApi {

  abstract adAccountsAudiencesSharedAccountsList(audienceId: string, accountType: AudienceAccountType, adAccountId: string, bookmark: string | undefined, pageSize: number | undefined,  request: Request): AdAccountsAudiencesSharedAccountsList200Response | Promise<AdAccountsAudiencesSharedAccountsList200Response> | Observable<AdAccountsAudiencesSharedAccountsList200Response>;


  abstract businessAccountAudiencesSharedAccountsList(businessId: string, audienceId: string, accountType: AudienceAccountType, bookmark: string | undefined, pageSize: number | undefined,  request: Request): AdAccountsAudiencesSharedAccountsList200Response | Promise<AdAccountsAudiencesSharedAccountsList200Response> | Observable<AdAccountsAudiencesSharedAccountsList200Response>;


  abstract sharedAudiencesForBusinessList(businessId: string, order: Order | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): SharedAudiencesForBusinessList200Response | Promise<SharedAudiencesForBusinessList200Response> | Observable<SharedAudiencesForBusinessList200Response>;


  abstract updateAdAccountToAdAccountSharedAudience(adAccountId: string, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,  request: Request): AdAccountToAdAccountSharedAudience | Promise<AdAccountToAdAccountSharedAudience> | Observable<AdAccountToAdAccountSharedAudience>;


  abstract updateAdAccountToBusinessSharedAudience(adAccountId: string, adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,  request: Request): AdAccountToBusinessSharedAudience | Promise<AdAccountToBusinessSharedAudience> | Observable<AdAccountToBusinessSharedAudience>;


  abstract updateBusinessToAdAccountSharedAudience(businessId: string, businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,  request: Request): BusinessToAdAccountSharedAudience | Promise<BusinessToAdAccountSharedAudience> | Observable<BusinessToAdAccountSharedAudience>;


  abstract updateBusinessToBusinessSharedAudience(businessId: string, businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody,  request: Request): BusinessToBusinessSharedAudience | Promise<BusinessToBusinessSharedAudience> | Observable<BusinessToBusinessSharedAudience>;

} 