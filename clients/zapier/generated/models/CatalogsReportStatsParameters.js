const utils = require('../utils/utils');
const CatalogsHotelReportStatsParameters = require('../models/CatalogsHotelReportStatsParameters');
const CatalogsHotelReportStatsParametersReport = require('../models/CatalogsHotelReportStatsParametersReport');
const CatalogsRetailReportStatsParameters = require('../models/CatalogsRetailReportStatsParameters');

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
                    'HOTEL',
                ],
            },
            ...CatalogsHotelReportStatsParametersReport.fields(`${keyPrefix}report`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'report': utils.removeIfEmpty(CatalogsHotelReportStatsParametersReport.mapping(bundle, `${keyPrefix}report`)),
        }
    },
}
