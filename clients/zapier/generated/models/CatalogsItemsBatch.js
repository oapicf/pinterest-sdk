const utils = require('../utils/utils');
const BatchOperationStatus = require('../models/BatchOperationStatus');
const ItemProcessingRecord = require('../models/ItemProcessingRecord');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: ItemProcessingRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}batch_id`,
                label: `Id of the catalogs items batch - [${labelPrefix}batch_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD - [${labelPrefix}created_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}completed_time`,
                label: `Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD - [${labelPrefix}completed_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...BatchOperationStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, ItemProcessingRecord),
            'batch_id': bundle.inputData?.[`${keyPrefix}batch_id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'completed_time': bundle.inputData?.[`${keyPrefix}completed_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
