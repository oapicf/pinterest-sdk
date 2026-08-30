const utils = require('../utils/utils');
const TopPinsAnalyticsResponseDateAvailability = require('../models/TopPinsAnalyticsResponseDateAvailability');
const TopPinsAnalyticsResponsePinsItems = require('../models/TopPinsAnalyticsResponsePinsItems');
const TopPinsSortBy = require('../models/TopPinsSortBy');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TopPinsAnalyticsResponseDateAvailability.fields(`${keyPrefix}date_availability`, isInput),
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: TopPinsAnalyticsResponsePinsItems.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}sort_by`,
                ...TopPinsSortBy.fields(`${keyPrefix}sort_by`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'date_availability': utils.removeIfEmpty(TopPinsAnalyticsResponseDateAvailability.mapping(bundle, `${keyPrefix}date_availability`)),
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, TopPinsAnalyticsResponsePinsItems),
            'sort_by': bundle.inputData?.[`${keyPrefix}sort_by`],
        }
    },
}
