//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateAssetGroupResponse {
  /// Returns a new [UpdateAssetGroupResponse] instance.
  UpdateAssetGroupResponse({
    this.exceptions = const [],
    this.updatedAssetGroups = const [],
  });

  /// A list of errors associated with the asset groups. Will be returned if there is an error.
  List<UpdateAssetGroupResponseExceptionsInner>? exceptions;

  /// A list of successfully edited asset groups.
  List<AssetGroupBinding> updatedAssetGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateAssetGroupResponse &&
    _deepEquality.equals(other.exceptions, exceptions) &&
    _deepEquality.equals(other.updatedAssetGroups, updatedAssetGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exceptions == null ? 0 : exceptions!.hashCode) +
    (updatedAssetGroups.hashCode);

  @override
  String toString() => 'UpdateAssetGroupResponse[exceptions=$exceptions, updatedAssetGroups=$updatedAssetGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.exceptions != null) {
      json[r'exceptions'] = this.exceptions;
    } else {
      json[r'exceptions'] = null;
    }
      json[r'updated_asset_groups'] = this.updatedAssetGroups;
    return json;
  }

  /// Returns a new [UpdateAssetGroupResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateAssetGroupResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateAssetGroupResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateAssetGroupResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateAssetGroupResponse(
        exceptions: UpdateAssetGroupResponseExceptionsInner.listFromJson(json[r'exceptions']),
        updatedAssetGroups: AssetGroupBinding.listFromJson(json[r'updated_asset_groups']),
      );
    }
    return null;
  }

  static List<UpdateAssetGroupResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateAssetGroupResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateAssetGroupResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateAssetGroupResponse> mapFromJson(dynamic json) {
    final map = <String, UpdateAssetGroupResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateAssetGroupResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateAssetGroupResponse-objects as value to a dart map
  static Map<String, List<UpdateAssetGroupResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateAssetGroupResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateAssetGroupResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

