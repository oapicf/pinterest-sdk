//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetGroupDeletionDelete {
  /// Returns a new [AssetGroupDeletionDelete] instance.
  AssetGroupDeletionDelete({
    this.assetGroupsToDelete = const [],
  });

  List<String> assetGroupsToDelete;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetGroupDeletionDelete &&
    _deepEquality.equals(other.assetGroupsToDelete, assetGroupsToDelete);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupsToDelete.hashCode);

  @override
  String toString() => 'AssetGroupDeletionDelete[assetGroupsToDelete=$assetGroupsToDelete]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_groups_to_delete'] = this.assetGroupsToDelete;
    return json;
  }

  /// Returns a new [AssetGroupDeletionDelete] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetGroupDeletionDelete? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'asset_groups_to_delete'), 'Required key "AssetGroupDeletionDelete[asset_groups_to_delete]" is missing from JSON.');
        assert(json[r'asset_groups_to_delete'] != null, 'Required key "AssetGroupDeletionDelete[asset_groups_to_delete]" has a null value in JSON.');
        return true;
      }());

      return AssetGroupDeletionDelete(
        assetGroupsToDelete: json[r'asset_groups_to_delete'] is Iterable
            ? (json[r'asset_groups_to_delete'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<AssetGroupDeletionDelete> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupDeletionDelete>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupDeletionDelete.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetGroupDeletionDelete> mapFromJson(dynamic json) {
    final map = <String, AssetGroupDeletionDelete>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetGroupDeletionDelete.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetGroupDeletionDelete-objects as value to a dart map
  static Map<String, List<AssetGroupDeletionDelete>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetGroupDeletionDelete>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetGroupDeletionDelete.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_groups_to_delete',
  };
}

