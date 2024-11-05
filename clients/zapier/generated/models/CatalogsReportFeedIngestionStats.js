const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}report_type`,
                label: `[${labelPrefix}report_type]`,
                type: 'string',
                choices: [
                    'FEED_INGESTION_ISSUES',
                ],
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `ID of the catalog entity. - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}code`,
                label: `The event code that a diagnostics aggregated number references - [${labelPrefix}code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}code_label`,
                label: `A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID') - [${labelPrefix}code_label]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `Title message describing the diagnostic issue - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}occurrences`,
                label: `Number of occurrences of the issue - [${labelPrefix}occurrences]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}severity`,
                label: `An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue - [${labelPrefix}severity]`,
                type: 'string',
                choices: [
                    'WARN',
                    'ERROR',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report_type': bundle.inputData?.[`${keyPrefix}report_type`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'code_label': bundle.inputData?.[`${keyPrefix}code_label`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'occurrences': bundle.inputData?.[`${keyPrefix}occurrences`],
            'severity': bundle.inputData?.[`${keyPrefix}severity`],
        }
    },
}
