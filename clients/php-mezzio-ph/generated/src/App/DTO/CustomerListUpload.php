<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomerListUpload
{
    /**
     * Advertiser ID.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Customer List Upload creation_time. Epoch (seconds).
     * @DTA\Data(field="creation_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $creation_time;

    /**
     * ID of the customer list associated with this upload.
     * @DTA\Data(field="customer_list_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $customer_list_id;

    /**
     * Error counts by error code
     * @DTA\Data(field="error_counts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection192::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection192::class})
     * @var \App\DTO\Collection192|null
     */
    public $error_counts;

    /**
     * Customer List Upload ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListOperationType::class})
     * @var \App\DTO\UserListOperationType|null
     */
    public $operation;

    /**
     * Record processing counts
     * @DTA\Data(field="record_counts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RecordCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RecordCounts::class})
     * @var \App\DTO\RecordCounts|null
     */
    public $record_counts;

    /**
     * @DTA\Data(field="state")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WorkloadState::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WorkloadState::class})
     * @var \App\DTO\WorkloadState|null
     */
    public $state;

    /**
     * Customer List Upload updated_time. Epoch (seconds).
     * @DTA\Data(field="updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
