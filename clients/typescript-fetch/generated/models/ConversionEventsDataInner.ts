/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { ConversionEventsDataInnerCustomData } from './ConversionEventsDataInnerCustomData';
import {
    ConversionEventsDataInnerCustomDataFromJSON,
    ConversionEventsDataInnerCustomDataFromJSONTyped,
    ConversionEventsDataInnerCustomDataToJSON,
    ConversionEventsDataInnerCustomDataToJSONTyped,
} from './ConversionEventsDataInnerCustomData';
import type { ConversionEventsUserData } from './ConversionEventsUserData';
import {
    ConversionEventsUserDataFromJSON,
    ConversionEventsUserDataFromJSONTyped,
    ConversionEventsUserDataToJSON,
    ConversionEventsUserDataToJSONTyped,
} from './ConversionEventsUserData';

/**
 * 
 * @export
 * @interface ConversionEventsDataInner
 */
export interface ConversionEventsDataInner {
    /**
     * <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.
     *   <ul>
     *   <li><code>add_to_cart</code></li>
     *   <li><code>checkout</code></li>
     *   <li><code>custom</code></li>
     *   <li><code>lead</code></li>
     *   <li><code>page_visit</code></li>
     *   <li><code>search</code></li>
     *   <li><code>signup</code></li>
     *   <li><code>view_category</code></li>
     *   <li><code>watch_video</code></li>
     *   </ul>
     * </p>
     * 
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    eventName: string;
    /**
     * <p>
     *   The source indicating where the conversion event occurred.
     *   <ul>
     *     <li><code>app_android</code></li>
     *     <li><code>app_ios</code></li>
     *     <li><code>web</code></li>
     *     <li><code>offline</code></li>
     *   </ul>
     * </p>
     * 
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    actionSource: string;
    /**
     * The time when the event happened. Unix timestamp in seconds.
     * @type {number}
     * @memberof ConversionEventsDataInner
     */
    eventTime: number;
    /**
     * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    eventId: string;
    /**
     * URL of the web conversion event.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    eventSourceUrl?: string | null;
    /**
     * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
     * @type {boolean}
     * @memberof ConversionEventsDataInner
     */
    optOut?: boolean;
    /**
     * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is "ss-partnername" lowercase. E.g ‘ss-shopify’
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    partnerName?: string | null;
    /**
     * 
     * @type {ConversionEventsUserData}
     * @memberof ConversionEventsDataInner
     */
    userData: ConversionEventsUserData;
    /**
     * 
     * @type {ConversionEventsDataInnerCustomData}
     * @memberof ConversionEventsDataInner
     */
    customData?: ConversionEventsDataInnerCustomData;
    /**
     * The app store app ID.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    appId?: string | null;
    /**
     * Name of the app.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    appName?: string | null;
    /**
     * Version of the app.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    appVersion?: string | null;
    /**
     * Brand of the user device.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    deviceBrand?: string | null;
    /**
     * User device's mobile carrier.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    deviceCarrier?: string | null;
    /**
     * Model of the user device.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    deviceModel?: string | null;
    /**
     * Type of the user device.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    deviceType?: string | null;
    /**
     * Version of the device operating system.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    osVersion?: string | null;
    /**
     * Whether the event occurred when the user device was connected to wifi.
     * @type {boolean}
     * @memberof ConversionEventsDataInner
     */
    wifi?: boolean;
    /**
     * Two-character ISO-639-1 language code indicating the user's language.
     * @type {string}
     * @memberof ConversionEventsDataInner
     */
    language?: string | null;
}

/**
 * Check if a given object implements the ConversionEventsDataInner interface.
 */
export function instanceOfConversionEventsDataInner(value: object): value is ConversionEventsDataInner {
    if (!('eventName' in value) || value['eventName'] === undefined) return false;
    if (!('actionSource' in value) || value['actionSource'] === undefined) return false;
    if (!('eventTime' in value) || value['eventTime'] === undefined) return false;
    if (!('eventId' in value) || value['eventId'] === undefined) return false;
    if (!('userData' in value) || value['userData'] === undefined) return false;
    return true;
}

export function ConversionEventsDataInnerFromJSON(json: any): ConversionEventsDataInner {
    return ConversionEventsDataInnerFromJSONTyped(json, false);
}

export function ConversionEventsDataInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ConversionEventsDataInner {
    if (json == null) {
        return json;
    }
    return {
        
        'eventName': json['event_name'],
        'actionSource': json['action_source'],
        'eventTime': json['event_time'],
        'eventId': json['event_id'],
        'eventSourceUrl': json['event_source_url'] == null ? undefined : json['event_source_url'],
        'optOut': json['opt_out'] == null ? undefined : json['opt_out'],
        'partnerName': json['partner_name'] == null ? undefined : json['partner_name'],
        'userData': ConversionEventsUserDataFromJSON(json['user_data']),
        'customData': json['custom_data'] == null ? undefined : ConversionEventsDataInnerCustomDataFromJSON(json['custom_data']),
        'appId': json['app_id'] == null ? undefined : json['app_id'],
        'appName': json['app_name'] == null ? undefined : json['app_name'],
        'appVersion': json['app_version'] == null ? undefined : json['app_version'],
        'deviceBrand': json['device_brand'] == null ? undefined : json['device_brand'],
        'deviceCarrier': json['device_carrier'] == null ? undefined : json['device_carrier'],
        'deviceModel': json['device_model'] == null ? undefined : json['device_model'],
        'deviceType': json['device_type'] == null ? undefined : json['device_type'],
        'osVersion': json['os_version'] == null ? undefined : json['os_version'],
        'wifi': json['wifi'] == null ? undefined : json['wifi'],
        'language': json['language'] == null ? undefined : json['language'],
    };
}

  export function ConversionEventsDataInnerToJSON(json: any): ConversionEventsDataInner {
      return ConversionEventsDataInnerToJSONTyped(json, false);
  }

  export function ConversionEventsDataInnerToJSONTyped(value?: ConversionEventsDataInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event_name': value['eventName'],
        'action_source': value['actionSource'],
        'event_time': value['eventTime'],
        'event_id': value['eventId'],
        'event_source_url': value['eventSourceUrl'],
        'opt_out': value['optOut'],
        'partner_name': value['partnerName'],
        'user_data': ConversionEventsUserDataToJSON(value['userData']),
        'custom_data': ConversionEventsDataInnerCustomDataToJSON(value['customData']),
        'app_id': value['appId'],
        'app_name': value['appName'],
        'app_version': value['appVersion'],
        'device_brand': value['deviceBrand'],
        'device_carrier': value['deviceCarrier'],
        'device_model': value['deviceModel'],
        'device_type': value['deviceType'],
        'os_version': value['osVersion'],
        'wifi': value['wifi'],
        'language': value['language'],
    };
}

