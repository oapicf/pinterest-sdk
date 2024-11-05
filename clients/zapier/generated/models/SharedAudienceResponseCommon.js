const utils = require('../utils/utils');
const Role = require('../models/Role');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_id`,
                label: `Audience ID that was shared - [${labelPrefix}audience_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}permissions`,
                list: true,
                type: 'string',
                ...Role.fields(`${keyPrefix}permissions`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_id': bundle.inputData?.[`${keyPrefix}audience_id`],
            'permissions': utils.childMapping(bundle.inputData?.[`${keyPrefix}permissions`], `${keyPrefix}permissions`, Role),
        }
    },
}
