<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object containing information about the application where event occurred.
 */
class ConversionEventAppInfo
{
    /**
     * App ID in Google Play Store, AppStore or other stores.
     * @DTA\Data(field="app_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $app_id;

    /**
     * Name of the app. Primarily used for Mobile Apps.
     * @DTA\Data(field="app_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $app_name;

    /**
     * App package name
     * @DTA\Data(field="app_package_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $app_package_name;

    /**
     * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
     * @DTA\Data(field="app_store", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $app_store;

    /**
     * App version. Primarily used for mobile apps
     * @DTA\Data(field="app_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $app_version;

    /**
     * App install time. Unix timestamp in seconds
     * @DTA\Data(field="install_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $install_time;

    /**
     * User Agent request header. Primarily used for Web events
     * @DTA\Data(field="user_agent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":16384})
     * @var string|null
     */
    public $user_agent;

    /**
     * Inner height of the window or viewport.
     * @DTA\Data(field="window_height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":30720, "inclusive":true})
     * @var int|null
     */
    public $window_height;

    /**
     * Inner width of the window or viewport.
     * @DTA\Data(field="window_width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":30720, "inclusive":true})
     * @var int|null
     */
    public $window_width;

}
