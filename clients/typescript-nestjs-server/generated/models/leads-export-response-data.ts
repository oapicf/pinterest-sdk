import { LeadsExportStatus } from './leads-export-status';


export interface LeadsExportResponseData { 
  download_url?: string | null;
  export_status?: LeadsExportStatus;
}
export namespace LeadsExportResponseData {
}


