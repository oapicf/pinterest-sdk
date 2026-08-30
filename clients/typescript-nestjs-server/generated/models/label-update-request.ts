import { LabelUpdateItem } from './label-update-item';


export interface LabelUpdateRequest { 
  /**
   * Labels that you are applying to the campaign.
   */
  labels: Array<LabelUpdateItem>;
}

