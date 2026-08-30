<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomerListUpload
{
    /**
     * Advertiser ID.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * Customer List Upload creation_time. Epoch (seconds).
     * @DTA\Data(field="creation_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $creation_time = null;

    /**
     * ID of the customer list associated with this upload.
     * @DTA\Data(field="customer_list_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $customer_list_id = null;

    /**
     * Error counts by error code
     * @DTA\Data(field="error_counts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection192::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection192::class})
     */
    public ?\App\DTO\Collection192 $error_counts = null;

    /**
     * Customer List Upload ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":18})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListOperationType::class})
     */
    public ?\App\DTO\UserListOperationType $operation = null;

    /**
     * Record processing counts
     * @DTA\Data(field="record_counts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RecordCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RecordCounts::class})
     */
    public ?\App\DTO\RecordCounts $record_counts = null;

    /**
     * @DTA\Data(field="state")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WorkloadState::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WorkloadState::class})
     */
    public ?\App\DTO\WorkloadState $state = null;

    /**
     * Customer List Upload updated_time. Epoch (seconds).
     * @DTA\Data(field="updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

}
