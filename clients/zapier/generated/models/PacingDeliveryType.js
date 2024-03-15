const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'STANDARD',
                    'ACCELERATED',
                ],
            }
        )
    }
