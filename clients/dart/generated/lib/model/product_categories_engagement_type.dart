//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ProductCategoriesEngagementType {
  /// Instantiate a new enum with the provided [value].
  const ProductCategoriesEngagementType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ENGAGEMENT = ProductCategoriesEngagementType._(r'ENGAGEMENT');
  static const OUTBOUND_CLICK = ProductCategoriesEngagementType._(r'OUTBOUND_CLICK');
  static const SAVE = ProductCategoriesEngagementType._(r'SAVE');

  /// List of all possible values in this [enum][ProductCategoriesEngagementType].
  static const values = <ProductCategoriesEngagementType>[
    ENGAGEMENT,
    OUTBOUND_CLICK,
    SAVE,
  ];

  static ProductCategoriesEngagementType? fromJson(dynamic value) => ProductCategoriesEngagementTypeTypeTransformer().decode(value);

  static List<ProductCategoriesEngagementType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductCategoriesEngagementType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductCategoriesEngagementType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductCategoriesEngagementType] to String,
/// and [decode] dynamic data back to [ProductCategoriesEngagementType].
class ProductCategoriesEngagementTypeTypeTransformer {
  factory ProductCategoriesEngagementTypeTypeTransformer() => _instance ??= const ProductCategoriesEngagementTypeTypeTransformer._();

  const ProductCategoriesEngagementTypeTypeTransformer._();

  String encode(ProductCategoriesEngagementType data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductCategoriesEngagementType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductCategoriesEngagementType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ENGAGEMENT': return ProductCategoriesEngagementType.ENGAGEMENT;
        case r'OUTBOUND_CLICK': return ProductCategoriesEngagementType.OUTBOUND_CLICK;
        case r'SAVE': return ProductCategoriesEngagementType.SAVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductCategoriesEngagementTypeTypeTransformer] instance.
  static ProductCategoriesEngagementTypeTypeTransformer? _instance;
}

