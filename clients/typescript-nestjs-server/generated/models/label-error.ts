import { LabelErrorData } from './label-error-data';


export interface LabelError { 
  data?: LabelErrorData;
  error_messages?: Array<string>;
}

