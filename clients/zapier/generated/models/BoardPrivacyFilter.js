const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'ALL',
                    'PUBLIC',
                    'PROTECTED',
                    'SECRET',
                    'PUBLIC_AND_SECRET',
                ],
            }
        )
    }
