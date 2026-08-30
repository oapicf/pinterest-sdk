//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeletePartnerAssetAccessItem {
  /// Returns a new [DeletePartnerAssetAccessItem] instance.
  DeletePartnerAssetAccessItem({
    required this.assetId,
    required this.partnerId,
    this.partnerType = const DeletePartnerAssetAccessItemPartnerTypeEnum._('INTERNAL'),
  });

  /// Unique identifier of the business asset.
  String assetId;

  /// Unique identifier of a business partner to update asset access to.
  String partnerId;

  /// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  DeletePartnerAssetAccessItemPartnerTypeEnum partnerType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeletePartnerAssetAccessItem &&
    other.assetId == assetId &&
    other.partnerId == partnerId &&
    other.partnerType == partnerType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId.hashCode) +
    (partnerId.hashCode) +
    (partnerType.hashCode);

  @override
  String toString() => 'DeletePartnerAssetAccessItem[assetId=$assetId, partnerId=$partnerId, partnerType=$partnerType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id'] = this.assetId;
      json[r'partner_id'] = this.partnerId;
      json[r'partner_type'] = this.partnerType;
    return json;
  }

  /// Returns a new [DeletePartnerAssetAccessItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeletePartnerAssetAccessItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'asset_id'), 'Required key "DeletePartnerAssetAccessItem[asset_id]" is missing from JSON.');
        assert(json[r'asset_id'] != null, 'Required key "DeletePartnerAssetAccessItem[asset_id]" has a null value in JSON.');
        assert(json.containsKey(r'partner_id'), 'Required key "DeletePartnerAssetAccessItem[partner_id]" is missing from JSON.');
        assert(json[r'partner_id'] != null, 'Required key "DeletePartnerAssetAccessItem[partner_id]" has a null value in JSON.');
        return true;
      }());

      return DeletePartnerAssetAccessItem(
        assetId: mapValueOfType<String>(json, r'asset_id')!,
        partnerId: mapValueOfType<String>(json, r'partner_id')!,
        partnerType: DeletePartnerAssetAccessItemPartnerTypeEnum.fromJson(json[r'partner_type']) ?? const DeletePartnerAssetAccessItemPartnerTypeEnum._('INTERNAL'),
      );
    }
    return null;
  }

  static List<DeletePartnerAssetAccessItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePartnerAssetAccessItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePartnerAssetAccessItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeletePartnerAssetAccessItem> mapFromJson(dynamic json) {
    final map = <String, DeletePartnerAssetAccessItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeletePartnerAssetAccessItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeletePartnerAssetAccessItem-objects as value to a dart map
  static Map<String, List<DeletePartnerAssetAccessItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeletePartnerAssetAccessItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeletePartnerAssetAccessItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id',
    'partner_id',
  };
}

/// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
enum DeletePartnerAssetAccessItemPartnerTypeEnum {
  INTERNAL._(r'INTERNAL'),
  EXTERNAL._(r'EXTERNAL'),
  ;

  /// Instantiate a new enum with the provided value.
  const DeletePartnerAssetAccessItemPartnerTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [DeletePartnerAssetAccessItemPartnerTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static DeletePartnerAssetAccessItemPartnerTypeEnum? fromJson(dynamic value) => DeletePartnerAssetAccessItemPartnerTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [DeletePartnerAssetAccessItemPartnerTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<DeletePartnerAssetAccessItemPartnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeletePartnerAssetAccessItemPartnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeletePartnerAssetAccessItemPartnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeletePartnerAssetAccessItemPartnerTypeEnum] to String,
/// and [decode] dynamic data back to [DeletePartnerAssetAccessItemPartnerTypeEnum].
class DeletePartnerAssetAccessItemPartnerTypeEnumTypeTransformer {
  factory DeletePartnerAssetAccessItemPartnerTypeEnumTypeTransformer() => _instance ??= const DeletePartnerAssetAccessItemPartnerTypeEnumTypeTransformer._();

  const DeletePartnerAssetAccessItemPartnerTypeEnumTypeTransformer._();

  String encode(DeletePartnerAssetAccessItemPartnerTypeEnum data) => data._value;

  /// Returns the instance of [DeletePartnerAssetAccessItemPartnerTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeletePartnerAssetAccessItemPartnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is DeletePartnerAssetAccessItemPartnerTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'INTERNAL': return DeletePartnerAssetAccessItemPartnerTypeEnum.INTERNAL;
        case r'EXTERNAL': return DeletePartnerAssetAccessItemPartnerTypeEnum.EXTERNAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static DeletePartnerAssetAccessItemPartnerTypeEnumTypeTransformer? _instance;
}


