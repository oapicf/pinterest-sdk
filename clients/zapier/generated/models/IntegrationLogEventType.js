const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Log event type for integration applications. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'APP',
                    'API',
                ],
            }
        )
    }
