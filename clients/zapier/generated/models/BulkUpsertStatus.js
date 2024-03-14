const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'RUNNING',
                    'SUCCEEDED',
                    'FAILED',
                ],
            }
        )
    }
