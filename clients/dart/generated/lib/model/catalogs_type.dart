//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Type of the catalog entity.
class CatalogsType {
  /// Instantiate a new enum with the provided [value].
  const CatalogsType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RETAIL = CatalogsType._(r'RETAIL');
  static const HOTEL = CatalogsType._(r'HOTEL');
  static const CREATIVE_ASSETS = CatalogsType._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsType].
  static const values = <CatalogsType>[
    RETAIL,
    HOTEL,
    CREATIVE_ASSETS,
  ];

  static CatalogsType? fromJson(dynamic value) => CatalogsTypeTypeTransformer().decode(value);

  static List<CatalogsType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsType] to String,
/// and [decode] dynamic data back to [CatalogsType].
class CatalogsTypeTypeTransformer {
  factory CatalogsTypeTypeTransformer() => _instance ??= const CatalogsTypeTypeTransformer._();

  const CatalogsTypeTypeTransformer._();

  String encode(CatalogsType data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsType.RETAIL;
        case r'HOTEL': return CatalogsType.HOTEL;
        case r'CREATIVE_ASSETS': return CatalogsType.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsTypeTypeTransformer] instance.
  static CatalogsTypeTypeTransformer? _instance;
}

