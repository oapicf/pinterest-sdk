const utils = require('../utils/utils');
const AppsflyerPlatform = require('../models/AppsflyerPlatform');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}container_id`,
                label: `The ID of the audience container - [${labelPrefix}container_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the audience - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}platform`,
                ...AppsflyerPlatform.fields(`${keyPrefix}platform`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'container_id': bundle.inputData?.[`${keyPrefix}container_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'platform': bundle.inputData?.[`${keyPrefix}platform`],
        }
    },
}
