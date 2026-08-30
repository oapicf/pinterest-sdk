const utils = require('../utils/utils');
const ScheduleAction = require('../models/ScheduleAction');
const ScheduleCommonDeltaValue = require('../models/ScheduleCommonDeltaValue');
const ScheduleStatus = require('../models/ScheduleStatus');
const ScheduleType = require('../models/ScheduleType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entity_id`,
                label: `[${labelPrefix}entity_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}entity_type`,
                label: `Entity type - [${labelPrefix}entity_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Schedule ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            ...ScheduleCommonDeltaValue.fields(`${keyPrefix}delta_value`, isInput),
            {
                key: `${keyPrefix}end_timestamp`,
                label: `Schedule end time. Unix timestamp in seconds. - [${labelPrefix}end_timestamp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}schedule_action`,
                ...ScheduleAction.fields(`${keyPrefix}schedule_action`, isInput),
            },
            {
                key: `${keyPrefix}schedule_status`,
                ...ScheduleStatus.fields(`${keyPrefix}schedule_status`, isInput),
            },
            {
                key: `${keyPrefix}schedule_type`,
                ...ScheduleType.fields(`${keyPrefix}schedule_type`, isInput),
            },
            {
                key: `${keyPrefix}start_timestamp`,
                label: `Schedule start time. Unix timestamp in seconds. - [${labelPrefix}start_timestamp]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entity_id': bundle.inputData?.[`${keyPrefix}entity_id`],
            'entity_type': bundle.inputData?.[`${keyPrefix}entity_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'delta_value': utils.removeIfEmpty(ScheduleCommonDeltaValue.mapping(bundle, `${keyPrefix}delta_value`)),
            'end_timestamp': bundle.inputData?.[`${keyPrefix}end_timestamp`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'schedule_action': bundle.inputData?.[`${keyPrefix}schedule_action`],
            'schedule_status': bundle.inputData?.[`${keyPrefix}schedule_status`],
            'schedule_type': bundle.inputData?.[`${keyPrefix}schedule_type`],
            'start_timestamp': bundle.inputData?.[`${keyPrefix}start_timestamp`],
        }
    },
}
