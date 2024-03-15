<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdsCreditRedeemRequest
{
    /**
     * Takes in a SHA256 hash of the offerCode.
     * @DTA\Data(field="offerCodeHash")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[a-z0-9]*$/"})
     */
    public ?string $offer_code_hash = null;

    /**
     * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
     * @DTA\Data(field="validateOnly")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $validate_only = null;

}
