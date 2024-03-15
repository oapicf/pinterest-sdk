const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. - [${key.replaceAll('__', '.')}]`,
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
                ],
            }
        )
    }
