const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Indicate targeting template is active or Deleted - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'DELETED',
                ],
            }
        )
    }
