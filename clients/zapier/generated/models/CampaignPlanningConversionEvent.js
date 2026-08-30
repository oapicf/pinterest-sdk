const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Conversion event for which a conversion rate estimate is computed. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SIGNUP',
                    'CHECKOUT',
                    'ADD_TO_CART',
                    'LEAD',
                ],
            }
        )
    }
