const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Budget duration type for delivery estimates. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'FIXED_DAILY',
                    'FLEXIBLE_DAILY',
                    'LIFETIME',
                ],
            }
        )
    }
