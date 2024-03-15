const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\". - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UPDATE',
                    'UPSERT',
                    'CREATE',
                    'DELETE_DISCONTINUED',
                    'DELETE',
                ],
            }
        )
    }
