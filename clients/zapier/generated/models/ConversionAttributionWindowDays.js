const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    '0',
                    '1',
                    '7',
                    '14',
                    '30',
                    '60',
                ],
            }
        )
    }
