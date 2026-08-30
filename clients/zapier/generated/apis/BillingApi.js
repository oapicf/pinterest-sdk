const samples = require('../samples/BillingApi');
const AdsCreditRedeem = require('../models/AdsCreditRedeem');
const AdsCreditRedeemCreate = require('../models/AdsCreditRedeemCreate');
const BillingInvoiceDocumentType = require('../models/BillingInvoiceDocumentType');
const BillingInvoiceDownloadResponse = require('../models/BillingInvoiceDownloadResponse');
const BillingInvoiceSortField = require('../models/BillingInvoiceSortField');
const BillingInvoiceStatus = require('../models/BillingInvoiceStatus');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const Pinterest.Lib.PaginationOrder = require('../models/Pinterest.Lib.PaginationOrder');
const SSIOAccount = require('../models/SSIOAccount');
const SSIOInsertionOrder = require('../models/SSIOInsertionOrder');
const SSIOInsertionOrderCreate = require('../models/SSIOInsertionOrderCreate');
const SSIOInsertionOrderStatusResponse = require('../models/SSIOInsertionOrderStatusResponse');
const SSIOInsertionOrderUpdate = require('../models/SSIOInsertionOrderUpdate');
const ads_credits_discounts_get_200_response = require('../models/ads_credits_discounts_get_200_response');
const billing_invoices_get_200_response = require('../models/billing_invoices_get_200_response');
const billing_profiles_get_200_response = require('../models/billing_profiles_get_200_response');
const ssio_insertion_orders_status_get_by_ad_account_200_response = require('../models/ssio_insertion_orders_status_get_by_ad_account_200_response');
const ssio_order_lines_get_by_ad_account_200_response = require('../models/ssio_order_lines_get_by_ad_account_200_response');
const utils = require('../utils/utils');

module.exports = {
    adsCredit/redeem: {
        key: 'adsCredit/redeem',
        noun: 'billing',
        display: {
            label: 'Redeem ad credits',
            description: 'Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                ...AdsCreditRedeemCreate.fields(),
            ],
            outputFields: [
                ...AdsCreditRedeem.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads_credit/redeem'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...AdsCreditRedeemCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adsCredit/redeem', response.json);
                    return results;
                })
            },
            sample: samples['AdsCreditRedeemSample']samples['AdsCreditRedeemSample']
        }
    },
    adsCreditsDiscounts/get: {
        key: 'adsCreditsDiscounts/get',
        noun: 'billing',
        display: {
            label: 'Get ads credit discounts',
            description: 'Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ads_credits_discounts_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ads_credit/discounts'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'adsCreditsDiscounts/get', response.json);
                    return results;
                })
            },
            sample: samples['ads_credits_discounts_get_200_responseSample']
        }
    },
    billingInvoiceDownload/get: {
        key: 'billingInvoiceDownload/get',
        noun: 'billing',
        display: {
            label: 'Get download url for a billing invoice',
            description: 'Get download url for a billing invoice.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'billing_invoice_id',
                    label: 'Unique identifier of a billing invoice.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...BillingInvoiceDownloadResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'billingInvoiceDownload/get', response.json);
                    return results;
                })
            },
            sample: samples['BillingInvoiceDownloadResponseSample']
        }
    },
    billingInvoices/get: {
        key: 'billingInvoices/get',
        noun: 'billing',
        display: {
            label: 'Get billing invoices',
            description: 'Get billing invoices in the advertiser account.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
                ....fields(),
                ....fields(),
                ....fields(),
                ....fields(),
                {
                    key: 'start_due_date',
                    label: 'Starting point for due dates when searching for invoices. Format: YYYY-MM-DD',
                    type: 'string',
                },
                {
                    key: 'end_due_date',
                    label: 'Ending point for due dates when searching for invoices. Format: YYYY-MM-DD',
                    type: 'string',
                },
            ],
            outputFields: [
                ...billing_invoices_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/billing_invoices'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                        'order': bundle.inputData?.['order'],
                        'sort': bundle.inputData?.['sort'],
                        'status': bundle.inputData?.['status'],
                        'document_type': bundle.inputData?.['document_type'],
                        'start_due_date': bundle.inputData?.['start_due_date'],
                        'end_due_date': bundle.inputData?.['end_due_date'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'billingInvoices/get', response.json);
                    return results;
                })
            },
            sample: samples['billing_invoices_get_200_responseSample']
        }
    },
    billingProfiles/get: {
        key: 'billingProfiles/get',
        noun: 'billing',
        display: {
            label: 'Get billing profiles',
            description: 'Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'is_active',
                    label: 'Return active billing profiles, if false return all billing profiles.',
                    type: 'boolean',
                    required: true,
                },
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...billing_profiles_get_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/billing_profiles'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'is_active': bundle.inputData?.['is_active'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'billingProfiles/get', response.json);
                    return results;
                })
            },
            sample: samples['billing_profiles_get_200_responseSample']
        }
    },
    ssioAccounts/get: {
        key: 'ssioAccounts/get',
        noun: 'billing',
        display: {
            label: 'Get Salesforce account details including bill-to information.',
            description: '  Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...SSIOAccount.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ssio/accounts'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ssioAccounts/get', response.json);
                    return results;
                })
            },
            sample: samples['SSIOAccountSample']
        }
    },
    ssioInsertionOrder/create: {
        key: 'ssioInsertionOrder/create',
        noun: 'billing',
        display: {
            label: 'Create insertion order through SSIO.',
            description: '  Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                ...SSIOInsertionOrderCreate.fields(),
            ],
            outputFields: [
                ...SSIOInsertionOrder.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SSIOInsertionOrderCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ssioInsertionOrder/create', response.json);
                    return results;
                })
            },
            sample: samples['SSIOInsertionOrderSample']samples['SSIOInsertionOrderSample']
        }
    },
    ssioInsertionOrder/edit: {
        key: 'ssioInsertionOrder/edit',
        noun: 'billing',
        display: {
            label: 'Edit insertion order through SSIO.',
            description: '  Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                ...SSIOInsertionOrderUpdate.fields(),
            ],
            outputFields: [
                ...SSIOInsertionOrder.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders'),
                    method: 'PATCH',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...SSIOInsertionOrderUpdate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ssioInsertionOrder/edit', response.json);
                    return results;
                })
            },
            sample: samples['SSIOInsertionOrderSample']
        }
    },
    ssioInsertionOrdersStatus/getByAdAccount: {
        key: 'ssioInsertionOrdersStatus/getByAdAccount',
        noun: 'billing',
        display: {
            label: 'Get insertion order status by ad account id.',
            description: '  Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ssio_insertion_orders_status_get_by_ad_account_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ssioInsertionOrdersStatus/getByAdAccount', response.json);
                    return results;
                })
            },
            sample: samples['ssio_insertion_orders_status_get_by_ad_account_200_responseSample']
        }
    },
    ssioInsertionOrdersStatus/getByPinOrderId: {
        key: 'ssioInsertionOrdersStatus/getByPinOrderId',
        noun: 'billing',
        display: {
            label: 'Get insertion order status by pin order id.',
            description: '  Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'pin_order_id',
                    label: 'The pin order id associated with the ssio insertion order',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...SSIOInsertionOrderStatusResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ssioInsertionOrdersStatus/getByPinOrderId', response.json);
                    return results;
                })
            },
            sample: samples['SSIOInsertionOrderStatusResponseSample']
        }
    },
    ssioOrderLines/getByAdAccount: {
        key: 'ssioOrderLines/getByAdAccount',
        noun: 'billing',
        display: {
            label: 'Get Salesforce order lines by ad account id.',
            description: '  Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ad_account_id',
                    label: 'Unique identifier of an ad account.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'pin_order_id',
                    label: 'The pin order id associated with the SSIO insertion order',
                    type: 'string',
                },
                {
                    key: 'bookmark',
                    label: 'Cursor used to fetch the next page of items',
                    type: 'string',
                },
                {
                    key: 'page_size',
                    label: 'Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.',
                    type: 'integer',
                },
            ],
            outputFields: [
                ...ssio_order_lines_get_by_ad_account_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/ssio/order_lines'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'pin_order_id': bundle.inputData?.['pin_order_id'],
                        'bookmark': bundle.inputData?.['bookmark'],
                        'page_size': bundle.inputData?.['page_size'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ssioOrderLines/getByAdAccount', response.json);
                    return results;
                })
            },
            sample: samples['ssio_order_lines_get_by_ad_account_200_responseSample']
        }
    },
}
