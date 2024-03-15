const utils = require('../utils/utils');
const SummaryPin = require('../models/SummaryPin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: SummaryPin.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
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
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, SummaryPin),
            'bookmark': bundle.inputData?.[`${keyPrefix}bookmark`],
        }
    },
}
