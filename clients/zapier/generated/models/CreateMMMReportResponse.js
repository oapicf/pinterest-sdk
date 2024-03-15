const utils = require('../utils/utils');
const CreateMMMReportResponseData = require('../models/CreateMMMReportResponseData');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `[${labelPrefix}code]`,
                type: 'number',
            },
            ...CreateMMMReportResponseData.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'data': utils.removeIfEmpty(CreateMMMReportResponseData.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
