import { FormFactor } from './form-factor';
import { NetworkType } from './network-type';
import { OsFamily } from './os-family';


/**
 * Object containing information about the device where event occurred.
 */
export interface ConversionEventDeviceInfo { 
  /**
   * Battery charge level percentage
   */
  battery_level?: number;
  /**
   * Device brand
   */
  brand?: string;
  /**
   * User device\'s mobile carrier.
   */
  carrier?: string;
  /**
   * Number of CPU cores
   */
  cpu_cores?: number;
  /**
   * External storage size in GB
   */
  external_storage_free_space?: number;
  /**
   * External storage size in GB
   */
  external_storage_size?: number;
  /**
   * Device form factor
   */
  form_factor?: FormFactor;
  /**
   * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
   */
  kernel_version?: string;
  /**
   * List of user installed languages. ISO 639-1 format
   */
  languages?: Array<string>;
  /**
   * Device locale BCP-47 format
   */
  locale?: string;
  /**
   * Device model name
   */
  model?: string;
  /**
   * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
   */
  network_type?: NetworkType;
  /**
   * OS Family
   */
  os_family?: OsFamily;
  /**
   * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
   */
  os_name?: string;
  /**
   * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
   */
  os_release_name?: string;
  /**
   * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
   */
  os_version?: string;
  /**
   * Screen density, PPI
   */
  screen_density?: number;
  /**
   * Screen height in pixels
   */
  screen_height?: number;
  /**
   * Screen width in pixels
   */
  screen_width?: number;
  /**
   * Internal storage size in GB
   */
  storage_free_space?: number;
  /**
   * Internal storage size in GB
   */
  storage_size?: number;
  /**
   * Device timezone
   */
  timezone?: string;
  /**
   * Timezone abbreviation
   */
  timezone_abbr?: string;
  /**
   * Device type
   */
  type?: string;
}
export namespace ConversionEventDeviceInfo {
}


