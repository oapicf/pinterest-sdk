const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Reason for a confidence level alert on delivery estimates. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UNKNOWN',
                    'OTHER',
                    'ADVERTISER_HAS_NO_RECENT_CAMPAIGNS',
                    'ADVERTISER_HAS_NO_RECENT_CONVERSIONS',
                ],
            }
        )
    }
