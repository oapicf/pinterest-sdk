const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ingested_videos`,
                label: `The number of videos successfully ingested from the feed file. - [${labelPrefix}ingested_videos]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}not_ingested_videos`,
                label: `The number of videos that were not ingested from the feed file. - [${labelPrefix}not_ingested_videos]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total_videos`,
                label: `The number of videos in the feed file. - [${labelPrefix}total_videos]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ingested_videos': bundle.inputData?.[`${keyPrefix}ingested_videos`],
            'not_ingested_videos': bundle.inputData?.[`${keyPrefix}not_ingested_videos`],
            'total_videos': bundle.inputData?.[`${keyPrefix}total_videos`],
        }
    },
}
