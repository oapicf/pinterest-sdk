const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}method`,
                label: `[${labelPrefix}method]`,
                required: true,
                type: 'string',
                choices: [
                    'GET',
                    'HEAD',
                    'POST',
                    'PUT',
                    'DELETE',
                    'CONNECT',
                    'OPTIONS',
                    'TRACE',
                    'PATCH',
                ],
            },
            {
                key: `${keyPrefix}host`,
                label: `HTTP request host from host header. - [${labelPrefix}host]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}path`,
                label: `HTTP request path. - [${labelPrefix}path]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}request_headers`,
                label: `HTTP request headers as key-value pairs. - [${labelPrefix}request_headers]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}response_headers`,
                label: `HTTP response headers as key-value pairs. - [${labelPrefix}response_headers]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}response_status_code`,
                label: `[${labelPrefix}response_status_code]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'method': bundle.inputData?.[`${keyPrefix}method`],
            'host': bundle.inputData?.[`${keyPrefix}host`],
            'path': bundle.inputData?.[`${keyPrefix}path`],
            'request_headers': bundle.inputData?.[`${keyPrefix}request_headers`],
            'response_headers': bundle.inputData?.[`${keyPrefix}response_headers`],
            'response_status_code': bundle.inputData?.[`${keyPrefix}response_status_code`],
        }
    },
}
