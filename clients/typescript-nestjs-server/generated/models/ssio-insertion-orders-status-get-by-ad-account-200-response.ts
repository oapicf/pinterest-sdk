import { SSIOInsertionOrderStatus } from './ssio-insertion-order-status';


export interface SsioInsertionOrdersStatusGetByAdAccount200Response { 
  bookmark?: string | null;
  items: Array<SSIOInsertionOrderStatus>;
}

