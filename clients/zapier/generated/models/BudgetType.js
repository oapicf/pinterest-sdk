const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DAILY',
                    'LIFETIME',
                    'CBO_ADGROUP',
                ],
            }
        )
    }
