const samples = require('../samples/LeadsExportApi');
const Error = require('../models/Error');
const LeadsExportCreateRequest = require('../models/LeadsExportCreateRequest');
const LeadsExportCreateResponse = require('../models/LeadsExportCreateResponse');
const LeadsExportResponseData = require('../models/LeadsExportResponseData');
const utils = require('../utils/utils');

module.exports = {
    leadsExport/create: {
        key: 'leadsExport/create',
        noun: 'leads_export',
        display: {
            label: 'Create a request to export leads collected from a lead ad',
            description: '&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.',
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
                ...LeadsExportCreateRequest.fields(),
            ],
            outputFields: [
                ...LeadsExportCreateResponse.fields('', false),
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
                        ...LeadsExportCreateRequest.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'leadsExport/create', response.json);
                    return results;
                })
            },
            sample: samples['LeadsExportCreateResponseSample']
        }
    },
    leadsExport/get: {
        key: 'leadsExport/get',
        noun: 'leads_export',
        display: {
            label: 'Get the lead export from the lead export create call',
            description: '&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.',
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
