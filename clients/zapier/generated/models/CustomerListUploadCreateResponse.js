const utils = require('../utils/utils');
const CustomerListUpload = require('../models/CustomerListUpload');
const S3MultipartUploadData = require('../models/S3MultipartUploadData');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CustomerListUpload.fields(`${keyPrefix}customer_list_upload`, isInput),
            ...S3MultipartUploadData.fields(`${keyPrefix}s3_multipart_upload_data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'customer_list_upload': utils.removeIfEmpty(CustomerListUpload.mapping(bundle, `${keyPrefix}customer_list_upload`)),
            's3_multipart_upload_data': utils.removeIfEmpty(S3MultipartUploadData.mapping(bundle, `${keyPrefix}s3_multipart_upload_data`)),
        }
    },
}
