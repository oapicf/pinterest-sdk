const utils = require('../utils/utils');
const KeywordUpdate = require('../models/KeywordUpdate');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordUpdate.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordUpdate),
        }
    },
}
