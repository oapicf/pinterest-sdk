const utils = require('../utils/utils');
const CatalogsAiContentDisclosureLabel = require('../models/CatalogsAiContentDisclosureLabel');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}disclosure`,
                list: true,
                type: 'string',
                ...CatalogsAiContentDisclosureLabel.fields(`${keyPrefix}disclosure`, isInput),
            },
            {
                key: `${keyPrefix}url`,
                label: `URL of the asset. Must match one of image_link, additional_image_link, or video_link. - [${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'disclosure': utils.childMapping(bundle.inputData?.[`${keyPrefix}disclosure`], `${keyPrefix}disclosure`, CatalogsAiContentDisclosureLabel),
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
