const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The field to sort member assets by - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NAME',
                    'ID',
                    'PERMISSIONS',
                ],
            }
        )
    }
