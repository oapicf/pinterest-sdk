const utils = require('../utils/utils');
const AdGroupUpdateRequest = require('../models/AdGroupUpdateRequest');
const AdUpdateRequest = require('../models/AdUpdateRequest');
const BulkUpsertRequestUpdateCatalogProductGroupsItems = require('../models/BulkUpsertRequestUpdateCatalogProductGroupsItems');
const CampaignUpdateRequest = require('../models/CampaignUpdateRequest');
const KeywordUpdateGenerated = require('../models/KeywordUpdateGenerated');
const LabelBulkUpdateRequest = require('../models/LabelBulkUpdateRequest');
const ProductGroupPromotionUpdateRequest = require('../models/ProductGroupPromotionUpdateRequest');
const ScheduleUpdateRequest = require('../models/ScheduleUpdateRequest');

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
                children: BulkUpsertRequestUpdateCatalogProductGroupsItems.fields(`${keyPrefix}catalog_product_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: KeywordUpdateGenerated.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
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
            {
                key: `${keyPrefix}schedules`,
                label: `[${labelPrefix}schedules]`,
                children: ScheduleUpdateRequest.fields(`${keyPrefix}schedules${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_groups`], `${keyPrefix}ad_groups`, AdGroupUpdateRequest),
            'ads': utils.childMapping(bundle.inputData?.[`${keyPrefix}ads`], `${keyPrefix}ads`, AdUpdateRequest),
            'campaigns': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaigns`], `${keyPrefix}campaigns`, CampaignUpdateRequest),
            'catalog_product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}catalog_product_groups`], `${keyPrefix}catalog_product_groups`, BulkUpsertRequestUpdateCatalogProductGroupsItems),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, KeywordUpdateGenerated),
            'labels': utils.childMapping(bundle.inputData?.[`${keyPrefix}labels`], `${keyPrefix}labels`, LabelBulkUpdateRequest),
            'product_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_groups`], `${keyPrefix}product_groups`, ProductGroupPromotionUpdateRequest),
            'schedules': utils.childMapping(bundle.inputData?.[`${keyPrefix}schedules`], `${keyPrefix}schedules`, ScheduleUpdateRequest),
        }
    },
}
