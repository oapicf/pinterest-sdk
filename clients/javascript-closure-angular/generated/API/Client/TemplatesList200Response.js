goog.provide('API.Client.templates_list_200_response');

/**
 * @record
 */
API.Client.TemplatesList200Response = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.TemplatesList200Response.prototype.bookmark;

/**
 * @type {!Array<!API.Client.AccountTemplate>}
 * @export
 */
API.Client.TemplatesList200Response.prototype.items;

