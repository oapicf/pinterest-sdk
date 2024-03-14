const utils = require('../utils/utils');
const RelatedTerms_related_terms_list_inner = require('../models/RelatedTerms_related_terms_list_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}related_term_count`,
                label: `Total number of related terms returned - [${labelPrefix}related_term_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}related_terms_list`,
                label: `[${labelPrefix}related_terms_list]`,
                children: RelatedTerms_related_terms_list_inner.fields(`${keyPrefix}related_terms_list${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'related_term_count': bundle.inputData?.[`${keyPrefix}related_term_count`],
            'related_terms_list': utils.childMapping(bundle.inputData?.[`${keyPrefix}related_terms_list`], `${keyPrefix}related_terms_list`, RelatedTerms_related_terms_list_inner),
        }
    },
}
