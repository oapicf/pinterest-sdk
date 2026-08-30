<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * User account model containing properties related to a user&#39;s account.
 */
class Account
{
    /**
     * Profile about description.
     * @DTA\Data(field="about", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $about;

    /**
     * Type of account
     * @DTA\Data(field="account_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserAccountType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserAccountType::class})
     * @var \App\DTO\UserAccountType|null
     */
    public $account_type;

    /**
     * User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
     * @DTA\Data(field="board_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $board_count;

    /**
     * @DTA\Data(field="business_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $business_name;

    /**
     * User account follower count.
     * @DTA\Data(field="follower_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $follower_count;

    /**
     * User account following count.
     * @DTA\Data(field="following_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $following_count;

    /**
     * User account ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * User account monthly views.
     * @DTA\Data(field="monthly_views", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $monthly_views;

    /**
     * User account pin count. This includes both created and saved pins.
     * @DTA\Data(field="pin_count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pin_count;

    /**
     * @DTA\Data(field="profile_image", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $profile_image;

    /**
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $username;

    /**
     * @DTA\Data(field="website_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $website_url;

}
