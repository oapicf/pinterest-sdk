<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object containing information about the device where event occurred.
 */
class ConversionEventDeviceInfo
{
    /**
     * Battery charge level percentage
     * @DTA\Data(field="battery_level", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100, "inclusive":true})
     * @var int|null
     */
    public $battery_level;

    /**
     * Device brand
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $brand;

    /**
     * User device&#39;s mobile carrier.
     * @DTA\Data(field="carrier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $carrier;

    /**
     * Number of CPU cores
     * @DTA\Data(field="cpu_cores", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1152, "inclusive":true})
     * @var int|null
     */
    public $cpu_cores;

    /**
     * External storage size in GB
     * @DTA\Data(field="external_storage_free_space", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1048576, "inclusive":true})
     * @var int|null
     */
    public $external_storage_free_space;

    /**
     * External storage size in GB
     * @DTA\Data(field="external_storage_size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1048576, "inclusive":true})
     * @var int|null
     */
    public $external_storage_size;

    /**
     * Device form factor
     * @DTA\Data(field="form_factor", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FormFactor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FormFactor::class})
     * @var \App\DTO\FormFactor|null
     */
    public $form_factor;

    /**
     * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
     * @DTA\Data(field="kernel_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $kernel_version;

    /**
     * List of user installed languages. ISO 639-1 format
     * @DTA\Data(field="languages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection199::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection199::class})
     * @var \App\DTO\Collection199|null
     */
    public $languages;

    /**
     * Device locale BCP-47 format
     * @DTA\Data(field="locale", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":35})
     * @var string|null
     */
    public $locale;

    /**
     * Device model name
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $model;

    /**
     * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
     * @DTA\Data(field="network_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NetworkType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NetworkType::class})
     * @var \App\DTO\NetworkType|null
     */
    public $network_type;

    /**
     * OS Family
     * @DTA\Data(field="os_family", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OsFamily::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OsFamily::class})
     * @var \App\DTO\OsFamily|null
     */
    public $os_family;

    /**
     * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
     * @DTA\Data(field="os_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $os_name;

    /**
     * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
     * @DTA\Data(field="os_release_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $os_release_name;

    /**
     * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
     * @DTA\Data(field="os_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $os_version;

    /**
     * Screen density, PPI
     * @DTA\Data(field="screen_density", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100000, "inclusive":true})
     * @var int|null
     */
    public $screen_density;

    /**
     * Screen height in pixels
     * @DTA\Data(field="screen_height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":30720, "inclusive":true})
     * @var int|null
     */
    public $screen_height;

    /**
     * Screen width in pixels
     * @DTA\Data(field="screen_width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":30720, "inclusive":true})
     * @var int|null
     */
    public $screen_width;

    /**
     * Internal storage size in GB
     * @DTA\Data(field="storage_free_space", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1048576, "inclusive":true})
     * @var int|null
     */
    public $storage_free_space;

    /**
     * Internal storage size in GB
     * @DTA\Data(field="storage_size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1048576, "inclusive":true})
     * @var int|null
     */
    public $storage_size;

    /**
     * Device timezone
     * @DTA\Data(field="timezone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":40})
     * @var string|null
     */
    public $timezone;

    /**
     * Timezone abbreviation
     * @DTA\Data(field="timezone_abbr", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":5})
     * @var string|null
     */
    public $timezone_abbr;

    /**
     * Device type
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $type;

}
