const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `[${key.replaceAll('__', '.')}]`,
                choices: [
                    'NONE',
                    'ID',
                    'SIZE',
                    'CREATION_DATE',
                    'UPDATED_TIME',
                    'NAME',
                    'STATUS',
                    'TYPE',
                ],
            }
        )
    }
