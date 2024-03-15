const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Whether the data is owned by the partner (1p) or by the data provider (3p) - [${key.replaceAll('__', '.')}]`,
                choices: [
                    '1p',
                    '3p',
                ],
            }
        )
    }
