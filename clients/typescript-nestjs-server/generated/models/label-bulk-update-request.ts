import { LabelStatusBulkUpdate } from './label-status-bulk-update';


export interface LabelBulkUpdateRequest { 
  /**
   * Label ID.
   */
  id: string;
  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   */
  parent_id: string;
  status: LabelStatusBulkUpdate;
}
export namespace LabelBulkUpdateRequest {
}


