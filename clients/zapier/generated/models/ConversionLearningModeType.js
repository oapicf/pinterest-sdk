const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `oCPM learn mode. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NOT_ACTIVE',
                    'ACTIVE',
                    '',
                ],
            }
        )
    }
