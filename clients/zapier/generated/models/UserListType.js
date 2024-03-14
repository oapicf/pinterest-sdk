const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `User list type - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'EMAIL',
                    'IDFA',
                    'MAID',
                    'LR_ID',
                    'DLX_ID',
                    'HASHED_PINNER_ID',
                ],
            }
        )
    }
