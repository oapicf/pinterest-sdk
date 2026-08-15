//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class EnhancedMatchStatusType {
  /// Instantiate a new enum with the provided [value].
  const EnhancedMatchStatusType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN = EnhancedMatchStatusType._(r'UNKNOWN');
  static const NOT_VALIDATED = EnhancedMatchStatusType._(r'NOT_VALIDATED');
  static const VALIDATING_IN_PROGRESS = EnhancedMatchStatusType._(r'VALIDATING_IN_PROGRESS');
  static const VALIDATION_COMPLETE = EnhancedMatchStatusType._(r'VALIDATION_COMPLETE');

  /// List of all possible values in this [enum][EnhancedMatchStatusType].
  static const values = <EnhancedMatchStatusType>[
    UNKNOWN,
    NOT_VALIDATED,
    VALIDATING_IN_PROGRESS,
    VALIDATION_COMPLETE,
  ];

  static EnhancedMatchStatusType? fromJson(dynamic value) => EnhancedMatchStatusTypeTypeTransformer().decode(value);

  static List<EnhancedMatchStatusType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EnhancedMatchStatusType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EnhancedMatchStatusType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [EnhancedMatchStatusType] to String,
/// and [decode] dynamic data back to [EnhancedMatchStatusType].
class EnhancedMatchStatusTypeTypeTransformer {
  factory EnhancedMatchStatusTypeTypeTransformer() => _instance ??= const EnhancedMatchStatusTypeTypeTransformer._();

  const EnhancedMatchStatusTypeTypeTransformer._();

  String encode(EnhancedMatchStatusType data) => data.value;

  /// Decodes a [dynamic value][data] to a EnhancedMatchStatusType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EnhancedMatchStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return EnhancedMatchStatusType.UNKNOWN;
        case r'NOT_VALIDATED': return EnhancedMatchStatusType.NOT_VALIDATED;
        case r'VALIDATING_IN_PROGRESS': return EnhancedMatchStatusType.VALIDATING_IN_PROGRESS;
        case r'VALIDATION_COMPLETE': return EnhancedMatchStatusType.VALIDATION_COMPLETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [EnhancedMatchStatusTypeTypeTransformer] instance.
  static EnhancedMatchStatusTypeTypeTransformer? _instance;
}

