const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The type of token to revoke. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'access_token',
                    'refresh_token',
                ],
            }
        )
    }
