const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'REGULAR',
                    'VIDEO',
                    'SHOPPING',
                    'CAROUSEL',
                    'MAX_VIDEO',
                    'SHOP_THE_PIN',
                    'COLLECTION',
                    'IDEA',
                ],
            }
        )
    }
