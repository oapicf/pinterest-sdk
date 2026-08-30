import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CustomerListUpload, CustomerListUploadCreateRequest, CustomerListUploadCreateResponse,  } from '../models';


@Injectable()
export abstract class CustomerListUploadsApi {

  abstract customerListUploadsCreate(adAccountId: string, customerListId: string, customerListUploadCreateRequest: CustomerListUploadCreateRequest,  request: Request): CustomerListUploadCreateResponse | Promise<CustomerListUploadCreateResponse> | Observable<CustomerListUploadCreateResponse>;


  abstract customerListUploadsGet(adAccountId: string, customerListId: string, customerListUploadId: string,  request: Request): CustomerListUpload | Promise<CustomerListUpload> | Observable<CustomerListUpload>;


  abstract customerListUploadsRun(adAccountId: string, customerListId: string, customerListUploadId: string,  request: Request): CustomerListUpload | Promise<CustomerListUpload> | Observable<CustomerListUpload>;

} 