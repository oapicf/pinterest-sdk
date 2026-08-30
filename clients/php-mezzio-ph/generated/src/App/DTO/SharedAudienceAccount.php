<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SharedAudienceAccount
{
    /**
     * Account ID (ad account or business ID).
     * @DTA\Data(field="account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $account_id;

    /**
     * Account name.
     * @DTA\Data(field="account_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $account_name;

    /**
     * account type
     * @DTA\Data(field="account_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceAccountType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceAccountType::class})
     * @var \App\DTO\AudienceAccountType|null
     */
    public $account_type;

    /**
     * Epoch timestamp in seconds for the shared audience event
     * @DTA\Data(field="shared_on_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shared_on_timestamp;

}
