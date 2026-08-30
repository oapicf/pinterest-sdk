const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `Field by which to sort billing invoices. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'DUE_DATE',
                    'BILLING_PERIOD',
                    'DOCUMENT_TYPE',
                    'TOTAL_AMOUNT',
                    'INVOICE_NUMBER',
                ],
            }
        )
    }
