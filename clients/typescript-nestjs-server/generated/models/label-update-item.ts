import { LabelStatus } from './label-status';


export interface LabelUpdateItem { 
  /**
   * Label ID.
   */
  id: string;
  status?: LabelStatus;
  /**
   * Label name. 100-character limit.
   */
  value?: string;
}
export namespace LabelUpdateItem {
}


