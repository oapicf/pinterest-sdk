const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The operation performed by the batch - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UPDATE',
                    'CREATE',
                    'DELETE_DISCONTINUED',
                ],
            }
        )
    }
