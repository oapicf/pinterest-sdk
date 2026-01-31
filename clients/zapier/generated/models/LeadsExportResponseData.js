const utils = require('../utils/utils');
const LeadsExportStatus = require('../models/LeadsExportStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}download_url`,
                label: `[${labelPrefix}download_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}export_status`,
                ...LeadsExportStatus.fields(`${keyPrefix}export_status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'download_url': bundle.inputData?.[`${keyPrefix}download_url`],
            'export_status': bundle.inputData?.[`${keyPrefix}export_status`],
        }
    },
}
