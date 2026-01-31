const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    '90',
                    '180',
                    '365',
                    '730',
                ],
            }
        )
    }
