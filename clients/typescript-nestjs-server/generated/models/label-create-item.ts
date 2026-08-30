import { LabelType } from './label-type';


export interface LabelCreateItem { 
  label_type: LabelType;
  /**
   * Label name. 100-character limit.
   */
  value: string;
}
export namespace LabelCreateItem {
}


