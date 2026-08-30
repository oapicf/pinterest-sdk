const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Account type filter for audience sharing. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'AD_ACCOUNT',
                    'BUSINESS_ACCOUNT',
                ],
            }
        )
    }
