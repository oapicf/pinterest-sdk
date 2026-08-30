import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { LeadForm, LeadFormBatchUpdate, LeadFormCreate, LeadFormTest, LeadFormTestCreate, LeadFormsCreate200Response, LeadFormsList200Response, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class LeadFormsApi {

  abstract leadFormGet(leadFormId: string, adAccountId: string,  request: Request): LeadForm | Promise<LeadForm> | Observable<LeadForm>;


  abstract leadFormTestCreate(adAccountId: string, leadFormId: string, leadFormTestCreate: LeadFormTestCreate,  request: Request): LeadFormTest | Promise<LeadFormTest> | Observable<LeadFormTest>;


  abstract leadFormsCreate(adAccountId: string, leadFormCreate: Array<LeadFormCreate>,  request: Request): LeadFormsCreate200Response | Promise<LeadFormsCreate200Response> | Observable<LeadFormsCreate200Response>;


  abstract leadFormsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined,  request: Request): LeadFormsList200Response | Promise<LeadFormsList200Response> | Observable<LeadFormsList200Response>;


  abstract leadFormsUpdate(adAccountId: string, leadFormBatchUpdate: Array<LeadFormBatchUpdate>,  request: Request): LeadFormsCreate200Response | Promise<LeadFormsCreate200Response> | Observable<LeadFormsCreate200Response>;

} 