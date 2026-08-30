const utils = require('../utils/utils');
const TopVideoPinsAnalyticsResponseDateAvailability = require('../models/TopVideoPinsAnalyticsResponseDateAvailability');
const TopVideoPinsAnalyticsResponsePinsItems = require('../models/TopVideoPinsAnalyticsResponsePinsItems');
const TopVideoPinsSortBy = require('../models/TopVideoPinsSortBy');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TopVideoPinsAnalyticsResponseDateAvailability.fields(`${keyPrefix}date_availability`, isInput),
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: TopVideoPinsAnalyticsResponsePinsItems.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}sort_by`,
                ...TopVideoPinsSortBy.fields(`${keyPrefix}sort_by`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'date_availability': utils.removeIfEmpty(TopVideoPinsAnalyticsResponseDateAvailability.mapping(bundle, `${keyPrefix}date_availability`)),
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, TopVideoPinsAnalyticsResponsePinsItems),
            'sort_by': bundle.inputData?.[`${keyPrefix}sort_by`],
        }
    },
}
