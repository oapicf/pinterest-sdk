const utils = require('../utils/utils');
const AdAccountEntityType = require('../models/AdAccountEntityType');
const ScheduleAction = require('../models/ScheduleAction');
const ScheduleStatus = require('../models/ScheduleStatus');
const ScheduleType = require('../models/ScheduleType');
const Schedule_delta_value = require('../models/Schedule_delta_value');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...Schedule_delta_value.fields(`${keyPrefix}delta_value`, isInput),
            {
                key: `${keyPrefix}end_timestamp`,
                label: `Schedule end time. Unix timestamp in seconds. - [${labelPrefix}end_timestamp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}entity_id`,
                label: `entity ID. - [${labelPrefix}entity_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}entity_type`,
                ...AdAccountEntityType.fields(`${keyPrefix}entity_type`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Schedule name. - [${labelPrefix}name]`,
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
            'delta_value': utils.removeIfEmpty(Schedule_delta_value.mapping(bundle, `${keyPrefix}delta_value`)),
            'end_timestamp': bundle.inputData?.[`${keyPrefix}end_timestamp`],
            'entity_id': bundle.inputData?.[`${keyPrefix}entity_id`],
            'entity_type': bundle.inputData?.[`${keyPrefix}entity_type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'schedule_action': bundle.inputData?.[`${keyPrefix}schedule_action`],
            'schedule_status': bundle.inputData?.[`${keyPrefix}schedule_status`],
            'schedule_type': bundle.inputData?.[`${keyPrefix}schedule_type`],
            'start_timestamp': bundle.inputData?.[`${keyPrefix}start_timestamp`],
        }
    },
}
