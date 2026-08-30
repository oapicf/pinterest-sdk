import { LabelCreateItem } from './label-create-item';


export interface LabelBulkCreateRequest { 
  /**
   * Labels that you are applying to the campaign.
   */
  labels: Array<LabelCreateItem>;
  /**
   * Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
   */
  parent_id: string;
}

