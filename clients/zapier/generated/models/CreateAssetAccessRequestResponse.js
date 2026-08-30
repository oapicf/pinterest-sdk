const utils = require('../utils/utils');
const AssetAccessRequestError = require('../models/AssetAccessRequestError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: AssetAccessRequestError.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}invites`,
                label: `An object mapping each partner id to the asset access request id. Only one request id is returned per partner. - [${labelPrefix}invites]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, AssetAccessRequestError),
            'invites': bundle.inputData?.[`${keyPrefix}invites`],
        }
    },
}
