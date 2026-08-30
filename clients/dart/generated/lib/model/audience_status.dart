//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Audience processing status
enum AudienceStatus {
  INITIALIZING._(r'INITIALIZING'),
  READY._(r'READY'),
  TOO_SMALL._(r'TOO_SMALL'),
  ELIGIBLE._(r'ELIGIBLE'),
  PERSONAS_INELIGIBLE_SIZE._(r'PERSONAS_INELIGIBLE_SIZE'),
  PERSONAS_INITIALIZING._(r'PERSONAS_INITIALIZING'),
  ;

  /// Instantiate a new enum with the provided value.
  const AudienceStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AudienceStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AudienceStatus? fromJson(dynamic value) => AudienceStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AudienceStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AudienceStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceStatus] to String,
/// and [decode] dynamic data back to [AudienceStatus].
class AudienceStatusTypeTransformer {
  factory AudienceStatusTypeTransformer() => _instance ??= const AudienceStatusTypeTransformer._();

  const AudienceStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AudienceStatus data) => data._value;

  /// Returns the instance of [AudienceStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is AudienceStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'INITIALIZING': return AudienceStatus.INITIALIZING;
        case r'READY': return AudienceStatus.READY;
        case r'TOO_SMALL': return AudienceStatus.TOO_SMALL;
        case r'ELIGIBLE': return AudienceStatus.ELIGIBLE;
        case r'PERSONAS_INELIGIBLE_SIZE': return AudienceStatus.PERSONAS_INELIGIBLE_SIZE;
        case r'PERSONAS_INITIALIZING': return AudienceStatus.PERSONAS_INITIALIZING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AudienceStatusTypeTransformer? _instance;
}

