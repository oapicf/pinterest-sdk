goog.provide('API.Client.LeadFormCreateRequest');

/**
 * @record
 */
API.Client.LeadFormCreateRequest = function() {}

/**
 * Internal name of the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.name;

/**
 * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.privacyPolicyLink;

/**
 * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
 * @type {!boolean}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.hasAcceptedTerms;

/**
 * A message for people who complete the form to let them know what happens next.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.completionMessage;

/**
 * @type {!API.Client.LeadFormStatus}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.status;

/**
 * Additional disclosure language to be included in the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.disclosureLanguage;

/**
 * List of questions to be displayed on the lead form.
 * @type {!Array<!API.Client.LeadFormQuestion>}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.questions;

/**
 * List of additional policy links to be displayed on the lead form.
 * @type {!Array<!API.Client.LeadFormCommon_policy_links_inner>}
 * @export
 */
API.Client.LeadFormCreateRequest.prototype.policyLinks;

