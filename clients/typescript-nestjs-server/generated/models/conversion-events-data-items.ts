import { ConversionEventAppInfo } from './conversion-event-app-info';
import { ConversionEventsDataItemsCustomData } from './conversion-events-data-items-custom-data';
import { ConversionEventsUserDataProperties } from './conversion-events-user-data-properties';
import { ConversionEventDeviceInfo } from './conversion-event-device-info';


export interface ConversionEventsDataItems { 
  /**
   * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
   */
  action_source: string;
  /**
   * The app store app ID.
   */
  app_id?: string | null;
  app_info?: ConversionEventAppInfo;
  /**
   * Name of the app.
   */
  app_name?: string | null;
  /**
   * Version of the app.
   */
  app_version?: string | null;
  custom_data?: ConversionEventsDataItemsCustomData;
  /**
   * Brand of the user device.
   */
  device_brand?: string | null;
  /**
   * User device\'s mobile carrier.
   */
  device_carrier?: string | null;
  device_info?: ConversionEventDeviceInfo;
  /**
   * Model of the user device.
   */
  device_model?: string | null;
  /**
   * Type of the user device.
   */
  device_type?: string | null;
  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event\'s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   */
  event_id: string;
  /**
   * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
   */
  event_name: string;
  /**
   * URL of the web conversion event.
   */
  event_source_url?: string | null;
  /**
   * The time when the event happened. Unix timestamp in seconds.
   */
  event_time: number;
  /**
   * Two-character ISO-639-1 language code indicating the user\'s language.
   */
  language?: string | null;
  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   */
  opt_out?: boolean;
  /**
   * Version of the device operating system.
   */
  os_version?: string | null;
  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g \'ss-shopify\'
   */
  partner_name?: string | null;
  /**
   * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
   */
  user_data: ConversionEventsUserDataProperties;
  /**
   * Whether the event occurred when the user device was connected to wifi.
   */
  wifi?: boolean;
}

