import { OrderLine } from './order-line';


export interface OrderLineMutationError { 
  data?: OrderLine;
  /**
   * Error messages.
   */
  error_messages?: Array<string>;
}

