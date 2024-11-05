const utils = require('../utils/utils');
const BatchOperationStatus = require('../models/BatchOperationStatus');
const CatalogsType = require('../models/CatalogsType');
const HotelProcessingRecord = require('../models/HotelProcessingRecord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}batch_id`,
                label: `Id of the catalogs items batch - [${labelPrefix}batch_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss - [${labelPrefix}created_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}completed_time`,
                label: `Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss - [${labelPrefix}completed_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...BatchOperationStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: HotelProcessingRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'batch_id': bundle.inputData?.[`${keyPrefix}batch_id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'completed_time': bundle.inputData?.[`${keyPrefix}completed_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, HotelProcessingRecord),
        }
    },
}
