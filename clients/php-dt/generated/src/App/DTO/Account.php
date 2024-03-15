<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Account
{
    /**
     * Type of account
     * @DTA\Data(field="account_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $account_type = null;

    /**
     * User account ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="profile_image", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $profile_image = null;

    /**
     * @DTA\Data(field="website_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $website_url = null;

    /**
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $username = null;

    /**
     * Profile about description.
     * @DTA\Data(field="about", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $about = null;

    /**
     * @DTA\Data(field="business_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $business_name = null;

    /**
     * User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
     * @DTA\Data(field="board_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $board_count = null;

    /**
     * User account pin count. This includes both created and saved pins.
     * @DTA\Data(field="pin_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pin_count = null;

    /**
     * User account follower count.
     * @DTA\Data(field="follower_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $follower_count = null;

    /**
     * User account following count.
     * @DTA\Data(field="following_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $following_count = null;

    /**
     * User account monthly views.
     * @DTA\Data(field="monthly_views", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $monthly_views = null;

}
