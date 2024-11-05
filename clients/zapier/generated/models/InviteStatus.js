const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The current status of the invite. - [${key.replaceAll('__', '.')}]`,
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
