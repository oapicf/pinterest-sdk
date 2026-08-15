//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdatePartnerAssetAccessBodyAccessesInner {
  /// Returns a new [UpdatePartnerAssetAccessBodyAccessesInner] instance.
  UpdatePartnerAssetAccessBodyAccessesInner({
    required this.assetId,
    required this.partnerId,
    this.permissions = const [],
  });

  /// Unique identifier of the business asset.
  String assetId;

  /// Unique identifier of a business partner to update asset access to.
  String partnerId;

  /// A non-empty array of permissions to assign to the partner.
  List<Permissions> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdatePartnerAssetAccessBodyAccessesInner &&
    other.assetId == assetId &&
    other.partnerId == partnerId &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId.hashCode) +
    (partnerId.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'UpdatePartnerAssetAccessBodyAccessesInner[assetId=$assetId, partnerId=$partnerId, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id'] = this.assetId;
      json[r'partner_id'] = this.partnerId;
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [UpdatePartnerAssetAccessBodyAccessesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdatePartnerAssetAccessBodyAccessesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdatePartnerAssetAccessBodyAccessesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdatePartnerAssetAccessBodyAccessesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdatePartnerAssetAccessBodyAccessesInner(
        assetId: mapValueOfType<String>(json, r'asset_id')!,
        partnerId: mapValueOfType<String>(json, r'partner_id')!,
        permissions: Permissions.listFromJson(json[r'permissions']),
      );
    }
    return null;
  }

  static List<UpdatePartnerAssetAccessBodyAccessesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdatePartnerAssetAccessBodyAccessesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdatePartnerAssetAccessBodyAccessesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdatePartnerAssetAccessBodyAccessesInner> mapFromJson(dynamic json) {
    final map = <String, UpdatePartnerAssetAccessBodyAccessesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdatePartnerAssetAccessBodyAccessesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdatePartnerAssetAccessBodyAccessesInner-objects as value to a dart map
  static Map<String, List<UpdatePartnerAssetAccessBodyAccessesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdatePartnerAssetAccessBodyAccessesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdatePartnerAssetAccessBodyAccessesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id',
    'partner_id',
    'permissions',
  };
}

