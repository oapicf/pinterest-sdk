const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'AD_ACCOUNT',
                    'BUSINESS_ACCOUNT',
                ],
            }
        )
    }
