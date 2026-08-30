//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventsDataItems {
  /// Returns a new [ConversionEventsDataItems] instance.
  ConversionEventsDataItems({
    required this.actionSource,
    this.appId,
    this.appInfo,
    this.appName,
    this.appVersion,
    this.customData,
    this.deviceBrand,
    this.deviceCarrier,
    this.deviceInfo,
    this.deviceModel,
    this.deviceType,
    required this.eventId,
    required this.eventName,
    this.eventSourceUrl,
    required this.eventTime,
    this.language,
    this.optOut,
    this.osVersion,
    this.partnerName,
    required this.userData,
    this.wifi,
  });

  /// The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
  String actionSource;

  /// The app store app ID.
  String? appId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionEventAppInfo? appInfo;

  /// Name of the app.
  String? appName;

  /// Version of the app.
  String? appVersion;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionEventsDataItemsCustomData? customData;

  /// Brand of the user device.
  String? deviceBrand;

  /// User device's mobile carrier.
  String? deviceCarrier;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionEventDeviceInfo? deviceInfo;

  /// Model of the user device.
  String? deviceModel;

  /// Type of the user device.
  String? deviceType;

  /// A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  String eventId;

  /// The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
  String eventName;

  /// URL of the web conversion event.
  String? eventSourceUrl;

  /// The time when the event happened. Unix timestamp in seconds.
  int eventTime;

  /// Two-character ISO-639-1 language code indicating the user's language.
  String? language;

  /// When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? optOut;

  /// Version of the device operating system.
  String? osVersion;

  /// The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
  String? partnerName;

  /// Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
  ConversionEventsUserDataProperties userData;

  /// Whether the event occurred when the user device was connected to wifi.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? wifi;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventsDataItems &&
    other.actionSource == actionSource &&
    other.appId == appId &&
    other.appInfo == appInfo &&
    other.appName == appName &&
    other.appVersion == appVersion &&
    other.customData == customData &&
    other.deviceBrand == deviceBrand &&
    other.deviceCarrier == deviceCarrier &&
    other.deviceInfo == deviceInfo &&
    other.deviceModel == deviceModel &&
    other.deviceType == deviceType &&
    other.eventId == eventId &&
    other.eventName == eventName &&
    other.eventSourceUrl == eventSourceUrl &&
    other.eventTime == eventTime &&
    other.language == language &&
    other.optOut == optOut &&
    other.osVersion == osVersion &&
    other.partnerName == partnerName &&
    other.userData == userData &&
    other.wifi == wifi;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (actionSource.hashCode) +
    (appId == null ? 0 : appId!.hashCode) +
    (appInfo == null ? 0 : appInfo!.hashCode) +
    (appName == null ? 0 : appName!.hashCode) +
    (appVersion == null ? 0 : appVersion!.hashCode) +
    (customData == null ? 0 : customData!.hashCode) +
    (deviceBrand == null ? 0 : deviceBrand!.hashCode) +
    (deviceCarrier == null ? 0 : deviceCarrier!.hashCode) +
    (deviceInfo == null ? 0 : deviceInfo!.hashCode) +
    (deviceModel == null ? 0 : deviceModel!.hashCode) +
    (deviceType == null ? 0 : deviceType!.hashCode) +
    (eventId.hashCode) +
    (eventName.hashCode) +
    (eventSourceUrl == null ? 0 : eventSourceUrl!.hashCode) +
    (eventTime.hashCode) +
    (language == null ? 0 : language!.hashCode) +
    (optOut == null ? 0 : optOut!.hashCode) +
    (osVersion == null ? 0 : osVersion!.hashCode) +
    (partnerName == null ? 0 : partnerName!.hashCode) +
    (userData.hashCode) +
    (wifi == null ? 0 : wifi!.hashCode);

  @override
  String toString() => 'ConversionEventsDataItems[actionSource=$actionSource, appId=$appId, appInfo=$appInfo, appName=$appName, appVersion=$appVersion, customData=$customData, deviceBrand=$deviceBrand, deviceCarrier=$deviceCarrier, deviceInfo=$deviceInfo, deviceModel=$deviceModel, deviceType=$deviceType, eventId=$eventId, eventName=$eventName, eventSourceUrl=$eventSourceUrl, eventTime=$eventTime, language=$language, optOut=$optOut, osVersion=$osVersion, partnerName=$partnerName, userData=$userData, wifi=$wifi]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'action_source'] = this.actionSource;
    if (this.appId != null) {
      json[r'app_id'] = this.appId;
    } else {
      json[r'app_id'] = null;
    }
    if (this.appInfo != null) {
      json[r'app_info'] = this.appInfo;
    } else {
      json[r'app_info'] = null;
    }
    if (this.appName != null) {
      json[r'app_name'] = this.appName;
    } else {
      json[r'app_name'] = null;
    }
    if (this.appVersion != null) {
      json[r'app_version'] = this.appVersion;
    } else {
      json[r'app_version'] = null;
    }
    if (this.customData != null) {
      json[r'custom_data'] = this.customData;
    } else {
      json[r'custom_data'] = null;
    }
    if (this.deviceBrand != null) {
      json[r'device_brand'] = this.deviceBrand;
    } else {
      json[r'device_brand'] = null;
    }
    if (this.deviceCarrier != null) {
      json[r'device_carrier'] = this.deviceCarrier;
    } else {
      json[r'device_carrier'] = null;
    }
    if (this.deviceInfo != null) {
      json[r'device_info'] = this.deviceInfo;
    } else {
      json[r'device_info'] = null;
    }
    if (this.deviceModel != null) {
      json[r'device_model'] = this.deviceModel;
    } else {
      json[r'device_model'] = null;
    }
    if (this.deviceType != null) {
      json[r'device_type'] = this.deviceType;
    } else {
      json[r'device_type'] = null;
    }
      json[r'event_id'] = this.eventId;
      json[r'event_name'] = this.eventName;
    if (this.eventSourceUrl != null) {
      json[r'event_source_url'] = this.eventSourceUrl;
    } else {
      json[r'event_source_url'] = null;
    }
      json[r'event_time'] = this.eventTime;
    if (this.language != null) {
      json[r'language'] = this.language;
    } else {
      json[r'language'] = null;
    }
    if (this.optOut != null) {
      json[r'opt_out'] = this.optOut;
    } else {
      json[r'opt_out'] = null;
    }
    if (this.osVersion != null) {
      json[r'os_version'] = this.osVersion;
    } else {
      json[r'os_version'] = null;
    }
    if (this.partnerName != null) {
      json[r'partner_name'] = this.partnerName;
    } else {
      json[r'partner_name'] = null;
    }
      json[r'user_data'] = this.userData;
    if (this.wifi != null) {
      json[r'wifi'] = this.wifi;
    } else {
      json[r'wifi'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionEventsDataItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventsDataItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'action_source'), 'Required key "ConversionEventsDataItems[action_source]" is missing from JSON.');
        assert(json[r'action_source'] != null, 'Required key "ConversionEventsDataItems[action_source]" has a null value in JSON.');
        assert(json.containsKey(r'event_id'), 'Required key "ConversionEventsDataItems[event_id]" is missing from JSON.');
        assert(json[r'event_id'] != null, 'Required key "ConversionEventsDataItems[event_id]" has a null value in JSON.');
        assert(json.containsKey(r'event_name'), 'Required key "ConversionEventsDataItems[event_name]" is missing from JSON.');
        assert(json[r'event_name'] != null, 'Required key "ConversionEventsDataItems[event_name]" has a null value in JSON.');
        assert(json.containsKey(r'event_time'), 'Required key "ConversionEventsDataItems[event_time]" is missing from JSON.');
        assert(json[r'event_time'] != null, 'Required key "ConversionEventsDataItems[event_time]" has a null value in JSON.');
        assert(json.containsKey(r'user_data'), 'Required key "ConversionEventsDataItems[user_data]" is missing from JSON.');
        assert(json[r'user_data'] != null, 'Required key "ConversionEventsDataItems[user_data]" has a null value in JSON.');
        return true;
      }());

      return ConversionEventsDataItems(
        actionSource: mapValueOfType<String>(json, r'action_source')!,
        appId: mapValueOfType<String>(json, r'app_id'),
        appInfo: ConversionEventAppInfo.fromJson(json[r'app_info']),
        appName: mapValueOfType<String>(json, r'app_name'),
        appVersion: mapValueOfType<String>(json, r'app_version'),
        customData: ConversionEventsDataItemsCustomData.fromJson(json[r'custom_data']),
        deviceBrand: mapValueOfType<String>(json, r'device_brand'),
        deviceCarrier: mapValueOfType<String>(json, r'device_carrier'),
        deviceInfo: ConversionEventDeviceInfo.fromJson(json[r'device_info']),
        deviceModel: mapValueOfType<String>(json, r'device_model'),
        deviceType: mapValueOfType<String>(json, r'device_type'),
        eventId: mapValueOfType<String>(json, r'event_id')!,
        eventName: mapValueOfType<String>(json, r'event_name')!,
        eventSourceUrl: mapValueOfType<String>(json, r'event_source_url'),
        eventTime: mapValueOfType<int>(json, r'event_time')!,
        language: mapValueOfType<String>(json, r'language'),
        optOut: mapValueOfType<bool>(json, r'opt_out'),
        osVersion: mapValueOfType<String>(json, r'os_version'),
        partnerName: mapValueOfType<String>(json, r'partner_name'),
        userData: ConversionEventsUserDataProperties.fromJson(json[r'user_data'])!,
        wifi: mapValueOfType<bool>(json, r'wifi'),
      );
    }
    return null;
  }

  static List<ConversionEventsDataItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventsDataItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventsDataItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventsDataItems> mapFromJson(dynamic json) {
    final map = <String, ConversionEventsDataItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventsDataItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventsDataItems-objects as value to a dart map
  static Map<String, List<ConversionEventsDataItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventsDataItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventsDataItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'action_source',
    'event_id',
    'event_name',
    'event_time',
    'user_data',
  };
}

