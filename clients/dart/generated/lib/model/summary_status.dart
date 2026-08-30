//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Summary status for campaign
enum SummaryStatus {
  RUNNING._(r'RUNNING'),
  PAUSED._(r'PAUSED'),
  NOT_STARTED._(r'NOT_STARTED'),
  COMPLETED._(r'COMPLETED'),
  ADVERTISER_DISABLED._(r'ADVERTISER_DISABLED'),
  ARCHIVED._(r'ARCHIVED'),
  DRAFT._(r'DRAFT'),
  DELETED_DRAFT._(r'DELETED_DRAFT'),
  ;

  /// Instantiate a new enum with the provided value.
  const SummaryStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [SummaryStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static SummaryStatus? fromJson(dynamic value) => SummaryStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [SummaryStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<SummaryStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SummaryStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SummaryStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SummaryStatus] to String,
/// and [decode] dynamic data back to [SummaryStatus].
class SummaryStatusTypeTransformer {
  factory SummaryStatusTypeTransformer() => _instance ??= const SummaryStatusTypeTransformer._();

  const SummaryStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(SummaryStatus data) => data._value;

  /// Returns the instance of [SummaryStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SummaryStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is SummaryStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RUNNING': return SummaryStatus.RUNNING;
        case r'PAUSED': return SummaryStatus.PAUSED;
        case r'NOT_STARTED': return SummaryStatus.NOT_STARTED;
        case r'COMPLETED': return SummaryStatus.COMPLETED;
        case r'ADVERTISER_DISABLED': return SummaryStatus.ADVERTISER_DISABLED;
        case r'ARCHIVED': return SummaryStatus.ARCHIVED;
        case r'DRAFT': return SummaryStatus.DRAFT;
        case r'DELETED_DRAFT': return SummaryStatus.DELETED_DRAFT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static SummaryStatusTypeTransformer? _instance;
}

