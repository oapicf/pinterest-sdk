//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateAssetAccessRequestBodyAssetRequestsInner {
  /// Returns a new [CreateAssetAccessRequestBodyAssetRequestsInner] instance.
  CreateAssetAccessRequestBodyAssetRequestsInner({
    this.assetIdToPermissions = const {},
    required this.partnerId,
  });

  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  Map<String, List<Permissions>> assetIdToPermissions;

  /// Unique identifier of a business partner to request asset access to.
  String partnerId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateAssetAccessRequestBodyAssetRequestsInner &&
    _deepEquality.equals(other.assetIdToPermissions, assetIdToPermissions) &&
    other.partnerId == partnerId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetIdToPermissions.hashCode) +
    (partnerId.hashCode);

  @override
  String toString() => 'CreateAssetAccessRequestBodyAssetRequestsInner[assetIdToPermissions=$assetIdToPermissions, partnerId=$partnerId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id_to_permissions'] = this.assetIdToPermissions;
      json[r'partner_id'] = this.partnerId;
    return json;
  }

  /// Returns a new [CreateAssetAccessRequestBodyAssetRequestsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateAssetAccessRequestBodyAssetRequestsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateAssetAccessRequestBodyAssetRequestsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateAssetAccessRequestBodyAssetRequestsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateAssetAccessRequestBodyAssetRequestsInner(
        assetIdToPermissions: json[r'asset_id_to_permissions'] == null
          ? const {}
            : Permissions.mapListFromJson(json[r'asset_id_to_permissions']),
        partnerId: mapValueOfType<String>(json, r'partner_id')!,
      );
    }
    return null;
  }

  static List<CreateAssetAccessRequestBodyAssetRequestsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssetAccessRequestBodyAssetRequestsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssetAccessRequestBodyAssetRequestsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateAssetAccessRequestBodyAssetRequestsInner> mapFromJson(dynamic json) {
    final map = <String, CreateAssetAccessRequestBodyAssetRequestsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateAssetAccessRequestBodyAssetRequestsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateAssetAccessRequestBodyAssetRequestsInner-objects as value to a dart map
  static Map<String, List<CreateAssetAccessRequestBodyAssetRequestsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateAssetAccessRequestBodyAssetRequestsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateAssetAccessRequestBodyAssetRequestsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id_to_permissions',
    'partner_id',
  };
}

