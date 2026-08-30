const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Ad review status - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'OTHER',
                    'PENDING',
                    'REJECTED',
                    'APPROVED',
                ],
            }
        )
    }
