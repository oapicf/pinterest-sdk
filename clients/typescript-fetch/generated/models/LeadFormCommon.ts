/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { LeadFormQuestion } from './LeadFormQuestion';
import {
    LeadFormQuestionFromJSON,
    LeadFormQuestionFromJSONTyped,
    LeadFormQuestionToJSON,
    LeadFormQuestionToJSONTyped,
} from './LeadFormQuestion';
import type { LeadFormCommonPolicyLinksInner } from './LeadFormCommonPolicyLinksInner';
import {
    LeadFormCommonPolicyLinksInnerFromJSON,
    LeadFormCommonPolicyLinksInnerFromJSONTyped,
    LeadFormCommonPolicyLinksInnerToJSON,
    LeadFormCommonPolicyLinksInnerToJSONTyped,
} from './LeadFormCommonPolicyLinksInner';
import type { LeadFormStatus } from './LeadFormStatus';
import {
    LeadFormStatusFromJSON,
    LeadFormStatusFromJSONTyped,
    LeadFormStatusToJSON,
    LeadFormStatusToJSONTyped,
} from './LeadFormStatus';

/**
 * Creation fields
 * @export
 * @interface LeadFormCommon
 */
export interface LeadFormCommon {
    /**
     * Internal name of the lead form.
     * @type {string}
     * @memberof LeadFormCommon
     */
    name?: string | null;
    /**
     * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
     * @type {string}
     * @memberof LeadFormCommon
     */
    privacyPolicyLink?: string | null;
    /**
     * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
     * 
     * By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in
     * compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href="https://policy.pinterest.com/en/lead-ad-terms">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href="https://business.pinterest.com/en/pinterest-advertising-services-agreement/">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
     * @type {boolean}
     * @memberof LeadFormCommon
     */
    hasAcceptedTerms?: boolean;
    /**
     * A message for people who complete the form to let them know what happens next.
     * @type {string}
     * @memberof LeadFormCommon
     */
    completionMessage?: string | null;
    /**
     * 
     * @type {LeadFormStatus}
     * @memberof LeadFormCommon
     */
    status?: LeadFormStatus;
    /**
     * Additional disclosure language to be included in the lead form.
     * @type {string}
     * @memberof LeadFormCommon
     */
    disclosureLanguage?: string | null;
    /**
     * List of questions to be displayed on the lead form.
     * @type {Array<LeadFormQuestion>}
     * @memberof LeadFormCommon
     */
    questions?: Array<LeadFormQuestion>;
    /**
     * List of additional policy links to be displayed on the lead form.
     * @type {Array<LeadFormCommonPolicyLinksInner>}
     * @memberof LeadFormCommon
     */
    policyLinks?: Array<LeadFormCommonPolicyLinksInner>;
}



/**
 * Check if a given object implements the LeadFormCommon interface.
 */
export function instanceOfLeadFormCommon(value: object): value is LeadFormCommon {
    return true;
}

export function LeadFormCommonFromJSON(json: any): LeadFormCommon {
    return LeadFormCommonFromJSONTyped(json, false);
}

export function LeadFormCommonFromJSONTyped(json: any, ignoreDiscriminator: boolean): LeadFormCommon {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'privacyPolicyLink': json['privacy_policy_link'] == null ? undefined : json['privacy_policy_link'],
        'hasAcceptedTerms': json['has_accepted_terms'] == null ? undefined : json['has_accepted_terms'],
        'completionMessage': json['completion_message'] == null ? undefined : json['completion_message'],
        'status': json['status'] == null ? undefined : LeadFormStatusFromJSON(json['status']),
        'disclosureLanguage': json['disclosure_language'] == null ? undefined : json['disclosure_language'],
        'questions': json['questions'] == null ? undefined : ((json['questions'] as Array<any>).map(LeadFormQuestionFromJSON)),
        'policyLinks': json['policy_links'] == null ? undefined : ((json['policy_links'] as Array<any>).map(LeadFormCommonPolicyLinksInnerFromJSON)),
    };
}

  export function LeadFormCommonToJSON(json: any): LeadFormCommon {
      return LeadFormCommonToJSONTyped(json, false);
  }

  export function LeadFormCommonToJSONTyped(value?: LeadFormCommon | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'name': value['name'],
        'privacy_policy_link': value['privacyPolicyLink'],
        'has_accepted_terms': value['hasAcceptedTerms'],
        'completion_message': value['completionMessage'],
        'status': LeadFormStatusToJSON(value['status']),
        'disclosure_language': value['disclosureLanguage'],
        'questions': value['questions'] == null ? undefined : ((value['questions'] as Array<any>).map(LeadFormQuestionToJSON)),
        'policy_links': value['policyLinks'] == null ? undefined : ((value['policyLinks'] as Array<any>).map(LeadFormCommonPolicyLinksInnerToJSON)),
    };
}

