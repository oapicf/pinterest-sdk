/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Currency } from '../models/Currency';
import { HttpFile } from '../http/http';

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

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "salesforceOrderLineId",
            "baseName": "salesforce_order_line_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "adsManagerOrderLineId",
            "baseName": "ads_manager_order_line_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "pinOrderId",
            "baseName": "pin_order_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "lastModifiedDateTime",
            "baseName": "last_modified_date_time",
            "type": "string",
            "format": ""
        },
        {
            "name": "startDate",
            "baseName": "start_date",
            "type": "string",
            "format": "date"
        },
        {
            "name": "endDate",
            "baseName": "end_date",
            "type": "string",
            "format": "date"
        },
        {
            "name": "billToCompanyName",
            "baseName": "bill_to_company_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "billingContactFirstname",
            "baseName": "billing_contact_firstname",
            "type": "string",
            "format": ""
        },
        {
            "name": "billingContactLastname",
            "baseName": "billing_contact_lastname",
            "type": "string",
            "format": ""
        },
        {
            "name": "billingContactEmail",
            "baseName": "billing_contact_email",
            "type": "string",
            "format": ""
        },
        {
            "name": "mediaContactEmail",
            "baseName": "media_contact_email",
            "type": "string",
            "format": ""
        },
        {
            "name": "mediaContactFirstname",
            "baseName": "media_contact_firstname",
            "type": "string",
            "format": ""
        },
        {
            "name": "mediaContactLastname",
            "baseName": "media_contact_lastname",
            "type": "string",
            "format": ""
        },
        {
            "name": "currencyInfo",
            "baseName": "currency_info",
            "type": "Currency",
            "format": ""
        },
        {
            "name": "agencyLink",
            "baseName": "agency_link",
            "type": "string",
            "format": ""
        },
        {
            "name": "poNumber",
            "baseName": "po_number",
            "type": "string",
            "format": ""
        },
        {
            "name": "orderName",
            "baseName": "order_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "pmpName",
            "baseName": "pmp_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "acceptedTermsId",
            "baseName": "accepted_terms_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "acceptedTermsTime",
            "baseName": "accepted_terms_time",
            "type": "string",
            "format": ""
        },
        {
            "name": "budgetAmount",
            "baseName": "budget_amount",
            "type": "number",
            "format": ""
        },
        {
            "name": "estimatedMonthlySpend",
            "baseName": "estimated_monthly_spend",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SSIOOrderLine.attributeTypeMap;
    }

    public constructor() {
    }
}


