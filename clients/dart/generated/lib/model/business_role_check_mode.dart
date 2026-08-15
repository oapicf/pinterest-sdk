//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Specifies if the partner is internal or external.
class BusinessRoleCheckMode {
  /// Instantiate a new enum with the provided [value].
  const BusinessRoleCheckMode._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const INTERNAL = BusinessRoleCheckMode._(r'INTERNAL');
  static const EXTERNAL = BusinessRoleCheckMode._(r'EXTERNAL');

  /// List of all possible values in this [enum][BusinessRoleCheckMode].
  static const values = <BusinessRoleCheckMode>[
    INTERNAL,
    EXTERNAL,
  ];

  static BusinessRoleCheckMode? fromJson(dynamic value) => BusinessRoleCheckModeTypeTransformer().decode(value);

  static List<BusinessRoleCheckMode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessRoleCheckMode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessRoleCheckMode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessRoleCheckMode] to String,
/// and [decode] dynamic data back to [BusinessRoleCheckMode].
class BusinessRoleCheckModeTypeTransformer {
  factory BusinessRoleCheckModeTypeTransformer() => _instance ??= const BusinessRoleCheckModeTypeTransformer._();

  const BusinessRoleCheckModeTypeTransformer._();

  String encode(BusinessRoleCheckMode data) => data.value;

  /// Decodes a [dynamic value][data] to a BusinessRoleCheckMode.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessRoleCheckMode? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'INTERNAL': return BusinessRoleCheckMode.INTERNAL;
        case r'EXTERNAL': return BusinessRoleCheckMode.EXTERNAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BusinessRoleCheckModeTypeTransformer] instance.
  static BusinessRoleCheckModeTypeTransformer? _instance;
}

