const utils = require('../utils/utils');
const DataStatus = require('../models/DataStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}data_status`,
                ...DataStatus.fields(`${keyPrefix}data_status`, isInput),
            },
            {
                key: `${keyPrefix}date`,
                label: `Metrics date (UTC): YYYY-MM-DD. - [${labelPrefix}date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}metrics`,
                label: `The metric name and daily value for each requested metric - [${labelPrefix}metrics]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data_status': bundle.inputData?.[`${keyPrefix}data_status`],
            'date': bundle.inputData?.[`${keyPrefix}date`],
            'metrics': bundle.inputData?.[`${keyPrefix}metrics`],
        }
    },
}
