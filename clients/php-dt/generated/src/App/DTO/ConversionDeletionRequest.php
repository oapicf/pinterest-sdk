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
     */
    public ?\DateTimeInterface $created_time = null;

    /**
     * Timestamp when the conversion deletion request was processed.
     * @DTA\Data(field="processed_time", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $processed_time = null;

    /**
     * Unique identifier of the conversion deletion request
     * @DTA\Data(field="request_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":18})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $request_id = null;

    /**
     * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionDeletionRequestStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionDeletionRequestStatus::class})
     */
    public ?\App\DTO\ConversionDeletionRequestStatus $status = null;

}
