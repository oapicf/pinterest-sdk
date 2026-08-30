const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'GREATER_THAN',
                    'GREATER_THAN_OR_EQUALS',
                    'LESS_THAN',
                    'LESS_THAN_OR_EQUALS',
                ],
            }
        )
    }
