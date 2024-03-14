const utils = require('../utils/utils');
const KeywordsCommon = require('../models/KeywordsCommon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordsCommon.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}parent_id`,
                label: `Keyword parent entity ID (advertiser, campaign, ad group). - [${labelPrefix}parent_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordsCommon),
            'parent_id': bundle.inputData?.[`${keyPrefix}parent_id`],
        }
    },
}
