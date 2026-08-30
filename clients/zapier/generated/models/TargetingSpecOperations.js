const utils = require('../utils/utils');
const TargetingSpecOperationAgeBucket = require('../models/TargetingSpecOperationAgeBucket');
const TargetingSpecOperationAppType = require('../models/TargetingSpecOperationAppType');
const TargetingSpecOperationAudienceExclude = require('../models/TargetingSpecOperationAudienceExclude');
const TargetingSpecOperationAudienceInclude = require('../models/TargetingSpecOperationAudienceInclude');
const TargetingSpecOperationGender = require('../models/TargetingSpecOperationGender');
const TargetingSpecOperationGeo = require('../models/TargetingSpecOperationGeo');
const TargetingSpecOperationGeoExclude = require('../models/TargetingSpecOperationGeoExclude');
const TargetingSpecOperationInterest = require('../models/TargetingSpecOperationInterest');
const TargetingSpecOperationLocale = require('../models/TargetingSpecOperationLocale');
const TargetingSpecOperationLocation = require('../models/TargetingSpecOperationLocation');
const TargetingSpecOperationLocationExclude = require('../models/TargetingSpecOperationLocationExclude');
const TargetingSpecOperationMaximumAge = require('../models/TargetingSpecOperationMaximumAge');
const TargetingSpecOperationMinimumAge = require('../models/TargetingSpecOperationMinimumAge');
const TargetingSpecOperationShoppingRetargeting = require('../models/TargetingSpecOperationShoppingRetargeting');
const TargetingSpecShoppingRetargeting = require('../models/TargetingSpecShoppingRetargeting');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}field`,
                label: `[${labelPrefix}field]`,
                required: true,
                type: 'string',
                choices: [
                    'MINIMUM_AGE',
                ],
            },
            {
                key: `${keyPrefix}operation`,
                label: `[${labelPrefix}operation]`,
                required: true,
                type: 'string',
                choices: [
                    'SET',
                ],
            },
            {
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                children: TargetingSpecShoppingRetargeting.fields(`${keyPrefix}values${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}value`,
                label: `[${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'field': bundle.inputData?.[`${keyPrefix}field`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, TargetingSpecShoppingRetargeting),
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
