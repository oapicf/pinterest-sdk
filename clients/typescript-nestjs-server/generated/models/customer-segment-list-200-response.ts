import { CustomerSegment } from './customer-segment';


export interface CustomerSegmentList200Response { 
  bookmark?: string | null;
  items: Array<CustomerSegment>;
}

