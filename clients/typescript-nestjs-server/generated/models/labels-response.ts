import { LabelError } from './label-error';
import { Label } from './label';


export interface LabelsResponse { 
  /**
   * Labels that were not successfully applied.
   */
  errors?: Array<LabelError>;
  labels?: Array<Label>;
}

