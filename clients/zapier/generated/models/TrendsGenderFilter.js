const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Gender category for trends demographic distribution. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'male',
                    'female',
                    'unknown',
                ],
            }
        )
    }
