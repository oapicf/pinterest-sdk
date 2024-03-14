const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Media upload status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'registered',
                    'processing',
                    'succeeded',
                    'failed',
                ],
            }
        )
    }
