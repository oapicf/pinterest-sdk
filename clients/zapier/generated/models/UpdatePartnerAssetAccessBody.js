const utils = require('../utils/utils');
const UpdatePartnerAssetAccessItem = require('../models/UpdatePartnerAssetAccessItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accesses`,
                label: `[${labelPrefix}accesses]`,
                children: UpdatePartnerAssetAccessItem.fields(`${keyPrefix}accesses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accesses': utils.childMapping(bundle.inputData?.[`${keyPrefix}accesses`], `${keyPrefix}accesses`, UpdatePartnerAssetAccessItem),
        }
    },
}
