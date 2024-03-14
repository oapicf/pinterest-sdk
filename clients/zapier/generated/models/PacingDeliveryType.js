const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad group pacing delivery type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'STANDARD',
                    'ACCELERATED',
                ],
            }
        )
    }
