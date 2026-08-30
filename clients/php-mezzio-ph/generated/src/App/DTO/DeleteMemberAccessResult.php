<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The terminated asset access.
 */
class DeleteMemberAccessResult
{
    /**
     * Unique identifier of the business asset.
     * @DTA\Data(field="asset_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $asset_id;

    /**
     * Unique identifier of the business member.
     * @DTA\Data(field="member_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $member_id;

}
