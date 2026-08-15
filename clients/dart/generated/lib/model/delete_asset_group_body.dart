//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteAssetGroupBody {
  /// Returns a new [DeleteAssetGroupBody] instance.
  DeleteAssetGroupBody({
    this.assetGroupsToDelete = const [],
  });

  /// List of ids of asset groups to be deleted
  List<String> assetGroupsToDelete;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteAssetGroupBody &&
    _deepEquality.equals(other.assetGroupsToDelete, assetGroupsToDelete);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupsToDelete.hashCode);

  @override
  String toString() => 'DeleteAssetGroupBody[assetGroupsToDelete=$assetGroupsToDelete]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_groups_to_delete'] = this.assetGroupsToDelete;
    return json;
  }

  /// Returns a new [DeleteAssetGroupBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteAssetGroupBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteAssetGroupBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteAssetGroupBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteAssetGroupBody(
        assetGroupsToDelete: json[r'asset_groups_to_delete'] is Iterable
            ? (json[r'asset_groups_to_delete'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<DeleteAssetGroupBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteAssetGroupBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteAssetGroupBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteAssetGroupBody> mapFromJson(dynamic json) {
    final map = <String, DeleteAssetGroupBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteAssetGroupBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteAssetGroupBody-objects as value to a dart map
  static Map<String, List<DeleteAssetGroupBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteAssetGroupBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteAssetGroupBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_groups_to_delete',
  };
}

