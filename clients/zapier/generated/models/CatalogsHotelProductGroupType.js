const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `<p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'MERCHANT_CREATED',
                    'ALL_LISTINGS',
                ],
            }
        )
    }
