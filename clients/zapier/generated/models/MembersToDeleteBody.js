const utils = require('../utils/utils');
const MembersToDeleteBody_members_inner = require('../models/MembersToDeleteBody_members_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}members`,
                label: `[${labelPrefix}members]`,
                children: MembersToDeleteBody_members_inner.fields(`${keyPrefix}members${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'members': utils.childMapping(bundle.inputData?.[`${keyPrefix}members`], `${keyPrefix}members`, MembersToDeleteBody_members_inner),
        }
    },
}
