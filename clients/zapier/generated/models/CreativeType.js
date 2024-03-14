const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad creative type enum - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'REGULAR',
                    'VIDEO',
                    'SHOPPING',
                    'CAROUSEL',
                    'MAX_VIDEO',
                    'SHOP_THE_PIN',
                    'IDEA',
                ],
            }
        )
    }
