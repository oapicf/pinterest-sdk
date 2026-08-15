//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Asset group type
class AssetGroupType {
  /// Instantiate a new enum with the provided [value].
  const AssetGroupType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BRAND = AssetGroupType._(r'BRAND');
  static const LOCATION_OR_LANGUAGE = AssetGroupType._(r'LOCATION_OR_LANGUAGE');
  static const PRODUCT_LINE = AssetGroupType._(r'PRODUCT_LINE');
  static const OTHER = AssetGroupType._(r'OTHER');

  /// List of all possible values in this [enum][AssetGroupType].
  static const values = <AssetGroupType>[
    BRAND,
    LOCATION_OR_LANGUAGE,
    PRODUCT_LINE,
    OTHER,
  ];

  static AssetGroupType? fromJson(dynamic value) => AssetGroupTypeTypeTransformer().decode(value);

  static List<AssetGroupType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssetGroupType] to String,
/// and [decode] dynamic data back to [AssetGroupType].
class AssetGroupTypeTypeTransformer {
  factory AssetGroupTypeTypeTransformer() => _instance ??= const AssetGroupTypeTypeTransformer._();

  const AssetGroupTypeTypeTransformer._();

  String encode(AssetGroupType data) => data.value;

  /// Decodes a [dynamic value][data] to a AssetGroupType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssetGroupType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BRAND': return AssetGroupType.BRAND;
        case r'LOCATION_OR_LANGUAGE': return AssetGroupType.LOCATION_OR_LANGUAGE;
        case r'PRODUCT_LINE': return AssetGroupType.PRODUCT_LINE;
        case r'OTHER': return AssetGroupType.OTHER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssetGroupTypeTypeTransformer] instance.
  static AssetGroupTypeTypeTransformer? _instance;
}

