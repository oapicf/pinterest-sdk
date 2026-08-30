const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The current status of an invite or request. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PENDING',
                    'ACCEPTED',
                    'DECLINED',
                    'CANCELLED',
                    'EXPIRED',
                ],
            }
        )
    }
