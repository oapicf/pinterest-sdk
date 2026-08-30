const utils = require('../utils/utils');
const AssetIdPermissions = require('../models/AssetIdPermissions');
const TotalCountByEntityStatus = require('../models/TotalCountByEntityStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}bookmark`,
                label: `[${labelPrefix}bookmark]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: AssetIdPermissions.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}total_data_count`,
                label: `Total number of assets matching the query - [${labelPrefix}total_data_count]`,
                required: true,
                type: 'integer',
            },
            ...TotalCountByEntityStatus.fields(`${keyPrefix}total_data_count_by_status`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bookmark': bundle.inputData?.[`${keyPrefix}bookmark`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, AssetIdPermissions),
            'total_data_count': bundle.inputData?.[`${keyPrefix}total_data_count`],
            'total_data_count_by_status': utils.removeIfEmpty(TotalCountByEntityStatus.mapping(bundle, `${keyPrefix}total_data_count_by_status`)),
        }
    },
}
