const utils = require('../utils/utils');
const CatalogsAiContentDisclosure = require('../models/CatalogsAiContentDisclosure');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}android_deep_link`,
                label: `Link to the creative assets page. - [${labelPrefix}android_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_0`,
                label: `Custom grouping of creative assets. - [${labelPrefix}custom_label_0]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_1`,
                label: `Custom grouping of creative assets. - [${labelPrefix}custom_label_1]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_2`,
                label: `Custom grouping of creative assets. - [${labelPrefix}custom_label_2]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_3`,
                label: `Custom grouping of creative assets. - [${labelPrefix}custom_label_3]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_4`,
                label: `Custom grouping of creative assets. - [${labelPrefix}custom_label_4]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Brief description of the creative assets. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category`,
                label: `The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. - [${labelPrefix}google_product_category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ios_deep_link`,
                label: `IOS deep link to the creative assets page. - [${labelPrefix}ios_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `Link to the creative assets page. - [${labelPrefix}link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `The name of the creative assets. - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}visibility`,
                label: `Visibility of the creative assets. Must be one of the following values (upper or lowercase): 'visible', 'hidden'. - [${labelPrefix}visibility]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ai_disclosures`,
                label: `[${labelPrefix}ai_disclosures]`,
                children: CatalogsAiContentDisclosure.fields(`${keyPrefix}ai_disclosures${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}image_link`,
                label: `The creative assets image. - [${labelPrefix}image_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}video_link`,
                label: `The creative assets video. - [${labelPrefix}video_link]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'android_deep_link': bundle.inputData?.[`${keyPrefix}android_deep_link`],
            'custom_label_0': bundle.inputData?.[`${keyPrefix}custom_label_0`],
            'custom_label_1': bundle.inputData?.[`${keyPrefix}custom_label_1`],
            'custom_label_2': bundle.inputData?.[`${keyPrefix}custom_label_2`],
            'custom_label_3': bundle.inputData?.[`${keyPrefix}custom_label_3`],
            'custom_label_4': bundle.inputData?.[`${keyPrefix}custom_label_4`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'google_product_category': bundle.inputData?.[`${keyPrefix}google_product_category`],
            'ios_deep_link': bundle.inputData?.[`${keyPrefix}ios_deep_link`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'visibility': bundle.inputData?.[`${keyPrefix}visibility`],
            'ai_disclosures': utils.childMapping(bundle.inputData?.[`${keyPrefix}ai_disclosures`], `${keyPrefix}ai_disclosures`, CatalogsAiContentDisclosure),
            'image_link': bundle.inputData?.[`${keyPrefix}image_link`],
            'video_link': bundle.inputData?.[`${keyPrefix}video_link`],
        }
    },
}
