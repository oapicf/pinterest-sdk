const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}cause`,
                label: `Original cause of the error. - [${labelPrefix}cause]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}column_number`,
                label: `Column number in the line of the file that raised the error. - [${labelPrefix}column_number]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}file_name`,
                label: `Filename where the error happened. - [${labelPrefix}file_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}line_number`,
                label: `Line number where the error happened. - [${labelPrefix}line_number]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}message`,
                label: `Human-readable description of the error. - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message_detail`,
                label: `More detail about the message. - [${labelPrefix}message_detail]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Filename where the error happened. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}number`,
                label: `Integer that specifies the error code. - [${labelPrefix}number]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}stack_trace`,
                label: `Stack trace of where the error happened. - [${labelPrefix}stack_trace]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cause': bundle.inputData?.[`${keyPrefix}cause`],
            'column_number': bundle.inputData?.[`${keyPrefix}column_number`],
            'file_name': bundle.inputData?.[`${keyPrefix}file_name`],
            'line_number': bundle.inputData?.[`${keyPrefix}line_number`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'message_detail': bundle.inputData?.[`${keyPrefix}message_detail`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'number': bundle.inputData?.[`${keyPrefix}number`],
            'stack_trace': bundle.inputData?.[`${keyPrefix}stack_trace`],
        }
    },
}
