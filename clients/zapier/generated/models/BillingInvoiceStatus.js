const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The status of a billing invoice. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OPEN',
                    'CLOSED',
                ],
            }
        )
    }
