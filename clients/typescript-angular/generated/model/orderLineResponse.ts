/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { OrderLineError } from './orderLineError';
import { OrderLine } from './orderLine';


export interface OrderLineResponse { 
    /**
     * Error list if update(s) fail.
     */
    errors?: Array<OrderLineError>;
    /**
     * Order Line object array.
     */
    order_line?: Array<OrderLine>;
}

