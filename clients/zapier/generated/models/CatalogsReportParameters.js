const utils = require('../utils/utils');
const CatalogsHotelReportParameters = require('../models/CatalogsHotelReportParameters');
const CatalogsHotelReportParametersReport = require('../models/CatalogsHotelReportParametersReport');
const CatalogsRetailReportParameters = require('../models/CatalogsRetailReportParameters');

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
            ...CatalogsHotelReportParametersReport.fields(`${keyPrefix}report`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'report': utils.removeIfEmpty(CatalogsHotelReportParametersReport.mapping(bundle, `${keyPrefix}report`)),
        }
    },
}
