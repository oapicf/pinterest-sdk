const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}link`,
                label: `<p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p> - [${labelPrefix}link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tag`,
                label: `Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image - [${labelPrefix}tag]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'tag': bundle.inputData?.[`${keyPrefix}tag`],
        }
    },
}
