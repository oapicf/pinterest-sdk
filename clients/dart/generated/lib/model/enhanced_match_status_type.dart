//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum EnhancedMatchStatusType {
  UNKNOWN._(r'UNKNOWN'),
  NOT_VALIDATED._(r'NOT_VALIDATED'),
  VALIDATING_IN_PROGRESS._(r'VALIDATING_IN_PROGRESS'),
  VALIDATION_COMPLETE._(r'VALIDATION_COMPLETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const EnhancedMatchStatusType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [EnhancedMatchStatusType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static EnhancedMatchStatusType? fromJson(dynamic value) => EnhancedMatchStatusTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [EnhancedMatchStatusType]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(EnhancedMatchStatusType data) => data._value;

  /// Returns the instance of [EnhancedMatchStatusType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EnhancedMatchStatusType? decode(dynamic data, {bool allowNull = true}) {
    if (data is EnhancedMatchStatusType) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static EnhancedMatchStatusTypeTypeTransformer? _instance;
}

