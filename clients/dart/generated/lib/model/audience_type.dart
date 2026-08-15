//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Audience type
class AudienceType {
  /// Instantiate a new enum with the provided [value].
  const AudienceType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CUSTOMER_LIST = AudienceType._(r'CUSTOMER_LIST');
  static const VISITOR = AudienceType._(r'VISITOR');
  static const ENGAGEMENT = AudienceType._(r'ENGAGEMENT');
  static const ACTALIKE = AudienceType._(r'ACTALIKE');
  static const PERSONA = AudienceType._(r'PERSONA');

  /// List of all possible values in this [enum][AudienceType].
  static const values = <AudienceType>[
    CUSTOMER_LIST,
    VISITOR,
    ENGAGEMENT,
    ACTALIKE,
    PERSONA,
  ];

  static AudienceType? fromJson(dynamic value) => AudienceTypeTypeTransformer().decode(value);

  static List<AudienceType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceType] to String,
/// and [decode] dynamic data back to [AudienceType].
class AudienceTypeTypeTransformer {
  factory AudienceTypeTypeTransformer() => _instance ??= const AudienceTypeTypeTransformer._();

  const AudienceTypeTypeTransformer._();

  String encode(AudienceType data) => data.value;

  /// Decodes a [dynamic value][data] to a AudienceType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CUSTOMER_LIST': return AudienceType.CUSTOMER_LIST;
        case r'VISITOR': return AudienceType.VISITOR;
        case r'ENGAGEMENT': return AudienceType.ENGAGEMENT;
        case r'ACTALIKE': return AudienceType.ACTALIKE;
        case r'PERSONA': return AudienceType.PERSONA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AudienceTypeTypeTransformer] instance.
  static AudienceTypeTypeTransformer? _instance;
}

