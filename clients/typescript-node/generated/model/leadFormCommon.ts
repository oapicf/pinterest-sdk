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
import { LeadFormCommonPolicyLinksInner } from './leadFormCommonPolicyLinksInner';
import { LeadFormQuestion } from './leadFormQuestion';
import { LeadFormStatus } from './leadFormStatus';

/**
* Creation fields
*/
export class LeadFormCommon {
    /**
    * Internal name of the lead form.
    */
    'name'?: string | null;
    /**
    * A link to the advertiser\'s privacy policy. This will be included in the lead form\'s disclosure language.
    */
    'privacyPolicyLink'?: string | null;
    /**
    * Whether the advertiser has accepted Pinterest\'s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest\'s <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
    */
    'hasAcceptedTerms'?: boolean;
    /**
    * A message for people who complete the form to let them know what happens next.
    */
    'completionMessage'?: string | null;
    'status'?: LeadFormStatus;
    /**
    * Additional disclosure language to be included in the lead form.
    */
    'disclosureLanguage'?: string | null;
    /**
    * List of questions to be displayed on the lead form.
    */
    'questions'?: Array<LeadFormQuestion>;
    /**
    * List of additional policy links to be displayed on the lead form.
    */
    'policyLinks'?: Array<LeadFormCommonPolicyLinksInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "privacyPolicyLink",
            "baseName": "privacy_policy_link",
            "type": "string"
        },
        {
            "name": "hasAcceptedTerms",
            "baseName": "has_accepted_terms",
            "type": "boolean"
        },
        {
            "name": "completionMessage",
            "baseName": "completion_message",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "LeadFormStatus"
        },
        {
            "name": "disclosureLanguage",
            "baseName": "disclosure_language",
            "type": "string"
        },
        {
            "name": "questions",
            "baseName": "questions",
            "type": "Array<LeadFormQuestion>"
        },
        {
            "name": "policyLinks",
            "baseName": "policy_links",
            "type": "Array<LeadFormCommonPolicyLinksInner>"
        }    ];

    static getAttributeTypeMap() {
        return LeadFormCommon.attributeTypeMap;
    }
}

export namespace LeadFormCommon {
}
