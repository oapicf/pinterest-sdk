const utils = require('../utils/utils');
const CreativeAssetsVisibilityType = require('../models/CreativeAssetsVisibilityType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}creative_assets_id`,
                label: `The user-created unique ID that represents the creative assets item. - [${labelPrefix}creative_assets_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}visibility`,
                ...CreativeAssetsVisibilityType.fields(`${keyPrefix}visibility`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'creative_assets_id': bundle.inputData?.[`${keyPrefix}creative_assets_id`],
            'visibility': bundle.inputData?.[`${keyPrefix}visibility`],
        }
    },
}
