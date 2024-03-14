const utils = require('../utils/utils');
const CatalogsProductMetadata = require('../models/CatalogsProductMetadata');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductMetadata.fields(`${keyPrefix}metadata`, isInput),
            ...Pin.fields(`${keyPrefix}pin`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'metadata': utils.removeIfEmpty(CatalogsProductMetadata.mapping(bundle, `${keyPrefix}metadata`)),
            'pin': utils.removeIfEmpty(Pin.mapping(bundle, `${keyPrefix}pin`)),
        }
    },
}
