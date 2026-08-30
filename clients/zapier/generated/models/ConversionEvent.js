const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'PAGE_VISIT',
                    'SIGNUP',
                    'CHECKOUT',
                    'CUSTOM',
                    'VIEW_CATEGORY',
                    'SEARCH',
                    'ADD_TO_CART',
                    'WATCH_VIDEO',
                    'LEAD',
                    'APP_INSTALL',
                ],
            }
        )
    }
