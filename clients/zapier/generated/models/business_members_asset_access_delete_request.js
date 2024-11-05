const utils = require('../utils/utils');
const business_members_asset_access_delete_request_accesses_inner = require('../models/business_members_asset_access_delete_request_accesses_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accesses`,
                label: `[${labelPrefix}accesses]`,
                children: business_members_asset_access_delete_request_accesses_inner.fields(`${keyPrefix}accesses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accesses': utils.childMapping(bundle.inputData?.[`${keyPrefix}accesses`], `${keyPrefix}accesses`, business_members_asset_access_delete_request_accesses_inner),
        }
    },
}
