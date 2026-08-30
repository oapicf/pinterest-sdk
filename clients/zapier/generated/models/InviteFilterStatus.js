const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Invite statuses used for filters. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PENDING',
                    'EXPIRED',
                ],
            }
        )
    }
