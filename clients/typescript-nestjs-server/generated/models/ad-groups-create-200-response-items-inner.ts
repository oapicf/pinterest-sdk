import { PinterestLibBatchItemException } from './pinterest-lib-batch-item-exception';
import { AdGroup } from './ad-group';


export interface AdGroupsCreate200ResponseItemsInner { 
  data?: AdGroup;
  exceptions?: Array<PinterestLibBatchItemException>;
}

