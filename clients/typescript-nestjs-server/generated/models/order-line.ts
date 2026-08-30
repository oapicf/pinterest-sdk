import { OrderLinePaidType } from './order-line-paid-type';
import { OrderLineStatus } from './order-line-status';


export interface OrderLine { 
  /**
   * Ad account ID.
   */
  ad_account_id: string;
  /**
   * Order line budget in micro currency.
   */
  budget?: number | null;
  /**
   * Associated List of campaign IDs.
   */
  campaign_ids: Array<string>;
  /**
   * End time. Unix timestamp.
   */
  end_time?: number | null;
  /**
   * Order line ID.
   */
  id: string;
  /**
   * Order line name.
   */
  name?: string | null;
  /**
   * Order line paid budget in micro currency.
   */
  paid_budget?: number | null;
  /**
   * Order line paid type.
   */
  paid_type?: OrderLinePaidType | null;
  /**
   * Purchase order ID.
   */
  purchase_order_id?: string | null;
  /**
   * Start time. Unix timestamp.
   */
  start_time?: number;
  /**
   * Order line status.
   */
  status: OrderLineStatus;
  /**
   * Always \"orderline\".
   */
  type: string;
}
export namespace OrderLine {
}


