//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetGroupInputCreate {
  /// Returns a new [AssetGroupInputCreate] instance.
  AssetGroupInputCreate({
    this.assetGroup,
    required this.assetGroupDescription,
    required this.assetGroupName,
    this.assetGroupTypes = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssetGroupBinding? assetGroup;

  /// Asset group description.
  String assetGroupDescription;

  /// Asset Group name.
  String assetGroupName;

  /// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  List<AssetGroupType> assetGroupTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetGroupInputCreate &&
    other.assetGroup == assetGroup &&
    other.assetGroupDescription == assetGroupDescription &&
    other.assetGroupName == assetGroupName &&
    _deepEquality.equals(other.assetGroupTypes, assetGroupTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroup == null ? 0 : assetGroup!.hashCode) +
    (assetGroupDescription.hashCode) +
    (assetGroupName.hashCode) +
    (assetGroupTypes.hashCode);

  @override
  String toString() => 'AssetGroupInputCreate[assetGroup=$assetGroup, assetGroupDescription=$assetGroupDescription, assetGroupName=$assetGroupName, assetGroupTypes=$assetGroupTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetGroup != null) {
      json[r'asset_group'] = this.assetGroup;
    } else {
      json[r'asset_group'] = null;
    }
      json[r'asset_group_description'] = this.assetGroupDescription;
      json[r'asset_group_name'] = this.assetGroupName;
      json[r'asset_group_types'] = this.assetGroupTypes;
    return json;
  }

  /// Returns a new [AssetGroupInputCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetGroupInputCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'asset_group_description'), 'Required key "AssetGroupInputCreate[asset_group_description]" is missing from JSON.');
        assert(json[r'asset_group_description'] != null, 'Required key "AssetGroupInputCreate[asset_group_description]" has a null value in JSON.');
        assert(json.containsKey(r'asset_group_name'), 'Required key "AssetGroupInputCreate[asset_group_name]" is missing from JSON.');
        assert(json[r'asset_group_name'] != null, 'Required key "AssetGroupInputCreate[asset_group_name]" has a null value in JSON.');
        assert(json.containsKey(r'asset_group_types'), 'Required key "AssetGroupInputCreate[asset_group_types]" is missing from JSON.');
        assert(json[r'asset_group_types'] != null, 'Required key "AssetGroupInputCreate[asset_group_types]" has a null value in JSON.');
        return true;
      }());

      return AssetGroupInputCreate(
        assetGroup: AssetGroupBinding.fromJson(json[r'asset_group']),
        assetGroupDescription: mapValueOfType<String>(json, r'asset_group_description')!,
        assetGroupName: mapValueOfType<String>(json, r'asset_group_name')!,
        assetGroupTypes: AssetGroupType.listFromJson(json[r'asset_group_types']),
      );
    }
    return null;
  }

  static List<AssetGroupInputCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupInputCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupInputCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetGroupInputCreate> mapFromJson(dynamic json) {
    final map = <String, AssetGroupInputCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetGroupInputCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetGroupInputCreate-objects as value to a dart map
  static Map<String, List<AssetGroupInputCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetGroupInputCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetGroupInputCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_group_description',
    'asset_group_name',
    'asset_group_types',
  };
}

