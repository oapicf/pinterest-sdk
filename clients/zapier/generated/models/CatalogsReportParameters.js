const utils = require('../utils/utils');
const CatalogsHotelReportParameters = require('../models/CatalogsHotelReportParameters');
const CatalogsHotelReportParameters_report = require('../models/CatalogsHotelReportParameters_report');
const CatalogsRetailReportParameters = require('../models/CatalogsRetailReportParameters');
const CatalogsType = require('../models/CatalogsType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            ...CatalogsHotelReportParameters_report.fields(`${keyPrefix}report`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'report': utils.removeIfEmpty(CatalogsHotelReportParameters_report.mapping(bundle, `${keyPrefix}report`)),
        }
    },
}
