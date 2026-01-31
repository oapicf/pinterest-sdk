const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PINTEREST_TIME_ZONE',
                    'AD_ACCOUNT_TIME_ZONE',
                ],
            }
        )
    }
