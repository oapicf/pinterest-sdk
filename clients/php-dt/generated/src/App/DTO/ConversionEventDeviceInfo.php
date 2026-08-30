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
     * @DTA\Validator(name="Range", options={"min":0, "max":100})
     */
    public ?int $battery_level = null;

    /**
     * Device brand
     * @DTA\Data(field="brand", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $brand = null;

    /**
     * User device&#39;s mobile carrier.
     * @DTA\Data(field="carrier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $carrier = null;

    /**
     * Number of CPU cores
     * @DTA\Data(field="cpu_cores", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1152})
     */
    public ?int $cpu_cores = null;

    /**
     * External storage size in GB
     * @DTA\Data(field="external_storage_free_space", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1048576})
     */
    public ?int $external_storage_free_space = null;

    /**
     * External storage size in GB
     * @DTA\Data(field="external_storage_size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1048576})
     */
    public ?int $external_storage_size = null;

    /**
     * Device form factor
     * @DTA\Data(field="form_factor", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FormFactor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FormFactor::class})
     */
    public ?\App\DTO\FormFactor $form_factor = null;

    /**
     * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
     * @DTA\Data(field="kernel_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $kernel_version = null;

    /**
     * List of user installed languages. ISO 639-1 format
     * @DTA\Data(field="languages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection199::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection199::class})
     */
    public ?\App\DTO\Collection199 $languages = null;

    /**
     * Device locale BCP-47 format
     * @DTA\Data(field="locale", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":35})
     */
    public ?string $locale = null;

    /**
     * Device model name
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $model = null;

    /**
     * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
     * @DTA\Data(field="network_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NetworkType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NetworkType::class})
     */
    public ?\App\DTO\NetworkType $network_type = null;

    /**
     * OS Family
     * @DTA\Data(field="os_family", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OsFamily::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OsFamily::class})
     */
    public ?\App\DTO\OsFamily $os_family = null;

    /**
     * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
     * @DTA\Data(field="os_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $os_name = null;

    /**
     * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
     * @DTA\Data(field="os_release_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $os_release_name = null;

    /**
     * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
     * @DTA\Data(field="os_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $os_version = null;

    /**
     * Screen density, PPI
     * @DTA\Data(field="screen_density", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":100000})
     */
    public ?int $screen_density = null;

    /**
     * Screen height in pixels
     * @DTA\Data(field="screen_height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":30720})
     */
    public ?int $screen_height = null;

    /**
     * Screen width in pixels
     * @DTA\Data(field="screen_width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":30720})
     */
    public ?int $screen_width = null;

    /**
     * Internal storage size in GB
     * @DTA\Data(field="storage_free_space", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1048576})
     */
    public ?int $storage_free_space = null;

    /**
     * Internal storage size in GB
     * @DTA\Data(field="storage_size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1048576})
     */
    public ?int $storage_size = null;

    /**
     * Device timezone
     * @DTA\Data(field="timezone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":40})
     */
    public ?string $timezone = null;

    /**
     * Timezone abbreviation
     * @DTA\Data(field="timezone_abbr", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":5})
     */
    public ?string $timezone_abbr = null;

    /**
     * Device type
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $type = null;

}
