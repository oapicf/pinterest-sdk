import { PinterestLibError } from './pinterest-lib-error';
import { Ad } from './ad';


export interface AdBatchItem { 
  data?: Ad;
  exceptions?: PinterestLibError;
}

