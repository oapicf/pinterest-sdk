//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Summary status for product group
class ProductGroupSummaryStatus {
  /// Instantiate a new enum with the provided [value].
  const ProductGroupSummaryStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RUNNING = ProductGroupSummaryStatus._(r'RUNNING');
  static const PAUSED = ProductGroupSummaryStatus._(r'PAUSED');
  static const EXCLUDED = ProductGroupSummaryStatus._(r'EXCLUDED');
  static const ARCHIVED = ProductGroupSummaryStatus._(r'ARCHIVED');

  /// List of all possible values in this [enum][ProductGroupSummaryStatus].
  static const values = <ProductGroupSummaryStatus>[
    RUNNING,
    PAUSED,
    EXCLUDED,
    ARCHIVED,
  ];

  static ProductGroupSummaryStatus? fromJson(dynamic value) => ProductGroupSummaryStatusTypeTransformer().decode(value);

  static List<ProductGroupSummaryStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupSummaryStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupSummaryStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductGroupSummaryStatus] to String,
/// and [decode] dynamic data back to [ProductGroupSummaryStatus].
class ProductGroupSummaryStatusTypeTransformer {
  factory ProductGroupSummaryStatusTypeTransformer() => _instance ??= const ProductGroupSummaryStatusTypeTransformer._();

  const ProductGroupSummaryStatusTypeTransformer._();

  String encode(ProductGroupSummaryStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductGroupSummaryStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductGroupSummaryStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RUNNING': return ProductGroupSummaryStatus.RUNNING;
        case r'PAUSED': return ProductGroupSummaryStatus.PAUSED;
        case r'EXCLUDED': return ProductGroupSummaryStatus.EXCLUDED;
        case r'ARCHIVED': return ProductGroupSummaryStatus.ARCHIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductGroupSummaryStatusTypeTransformer] instance.
  static ProductGroupSummaryStatusTypeTransformer? _instance;
}

