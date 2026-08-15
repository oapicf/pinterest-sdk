//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateAssetGroupBodyAssetGroupsToUpdateInner {
  /// Returns a new [UpdateAssetGroupBodyAssetGroupsToUpdateInner] instance.
  UpdateAssetGroupBodyAssetGroupsToUpdateInner({
    required this.assetGroupId,
    this.assetGroupTypes = const [],
    this.assetsToAdd = const [],
    this.assetsToRemove = const [],
    this.description,
    this.name,
  });

  /// Unique identifier of the asset group to update.
  String assetGroupId;

  /// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  List<AssetGroupType> assetGroupTypes;

  /// A list of asset ids to add to the asset group.
  List<String> assetsToAdd;

  /// A list of asset ids to remove from the asset group.
  List<String> assetsToRemove;

  /// Asset group description
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Asset Group name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateAssetGroupBodyAssetGroupsToUpdateInner &&
    other.assetGroupId == assetGroupId &&
    _deepEquality.equals(other.assetGroupTypes, assetGroupTypes) &&
    _deepEquality.equals(other.assetsToAdd, assetsToAdd) &&
    _deepEquality.equals(other.assetsToRemove, assetsToRemove) &&
    other.description == description &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupId.hashCode) +
    (assetGroupTypes.hashCode) +
    (assetsToAdd.hashCode) +
    (assetsToRemove.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'UpdateAssetGroupBodyAssetGroupsToUpdateInner[assetGroupId=$assetGroupId, assetGroupTypes=$assetGroupTypes, assetsToAdd=$assetsToAdd, assetsToRemove=$assetsToRemove, description=$description, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_group_id'] = this.assetGroupId;
      json[r'asset_group_types'] = this.assetGroupTypes;
      json[r'assets_to_add'] = this.assetsToAdd;
      json[r'assets_to_remove'] = this.assetsToRemove;
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateAssetGroupBodyAssetGroupsToUpdateInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateAssetGroupBodyAssetGroupsToUpdateInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateAssetGroupBodyAssetGroupsToUpdateInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateAssetGroupBodyAssetGroupsToUpdateInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateAssetGroupBodyAssetGroupsToUpdateInner(
        assetGroupId: mapValueOfType<String>(json, r'asset_group_id')!,
        assetGroupTypes: AssetGroupType.listFromJson(json[r'asset_group_types']),
        assetsToAdd: json[r'assets_to_add'] is Iterable
            ? (json[r'assets_to_add'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        assetsToRemove: json[r'assets_to_remove'] is Iterable
            ? (json[r'assets_to_remove'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        description: mapValueOfType<String>(json, r'description'),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateAssetGroupBodyAssetGroupsToUpdateInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateAssetGroupBodyAssetGroupsToUpdateInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateAssetGroupBodyAssetGroupsToUpdateInner> mapFromJson(dynamic json) {
    final map = <String, UpdateAssetGroupBodyAssetGroupsToUpdateInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateAssetGroupBodyAssetGroupsToUpdateInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateAssetGroupBodyAssetGroupsToUpdateInner-objects as value to a dart map
  static Map<String, List<UpdateAssetGroupBodyAssetGroupsToUpdateInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateAssetGroupBodyAssetGroupsToUpdateInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateAssetGroupBodyAssetGroupsToUpdateInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_group_id',
  };
}

