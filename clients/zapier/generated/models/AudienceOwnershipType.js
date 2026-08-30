const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Filter audiences by ownership type. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OWNED',
                    'RECEIVED',
                ],
            }
        )
    }
