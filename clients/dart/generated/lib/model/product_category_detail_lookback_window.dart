//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ProductCategoryDetailLookbackWindow {
  /// Instantiate a new enum with the provided [value].
  const ProductCategoryDetailLookbackWindow._(this.value);

  /// The underlying value of this enum member.
  final num value;

  @override
  String toString() => value.toString();

  num toJson() => value;

  static const n90 = ProductCategoryDetailLookbackWindow._('90');
  static const n180 = ProductCategoryDetailLookbackWindow._('180');
  static const n365 = ProductCategoryDetailLookbackWindow._('365');
  static const n730 = ProductCategoryDetailLookbackWindow._('730');

  /// List of all possible values in this [enum][ProductCategoryDetailLookbackWindow].
  static const values = <ProductCategoryDetailLookbackWindow>[
    n90,
    n180,
    n365,
    n730,
  ];

  static ProductCategoryDetailLookbackWindow? fromJson(dynamic value) => ProductCategoryDetailLookbackWindowTypeTransformer().decode(value);

  static List<ProductCategoryDetailLookbackWindow> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductCategoryDetailLookbackWindow>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductCategoryDetailLookbackWindow.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductCategoryDetailLookbackWindow] to num,
/// and [decode] dynamic data back to [ProductCategoryDetailLookbackWindow].
class ProductCategoryDetailLookbackWindowTypeTransformer {
  factory ProductCategoryDetailLookbackWindowTypeTransformer() => _instance ??= const ProductCategoryDetailLookbackWindowTypeTransformer._();

  const ProductCategoryDetailLookbackWindowTypeTransformer._();

  num encode(ProductCategoryDetailLookbackWindow data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductCategoryDetailLookbackWindow.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductCategoryDetailLookbackWindow? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case '90': return ProductCategoryDetailLookbackWindow.n90;
        case '180': return ProductCategoryDetailLookbackWindow.n180;
        case '365': return ProductCategoryDetailLookbackWindow.n365;
        case '730': return ProductCategoryDetailLookbackWindow.n730;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductCategoryDetailLookbackWindowTypeTransformer] instance.
  static ProductCategoryDetailLookbackWindowTypeTransformer? _instance;
}

