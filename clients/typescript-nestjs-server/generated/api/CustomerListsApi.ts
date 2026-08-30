import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CustomerList, CustomerListCreate, CustomerListUpdateWithRequiredBody, CustomerListsList200Response, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class CustomerListsApi {

  abstract customerListsCreate(adAccountId: string, customerListCreate: CustomerListCreate,  request: Request): CustomerList | Promise<CustomerList> | Observable<CustomerList>;


  abstract customerListsGet(adAccountId: string, customerListId: string,  request: Request): CustomerList | Promise<CustomerList> | Observable<CustomerList>;


  abstract customerListsList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, excludeNca: boolean | undefined,  request: Request): CustomerListsList200Response | Promise<CustomerListsList200Response> | Observable<CustomerListsList200Response>;


  abstract customerListsUpdate(adAccountId: string, customerListId: string, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody,  request: Request): CustomerList | Promise<CustomerList> | Observable<CustomerList>;

} 