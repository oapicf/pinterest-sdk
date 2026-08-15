//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsersForIndividualAssetResponse {
  /// Returns a new [UsersForIndividualAssetResponse] instance.
  UsersForIndividualAssetResponse({
    this.assetId,
    this.memberId,
    this.permissions = const [],
  });

  /// Unique identifier of a business asset.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assetId;

  /// Unique identifier of the business member with asset access.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? memberId;

  /// Permission levels member or partner has on an asset.
  List<String> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsersForIndividualAssetResponse &&
    other.assetId == assetId &&
    other.memberId == memberId &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId == null ? 0 : assetId!.hashCode) +
    (memberId == null ? 0 : memberId!.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'UsersForIndividualAssetResponse[assetId=$assetId, memberId=$memberId, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetId != null) {
      json[r'asset_id'] = this.assetId;
    } else {
      json[r'asset_id'] = null;
    }
    if (this.memberId != null) {
      json[r'member_id'] = this.memberId;
    } else {
      json[r'member_id'] = null;
    }
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [UsersForIndividualAssetResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsersForIndividualAssetResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsersForIndividualAssetResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsersForIndividualAssetResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsersForIndividualAssetResponse(
        assetId: mapValueOfType<String>(json, r'asset_id'),
        memberId: mapValueOfType<String>(json, r'member_id'),
        permissions: json[r'permissions'] is Iterable
            ? (json[r'permissions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<UsersForIndividualAssetResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsersForIndividualAssetResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsersForIndividualAssetResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsersForIndividualAssetResponse> mapFromJson(dynamic json) {
    final map = <String, UsersForIndividualAssetResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsersForIndividualAssetResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsersForIndividualAssetResponse-objects as value to a dart map
  static Map<String, List<UsersForIndividualAssetResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsersForIndividualAssetResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsersForIndividualAssetResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

