const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The type of OAuth grant being requested. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'authorization_code',
                    'refresh_token',
                    'client_credentials',
                ],
            }
        )
    }
