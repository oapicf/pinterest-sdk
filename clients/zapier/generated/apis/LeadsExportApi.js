const samples = require('../samples/LeadsExportApi');
const LeadsExportResponseData = require('../models/LeadsExportResponseData');
const LeadsExports = require('../models/LeadsExports');
const LeadsExportsCreate = require('../models/LeadsExportsCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const utils = require('../utils/utils');

module.exports = {
    leadsExport/create: {
        key: 'leadsExport/create',
        noun: 'leads_export',
        display: {
            label: 'Create a request to export leads collected from a lead ad',
            description: '**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).',
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
                ...LeadsExportsCreate.fields(),
            ],
            outputFields: [
                ...LeadsExports.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/leads_export'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...LeadsExportsCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadsExport/create', response.json);
                    return results;
                })
            },
            sample: samples['LeadsExportsSample']samples['LeadsExportsSample']
        }
    },
    leadsExport/get: {
        key: 'leadsExport/get',
        noun: 'leads_export',
        display: {
            label: 'Get the lead export from the lead export create call',
            description: '**This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).',
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
                    key: 'leads_export_id',
                    label: 'lead_export_id token returned from the create a lead export endpoint',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...LeadsExportResponseData.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadsExport/get', response.json);
                    return results;
                })
            },
            sample: samples['LeadsExportResponseDataSample']
        }
    },
}
