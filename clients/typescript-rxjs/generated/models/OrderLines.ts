// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    OrderLinePaidType,
    OrderLineStatus,
} from './';

/**
 * Order Line
 * @export
 * @interface OrderLines
 */
export interface OrderLines {
    /**
     * Order line ID.
     * @type {string}
     * @memberof OrderLines
     */
    id?: string;
    /**
     * Always \"orderline\".
     * @type {string}
     * @memberof OrderLines
     */
    type?: string;
    /**
     * Ad account ID.
     * @type {string}
     * @memberof OrderLines
     */
    ad_account_id?: string;
    /**
     * Purchase order ID.
     * @type {string}
     * @memberof OrderLines
     */
    purchase_order_id?: string | null;
    /**
     * Start time. Unix timestamp.
     * @type {number}
     * @memberof OrderLines
     */
    start_time?: number;
    /**
     * End time. Unix timestamp.
     * @type {number}
     * @memberof OrderLines
     */
    end_time?: number | null;
    /**
     * Order line budget in micro currency.
     * @type {number}
     * @memberof OrderLines
     */
    budget?: number | null;
    /**
     * Order line paid budget in micro currency.
     * @type {number}
     * @memberof OrderLines
     */
    paid_budget?: number | null;
    /**
     * Order line status.
     * @type {OrderLineStatus}
     * @memberof OrderLines
     */
    status?: OrderLineStatus;
    /**
     * Order line name.
     * @type {string}
     * @memberof OrderLines
     */
    name?: string | null;
    /**
     * Order line paid type.
     * @type {OrderLinePaidType}
     * @memberof OrderLines
     */
    paid_type?: OrderLinePaidType | null;
}

