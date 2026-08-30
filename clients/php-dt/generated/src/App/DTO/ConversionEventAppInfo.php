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
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $app_id = null;

    /**
     * Name of the app. Primarily used for Mobile Apps.
     * @DTA\Data(field="app_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $app_name = null;

    /**
     * App package name
     * @DTA\Data(field="app_package_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $app_package_name = null;

    /**
     * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
     * @DTA\Data(field="app_store", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $app_store = null;

    /**
     * App version. Primarily used for mobile apps
     * @DTA\Data(field="app_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $app_version = null;

    /**
     * App install time. Unix timestamp in seconds
     * @DTA\Data(field="install_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $install_time = null;

    /**
     * User Agent request header. Primarily used for Web events
     * @DTA\Data(field="user_agent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":16384})
     */
    public ?string $user_agent = null;

    /**
     * Inner height of the window or viewport.
     * @DTA\Data(field="window_height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":30720})
     */
    public ?int $window_height = null;

    /**
     * Inner width of the window or viewport.
     * @DTA\Data(field="window_width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":30720})
     */
    public ?int $window_width = null;

}
