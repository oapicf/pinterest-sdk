const utils = require('../utils/utils');
const DeleteAssetGroupResponse_exceptions_inner = require('../models/DeleteAssetGroupResponse_exceptions_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}deleted_asset_groups`,
                label: `A list of ids of successfully deleted asset groups. - [${labelPrefix}deleted_asset_groups]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: DeleteAssetGroupResponse_exceptions_inner.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'deleted_asset_groups': bundle.inputData?.[`${keyPrefix}deleted_asset_groups`],
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, DeleteAssetGroupResponse_exceptions_inner),
        }
    },
}
