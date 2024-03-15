const utils = require('../utils/utils');
const PinMediaSourceImageBase64 = require('../models/PinMediaSourceImageBase64');
const PinMediaSourceImageURL = require('../models/PinMediaSourceImageURL');
const PinMediaSourceImagesBase64 = require('../models/PinMediaSourceImagesBase64');
const PinMediaSourceImagesURL = require('../models/PinMediaSourceImagesURL');
const PinMediaSourceImagesURL_items_inner = require('../models/PinMediaSourceImagesURL_items_inner');
const PinMediaSourcePinURL = require('../models/PinMediaSourcePinURL');
const PinMediaSourceVideoID = require('../models/PinMediaSourceVideoID');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'pin_url',
                ],
            },
            {
                key: `${keyPrefix}content_type`,
                label: `[${labelPrefix}content_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image/jpeg',
                    'image/png',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_url`,
                label: `Cover image url. - [${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_content_type`,
                label: `Content type for cover image Base64. - [${labelPrefix}cover_image_content_type]`,
                type: 'string',
                choices: [
                    'image/jpeg',
                    'image/png',
                ],
            },
            {
                key: `${keyPrefix}cover_image_data`,
                label: `Cover image Base64. - [${labelPrefix}cover_image_data]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_id`,
                label: `[${labelPrefix}media_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: PinMediaSourceImagesURL_items_inner.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_affiliate_link`,
                label: `This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. - [${labelPrefix}is_affiliate_link]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'content_type': bundle.inputData?.[`${keyPrefix}content_type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'cover_image_content_type': bundle.inputData?.[`${keyPrefix}cover_image_content_type`],
            'cover_image_data': bundle.inputData?.[`${keyPrefix}cover_image_data`],
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, PinMediaSourceImagesURL_items_inner),
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'is_affiliate_link': bundle.inputData?.[`${keyPrefix}is_affiliate_link`],
        }
    },
}
