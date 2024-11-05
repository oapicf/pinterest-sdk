const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Operation type to share a specific audience or revoke access to a previously shared audience - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'SHARE',
                    'REVOKE',
                ],
            }
        )
    }
