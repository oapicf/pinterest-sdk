import { LabelCreateItem } from './label-create-item';


export interface LabelCreateRequest { 
  /**
   * Labels that you are applying to the campaign.
   */
  labels: Array<LabelCreateItem>;
}

