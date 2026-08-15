//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventAppInfo {
  /// Returns a new [ConversionEventAppInfo] instance.
  ConversionEventAppInfo({
    this.appId,
    this.appName,
    this.appPackageName,
    this.appStore,
    this.appVersion,
    this.installTime,
    this.userAgent,
    this.windowHeight,
    this.windowWidth,
  });

  /// App ID in Google Play Store, AppStore or other stores.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appId;

  /// Name of the app. Primarily used for Mobile Apps.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appName;

  /// App package name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appPackageName;

  /// The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appStore;

  /// App version. Primarily used for mobile apps
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appVersion;

  /// App install time. Unix timestamp in seconds
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? installTime;

  /// User Agent request header. Primarily used for Web events
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userAgent;

  /// Inner height of the window or viewport.
  ///
  /// Minimum value: 0
  /// Maximum value: 30720
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? windowHeight;

  /// Inner width of the window or viewport.
  ///
  /// Minimum value: 0
  /// Maximum value: 30720
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? windowWidth;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventAppInfo &&
    other.appId == appId &&
    other.appName == appName &&
    other.appPackageName == appPackageName &&
    other.appStore == appStore &&
    other.appVersion == appVersion &&
    other.installTime == installTime &&
    other.userAgent == userAgent &&
    other.windowHeight == windowHeight &&
    other.windowWidth == windowWidth;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (appId == null ? 0 : appId!.hashCode) +
    (appName == null ? 0 : appName!.hashCode) +
    (appPackageName == null ? 0 : appPackageName!.hashCode) +
    (appStore == null ? 0 : appStore!.hashCode) +
    (appVersion == null ? 0 : appVersion!.hashCode) +
    (installTime == null ? 0 : installTime!.hashCode) +
    (userAgent == null ? 0 : userAgent!.hashCode) +
    (windowHeight == null ? 0 : windowHeight!.hashCode) +
    (windowWidth == null ? 0 : windowWidth!.hashCode);

  @override
  String toString() => 'ConversionEventAppInfo[appId=$appId, appName=$appName, appPackageName=$appPackageName, appStore=$appStore, appVersion=$appVersion, installTime=$installTime, userAgent=$userAgent, windowHeight=$windowHeight, windowWidth=$windowWidth]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.appId != null) {
      json[r'app_id'] = this.appId;
    } else {
      json[r'app_id'] = null;
    }
    if (this.appName != null) {
      json[r'app_name'] = this.appName;
    } else {
      json[r'app_name'] = null;
    }
    if (this.appPackageName != null) {
      json[r'app_package_name'] = this.appPackageName;
    } else {
      json[r'app_package_name'] = null;
    }
    if (this.appStore != null) {
      json[r'app_store'] = this.appStore;
    } else {
      json[r'app_store'] = null;
    }
    if (this.appVersion != null) {
      json[r'app_version'] = this.appVersion;
    } else {
      json[r'app_version'] = null;
    }
    if (this.installTime != null) {
      json[r'install_time'] = this.installTime;
    } else {
      json[r'install_time'] = null;
    }
    if (this.userAgent != null) {
      json[r'user_agent'] = this.userAgent;
    } else {
      json[r'user_agent'] = null;
    }
    if (this.windowHeight != null) {
      json[r'window_height'] = this.windowHeight;
    } else {
      json[r'window_height'] = null;
    }
    if (this.windowWidth != null) {
      json[r'window_width'] = this.windowWidth;
    } else {
      json[r'window_width'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionEventAppInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventAppInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionEventAppInfo[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionEventAppInfo[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionEventAppInfo(
        appId: mapValueOfType<String>(json, r'app_id'),
        appName: mapValueOfType<String>(json, r'app_name'),
        appPackageName: mapValueOfType<String>(json, r'app_package_name'),
        appStore: mapValueOfType<String>(json, r'app_store'),
        appVersion: mapValueOfType<String>(json, r'app_version'),
        installTime: mapValueOfType<int>(json, r'install_time'),
        userAgent: mapValueOfType<String>(json, r'user_agent'),
        windowHeight: mapValueOfType<int>(json, r'window_height'),
        windowWidth: mapValueOfType<int>(json, r'window_width'),
      );
    }
    return null;
  }

  static List<ConversionEventAppInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventAppInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventAppInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventAppInfo> mapFromJson(dynamic json) {
    final map = <String, ConversionEventAppInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventAppInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventAppInfo-objects as value to a dart map
  static Map<String, List<ConversionEventAppInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventAppInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventAppInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

