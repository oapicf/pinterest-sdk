import { SSIOOrderLine } from './ssio-order-line';


export interface SsioOrderLinesGetByAdAccount200Response { 
  bookmark?: string | null;
  items: Array<SSIOOrderLine>;
}

