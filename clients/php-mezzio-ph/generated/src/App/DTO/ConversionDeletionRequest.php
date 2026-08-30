<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Conversion deletion request
 */
class ConversionDeletionRequest
{
    /**
     * Timestamp when the conversion deletion request was succesfully created.
     * @DTA\Data(field="created_time")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $created_time;

    /**
     * Timestamp when the conversion deletion request was processed.
     * @DTA\Data(field="processed_time", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $processed_time;

    /**
     * Unique identifier of the conversion deletion request
     * @DTA\Data(field="request_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $request_id;

    /**
     * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionDeletionRequestStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionDeletionRequestStatus::class})
     * @var \App\DTO\ConversionDeletionRequestStatus|null
     */
    public $status;

}
