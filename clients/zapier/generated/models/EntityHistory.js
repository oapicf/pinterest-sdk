const utils = require('../utils/utils');
const ChangeHistoryOperationType = require('../models/ChangeHistoryOperationType');
const EntityDataChangeHistory = require('../models/EntityDataChangeHistory');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}change_timestamp`,
                label: `A Unix timestamp representing the time of the change in seconds - [${labelPrefix}change_timestamp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}data_changes`,
                label: `[${labelPrefix}data_changes]`,
                children: EntityDataChangeHistory.fields(`${keyPrefix}data_changes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}entity_id`,
                label: `The id of the entity that was changed - [${labelPrefix}entity_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}entity_name`,
                label: `The name of the entity that was changed - [${labelPrefix}entity_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ldap`,
                label: `The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users - [${labelPrefix}ldap]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation`,
                ...ChangeHistoryOperationType.fields(`${keyPrefix}operation`, isInput),
            },
            {
                key: `${keyPrefix}user_id`,
                label: `The id of the user who initiated the change - [${labelPrefix}user_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'change_timestamp': bundle.inputData?.[`${keyPrefix}change_timestamp`],
            'data_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}data_changes`], `${keyPrefix}data_changes`, EntityDataChangeHistory),
            'entity_id': bundle.inputData?.[`${keyPrefix}entity_id`],
            'entity_name': bundle.inputData?.[`${keyPrefix}entity_name`],
            'ldap': bundle.inputData?.[`${keyPrefix}ldap`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
        }
    },
}
