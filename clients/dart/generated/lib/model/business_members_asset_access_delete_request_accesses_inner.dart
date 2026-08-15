//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessMembersAssetAccessDeleteRequestAccessesInner {
  /// Returns a new [BusinessMembersAssetAccessDeleteRequestAccessesInner] instance.
  BusinessMembersAssetAccessDeleteRequestAccessesInner({
    required this.assetId,
    required this.memberId,
  });

  /// Id of the asset on which to remove member permissions.
  String assetId;

  /// Unique identifier of the member on which to perform the asset permission removal
  String memberId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessMembersAssetAccessDeleteRequestAccessesInner &&
    other.assetId == assetId &&
    other.memberId == memberId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId.hashCode) +
    (memberId.hashCode);

  @override
  String toString() => 'BusinessMembersAssetAccessDeleteRequestAccessesInner[assetId=$assetId, memberId=$memberId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id'] = this.assetId;
      json[r'member_id'] = this.memberId;
    return json;
  }

  /// Returns a new [BusinessMembersAssetAccessDeleteRequestAccessesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessMembersAssetAccessDeleteRequestAccessesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BusinessMembersAssetAccessDeleteRequestAccessesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BusinessMembersAssetAccessDeleteRequestAccessesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BusinessMembersAssetAccessDeleteRequestAccessesInner(
        assetId: mapValueOfType<String>(json, r'asset_id')!,
        memberId: mapValueOfType<String>(json, r'member_id')!,
      );
    }
    return null;
  }

  static List<BusinessMembersAssetAccessDeleteRequestAccessesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessMembersAssetAccessDeleteRequestAccessesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessMembersAssetAccessDeleteRequestAccessesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessMembersAssetAccessDeleteRequestAccessesInner> mapFromJson(dynamic json) {
    final map = <String, BusinessMembersAssetAccessDeleteRequestAccessesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessMembersAssetAccessDeleteRequestAccessesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessMembersAssetAccessDeleteRequestAccessesInner-objects as value to a dart map
  static Map<String, List<BusinessMembersAssetAccessDeleteRequestAccessesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessMembersAssetAccessDeleteRequestAccessesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessMembersAssetAccessDeleteRequestAccessesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id',
    'member_id',
  };
}

