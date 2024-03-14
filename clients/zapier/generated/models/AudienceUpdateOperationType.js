const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Audience operation type (update or remove). - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'UPDATE',
                    'REMOVE',
                ],
            }
        )
    }
