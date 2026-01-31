const utils = require('../utils/utils');
const CatalogsHotelReportStatsParameters = require('../models/CatalogsHotelReportStatsParameters');
const CatalogsHotelReportStatsParameters_report = require('../models/CatalogsHotelReportStatsParameters_report');
const CatalogsRetailReportStatsParameters = require('../models/CatalogsRetailReportStatsParameters');
const CatalogsType = require('../models/CatalogsType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            ...CatalogsHotelReportStatsParameters_report.fields(`${keyPrefix}report`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'report': utils.removeIfEmpty(CatalogsHotelReportStatsParameters_report.mapping(bundle, `${keyPrefix}report`)),
        }
    },
}
