const utils = require('../utils/utils');
const AdCreateRequest = require('../models/AdCreateRequest');
const AdGroupCreateRequest = require('../models/AdGroupCreateRequest');
const BulkUpsertRequestCreateCatalogProductGroupsItems = require('../models/BulkUpsertRequestCreateCatalogProductGroupsItems');
const CampaignCreateRequest = require('../models/CampaignCreateRequest');
const KeywordsRequest = require('../models/KeywordsRequest');
const LabelBulkCreateRequest = require('../models/LabelBulkCreateRequest');
const ProductGroupPromotionCreateRequest = require('../models/ProductGroupPromotionCreateRequest');
const ScheduleCreateRequest = require('../models/ScheduleCreateRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}campaigns`,
                label: `[${labelPrefix}campaigns]`,
                children: CampaignCreateRequest.fields(`${keyPrefix}campaigns${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}catalog_product_groups`,
                label: `[${labelPrefix}catalog_product_groups]`,
                children: BulkUpsertRequestCreateCatalogProductGroupsItems.fields(`${keyPrefix}catalog_product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordsRequest.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                children: LabelBulkCreateRequest.fields(`${keyPrefix}labels${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}product_groups`,
                label: `[${labelPrefix}product_groups]`,
                children: ProductGroupPromotionCreateRequest.fields(`${keyPrefix}product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}schedules`,
                label: `[${labelPrefix}schedules]`,
                children: ScheduleCreateRequest.fields(`${keyPrefix}schedules${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_groups`], `${keyPrefix}ad_groups`, AdGroupCreateRequest),
            'ads': utils.childMapping(bundle.inputData?.[`${keyPrefix}ads`], `${keyPrefix}ads`, AdCreateRequest),
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, CampaignCreateRequest),
            'catalog_product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}catalog_product_groups`], `${keyPrefix}catalog_product_groups`, BulkUpsertRequestCreateCatalogProductGroupsItems),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordsRequest),
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelBulkCreateRequest),
            'product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_groups`], `${keyPrefix}product_groups`, ProductGroupPromotionCreateRequest),
            'schedules': utils.childMapping(bundle.inputData?.[`${keyPrefix}schedules`], `${keyPrefix}schedules`, ScheduleCreateRequest),
        }
    },
}
