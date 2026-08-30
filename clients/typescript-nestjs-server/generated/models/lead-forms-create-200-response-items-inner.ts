import { PinterestLibBatchItemException } from './pinterest-lib-batch-item-exception';
import { LeadForm } from './lead-form';


export interface LeadFormsCreate200ResponseItemsInner { 
  data?: LeadForm;
  exceptions?: Array<PinterestLibBatchItemException>;
}

