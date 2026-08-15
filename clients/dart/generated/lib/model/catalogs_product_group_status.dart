//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CatalogsProductGroupStatus {
  /// Instantiate a new enum with the provided [value].
  const CatalogsProductGroupStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = CatalogsProductGroupStatus._(r'ACTIVE');
  static const INACTIVE = CatalogsProductGroupStatus._(r'INACTIVE');

  /// List of all possible values in this [enum][CatalogsProductGroupStatus].
  static const values = <CatalogsProductGroupStatus>[
    ACTIVE,
    INACTIVE,
  ];

  static CatalogsProductGroupStatus? fromJson(dynamic value) => CatalogsProductGroupStatusTypeTransformer().decode(value);

  static List<CatalogsProductGroupStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupStatus] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupStatus].
class CatalogsProductGroupStatusTypeTransformer {
  factory CatalogsProductGroupStatusTypeTransformer() => _instance ??= const CatalogsProductGroupStatusTypeTransformer._();

  const CatalogsProductGroupStatusTypeTransformer._();

  String encode(CatalogsProductGroupStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsProductGroupStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return CatalogsProductGroupStatus.ACTIVE;
        case r'INACTIVE': return CatalogsProductGroupStatus.INACTIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsProductGroupStatusTypeTransformer] instance.
  static CatalogsProductGroupStatusTypeTransformer? _instance;
}

