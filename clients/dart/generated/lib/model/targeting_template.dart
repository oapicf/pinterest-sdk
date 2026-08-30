//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTemplate {
  /// Returns a new [TargetingTemplate] instance.
  TargetingTemplate({
    this.adAccountId,
    this.autoTargetingEnabled = true,
    this.createdTime,
    this.id,
    this.keywords = const [],
    required this.name,
    this.placementGroup,
    this.sizing,
    this.status,
    required this.targetingAttributes,
    this.trackingUrls,
    this.updatedTime,
    this.valid,
  });

  /// The ID of the advertiser that this targeting template belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  bool autoTargetingEnabled;

  /// Targeting template created time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// Targeting template ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  List<TargetingTemplateKeyword> keywords;

  /// targeting template name
  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PlacementGroupType? placementGroup;

  TargetingTemplateAudienceSizing? sizing;

  /// Indicate targeting template is active or Deleted
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingTemplateStatus? status;

  /// targeting profile attributes
  TargetingSpecOptimal targetingAttributes;

  TrackingUrls? trackingUrls;

  /// Targeting template updated time.Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  /// Inform if the targeting template is valid (ex. would be false if has revoked audience)
  bool? valid;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTemplate &&
    other.adAccountId == adAccountId &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    other.createdTime == createdTime &&
    other.id == id &&
    _deepEquality.equals(other.keywords, keywords) &&
    other.name == name &&
    other.placementGroup == placementGroup &&
    other.sizing == sizing &&
    other.status == status &&
    other.targetingAttributes == targetingAttributes &&
    other.trackingUrls == trackingUrls &&
    other.updatedTime == updatedTime &&
    other.valid == valid;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (autoTargetingEnabled.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (keywords.hashCode) +
    (name.hashCode) +
    (placementGroup == null ? 0 : placementGroup!.hashCode) +
    (sizing == null ? 0 : sizing!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (targetingAttributes.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode) +
    (valid == null ? 0 : valid!.hashCode);

  @override
  String toString() => 'TargetingTemplate[adAccountId=$adAccountId, autoTargetingEnabled=$autoTargetingEnabled, createdTime=$createdTime, id=$id, keywords=$keywords, name=$name, placementGroup=$placementGroup, sizing=$sizing, status=$status, targetingAttributes=$targetingAttributes, trackingUrls=$trackingUrls, updatedTime=$updatedTime, valid=$valid]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'keywords'] = this.keywords;
      json[r'name'] = this.name;
    if (this.placementGroup != null) {
      json[r'placement_group'] = this.placementGroup;
    } else {
      json[r'placement_group'] = null;
    }
    if (this.sizing != null) {
      json[r'sizing'] = this.sizing;
    } else {
      json[r'sizing'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'targeting_attributes'] = this.targetingAttributes;
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    if (this.valid != null) {
      json[r'valid'] = this.valid;
    } else {
      json[r'valid'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingTemplate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTemplate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "TargetingTemplate[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "TargetingTemplate[name]" has a null value in JSON.');
        assert(json.containsKey(r'targeting_attributes'), 'Required key "TargetingTemplate[targeting_attributes]" is missing from JSON.');
        assert(json[r'targeting_attributes'] != null, 'Required key "TargetingTemplate[targeting_attributes]" has a null value in JSON.');
        return true;
      }());

      return TargetingTemplate(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled') ?? true,
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        keywords: TargetingTemplateKeyword.listFromJson(json[r'keywords']),
        name: mapValueOfType<String>(json, r'name')!,
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']),
        sizing: TargetingTemplateAudienceSizing.fromJson(json[r'sizing']),
        status: TargetingTemplateStatus.fromJson(json[r'status']),
        targetingAttributes: TargetingSpecOptimal.fromJson(json[r'targeting_attributes'])!,
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
        valid: mapValueOfType<bool>(json, r'valid'),
      );
    }
    return null;
  }

  static List<TargetingTemplate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTemplate> mapFromJson(dynamic json) {
    final map = <String, TargetingTemplate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTemplate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTemplate-objects as value to a dart map
  static Map<String, List<TargetingTemplate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTemplate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTemplate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'targeting_attributes',
  };
}

