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
class CampaignSummaryStatus {
  /// Instantiate a new enum with the provided [value].
  const CampaignSummaryStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RUNNING = CampaignSummaryStatus._(r'RUNNING');
  static const PAUSED = CampaignSummaryStatus._(r'PAUSED');
  static const NOT_STARTED = CampaignSummaryStatus._(r'NOT_STARTED');
  static const COMPLETED = CampaignSummaryStatus._(r'COMPLETED');
  static const ADVERTISER_DISABLED = CampaignSummaryStatus._(r'ADVERTISER_DISABLED');
  static const ARCHIVED = CampaignSummaryStatus._(r'ARCHIVED');
  static const DRAFT = CampaignSummaryStatus._(r'DRAFT');
  static const DELETED_DRAFT = CampaignSummaryStatus._(r'DELETED_DRAFT');

  /// List of all possible values in this [enum][CampaignSummaryStatus].
  static const values = <CampaignSummaryStatus>[
    RUNNING,
    PAUSED,
    NOT_STARTED,
    COMPLETED,
    ADVERTISER_DISABLED,
    ARCHIVED,
    DRAFT,
    DELETED_DRAFT,
  ];

  static CampaignSummaryStatus? fromJson(dynamic value) => CampaignSummaryStatusTypeTransformer().decode(value);

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

  String encode(CampaignSummaryStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a CampaignSummaryStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignSummaryStatus? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [CampaignSummaryStatusTypeTransformer] instance.
  static CampaignSummaryStatusTypeTransformer? _instance;
}

