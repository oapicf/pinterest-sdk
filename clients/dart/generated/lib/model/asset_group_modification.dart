//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetGroupModification {
  /// Returns a new [AssetGroupModification] instance.
  AssetGroupModification({
    this.exceptions = const [],
    this.updatedAssetGroups = const [],
  });

  /// A list of errors associated with the asset groups. Will be returned if there is an error.
  List<AssetGroupUpdateError> exceptions;

  /// A list of successfully edited asset groups.
  List<AssetGroupBinding> updatedAssetGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetGroupModification &&
    _deepEquality.equals(other.exceptions, exceptions) &&
    _deepEquality.equals(other.updatedAssetGroups, updatedAssetGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exceptions.hashCode) +
    (updatedAssetGroups.hashCode);

  @override
  String toString() => 'AssetGroupModification[exceptions=$exceptions, updatedAssetGroups=$updatedAssetGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'exceptions'] = this.exceptions;
      json[r'updated_asset_groups'] = this.updatedAssetGroups;
    return json;
  }

  /// Returns a new [AssetGroupModification] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetGroupModification? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AssetGroupModification(
        exceptions: AssetGroupUpdateError.listFromJson(json[r'exceptions']),
        updatedAssetGroups: AssetGroupBinding.listFromJson(json[r'updated_asset_groups']),
      );
    }
    return null;
  }

  static List<AssetGroupModification> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupModification>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupModification.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetGroupModification> mapFromJson(dynamic json) {
    final map = <String, AssetGroupModification>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetGroupModification.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetGroupModification-objects as value to a dart map
  static Map<String, List<AssetGroupModification>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetGroupModification>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetGroupModification.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

