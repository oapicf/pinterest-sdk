//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Type of asset.
class GetBusinessAssetTypeResponse {
  /// Instantiate a new enum with the provided [value].
  const GetBusinessAssetTypeResponse._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AD_ACCOUNT = GetBusinessAssetTypeResponse._(r'AD_ACCOUNT');
  static const PROFILE = GetBusinessAssetTypeResponse._(r'PROFILE');
  static const ASSET_GROUP = GetBusinessAssetTypeResponse._(r'ASSET_GROUP');
  static const CONVERSION_TAG = GetBusinessAssetTypeResponse._(r'CONVERSION_TAG');
  static const CATALOG = GetBusinessAssetTypeResponse._(r'CATALOG');

  /// List of all possible values in this [enum][GetBusinessAssetTypeResponse].
  static const values = <GetBusinessAssetTypeResponse>[
    AD_ACCOUNT,
    PROFILE,
    ASSET_GROUP,
    CONVERSION_TAG,
    CATALOG,
  ];

  static GetBusinessAssetTypeResponse? fromJson(dynamic value) => GetBusinessAssetTypeResponseTypeTransformer().decode(value);

  static List<GetBusinessAssetTypeResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetBusinessAssetTypeResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetBusinessAssetTypeResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GetBusinessAssetTypeResponse] to String,
/// and [decode] dynamic data back to [GetBusinessAssetTypeResponse].
class GetBusinessAssetTypeResponseTypeTransformer {
  factory GetBusinessAssetTypeResponseTypeTransformer() => _instance ??= const GetBusinessAssetTypeResponseTypeTransformer._();

  const GetBusinessAssetTypeResponseTypeTransformer._();

  String encode(GetBusinessAssetTypeResponse data) => data.value;

  /// Decodes a [dynamic value][data] to a GetBusinessAssetTypeResponse.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GetBusinessAssetTypeResponse? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AD_ACCOUNT': return GetBusinessAssetTypeResponse.AD_ACCOUNT;
        case r'PROFILE': return GetBusinessAssetTypeResponse.PROFILE;
        case r'ASSET_GROUP': return GetBusinessAssetTypeResponse.ASSET_GROUP;
        case r'CONVERSION_TAG': return GetBusinessAssetTypeResponse.CONVERSION_TAG;
        case r'CATALOG': return GetBusinessAssetTypeResponse.CATALOG;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GetBusinessAssetTypeResponseTypeTransformer] instance.
  static GetBusinessAssetTypeResponseTypeTransformer? _instance;
}

