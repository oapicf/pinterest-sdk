const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The time window for frequency bid multipliers. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'WEEK',
                    'MONTH',
                    '',
                ],
            }
        )
    }
