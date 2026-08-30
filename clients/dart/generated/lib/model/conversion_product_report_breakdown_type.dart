//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum ConversionProductReportBreakdownType {
  PRODUCT_BRAND._(r'PRODUCT_BRAND'),
  PRODUCT_CATEGORY._(r'PRODUCT_CATEGORY'),
  PRODUCT_BRAND_AND_CATEGORY._(r'PRODUCT_BRAND_AND_CATEGORY'),
  PRODUCT_SKU._(r'PRODUCT_SKU'),
  PRODUCT_SKU_GROUP._(r'PRODUCT_SKU_GROUP'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionProductReportBreakdownType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionProductReportBreakdownType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionProductReportBreakdownType? fromJson(dynamic value) => ConversionProductReportBreakdownTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionProductReportBreakdownType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionProductReportBreakdownType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportBreakdownType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportBreakdownType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionProductReportBreakdownType] to String,
/// and [decode] dynamic data back to [ConversionProductReportBreakdownType].
class ConversionProductReportBreakdownTypeTypeTransformer {
  factory ConversionProductReportBreakdownTypeTypeTransformer() => _instance ??= const ConversionProductReportBreakdownTypeTypeTransformer._();

  const ConversionProductReportBreakdownTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionProductReportBreakdownType data) => data._value;

  /// Returns the instance of [ConversionProductReportBreakdownType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionProductReportBreakdownType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionProductReportBreakdownType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PRODUCT_BRAND': return ConversionProductReportBreakdownType.PRODUCT_BRAND;
        case r'PRODUCT_CATEGORY': return ConversionProductReportBreakdownType.PRODUCT_CATEGORY;
        case r'PRODUCT_BRAND_AND_CATEGORY': return ConversionProductReportBreakdownType.PRODUCT_BRAND_AND_CATEGORY;
        case r'PRODUCT_SKU': return ConversionProductReportBreakdownType.PRODUCT_SKU;
        case r'PRODUCT_SKU_GROUP': return ConversionProductReportBreakdownType.PRODUCT_SKU_GROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionProductReportBreakdownTypeTypeTransformer? _instance;
}

