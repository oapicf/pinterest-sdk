const utils = require('../utils/utils');
const ConversionTagConfigs = require('../models/ConversionTagConfigs');
const EnhancedMatchStatusType = require('../models/EnhancedMatchStatusType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code_snippet`,
                label: `Tag code snippet. - [${labelPrefix}code_snippet]`,
                type: 'string',
            },
            ...ConversionTagConfigs.fields(`${keyPrefix}configs`, isInput),
            {
                key: `${keyPrefix}enhanced_match_status`,
                ...EnhancedMatchStatusType.fields(`${keyPrefix}enhanced_match_status`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `Tag ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}last_fired_time_ms`,
                label: `Time for the last event fired. - [${labelPrefix}last_fired_time_ms]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Conversion tag name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}version`,
                label: `Version number. - [${labelPrefix}version]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code_snippet': bundle.inputData?.[`${keyPrefix}code_snippet`],
            'configs': utils.removeIfEmpty(ConversionTagConfigs.mapping(bundle, `${keyPrefix}configs`)),
            'enhanced_match_status': bundle.inputData?.[`${keyPrefix}enhanced_match_status`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'last_fired_time_ms': bundle.inputData?.[`${keyPrefix}last_fired_time_ms`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'version': bundle.inputData?.[`${keyPrefix}version`],
        }
    },
}
