const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Reporting columns for sync reporting data filter - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SPEND_IN_DOLLAR',
                    'TOTAL_IMPRESSION',
                ],
            }
        )
    }
