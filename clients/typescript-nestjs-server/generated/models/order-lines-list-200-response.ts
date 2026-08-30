import { OrderLine } from './order-line';


export interface OrderLinesList200Response { 
  bookmark?: string | null;
  items: Array<OrderLine>;
}

