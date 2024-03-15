<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for follow_user/update
 */
class FollowUserUpdateParameterData
{
    /**
     * A valid username
     * @DTA\Data(subset="path", field="username")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/(?!^\d+$)^.+$/"})
     */
    public ?string $username = null;

}
