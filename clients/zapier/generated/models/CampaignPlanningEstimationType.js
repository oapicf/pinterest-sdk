const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Estimation type for campaign planning estimated curve - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'IMPRESSION',
                    'CLICK',
                    'CONVERSION',
                    'WEEKLY_FREQUENCY',
                    'WEEKLY_REACH',
                    'LIFETIME_FREQUENCY',
                    'LIFETIME_REACH',
                    'CPM',
                    'CPC',
                    'CPA',
                ],
            }
        )
    }
