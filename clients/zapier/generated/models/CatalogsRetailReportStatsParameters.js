const utils = require('../utils/utils');
const CatalogsRetailReportStatsParametersReport = require('../models/CatalogsRetailReportStatsParametersReport');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'RETAIL',
                ],
            },
            ...CatalogsRetailReportStatsParametersReport.fields(`${keyPrefix}report`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'report': utils.removeIfEmpty(CatalogsRetailReportStatsParametersReport.mapping(bundle, `${keyPrefix}report`)),
        }
    },
}
