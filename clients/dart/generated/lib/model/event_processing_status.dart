//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Status of a single event in the response.
enum EventProcessingStatus {
  failed._(r'failed'),
  processed._(r'processed'),
  ;

  /// Instantiate a new enum with the provided value.
  const EventProcessingStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [EventProcessingStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static EventProcessingStatus? fromJson(dynamic value) => EventProcessingStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [EventProcessingStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<EventProcessingStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EventProcessingStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EventProcessingStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [EventProcessingStatus] to String,
/// and [decode] dynamic data back to [EventProcessingStatus].
class EventProcessingStatusTypeTransformer {
  factory EventProcessingStatusTypeTransformer() => _instance ??= const EventProcessingStatusTypeTransformer._();

  const EventProcessingStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(EventProcessingStatus data) => data._value;

  /// Returns the instance of [EventProcessingStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EventProcessingStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is EventProcessingStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'failed': return EventProcessingStatus.failed;
        case r'processed': return EventProcessingStatus.processed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static EventProcessingStatusTypeTransformer? _instance;
}

