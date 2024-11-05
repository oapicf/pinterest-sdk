const utils = require('../utils/utils');
const LeadsExportStatus = require('../models/LeadsExportStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}export_status`,
                ...LeadsExportStatus.fields(`${keyPrefix}export_status`, isInput),
            },
            {
                key: `${keyPrefix}download_url`,
                label: `[${labelPrefix}download_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'export_status': bundle.inputData?.[`${keyPrefix}export_status`],
            'download_url': bundle.inputData?.[`${keyPrefix}download_url`],
        }
    },
}
