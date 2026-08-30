const utils = require('../utils/utils');
const KeywordCreateItem = require('../models/KeywordCreateItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordCreateItem.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}parent_id`,
                label: `Keyword data - [${labelPrefix}parent_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordCreateItem),
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
        }
    },
}
