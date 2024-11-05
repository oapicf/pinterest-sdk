const utils = require('../utils/utils');
const UpdateMemberAssetAccessBody_accesses_inner = require('../models/UpdateMemberAssetAccessBody_accesses_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accesses`,
                label: `[${labelPrefix}accesses]`,
                children: UpdateMemberAssetAccessBody_accesses_inner.fields(`${keyPrefix}accesses${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accesses': utils.childMapping(bundle.inputData?.[`${keyPrefix}accesses`], `${keyPrefix}accesses`, UpdateMemberAssetAccessBody_accesses_inner),
        }
    },
}
