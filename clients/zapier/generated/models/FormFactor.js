const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Device form factor - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'desktop',
                    'laptop',
                    'cellphone',
                    'tablet',
                    'smartwatch',
                    'tv',
                    'vr',
                    'console',
                    'other',
                ],
            }
        )
    }
