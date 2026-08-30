//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetGroupInput {
  /// Returns a new [AssetGroupInput] instance.
  AssetGroupInput({
    this.assetGroup,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssetGroupBinding? assetGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetGroupInput &&
    other.assetGroup == assetGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroup == null ? 0 : assetGroup!.hashCode);

  @override
  String toString() => 'AssetGroupInput[assetGroup=$assetGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetGroup != null) {
      json[r'asset_group'] = this.assetGroup;
    } else {
      json[r'asset_group'] = null;
    }
    return json;
  }

  /// Returns a new [AssetGroupInput] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetGroupInput? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AssetGroupInput(
        assetGroup: AssetGroupBinding.fromJson(json[r'asset_group']),
      );
    }
    return null;
  }

  static List<AssetGroupInput> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupInput>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupInput.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetGroupInput> mapFromJson(dynamic json) {
    final map = <String, AssetGroupInput>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetGroupInput.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetGroupInput-objects as value to a dart map
  static Map<String, List<AssetGroupInput>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetGroupInput>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetGroupInput.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

