const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Conversion report time type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'TIME_OF_AD_ACTION',
                    'TIME_OF_CONVERSION',
                ],
            }
        )
    }
