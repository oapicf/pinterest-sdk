//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTemplateResponseData {
  /// Returns a new [TargetingTemplateResponseData] instance.
  TargetingTemplateResponseData({
    this.autoTargetingEnabled = true,
    this.keywords = const [],
    this.name,
    this.placementGroup,
    this.targetingAttributes,
    this.trackingUrls,
    this.adAccountId,
    this.createdTime,
    this.id,
    this.sizing,
    this.status = const TargetingTemplateResponseDataStatusEnum._('ACTIVE'),
    this.updatedTime,
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

  /// The ID of the advertiser that this targeting template belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

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

  TargetingTemplateAudienceSizing? sizing;

  /// Indicate targeting template is active or Deleted
  TargetingTemplateResponseDataStatusEnum status;

  /// Targeting template updated time.Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTemplateResponseData &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    _deepEquality.equals(other.keywords, keywords) &&
    other.name == name &&
    other.placementGroup == placementGroup &&
    other.targetingAttributes == targetingAttributes &&
    other.trackingUrls == trackingUrls &&
    other.adAccountId == adAccountId &&
    other.createdTime == createdTime &&
    other.id == id &&
    other.sizing == sizing &&
    other.status == status &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled.hashCode) +
    (keywords.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (placementGroup == null ? 0 : placementGroup!.hashCode) +
    (targetingAttributes == null ? 0 : targetingAttributes!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (sizing == null ? 0 : sizing!.hashCode) +
    (status.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'TargetingTemplateResponseData[autoTargetingEnabled=$autoTargetingEnabled, keywords=$keywords, name=$name, placementGroup=$placementGroup, targetingAttributes=$targetingAttributes, trackingUrls=$trackingUrls, adAccountId=$adAccountId, createdTime=$createdTime, id=$id, sizing=$sizing, status=$status, updatedTime=$updatedTime]';

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
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
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
    if (this.sizing != null) {
      json[r'sizing'] = this.sizing;
    } else {
      json[r'sizing'] = null;
    }
      json[r'status'] = this.status;
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingTemplateResponseData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTemplateResponseData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingTemplateResponseData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingTemplateResponseData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingTemplateResponseData(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled') ?? true,
        keywords: TargetingTemplateKeyword.listFromJson(json[r'keywords']),
        name: mapValueOfType<String>(json, r'name'),
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']),
        targetingAttributes: TargetingSpec.fromJson(json[r'targeting_attributes']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        sizing: TargetingTemplateAudienceSizing.fromJson(json[r'sizing']),
        status: TargetingTemplateResponseDataStatusEnum.fromJson(json[r'status']) ?? 'ACTIVE',
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<TargetingTemplateResponseData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateResponseData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateResponseData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTemplateResponseData> mapFromJson(dynamic json) {
    final map = <String, TargetingTemplateResponseData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTemplateResponseData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTemplateResponseData-objects as value to a dart map
  static Map<String, List<TargetingTemplateResponseData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTemplateResponseData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTemplateResponseData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Indicate targeting template is active or Deleted
class TargetingTemplateResponseDataStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingTemplateResponseDataStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = TargetingTemplateResponseDataStatusEnum._(r'ACTIVE');
  static const DELETED = TargetingTemplateResponseDataStatusEnum._(r'DELETED');

  /// List of all possible values in this [enum][TargetingTemplateResponseDataStatusEnum].
  static const values = <TargetingTemplateResponseDataStatusEnum>[
    ACTIVE,
    DELETED,
  ];

  static TargetingTemplateResponseDataStatusEnum? fromJson(dynamic value) => TargetingTemplateResponseDataStatusEnumTypeTransformer().decode(value);

  static List<TargetingTemplateResponseDataStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateResponseDataStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateResponseDataStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingTemplateResponseDataStatusEnum] to String,
/// and [decode] dynamic data back to [TargetingTemplateResponseDataStatusEnum].
class TargetingTemplateResponseDataStatusEnumTypeTransformer {
  factory TargetingTemplateResponseDataStatusEnumTypeTransformer() => _instance ??= const TargetingTemplateResponseDataStatusEnumTypeTransformer._();

  const TargetingTemplateResponseDataStatusEnumTypeTransformer._();

  String encode(TargetingTemplateResponseDataStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingTemplateResponseDataStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingTemplateResponseDataStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return TargetingTemplateResponseDataStatusEnum.ACTIVE;
        case r'DELETED': return TargetingTemplateResponseDataStatusEnum.DELETED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingTemplateResponseDataStatusEnumTypeTransformer] instance.
  static TargetingTemplateResponseDataStatusEnumTypeTransformer? _instance;
}


