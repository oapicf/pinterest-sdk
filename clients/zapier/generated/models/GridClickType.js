const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Where a user is taken after clicking on an ad in grid. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'CLOSEUP',
                    'DIRECT_TO_DESTINATION',
                ],
            }
        )
    }
