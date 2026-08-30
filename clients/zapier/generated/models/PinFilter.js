const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'exclude_native',
                    'exclude_repins',
                    'has_been_promoted',
                ],
            }
        )
    }
