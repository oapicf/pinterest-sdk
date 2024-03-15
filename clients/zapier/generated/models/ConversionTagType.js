const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `conversion tag type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PAGE_LOAD',
                    'UNKNOWN',
                    'INITIALIZED',
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
                    'WEB_SESSION',
                    'EXTERNAL_MEASUREMENT',
                ],
            }
        )
    }
