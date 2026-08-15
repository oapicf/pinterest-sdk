//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// <p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog.
class CatalogsHotelProductGroupType {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelProductGroupType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MERCHANT_CREATED = CatalogsHotelProductGroupType._(r'MERCHANT_CREATED');
  static const ALL_LISTINGS = CatalogsHotelProductGroupType._(r'ALL_LISTINGS');

  /// List of all possible values in this [enum][CatalogsHotelProductGroupType].
  static const values = <CatalogsHotelProductGroupType>[
    MERCHANT_CREATED,
    ALL_LISTINGS,
  ];

  static CatalogsHotelProductGroupType? fromJson(dynamic value) => CatalogsHotelProductGroupTypeTypeTransformer().decode(value);

  static List<CatalogsHotelProductGroupType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductGroupType] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductGroupType].
class CatalogsHotelProductGroupTypeTypeTransformer {
  factory CatalogsHotelProductGroupTypeTypeTransformer() => _instance ??= const CatalogsHotelProductGroupTypeTypeTransformer._();

  const CatalogsHotelProductGroupTypeTypeTransformer._();

  String encode(CatalogsHotelProductGroupType data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelProductGroupType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductGroupType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'MERCHANT_CREATED': return CatalogsHotelProductGroupType.MERCHANT_CREATED;
        case r'ALL_LISTINGS': return CatalogsHotelProductGroupType.ALL_LISTINGS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelProductGroupTypeTypeTransformer] instance.
  static CatalogsHotelProductGroupTypeTypeTransformer? _instance;
}

