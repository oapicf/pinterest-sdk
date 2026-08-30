const utils = require('../utils/utils');
const CreateAssetAccessRequestItem = require('../models/CreateAssetAccessRequestItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_requests`,
                label: `[${labelPrefix}asset_requests]`,
                children: CreateAssetAccessRequestItem.fields(`${keyPrefix}asset_requests${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_requests': utils.childMapping(bundle.inputData?.[`${keyPrefix}asset_requests`], `${keyPrefix}asset_requests`, CreateAssetAccessRequestItem),
        }
    },
}
