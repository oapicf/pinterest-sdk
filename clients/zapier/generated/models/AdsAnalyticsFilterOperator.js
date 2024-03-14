const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Filter operator for sync reporting - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'LESS_THAN',
                    'GREATER_THAN',
                ],
            }
        )
    }
