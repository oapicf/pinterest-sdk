const utils = require('../utils/utils');
const GetMMMReportResponseData = require('../models/GetMMMReportResponseData');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `[${labelPrefix}code]`,
                type: 'number',
            },
            ...GetMMMReportResponseData.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}message`,
                label: `[${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `[${labelPrefix}status]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'data': utils.removeIfEmpty(GetMMMReportResponseData.mapping(bundle, `${keyPrefix}data`)),
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
