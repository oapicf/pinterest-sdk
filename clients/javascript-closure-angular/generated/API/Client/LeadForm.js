goog.provide('API.Client.LeadForm');

/**
 * @record
 */
API.Client.LeadForm = function() {}

/**
 * The Ad Account ID that this lead form belongs to.
 * @type {!string}
 * @export
 */
API.Client.LeadForm.prototype.adAccountId;

/**
 * A message for people who complete the form to let them know what happens next.
 * @type {!string}
 * @export
 */
API.Client.LeadForm.prototype.completionMessage;

/**
 * Lead form creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.LeadForm.prototype.createdTime;

/**
 * Additional disclosure language to be included in the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadForm.prototype.disclosureLanguage;

/**
 * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
 * @type {!boolean}
 * @export
 */
API.Client.LeadForm.prototype.hasAcceptedTerms;

/**
 * The ID of this lead form
 * @type {!string}
 * @export
 */
API.Client.LeadForm.prototype.id;

/**
 * Internal name of the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadForm.prototype.name;

/**
 * List of additional policy links to be displayed on the lead form.
 * @type {!Array<!API.Client.LeadFormPolicyLink>}
 * @export
 */
API.Client.LeadForm.prototype.policyLinks;

/**
 * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @type {!string}
 * @export
 */
API.Client.LeadForm.prototype.privacyPolicyLink;

/**
 * List of questions to be displayed on the lead form.
 * @type {!Array<!API.Client.LeadFormQuestion>}
 * @export
 */
API.Client.LeadForm.prototype.questions;

/**
 * @type {!API.Client.LeadFormStatus}
 * @export
 */
API.Client.LeadForm.prototype.status;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.LeadForm.prototype.updatedTime;

