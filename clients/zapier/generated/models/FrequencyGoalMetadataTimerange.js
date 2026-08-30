const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'THIRTY_DAY',
                    'DAY',
                    'SEVEN_DAY',
                    'TWENTY_MINUTE',
                    'TEN_MINUTE',
                    'TWENTY_FOUR_HOUR',
                ],
            }
        )
    }
