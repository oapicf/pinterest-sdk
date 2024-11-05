const utils = require('../utils/utils');
const CreateAssetAccessRequestBody_asset_requests_inner = require('../models/CreateAssetAccessRequestBody_asset_requests_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}asset_requests`,
                label: `[${labelPrefix}asset_requests]`,
                children: CreateAssetAccessRequestBody_asset_requests_inner.fields(`${keyPrefix}asset_requests${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asset_requests': utils.childMapping(bundle.inputData?.[`${keyPrefix}asset_requests`], `${keyPrefix}asset_requests`, CreateAssetAccessRequestBody_asset_requests_inner),
        }
    },
}
