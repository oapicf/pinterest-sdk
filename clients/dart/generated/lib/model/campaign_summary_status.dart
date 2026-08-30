//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum CampaignSummaryStatus {
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
  const CampaignSummaryStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignSummaryStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignSummaryStatus? fromJson(dynamic value) => CampaignSummaryStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignSummaryStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignSummaryStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignSummaryStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignSummaryStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignSummaryStatus] to String,
/// and [decode] dynamic data back to [CampaignSummaryStatus].
class CampaignSummaryStatusTypeTransformer {
  factory CampaignSummaryStatusTypeTransformer() => _instance ??= const CampaignSummaryStatusTypeTransformer._();

  const CampaignSummaryStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignSummaryStatus data) => data._value;

  /// Returns the instance of [CampaignSummaryStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignSummaryStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignSummaryStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RUNNING': return CampaignSummaryStatus.RUNNING;
        case r'PAUSED': return CampaignSummaryStatus.PAUSED;
        case r'NOT_STARTED': return CampaignSummaryStatus.NOT_STARTED;
        case r'COMPLETED': return CampaignSummaryStatus.COMPLETED;
        case r'ADVERTISER_DISABLED': return CampaignSummaryStatus.ADVERTISER_DISABLED;
        case r'ARCHIVED': return CampaignSummaryStatus.ARCHIVED;
        case r'DRAFT': return CampaignSummaryStatus.DRAFT;
        case r'DELETED_DRAFT': return CampaignSummaryStatus.DELETED_DRAFT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignSummaryStatusTypeTransformer? _instance;
}

