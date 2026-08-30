const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The source of conversion events ingestion - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'ADS_API',
                    'ADS_MANAGER_REPORTING_PAGE',
                    'ADS_MANAGER_REPORT_BUILDER',
                ],
            }
        )
    }
