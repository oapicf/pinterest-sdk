import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { LeadsExportResponseData, LeadsExports, LeadsExportsCreate,  } from '../models';


@Injectable()
export abstract class LeadsExportApi {

  abstract leadsExportCreate(adAccountId: string, leadsExportsCreate: LeadsExportsCreate,  request: Request): LeadsExports | Promise<LeadsExports> | Observable<LeadsExports>;


  abstract leadsExportGet(adAccountId: string, leadsExportId: string,  request: Request): LeadsExportResponseData | Promise<LeadsExportResponseData> | Observable<LeadsExportResponseData>;

} 