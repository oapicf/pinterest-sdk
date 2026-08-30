//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BaseBusinessAssets {
  /// Returns a new [BaseBusinessAssets] instance.
  BaseBusinessAssets({
    this.assetGroupInfo,
    this.assetId,
    this.assetType,
    this.permissions = const [],
  });

  /// An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssetGroupBinding? assetGroupInfo;

  /// Unique identifier of a business asset.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assetId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssetTypeResponse? assetType;

  /// Permission levels the requesting business has on an asset.
  List<String> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BaseBusinessAssets &&
    other.assetGroupInfo == assetGroupInfo &&
    other.assetId == assetId &&
    other.assetType == assetType &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupInfo == null ? 0 : assetGroupInfo!.hashCode) +
    (assetId == null ? 0 : assetId!.hashCode) +
    (assetType == null ? 0 : assetType!.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'BaseBusinessAssets[assetGroupInfo=$assetGroupInfo, assetId=$assetId, assetType=$assetType, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetGroupInfo != null) {
      json[r'asset_group_info'] = this.assetGroupInfo;
    } else {
      json[r'asset_group_info'] = null;
    }
    if (this.assetId != null) {
      json[r'asset_id'] = this.assetId;
    } else {
      json[r'asset_id'] = null;
    }
    if (this.assetType != null) {
      json[r'asset_type'] = this.assetType;
    } else {
      json[r'asset_type'] = null;
    }
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [BaseBusinessAssets] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BaseBusinessAssets? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BaseBusinessAssets(
        assetGroupInfo: AssetGroupBinding.fromJson(json[r'asset_group_info']),
        assetId: mapValueOfType<String>(json, r'asset_id'),
        assetType: AssetTypeResponse.fromJson(json[r'asset_type']),
        permissions: json[r'permissions'] is Iterable
            ? (json[r'permissions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<BaseBusinessAssets> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BaseBusinessAssets>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BaseBusinessAssets.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BaseBusinessAssets> mapFromJson(dynamic json) {
    final map = <String, BaseBusinessAssets>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BaseBusinessAssets.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BaseBusinessAssets-objects as value to a dart map
  static Map<String, List<BaseBusinessAssets>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BaseBusinessAssets>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BaseBusinessAssets.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

