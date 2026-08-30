const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'PROCESSING',
                    'READY',
                    'TOO_SMALL',
                    'UPLOADING',
                ],
            }
        )
    }
