//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletePartnerAssetAccessResult {
  /// Returns a new [DeletePartnerAssetAccessResult] instance.
  DeletePartnerAssetAccessResult({
    this.assetId,
    this.assetType,
    this.isSharedPartner,
    this.partnerId,
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

  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? assetType;

  /// If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isSharedPartner;

  /// Unique identifier of a business partner.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerId;

  /// Permission levels member or partner has on an asset.
  List<String> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletePartnerAssetAccessResult &&
    other.assetId == assetId &&
    other.assetType == assetType &&
    other.isSharedPartner == isSharedPartner &&
    other.partnerId == partnerId &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId == null ? 0 : assetId!.hashCode) +
    (assetType == null ? 0 : assetType!.hashCode) +
    (isSharedPartner == null ? 0 : isSharedPartner!.hashCode) +
    (partnerId == null ? 0 : partnerId!.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'DeletePartnerAssetAccessResult[assetId=$assetId, assetType=$assetType, isSharedPartner=$isSharedPartner, partnerId=$partnerId, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    if (this.isSharedPartner != null) {
      json[r'is_shared_partner'] = this.isSharedPartner;
    } else {
      json[r'is_shared_partner'] = null;
    }
    if (this.partnerId != null) {
      json[r'partner_id'] = this.partnerId;
    } else {
      json[r'partner_id'] = null;
    }
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [DeletePartnerAssetAccessResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletePartnerAssetAccessResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return DeletePartnerAssetAccessResult(
        assetId: mapValueOfType<String>(json, r'asset_id'),
        assetType: mapValueOfType<String>(json, r'asset_type'),
        isSharedPartner: mapValueOfType<bool>(json, r'is_shared_partner'),
        partnerId: mapValueOfType<String>(json, r'partner_id'),
        permissions: json[r'permissions'] is Iterable
            ? (json[r'permissions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<DeletePartnerAssetAccessResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePartnerAssetAccessResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePartnerAssetAccessResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletePartnerAssetAccessResult> mapFromJson(dynamic json) {
    final map = <String, DeletePartnerAssetAccessResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletePartnerAssetAccessResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletePartnerAssetAccessResult-objects as value to a dart map
  static Map<String, List<DeletePartnerAssetAccessResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletePartnerAssetAccessResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletePartnerAssetAccessResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

