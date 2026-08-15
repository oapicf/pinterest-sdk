//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// List of verticals for product categories.
class VerticalProductCategory {
  /// Instantiate a new enum with the provided [value].
  const VerticalProductCategory._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FASHION = VerticalProductCategory._(r'FASHION');
  static const HOME_DECOR = VerticalProductCategory._(r'HOME_DECOR');
  static const BEAUTY = VerticalProductCategory._(r'BEAUTY');

  /// List of all possible values in this [enum][VerticalProductCategory].
  static const values = <VerticalProductCategory>[
    FASHION,
    HOME_DECOR,
    BEAUTY,
  ];

  static VerticalProductCategory? fromJson(dynamic value) => VerticalProductCategoryTypeTransformer().decode(value);

  static List<VerticalProductCategory> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VerticalProductCategory>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VerticalProductCategory.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VerticalProductCategory] to String,
/// and [decode] dynamic data back to [VerticalProductCategory].
class VerticalProductCategoryTypeTransformer {
  factory VerticalProductCategoryTypeTransformer() => _instance ??= const VerticalProductCategoryTypeTransformer._();

  const VerticalProductCategoryTypeTransformer._();

  String encode(VerticalProductCategory data) => data.value;

  /// Decodes a [dynamic value][data] to a VerticalProductCategory.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VerticalProductCategory? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FASHION': return VerticalProductCategory.FASHION;
        case r'HOME_DECOR': return VerticalProductCategory.HOME_DECOR;
        case r'BEAUTY': return VerticalProductCategory.BEAUTY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [VerticalProductCategoryTypeTransformer] instance.
  static VerticalProductCategoryTypeTransformer? _instance;
}

