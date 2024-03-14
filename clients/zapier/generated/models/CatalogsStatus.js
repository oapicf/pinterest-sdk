const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ACTIVE',
                    'INACTIVE',
                ],
            }
        )
    }
