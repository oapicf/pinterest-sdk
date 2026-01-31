const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'REGULAR',
                    'VIDEO',
                    'SHOPPING',
                    'CAROUSEL',
                    'MAX_VIDEO',
                    'SHOP_THE_PIN',
                    'COLLECTION',
                    'IDEA',
                    'SHOWCASE',
                    'QUIZ',
                    'COLLAGE',
                    'MAX_WIDTH_REGULAR_COLLECTION',
                    'MAX_WIDTH_VIDEO_COLLECTION',
                ],
            }
        )
    }
