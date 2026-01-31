const utils = require('../utils/utils');
const ContentType = require('../models/ContentType');
const PinMediaSourceImageBase64 = require('../models/PinMediaSourceImageBase64');
const PinMediaSourceImageURL = require('../models/PinMediaSourceImageURL');
const PinMediaSourceImagesBase64 = require('../models/PinMediaSourceImagesBase64');
const PinMediaSourceImagesURL = require('../models/PinMediaSourceImagesURL');
const PinMediaSourceImagesURLItem = require('../models/PinMediaSourceImagesURLItem');
const PinMediaSourcePinURL = require('../models/PinMediaSourcePinURL');
const PinMediaSourceVideoID = require('../models/PinMediaSourceVideoID');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content_type`,
                ...ContentType.fields(`${keyPrefix}content_type`, isInput),
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
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'pin_url',
                ],
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_content_type`,
                ...ContentType.fields(`${keyPrefix}cover_image_content_type`, isInput),
            },
            {
                key: `${keyPrefix}cover_image_data`,
                label: `Cover image Base64. - [${labelPrefix}cover_image_data]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_key_frame_time`,
                label: `Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. - [${labelPrefix}cover_image_key_frame_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cover_image_url`,
                label: `Cover image URL. - [${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_id`,
                label: `[${labelPrefix}media_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: PinMediaSourceImagesURLItem.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
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
            'content_type': bundle.inputData?.[`${keyPrefix}content_type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'cover_image_content_type': bundle.inputData?.[`${keyPrefix}cover_image_content_type`],
            'cover_image_data': bundle.inputData?.[`${keyPrefix}cover_image_data`],
            'cover_image_key_frame_time': bundle.inputData?.[`${keyPrefix}cover_image_key_frame_time`],
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, PinMediaSourceImagesURLItem),
            'is_affiliate_link': bundle.inputData?.[`${keyPrefix}is_affiliate_link`],
        }
    },
}
