const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'CREATE',
                    'UPDATE',
                    'DELETE',
                ],
            }
        )
    }
