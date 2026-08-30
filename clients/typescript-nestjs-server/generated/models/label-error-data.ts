import { NullableLabelStatus } from './nullable-label-status';
import { NullableLabelType } from './nullable-label-type';


export interface LabelErrorData { 
  /**
   * Label ID.
   */
  id?: string;
  label_type?: NullableLabelType | null;
  status?: NullableLabelStatus | null;
  /**
   * Label name. 100-character limit.
   */
  value?: string;
}
export namespace LabelErrorData {
}


