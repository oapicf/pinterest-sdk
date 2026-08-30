const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The type of an SSIO order line. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'BUDGET',
                    'PERPETUALS',
                ],
            }
        )
    }
