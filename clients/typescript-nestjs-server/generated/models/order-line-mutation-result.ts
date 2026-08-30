import { OrderLineMutationError } from './order-line-mutation-error';
import { OrderLine } from './order-line';


export interface OrderLineMutationResult { 
  /**
   * Error list if update(s) fail.
   */
  errors?: Array<OrderLineMutationError>;
  /**
   * Order Line object array.
   */
  order_line?: Array<OrderLine>;
}

