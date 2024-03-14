const utils = require('../utils/utils');
const AdGroupUpdateRequest = require('../models/AdGroupUpdateRequest');
const AdUpdateRequest = require('../models/AdUpdateRequest');
const CampaignUpdateRequest = require('../models/CampaignUpdateRequest');
const KeywordUpdate = require('../models/KeywordUpdate');
const ProductGroupPromotionUpdateRequest = require('../models/ProductGroupPromotionUpdateRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaigns`,
                label: `[${labelPrefix}campaigns]`,
                children: CampaignUpdateRequest.fields(`${keyPrefix}campaigns${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}ad_groups`,
                label: `[${labelPrefix}ad_groups]`,
                children: AdGroupUpdateRequest.fields(`${keyPrefix}ad_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}ads`,
                label: `[${labelPrefix}ads]`,
                children: AdUpdateRequest.fields(`${keyPrefix}ads${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}product_groups`,
                label: `[${labelPrefix}product_groups]`,
                children: ProductGroupPromotionUpdateRequest.fields(`${keyPrefix}product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordUpdate.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, CampaignUpdateRequest),
            'ad_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_groups`], `${keyPrefix}ad_groups`, AdGroupUpdateRequest),
            'ads': utils.childMapping(bundle.inputData?.[`${keyPrefix}ads`], `${keyPrefix}ads`, AdUpdateRequest),
            'product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_groups`], `${keyPrefix}product_groups`, ProductGroupPromotionUpdateRequest),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordUpdate),
        }
    },
}
