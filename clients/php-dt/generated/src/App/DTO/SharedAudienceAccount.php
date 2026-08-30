<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SharedAudienceAccount
{
    /**
     * Account ID (ad account or business ID).
     * @DTA\Data(field="account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $account_id = null;

    /**
     * Account name.
     * @DTA\Data(field="account_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $account_name = null;

    /**
     * account type
     * @DTA\Data(field="account_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AudienceAccountType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AudienceAccountType::class})
     */
    public ?\App\DTO\AudienceAccountType $account_type = null;

    /**
     * Epoch timestamp in seconds for the shared audience event
     * @DTA\Data(field="shared_on_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $shared_on_timestamp = null;

}
