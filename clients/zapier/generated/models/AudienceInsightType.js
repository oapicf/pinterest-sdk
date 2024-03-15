const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'YOUR_TOTAL_AUDIENCE',
                    'YOUR_ENGAGED_AUDIENCE',
                    'PINTEREST_TOTAL_AUDIENCE',
                ],
            }
        )
    }
