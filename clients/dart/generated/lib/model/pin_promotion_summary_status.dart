//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Summary status for pin promotions
enum PinPromotionSummaryStatus {
  APPROVED._(r'APPROVED'),
  PAUSED._(r'PAUSED'),
  PENDING._(r'PENDING'),
  REJECTED._(r'REJECTED'),
  ADVERTISER_DISABLED._(r'ADVERTISER_DISABLED'),
  ARCHIVED._(r'ARCHIVED'),
  DRAFT._(r'DRAFT'),
  DELETED_DRAFT._(r'DELETED_DRAFT'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinPromotionSummaryStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinPromotionSummaryStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinPromotionSummaryStatus? fromJson(dynamic value) => PinPromotionSummaryStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinPromotionSummaryStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinPromotionSummaryStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinPromotionSummaryStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinPromotionSummaryStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinPromotionSummaryStatus] to String,
/// and [decode] dynamic data back to [PinPromotionSummaryStatus].
class PinPromotionSummaryStatusTypeTransformer {
  factory PinPromotionSummaryStatusTypeTransformer() => _instance ??= const PinPromotionSummaryStatusTypeTransformer._();

  const PinPromotionSummaryStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PinPromotionSummaryStatus data) => data._value;

  /// Returns the instance of [PinPromotionSummaryStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinPromotionSummaryStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinPromotionSummaryStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'APPROVED': return PinPromotionSummaryStatus.APPROVED;
        case r'PAUSED': return PinPromotionSummaryStatus.PAUSED;
        case r'PENDING': return PinPromotionSummaryStatus.PENDING;
        case r'REJECTED': return PinPromotionSummaryStatus.REJECTED;
        case r'ADVERTISER_DISABLED': return PinPromotionSummaryStatus.ADVERTISER_DISABLED;
        case r'ARCHIVED': return PinPromotionSummaryStatus.ARCHIVED;
        case r'DRAFT': return PinPromotionSummaryStatus.DRAFT;
        case r'DELETED_DRAFT': return PinPromotionSummaryStatus.DELETED_DRAFT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinPromotionSummaryStatusTypeTransformer? _instance;
}

