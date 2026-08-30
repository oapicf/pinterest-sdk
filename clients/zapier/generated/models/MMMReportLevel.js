const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'CAMPAIGN_TARGETING',
                    'AD_GROUP_TARGETING',
                ],
            }
        )
    }
