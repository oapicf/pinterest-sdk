const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'FEMALE',
                    'MALE',
                    'UNISEX',
                ],
            }
        )
    }
