const utils = require('../utils/utils');
const AudienceSubcategory = require('../models/AudienceSubcategory');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Interest ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}index`,
                label: `Interest affinity index. - [${labelPrefix}index]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}key`,
                label: `Interest unique key (same as ID). - [${labelPrefix}key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Interest name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ratio`,
                label: `Interest's percent of category's total audience. - [${labelPrefix}ratio]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}subcategories`,
                label: `[${labelPrefix}subcategories]`,
                children: AudienceSubcategory.fields(`${keyPrefix}subcategories${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'key': bundle.inputData?.[`${keyPrefix}key`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'ratio': bundle.inputData?.[`${keyPrefix}ratio`],
            'subcategories': utils.childMapping(bundle.inputData?.[`${keyPrefix}subcategories`], `${keyPrefix}subcategories`, AudienceSubcategory),
        }
    },
}
