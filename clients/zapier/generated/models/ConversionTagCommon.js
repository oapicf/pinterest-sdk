const utils = require('../utils/utils');
const ConversionTagConfigs = require('../models/ConversionTagConfigs');
const EnhancedMatchStatusType = require('../models/EnhancedMatchStatusType');
const EntityStatus = require('../models/EntityStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Ad account ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}code_snippet`,
                label: `Tag code snippet. - [${labelPrefix}code_snippet]`,
                type: 'string',
            },
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
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}version`,
                label: `Version number. - [${labelPrefix}version]`,
                type: 'string',
            },
            ...ConversionTagConfigs.fields(`${keyPrefix}configs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'code_snippet': bundle.inputData?.[`${keyPrefix}code_snippet`],
            'enhanced_match_status': bundle.inputData?.[`${keyPrefix}enhanced_match_status`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'last_fired_time_ms': bundle.inputData?.[`${keyPrefix}last_fired_time_ms`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'version': bundle.inputData?.[`${keyPrefix}version`],
            'configs': utils.removeIfEmpty(ConversionTagConfigs.mapping(bundle, `${keyPrefix}configs`)),
        }
    },
}
