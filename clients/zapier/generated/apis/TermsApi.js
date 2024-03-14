const samples = require('../samples/TermsApi');
const Error = require('../models/Error');
const RelatedTerms = require('../models/RelatedTerms');
const utils = require('../utils/utils');

module.exports = {
    termsRelated/list: {
        key: 'termsRelated/list',
        noun: 'terms',
        display: {
            label: 'List related terms',
            description: 'Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'terms',
                    label: 'List of input terms.',
                    type: 'string',
                }
            ],
            outputFields: [
                ...RelatedTerms.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/terms/related'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'terms': bundle.inputData?.['terms'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['RelatedTermsSample']
        }
    },
    termsSuggested/list: {
        key: 'termsSuggested/list',
        noun: 'terms',
        display: {
            label: 'List suggested terms',
            description: 'Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'term',
                    label: 'Input term.',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'limit',
                    label: 'Max suggested terms to return.',
                    type: 'integer',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/terms/suggested'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'term': bundle.inputData?.['term'],
                        'limit': bundle.inputData?.['limit'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}
