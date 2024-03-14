const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `User list operation type (add or remove) - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ADD',
                    'REMOVE',
                ],
            }
        )
    }
