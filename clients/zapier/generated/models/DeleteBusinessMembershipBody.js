const utils = require('../utils/utils');
const DeleteBusinessMembershipMember = require('../models/DeleteBusinessMembershipMember');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}members`,
                label: `[${labelPrefix}members]`,
                children: DeleteBusinessMembershipMember.fields(`${keyPrefix}members${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'members': utils.childMapping(bundle.inputData?.[`${keyPrefix}members`], `${keyPrefix}members`, DeleteBusinessMembershipMember),
        }
    },
}
