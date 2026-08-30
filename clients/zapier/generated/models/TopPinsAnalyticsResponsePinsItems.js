const utils = require('../utils/utils');
const DataStatus = require('../models/DataStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...DataStatus.fields(`${keyPrefix}data_status`, isInput),
            {
                key: `${keyPrefix}metrics`,
                label: `[${labelPrefix}metrics]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `The pin id - [${labelPrefix}pin_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data_status': utils.removeIfEmpty(DataStatus.mapping(bundle, `${keyPrefix}data_status`)),
            'metrics': bundle.inputData?.[`${keyPrefix}metrics`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
        }
    },
}
