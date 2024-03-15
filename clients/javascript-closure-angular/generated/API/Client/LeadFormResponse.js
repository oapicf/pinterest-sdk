goog.provide('API.Client.LeadFormResponse');

/**
 * @record
 */
API.Client.LeadFormResponse = function() {}

/**
 * Internal name of the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadFormResponse.prototype.name;

/**
 * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @type {!string}
 * @export
 */
API.Client.LeadFormResponse.prototype.privacyPolicyLink;

/**
 * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
 * @type {!boolean}
 * @export
 */
API.Client.LeadFormResponse.prototype.hasAcceptedTerms;

/**
 * A message for people who complete the form to let them know what happens next.
 * @type {!string}
 * @export
 */
API.Client.LeadFormResponse.prototype.completionMessage;

/**
 * @type {!API.Client.LeadFormStatus}
 * @export
 */
API.Client.LeadFormResponse.prototype.status;

/**
 * Additional disclosure language to be included in the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadFormResponse.prototype.disclosureLanguage;

/**
 * List of questions to be displayed on the lead form.
 * @type {!Array<!API.Client.LeadFormQuestion>}
 * @export
 */
API.Client.LeadFormResponse.prototype.questions;

/**
 * The ID of this lead form
 * @type {!string}
 * @export
 */
API.Client.LeadFormResponse.prototype.id;

/**
 * The Ad Account ID that this lead form belongs to.
 * @type {!string}
 * @export
 */
API.Client.LeadFormResponse.prototype.adAccountId;

/**
 * Lead form creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.LeadFormResponse.prototype.createdTime;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.LeadFormResponse.prototype.updatedTime;

