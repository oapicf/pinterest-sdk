const utils = require('../utils/utils');
const AudienceCategory = require('../models/AudienceCategory');
const AudienceDemographics = require('../models/AudienceDemographics');
const AudienceInsightType = require('../models/AudienceInsightType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}categories`,
                label: `[${labelPrefix}categories]`,
                children: AudienceCategory.fields(`${keyPrefix}categories${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...AudienceDemographics.fields(`${keyPrefix}demographics`, isInput),
            {
                key: `${keyPrefix}type`,
                ...AudienceInsightType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}date`,
                label: `Generation date - [${labelPrefix}date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size`,
                label: `Population count. - [${labelPrefix}size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}size_is_upper_bound`,
                label: `Indicates whether the audience size has been rounded up to the next highest upper boundary. - [${labelPrefix}size_is_upper_bound]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'categories': utils.childMapping(bundle.inputData?.[`${keyPrefix}categories`], `${keyPrefix}categories`, AudienceCategory),
            'demographics': utils.removeIfEmpty(AudienceDemographics.mapping(bundle, `${keyPrefix}demographics`)),
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'date': bundle.inputData?.[`${keyPrefix}date`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'size_is_upper_bound': bundle.inputData?.[`${keyPrefix}size_is_upper_bound`],
        }
    },
}
