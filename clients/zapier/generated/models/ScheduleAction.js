const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The schedule action - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'INCREASE_BY_VALUE',
                    'INCREASE_BY_PERCENT',
                ],
            }
        )
    }
