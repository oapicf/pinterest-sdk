goog.provide('API.Client.RelatedTerms');

/**
 * @record
 */
API.Client.RelatedTerms = function() {}

/**
 * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
 * @type {!string}
 * @export
 */
API.Client.RelatedTerms.prototype.id;

/**
 * Total number of related terms returned
 * @type {!number}
 * @export
 */
API.Client.RelatedTerms.prototype.relatedTermCount;

/**
 * The id of the advertiser.
 * @type {!Array<!API.Client.RelatedTerms_related_terms_list_inner>}
 * @export
 */
API.Client.RelatedTerms.prototype.relatedTermsList;

