const utils = require('../utils/utils');
const ConversionTagTypeOptimal = require('../models/ConversionTagTypeOptimal');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}mapped_conversion_type`,
                ...ConversionTagTypeOptimal.fields(`${keyPrefix}mapped_conversion_type`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Raw string name of the event, usually logged as raw_event_name in our dataset - [${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'mapped_conversion_type': bundle.inputData?.[`${keyPrefix}mapped_conversion_type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
