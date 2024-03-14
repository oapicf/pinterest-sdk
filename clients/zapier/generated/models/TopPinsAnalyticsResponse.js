const utils = require('../utils/utils');
const TopPinsAnalyticsResponse_date_availability = require('../models/TopPinsAnalyticsResponse_date_availability');
const TopPinsAnalyticsResponse_pins_inner = require('../models/TopPinsAnalyticsResponse_pins_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TopPinsAnalyticsResponse_date_availability.fields(`${keyPrefix}date_availability`, isInput),
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: TopPinsAnalyticsResponse_pins_inner.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}sort_by`,
                label: `[${labelPrefix}sort_by]`,
                type: 'string',
                choices: [
                    'ENGAGEMENT',
                    'SAVE',
                    'IMPRESSION',
                    'OUTBOUND_CLICK',
                    'PIN_CLICK',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'date_availability': utils.removeIfEmpty(TopPinsAnalyticsResponse_date_availability.mapping(bundle, `${keyPrefix}date_availability`)),
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, TopPinsAnalyticsResponse_pins_inner),
            'sort_by': bundle.inputData?.[`${keyPrefix}sort_by`],
        }
    },
}
