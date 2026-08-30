const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Set status to `ARCHIVED` to remove the label from the parent entity. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ARCHIVED',
                ],
            }
        )
    }
