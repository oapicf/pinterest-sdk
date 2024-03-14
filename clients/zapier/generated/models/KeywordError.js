const utils = require('../utils/utils');
const Keyword = require('../models/Keyword');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...Keyword.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}error_messages`,
                label: `[${labelPrefix}error_messages]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(Keyword.mapping(bundle, `${keyPrefix}data`)),
            'error_messages': bundle.inputData?.[`${keyPrefix}error_messages`],
        }
    },
}
