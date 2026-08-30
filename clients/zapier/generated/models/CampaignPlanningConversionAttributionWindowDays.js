const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Conversion attribution window in days. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DAYS_0',
                    'DAYS_1',
                    'DAYS_7',
                    'DAYS_30',
                    'DAYS_60',
                ],
            }
        )
    }
