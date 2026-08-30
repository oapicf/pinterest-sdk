//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetGroupDeletion {
  /// Returns a new [AssetGroupDeletion] instance.
  AssetGroupDeletion({
    this.deletedAssetGroups = const [],
    this.exceptions = const [],
  });

  List<String> deletedAssetGroups;

  List<AssetGroupDeleteError>? exceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetGroupDeletion &&
    _deepEquality.equals(other.deletedAssetGroups, deletedAssetGroups) &&
    _deepEquality.equals(other.exceptions, exceptions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deletedAssetGroups.hashCode) +
    (exceptions == null ? 0 : exceptions!.hashCode);

  @override
  String toString() => 'AssetGroupDeletion[deletedAssetGroups=$deletedAssetGroups, exceptions=$exceptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'deleted_asset_groups'] = this.deletedAssetGroups;
    if (this.exceptions != null) {
      json[r'exceptions'] = this.exceptions;
    } else {
      json[r'exceptions'] = null;
    }
    return json;
  }

  /// Returns a new [AssetGroupDeletion] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetGroupDeletion? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AssetGroupDeletion(
        deletedAssetGroups: json[r'deleted_asset_groups'] is Iterable
            ? (json[r'deleted_asset_groups'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        exceptions: AssetGroupDeleteError.listFromJson(json[r'exceptions']),
      );
    }
    return null;
  }

  static List<AssetGroupDeletion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupDeletion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupDeletion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetGroupDeletion> mapFromJson(dynamic json) {
    final map = <String, AssetGroupDeletion>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetGroupDeletion.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetGroupDeletion-objects as value to a dart map
  static Map<String, List<AssetGroupDeletion>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetGroupDeletion>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetGroupDeletion.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

