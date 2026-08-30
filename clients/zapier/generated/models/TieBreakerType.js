const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Quiz ad tie breaker type, default is RANDOM - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'RANDOM',
                    'CUSTOM',
                ],
            }
        )
    }
