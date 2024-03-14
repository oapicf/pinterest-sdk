const utils = require('../utils/utils');
const Keyword = require('../models/Keyword');
const KeywordError = require('../models/KeywordError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: KeywordError.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: Keyword.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, KeywordError),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, Keyword),
        }
    },
}
