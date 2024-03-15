goog.provide('API.Client.LeadFormCommon');

/**
 * Creation fields
 * @record
 */
API.Client.LeadFormCommon = function() {}

/**
 * Internal name of the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCommon.prototype.name;

/**
 * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCommon.prototype.privacyPolicyLink;

/**
 * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
 * @type {!boolean}
 * @export
 */
API.Client.LeadFormCommon.prototype.hasAcceptedTerms;

/**
 * A message for people who complete the form to let them know what happens next.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCommon.prototype.completionMessage;

/**
 * @type {!API.Client.LeadFormStatus}
 * @export
 */
API.Client.LeadFormCommon.prototype.status;

/**
 * Additional disclosure language to be included in the lead form.
 * @type {!string}
 * @export
 */
API.Client.LeadFormCommon.prototype.disclosureLanguage;

/**
 * List of questions to be displayed on the lead form.
 * @type {!Array<!API.Client.LeadFormQuestion>}
 * @export
 */
API.Client.LeadFormCommon.prototype.questions;

