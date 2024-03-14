const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    '1',
                    '7',
                    '30',
                    '60',
                ],
            }
        )
    }
