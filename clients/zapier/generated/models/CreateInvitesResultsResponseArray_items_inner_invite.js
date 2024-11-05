const utils = require('../utils/utils');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of the invite/request. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}user`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}user`)),
        }
    },
}
