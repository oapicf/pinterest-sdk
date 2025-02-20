/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { Currency } from './currency';

export class SSIOOrderLine {
    /**
    * OrderLineId in SFDC
    */
    'salesforceOrderLineId'?: string | null;
    /**
    * Ads manager OrderLineId
    */
    'adsManagerOrderLineId'?: string | null;
    /**
    * The pin order id associated with the order line in SFDC
    */
    'pinOrderId'?: string | null;
    /**
    * Last modified date.
    */
    'lastModifiedDateTime'?: string | null;
    /**
    * Start date of the order line.
    */
    'startDate'?: string | null;
    /**
    * End date of the order line.
    */
    'endDate'?: string | null;
    /**
    * Bill To Company name
    */
    'billToCompanyName'?: string | null;
    /**
    * Billing contact first name
    */
    'billingContactFirstname'?: string | null;
    /**
    * Billing contact last name
    */
    'billingContactLastname'?: string | null;
    /**
    * Billing contact email
    */
    'billingContactEmail'?: string | null;
    /**
    * Billing media email
    */
    'mediaContactEmail'?: string | null;
    /**
    * Billing contact first name
    */
    'mediaContactFirstname'?: string | null;
    /**
    * Billing contact first name
    */
    'mediaContactLastname'?: string | null;
    'currencyInfo'?: Currency;
    /**
    * Agency link
    */
    'agencyLink'?: string | null;
    /**
    * The po number
    */
    'poNumber'?: string | null;
    /**
    * The order name
    */
    'orderName'?: string | null;
    /**
    * The Pinterest marketing partner name
    */
    'pmpName'?: string | null;
    /**
    * The SFDC id for the terms
    */
    'acceptedTermsId'?: string | null;
    /**
    * The UTC timestamp (to the nearest sec) of when terms were accepted
    */
    'acceptedTermsTime'?: string | null;
    /**
    * If Budget order line, the budget amount.
    */
    'budgetAmount'?: number | null;
    /**
    * If Ongoing (perpetual) order line, the estimated monthly spend
    */
    'estimatedMonthlySpend'?: number | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "salesforceOrderLineId",
            "baseName": "salesforce_order_line_id",
            "type": "string"
        },
        {
            "name": "adsManagerOrderLineId",
            "baseName": "ads_manager_order_line_id",
            "type": "string"
        },
        {
            "name": "pinOrderId",
            "baseName": "pin_order_id",
            "type": "string"
        },
        {
            "name": "lastModifiedDateTime",
            "baseName": "last_modified_date_time",
            "type": "string"
        },
        {
            "name": "startDate",
            "baseName": "start_date",
            "type": "string"
        },
        {
            "name": "endDate",
            "baseName": "end_date",
            "type": "string"
        },
        {
            "name": "billToCompanyName",
            "baseName": "bill_to_company_name",
            "type": "string"
        },
        {
            "name": "billingContactFirstname",
            "baseName": "billing_contact_firstname",
            "type": "string"
        },
        {
            "name": "billingContactLastname",
            "baseName": "billing_contact_lastname",
            "type": "string"
        },
        {
            "name": "billingContactEmail",
            "baseName": "billing_contact_email",
            "type": "string"
        },
        {
            "name": "mediaContactEmail",
            "baseName": "media_contact_email",
            "type": "string"
        },
        {
            "name": "mediaContactFirstname",
            "baseName": "media_contact_firstname",
            "type": "string"
        },
        {
            "name": "mediaContactLastname",
            "baseName": "media_contact_lastname",
            "type": "string"
        },
        {
            "name": "currencyInfo",
            "baseName": "currency_info",
            "type": "Currency"
        },
        {
            "name": "agencyLink",
            "baseName": "agency_link",
            "type": "string"
        },
        {
            "name": "poNumber",
            "baseName": "po_number",
            "type": "string"
        },
        {
            "name": "orderName",
            "baseName": "order_name",
            "type": "string"
        },
        {
            "name": "pmpName",
            "baseName": "pmp_name",
            "type": "string"
        },
        {
            "name": "acceptedTermsId",
            "baseName": "accepted_terms_id",
            "type": "string"
        },
        {
            "name": "acceptedTermsTime",
            "baseName": "accepted_terms_time",
            "type": "string"
        },
        {
            "name": "budgetAmount",
            "baseName": "budget_amount",
            "type": "number"
        },
        {
            "name": "estimatedMonthlySpend",
            "baseName": "estimated_monthly_spend",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return SSIOOrderLine.attributeTypeMap;
    }
}

export namespace SSIOOrderLine {
}
