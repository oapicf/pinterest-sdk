const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The field to search member assets by - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'NAME',
                    'ID',
                    'NAME_OR_ID',
                    'OWNER_NAME',
                    'NAME_OR_OWNER',
                ],
            }
        )
    }
