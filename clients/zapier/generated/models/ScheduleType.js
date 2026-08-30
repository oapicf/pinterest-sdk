const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The schedule type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CAMPAIGN_BUDGET_CHANGE',
                    'CAMPAIGN_BID_MULTIPLIERS',
                ],
            }
        )
    }
