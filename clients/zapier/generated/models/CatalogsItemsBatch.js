const utils = require('../utils/utils');
const BatchOperationStatus = require('../models/BatchOperationStatus');
const CatalogsCreativeAssetsItemsBatch = require('../models/CatalogsCreativeAssetsItemsBatch');
const CatalogsHotelItemsBatch = require('../models/CatalogsHotelItemsBatch');
const CatalogsRetailItemsBatch = require('../models/CatalogsRetailItemsBatch');
const CatalogsType = require('../models/CatalogsType');
const CreativeAssetsProcessingRecord = require('../models/CreativeAssetsProcessingRecord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
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
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: CreativeAssetsProcessingRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'batch_id': bundle.inputData?.[`${keyPrefix}batch_id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'completed_time': bundle.inputData?.[`${keyPrefix}completed_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, CreativeAssetsProcessingRecord),
        }
    },
}
