//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
enum AssetTypeResponse {
  AD_ACCOUNT._(r'AD_ACCOUNT'),
  MERCHANT._(r'MERCHANT'),
  PROFILE._(r'PROFILE'),
  ASSET_GROUP._(r'ASSET_GROUP'),
  PINNER_LIST._(r'PINNER_LIST'),
  CONVERSION_TAG._(r'CONVERSION_TAG'),
  CATALOG._(r'CATALOG'),
  CONVERSION_SEGMENT._(r'CONVERSION_SEGMENT'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssetTypeResponse._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssetTypeResponse] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssetTypeResponse? fromJson(dynamic value) => AssetTypeResponseTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssetTypeResponse]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssetTypeResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetTypeResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetTypeResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssetTypeResponse] to String,
/// and [decode] dynamic data back to [AssetTypeResponse].
class AssetTypeResponseTypeTransformer {
  factory AssetTypeResponseTypeTransformer() => _instance ??= const AssetTypeResponseTypeTransformer._();

  const AssetTypeResponseTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AssetTypeResponse data) => data._value;

  /// Returns the instance of [AssetTypeResponse] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssetTypeResponse? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssetTypeResponse) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AD_ACCOUNT': return AssetTypeResponse.AD_ACCOUNT;
        case r'MERCHANT': return AssetTypeResponse.MERCHANT;
        case r'PROFILE': return AssetTypeResponse.PROFILE;
        case r'ASSET_GROUP': return AssetTypeResponse.ASSET_GROUP;
        case r'PINNER_LIST': return AssetTypeResponse.PINNER_LIST;
        case r'CONVERSION_TAG': return AssetTypeResponse.CONVERSION_TAG;
        case r'CATALOG': return AssetTypeResponse.CATALOG;
        case r'CONVERSION_SEGMENT': return AssetTypeResponse.CONVERSION_SEGMENT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssetTypeResponseTypeTransformer? _instance;
}

