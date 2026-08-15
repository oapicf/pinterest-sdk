//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateAssetGroupBody {
  /// Returns a new [CreateAssetGroupBody] instance.
  CreateAssetGroupBody({
    required this.assetGroupDescription,
    required this.assetGroupName,
    this.assetGroupTypes = const [],
  });

  /// Asset group description
  String assetGroupDescription;

  /// Asset Group name
  String assetGroupName;

  /// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  List<AssetGroupType> assetGroupTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateAssetGroupBody &&
    other.assetGroupDescription == assetGroupDescription &&
    other.assetGroupName == assetGroupName &&
    _deepEquality.equals(other.assetGroupTypes, assetGroupTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupDescription.hashCode) +
    (assetGroupName.hashCode) +
    (assetGroupTypes.hashCode);

  @override
  String toString() => 'CreateAssetGroupBody[assetGroupDescription=$assetGroupDescription, assetGroupName=$assetGroupName, assetGroupTypes=$assetGroupTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_group_description'] = this.assetGroupDescription;
      json[r'asset_group_name'] = this.assetGroupName;
      json[r'asset_group_types'] = this.assetGroupTypes;
    return json;
  }

  /// Returns a new [CreateAssetGroupBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateAssetGroupBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateAssetGroupBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateAssetGroupBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateAssetGroupBody(
        assetGroupDescription: mapValueOfType<String>(json, r'asset_group_description')!,
        assetGroupName: mapValueOfType<String>(json, r'asset_group_name')!,
        assetGroupTypes: AssetGroupType.listFromJson(json[r'asset_group_types']),
      );
    }
    return null;
  }

  static List<CreateAssetGroupBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssetGroupBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssetGroupBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateAssetGroupBody> mapFromJson(dynamic json) {
    final map = <String, CreateAssetGroupBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateAssetGroupBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateAssetGroupBody-objects as value to a dart map
  static Map<String, List<CreateAssetGroupBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateAssetGroupBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateAssetGroupBody.listFromJson(entry.value, growable: growable,);
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

