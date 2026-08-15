//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTemplateCommon {
  /// Returns a new [TargetingTemplateCommon] instance.
  TargetingTemplateCommon({
    this.autoTargetingEnabled = true,
    this.keywords = const [],
    this.name,
    this.placementGroup,
    this.targetingAttributes,
    this.trackingUrls,
  });

  /// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  bool autoTargetingEnabled;

  List<TargetingTemplateKeyword> keywords;

  /// targeting template name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PlacementGroupType? placementGroup;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpec? targetingAttributes;

  TrackingUrls? trackingUrls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTemplateCommon &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    _deepEquality.equals(other.keywords, keywords) &&
    other.name == name &&
    other.placementGroup == placementGroup &&
    other.targetingAttributes == targetingAttributes &&
    other.trackingUrls == trackingUrls;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled.hashCode) +
    (keywords.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (placementGroup == null ? 0 : placementGroup!.hashCode) +
    (targetingAttributes == null ? 0 : targetingAttributes!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode);

  @override
  String toString() => 'TargetingTemplateCommon[autoTargetingEnabled=$autoTargetingEnabled, keywords=$keywords, name=$name, placementGroup=$placementGroup, targetingAttributes=$targetingAttributes, trackingUrls=$trackingUrls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
      json[r'keywords'] = this.keywords;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.placementGroup != null) {
      json[r'placement_group'] = this.placementGroup;
    } else {
      json[r'placement_group'] = null;
    }
    if (this.targetingAttributes != null) {
      json[r'targeting_attributes'] = this.targetingAttributes;
    } else {
      json[r'targeting_attributes'] = null;
    }
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingTemplateCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTemplateCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingTemplateCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingTemplateCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingTemplateCommon(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled') ?? true,
        keywords: TargetingTemplateKeyword.listFromJson(json[r'keywords']),
        name: mapValueOfType<String>(json, r'name'),
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']),
        targetingAttributes: TargetingSpec.fromJson(json[r'targeting_attributes']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
      );
    }
    return null;
  }

  static List<TargetingTemplateCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTemplateCommon> mapFromJson(dynamic json) {
    final map = <String, TargetingTemplateCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTemplateCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTemplateCommon-objects as value to a dart map
  static Map<String, List<TargetingTemplateCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTemplateCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTemplateCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

