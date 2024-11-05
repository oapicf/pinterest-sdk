const utils = require('../utils/utils');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}permissions`,
                label: `Permission levels member or partner has on an asset. - [${labelPrefix}permissions]`,
                list: true,
                type: 'string',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}user`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
            'user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}user`)),
        }
    },
}
