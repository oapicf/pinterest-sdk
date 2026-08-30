import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { BulkDownload, BulkDownloadCreate, BulkJobData, BulkUpsertRequest, BulkUpsertResponse,  } from '../models';


@Injectable()
export abstract class BulkApi {

  abstract bulkDownloadCreate(adAccountId: string, bulkDownloadCreate: BulkDownloadCreate,  request: Request): BulkDownload | Promise<BulkDownload> | Observable<BulkDownload>;


  abstract bulkRequestGet(adAccountId: string, bulkRequestId: string, includeDetails: boolean | undefined,  request: Request): BulkJobData | Promise<BulkJobData> | Observable<BulkJobData>;


  abstract bulkUpsertCreate(adAccountId: string, bulkUpsertRequest: BulkUpsertRequest,  request: Request): BulkUpsertResponse | Promise<BulkUpsertResponse> | Observable<BulkUpsertResponse>;

} 