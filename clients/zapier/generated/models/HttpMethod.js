const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `HTTP request method. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'GET',
                    'HEAD',
                    'POST',
                    'PUT',
                    'DELETE',
                    'CONNECT',
                    'OPTIONS',
                    'TRACE',
                    'PATCH',
                ],
            }
        )
    }
