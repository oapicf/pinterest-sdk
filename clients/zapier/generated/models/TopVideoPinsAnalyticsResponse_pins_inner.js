const utils = require('../utils/utils');
const DataStatus = require('../models/DataStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}metrics`,
                label: `The metric name and daily value for each requested metric - [${labelPrefix}metrics]`,
                type: 'object',
            },
            ...DataStatus.fields(`${keyPrefix}data_status`, isInput),
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
            'metrics': bundle.inputData?.[`${keyPrefix}metrics`],
            'data_status': utils.removeIfEmpty(DataStatus.mapping(bundle, `${keyPrefix}data_status`)),
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
        }
    },
}
