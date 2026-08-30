<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomerList
{
    /**
     * Associated ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $created_time;

    /**
     * Customer list errors.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $exceptions;

    /**
     * Customer list ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
     * @DTA\Data(field="is_nca", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_nca;

    /**
     * Customer list name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
     * @DTA\Data(field="num_batches", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $num_batches;

    /**
     * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
     * @DTA\Data(field="num_removed_user_records", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $num_removed_user_records;

    /**
     * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
     * @DTA\Data(field="num_uploaded_user_records", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $num_uploaded_user_records;

    /**
     * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CustomerListStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CustomerListStatus::class})
     * @var \App\DTO\CustomerListStatus|null
     */
    public $status;

    /**
     * Always &#x60;customerlist&#x60;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $updated_time;

}
