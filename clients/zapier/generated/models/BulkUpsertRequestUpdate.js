const utils = require('../utils/utils');
const AdGroupUpdateRequest = require('../models/AdGroupUpdateRequest');
const AdUpdateRequest = require('../models/AdUpdateRequest');
const CampaignUpdateRequest = require('../models/CampaignUpdateRequest');
const KeywordUpdate = require('../models/KeywordUpdate');
const LabelBulkUpdateRequest = require('../models/LabelBulkUpdateRequest');
const ProductGroupPromotionUpdateRequest = require('../models/ProductGroupPromotionUpdateRequest');
const catalogs_product_groups_update_request = require('../models/catalogs_product_groups_update_request');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}campaigns`,
                label: `[${labelPrefix}campaigns]`,
                children: CampaignUpdateRequest.fields(`${keyPrefix}campaigns${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}catalog_product_groups`,
                label: `[${labelPrefix}catalog_product_groups]`,
                children: catalogs_product_groups_update_request.fields(`${keyPrefix}catalog_product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordUpdate.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                children: LabelBulkUpdateRequest.fields(`${keyPrefix}labels${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}product_groups`,
                label: `[${labelPrefix}product_groups]`,
                children: ProductGroupPromotionUpdateRequest.fields(`${keyPrefix}product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_groups`], `${keyPrefix}ad_groups`, AdGroupUpdateRequest),
            'ads': utils.childMapping(bundle.inputData?.[`${keyPrefix}ads`], `${keyPrefix}ads`, AdUpdateRequest),
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, CampaignUpdateRequest),
            'catalog_product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}catalog_product_groups`], `${keyPrefix}catalog_product_groups`, catalogs_product_groups_update_request),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordUpdate),
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelBulkUpdateRequest),
            'product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_groups`], `${keyPrefix}product_groups`, ProductGroupPromotionUpdateRequest),
        }
    },
}
