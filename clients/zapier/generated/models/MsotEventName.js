const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Type of user conversion event. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'add_to_cart',
                    'checkout',
                    'lead',
                    'signup',
                ],
            }
        )
    }
