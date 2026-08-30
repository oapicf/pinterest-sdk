import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CustomerSegment, CustomerSegmentCreate, CustomerSegmentList200Response, CustomerSegmentUpdateRequestUpdateWithRequiredBody, PinterestLibPaginationOrder,  } from '../models';


@Injectable()
export abstract class CustomerSegmentApi {

  abstract customerSegmentCreate(adAccountId: string, customerSegmentCreate: CustomerSegmentCreate,  request: Request): CustomerSegment | Promise<CustomerSegment> | Observable<CustomerSegment>;


  abstract customerSegmentList(adAccountId: string, bookmark: string | undefined, pageSize: number | undefined, order: PinterestLibPaginationOrder | undefined, includeSizing: boolean | undefined, searchQuery: string | undefined,  request: Request): CustomerSegmentList200Response | Promise<CustomerSegmentList200Response> | Observable<CustomerSegmentList200Response>;


  abstract customerSegmentUpdate(adAccountId: string, customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody,  request: Request): void | Promise<void> | Observable<void>;

} 