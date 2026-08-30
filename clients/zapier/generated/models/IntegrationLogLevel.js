const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Log level type for integration applications. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'INFO',
                    'WARN',
                    'ERROR',
                ],
            }
        )
    }
