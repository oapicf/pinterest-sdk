const utils = require('../utils/utils');
const IntegrationRecord = require('../models/IntegrationRecord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: IntegrationRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
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
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, IntegrationRecord),
            'bookmark': bundle.inputData?.[`${keyPrefix}bookmark`],
        }
    },
}
