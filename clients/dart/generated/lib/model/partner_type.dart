//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class PartnerType {
  /// Instantiate a new enum with the provided [value].
  const PartnerType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const INTERNAL = PartnerType._(r'INTERNAL');
  static const EXTERNAL = PartnerType._(r'EXTERNAL');

  /// List of all possible values in this [enum][PartnerType].
  static const values = <PartnerType>[
    INTERNAL,
    EXTERNAL,
  ];

  static PartnerType? fromJson(dynamic value) => PartnerTypeTypeTransformer().decode(value);

  static List<PartnerType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PartnerType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PartnerType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PartnerType] to String,
/// and [decode] dynamic data back to [PartnerType].
class PartnerTypeTypeTransformer {
  factory PartnerTypeTypeTransformer() => _instance ??= const PartnerTypeTypeTransformer._();

  const PartnerTypeTypeTransformer._();

  String encode(PartnerType data) => data.value;

  /// Decodes a [dynamic value][data] to a PartnerType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PartnerType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'INTERNAL': return PartnerType.INTERNAL;
        case r'EXTERNAL': return PartnerType.EXTERNAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PartnerTypeTypeTransformer] instance.
  static PartnerTypeTypeTransformer? _instance;
}

