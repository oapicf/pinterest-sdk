//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidOptionsAppTypeMultipliers {
  /// Returns a new [BidOptionsAppTypeMultipliers] instance.
  BidOptionsAppTypeMultipliers({
    this.androidMobile,
    this.androidTablet,
    this.ipad,
    this.iphone,
    this.web,
    this.webMobile,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? androidMobile;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? androidTablet;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? ipad;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? iphone;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? web;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? webMobile;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidOptionsAppTypeMultipliers &&
    other.androidMobile == androidMobile &&
    other.androidTablet == androidTablet &&
    other.ipad == ipad &&
    other.iphone == iphone &&
    other.web == web &&
    other.webMobile == webMobile;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (androidMobile == null ? 0 : androidMobile!.hashCode) +
    (androidTablet == null ? 0 : androidTablet!.hashCode) +
    (ipad == null ? 0 : ipad!.hashCode) +
    (iphone == null ? 0 : iphone!.hashCode) +
    (web == null ? 0 : web!.hashCode) +
    (webMobile == null ? 0 : webMobile!.hashCode);

  @override
  String toString() => 'BidOptionsAppTypeMultipliers[androidMobile=$androidMobile, androidTablet=$androidTablet, ipad=$ipad, iphone=$iphone, web=$web, webMobile=$webMobile]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.androidMobile != null) {
      json[r'android_mobile'] = this.androidMobile;
    } else {
      json[r'android_mobile'] = null;
    }
    if (this.androidTablet != null) {
      json[r'android_tablet'] = this.androidTablet;
    } else {
      json[r'android_tablet'] = null;
    }
    if (this.ipad != null) {
      json[r'ipad'] = this.ipad;
    } else {
      json[r'ipad'] = null;
    }
    if (this.iphone != null) {
      json[r'iphone'] = this.iphone;
    } else {
      json[r'iphone'] = null;
    }
    if (this.web != null) {
      json[r'web'] = this.web;
    } else {
      json[r'web'] = null;
    }
    if (this.webMobile != null) {
      json[r'web_mobile'] = this.webMobile;
    } else {
      json[r'web_mobile'] = null;
    }
    return json;
  }

  /// Returns a new [BidOptionsAppTypeMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidOptionsAppTypeMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BidOptionsAppTypeMultipliers(
        androidMobile: num.parse('${json[r'android_mobile']}'),
        androidTablet: num.parse('${json[r'android_tablet']}'),
        ipad: num.parse('${json[r'ipad']}'),
        iphone: num.parse('${json[r'iphone']}'),
        web: num.parse('${json[r'web']}'),
        webMobile: num.parse('${json[r'web_mobile']}'),
      );
    }
    return null;
  }

  static List<BidOptionsAppTypeMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidOptionsAppTypeMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidOptionsAppTypeMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidOptionsAppTypeMultipliers> mapFromJson(dynamic json) {
    final map = <String, BidOptionsAppTypeMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidOptionsAppTypeMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidOptionsAppTypeMultipliers-objects as value to a dart map
  static Map<String, List<BidOptionsAppTypeMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidOptionsAppTypeMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidOptionsAppTypeMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

