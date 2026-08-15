//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetBusinessAssetsResponse {
  /// Returns a new [GetBusinessAssetsResponse] instance.
  GetBusinessAssetsResponse({
    this.assetGroupInfo,
    this.assetId,
    this.assetType,
    this.catalogInfo,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssetGroupBinding? assetGroupInfo;

  /// Unique identifier of a business asset.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assetId;

  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assetType;

  GetBusinessAssetsResponseCatalogInfo? catalogInfo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetBusinessAssetsResponse &&
    other.assetGroupInfo == assetGroupInfo &&
    other.assetId == assetId &&
    other.assetType == assetType &&
    other.catalogInfo == catalogInfo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupInfo == null ? 0 : assetGroupInfo!.hashCode) +
    (assetId == null ? 0 : assetId!.hashCode) +
    (assetType == null ? 0 : assetType!.hashCode) +
    (catalogInfo == null ? 0 : catalogInfo!.hashCode);

  @override
  String toString() => 'GetBusinessAssetsResponse[assetGroupInfo=$assetGroupInfo, assetId=$assetId, assetType=$assetType, catalogInfo=$catalogInfo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetGroupInfo != null) {
      json[r'asset_group_info'] = this.assetGroupInfo;
    } else {
      json[r'asset_group_info'] = null;
    }
    if (this.assetId != null) {
      json[r'asset_id'] = this.assetId;
    } else {
      json[r'asset_id'] = null;
    }
    if (this.assetType != null) {
      json[r'asset_type'] = this.assetType;
    } else {
      json[r'asset_type'] = null;
    }
    if (this.catalogInfo != null) {
      json[r'catalog_info'] = this.catalogInfo;
    } else {
      json[r'catalog_info'] = null;
    }
    return json;
  }

  /// Returns a new [GetBusinessAssetsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetBusinessAssetsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetBusinessAssetsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetBusinessAssetsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetBusinessAssetsResponse(
        assetGroupInfo: AssetGroupBinding.fromJson(json[r'asset_group_info']),
        assetId: mapValueOfType<String>(json, r'asset_id'),
        assetType: mapValueOfType<String>(json, r'asset_type'),
        catalogInfo: GetBusinessAssetsResponseCatalogInfo.fromJson(json[r'catalog_info']),
      );
    }
    return null;
  }

  static List<GetBusinessAssetsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetBusinessAssetsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetBusinessAssetsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetBusinessAssetsResponse> mapFromJson(dynamic json) {
    final map = <String, GetBusinessAssetsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetBusinessAssetsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetBusinessAssetsResponse-objects as value to a dart map
  static Map<String, List<GetBusinessAssetsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetBusinessAssetsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = GetBusinessAssetsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

