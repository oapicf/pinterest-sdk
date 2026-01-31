const samples = require('../samples/MediaApi');
const Media = require('../models/Media');
const MediaUpload = require('../models/MediaUpload');
const MediaUploadCreate = require('../models/MediaUploadCreate');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const media_list_200_response = require('../models/media_list_200_response');
const utils = require('../utils/utils');

module.exports = {
    media/create: {
        key: 'media/create',
        noun: 'media',
        display: {
            label: 'Register media upload',
            description: 'Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.',
            hidden: false,
        },
        operation: {
            inputFields: [
                ...MediaUploadCreate.fields(),
            ],
            outputFields: [
                ...MediaUpload.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/media'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                        ...MediaUploadCreate.mapping(bundle),
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'media/create', response.json);
                    return results;
                })
            },
            sample: samples['MediaUploadSample']samples['MediaUploadSample']
        }
    },
    media/get: {
        key: 'media/get',
        noun: 'media',
        display: {
            label: 'Get media upload details',
            description: 'Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'media_id',
                    label: 'Unique identifier for this media upload. Used to track status and for attaching during Pin creation.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Media.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/media/{media_id}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'media/get', response.json);
                    return results;
                })
            },
            sample: samples['MediaSample']
        }
    },
    media/list: {
        key: 'media/list',
        noun: 'media',
        display: {
            label: 'List media uploads',
            description: 'List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.',
            hidden: false,
        },
        operation: {
            inputFields: [
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
                ...media_list_200_response.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.pinterest.com/v5/media'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'media/list', response.json);
                    return results;
                })
            },
            sample: samples['media_list_200_responseSample']
        }
    },
}
