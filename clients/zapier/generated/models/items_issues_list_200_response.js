const utils = require('../utils/utils');
const CatalogsItemValidationIssues = require('../models/CatalogsItemValidationIssues');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: CatalogsItemValidationIssues.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}bookmark`,
                label: `[${labelPrefix}bookmark]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, CatalogsItemValidationIssues),
            'bookmark': bundle.inputData?.[`${keyPrefix}bookmark`],
        }
    },
}