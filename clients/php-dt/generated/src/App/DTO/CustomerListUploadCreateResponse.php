<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomerListUploadCreateResponse
{
    /**
     * The Customer List Upload created.
     * @DTA\Data(field="customer_list_upload")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CustomerListUpload::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CustomerListUpload::class})
     */
    public ?\App\DTO\CustomerListUpload $customer_list_upload = null;

    /**
     * Pre-signed upload URLs corresponding to each part of the upload.
     * @DTA\Data(field="s3_multipart_upload_data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\S3MultipartUploadData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\S3MultipartUploadData::class})
     */
    public ?\App\DTO\S3MultipartUploadData $s3_multipart_upload_data = null;

}
