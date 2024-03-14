const utils = require('../utils/utils');
const AdCreateRequest = require('../models/AdCreateRequest');
const AdGroupCreateRequest = require('../models/AdGroupCreateRequest');
const CampaignCreateRequest = require('../models/CampaignCreateRequest');
const KeywordsRequest = require('../models/KeywordsRequest');
const ProductGroupPromotionCreateRequest = require('../models/ProductGroupPromotionCreateRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}campaigns`,
                label: `[${labelPrefix}campaigns]`,
                children: CampaignCreateRequest.fields(`${keyPrefix}campaigns${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}ad_groups`,
                label: `[${labelPrefix}ad_groups]`,
                children: AdGroupCreateRequest.fields(`${keyPrefix}ad_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}ads`,
                label: `[${labelPrefix}ads]`,
                children: AdCreateRequest.fields(`${keyPrefix}ads${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}product_groups`,
                label: `[${labelPrefix}product_groups]`,
                children: ProductGroupPromotionCreateRequest.fields(`${keyPrefix}product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordsRequest.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, CampaignCreateRequest),
            'ad_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_groups`], `${keyPrefix}ad_groups`, AdGroupCreateRequest),
            'ads': utils.childMapping(bundle.inputData?.[`${keyPrefix}ads`], `${keyPrefix}ads`, AdCreateRequest),
            'product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_groups`], `${keyPrefix}product_groups`, ProductGroupPromotionCreateRequest),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordsRequest),
        }
    },
}
