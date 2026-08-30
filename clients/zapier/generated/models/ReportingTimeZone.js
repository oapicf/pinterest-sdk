const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Specify the timezone to be applied for the reporting. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PINTEREST_TIME_ZONE',
                    'AD_ACCOUNT_TIME_ZONE',
                ],
            }
        )
    }
