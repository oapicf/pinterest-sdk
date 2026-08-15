//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignBidOptionsUpdate {
  /// Returns a new [CampaignBidOptionsUpdate] instance.
  CampaignBidOptionsUpdate({
    this.appTypeMultipliers,
    this.audienceMultipliers,
    this.placementMultipliers,
    this.updateMask = const [],
  });

  AppTypeMultipliers? appTypeMultipliers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignAudienceMultipliers? audienceMultipliers;

  PlacementMultipliers? placementMultipliers;

  /// List of fields to update, only the fields in the list will be updated.
  List<CampaignBidOptionsUpdateUpdateMaskEnum> updateMask;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignBidOptionsUpdate &&
    other.appTypeMultipliers == appTypeMultipliers &&
    other.audienceMultipliers == audienceMultipliers &&
    other.placementMultipliers == placementMultipliers &&
    _deepEquality.equals(other.updateMask, updateMask);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (appTypeMultipliers == null ? 0 : appTypeMultipliers!.hashCode) +
    (audienceMultipliers == null ? 0 : audienceMultipliers!.hashCode) +
    (placementMultipliers == null ? 0 : placementMultipliers!.hashCode) +
    (updateMask.hashCode);

  @override
  String toString() => 'CampaignBidOptionsUpdate[appTypeMultipliers=$appTypeMultipliers, audienceMultipliers=$audienceMultipliers, placementMultipliers=$placementMultipliers, updateMask=$updateMask]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.appTypeMultipliers != null) {
      json[r'app_type_multipliers'] = this.appTypeMultipliers;
    } else {
      json[r'app_type_multipliers'] = null;
    }
    if (this.audienceMultipliers != null) {
      json[r'audience_multipliers'] = this.audienceMultipliers;
    } else {
      json[r'audience_multipliers'] = null;
    }
    if (this.placementMultipliers != null) {
      json[r'placement_multipliers'] = this.placementMultipliers;
    } else {
      json[r'placement_multipliers'] = null;
    }
      json[r'update_mask'] = this.updateMask;
    return json;
  }

  /// Returns a new [CampaignBidOptionsUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignBidOptionsUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignBidOptionsUpdate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignBidOptionsUpdate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignBidOptionsUpdate(
        appTypeMultipliers: AppTypeMultipliers.fromJson(json[r'app_type_multipliers']),
        audienceMultipliers: CampaignAudienceMultipliers.fromJson(json[r'audience_multipliers']),
        placementMultipliers: PlacementMultipliers.fromJson(json[r'placement_multipliers']),
        updateMask: CampaignBidOptionsUpdateUpdateMaskEnum.listFromJson(json[r'update_mask']),
      );
    }
    return null;
  }

  static List<CampaignBidOptionsUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBidOptionsUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBidOptionsUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignBidOptionsUpdate> mapFromJson(dynamic json) {
    final map = <String, CampaignBidOptionsUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignBidOptionsUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignBidOptionsUpdate-objects as value to a dart map
  static Map<String, List<CampaignBidOptionsUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignBidOptionsUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignBidOptionsUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'update_mask',
  };
}


class CampaignBidOptionsUpdateUpdateMaskEnum {
  /// Instantiate a new enum with the provided [value].
  const CampaignBidOptionsUpdateUpdateMaskEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AUDIENCE = CampaignBidOptionsUpdateUpdateMaskEnum._(r'AUDIENCE');
  static const APP_TYPE = CampaignBidOptionsUpdateUpdateMaskEnum._(r'APP_TYPE');
  static const PLACEMENT = CampaignBidOptionsUpdateUpdateMaskEnum._(r'PLACEMENT');
  static const GENDER = CampaignBidOptionsUpdateUpdateMaskEnum._(r'GENDER');
  static const AGE_BUCKET = CampaignBidOptionsUpdateUpdateMaskEnum._(r'AGE_BUCKET');

  /// List of all possible values in this [enum][CampaignBidOptionsUpdateUpdateMaskEnum].
  static const values = <CampaignBidOptionsUpdateUpdateMaskEnum>[
    AUDIENCE,
    APP_TYPE,
    PLACEMENT,
    GENDER,
    AGE_BUCKET,
  ];

  static CampaignBidOptionsUpdateUpdateMaskEnum? fromJson(dynamic value) => CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer().decode(value);

  static List<CampaignBidOptionsUpdateUpdateMaskEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBidOptionsUpdateUpdateMaskEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBidOptionsUpdateUpdateMaskEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignBidOptionsUpdateUpdateMaskEnum] to String,
/// and [decode] dynamic data back to [CampaignBidOptionsUpdateUpdateMaskEnum].
class CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer {
  factory CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer() => _instance ??= const CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer._();

  const CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer._();

  String encode(CampaignBidOptionsUpdateUpdateMaskEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CampaignBidOptionsUpdateUpdateMaskEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignBidOptionsUpdateUpdateMaskEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AUDIENCE': return CampaignBidOptionsUpdateUpdateMaskEnum.AUDIENCE;
        case r'APP_TYPE': return CampaignBidOptionsUpdateUpdateMaskEnum.APP_TYPE;
        case r'PLACEMENT': return CampaignBidOptionsUpdateUpdateMaskEnum.PLACEMENT;
        case r'GENDER': return CampaignBidOptionsUpdateUpdateMaskEnum.GENDER;
        case r'AGE_BUCKET': return CampaignBidOptionsUpdateUpdateMaskEnum.AGE_BUCKET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer] instance.
  static CampaignBidOptionsUpdateUpdateMaskEnumTypeTransformer? _instance;
}


