//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Summary status for ad group
class AdGroupSummaryStatus {
  /// Instantiate a new enum with the provided [value].
  const AdGroupSummaryStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RUNNING = AdGroupSummaryStatus._(r'RUNNING');
  static const PAUSED = AdGroupSummaryStatus._(r'PAUSED');
  static const NOT_STARTED = AdGroupSummaryStatus._(r'NOT_STARTED');
  static const COMPLETED = AdGroupSummaryStatus._(r'COMPLETED');
  static const ADVERTISER_DISABLED = AdGroupSummaryStatus._(r'ADVERTISER_DISABLED');
  static const ARCHIVED = AdGroupSummaryStatus._(r'ARCHIVED');
  static const DRAFT = AdGroupSummaryStatus._(r'DRAFT');
  static const DELETED_DRAFT = AdGroupSummaryStatus._(r'DELETED_DRAFT');

  /// List of all possible values in this [enum][AdGroupSummaryStatus].
  static const values = <AdGroupSummaryStatus>[
    RUNNING,
    PAUSED,
    NOT_STARTED,
    COMPLETED,
    ADVERTISER_DISABLED,
    ARCHIVED,
    DRAFT,
    DELETED_DRAFT,
  ];

  static AdGroupSummaryStatus? fromJson(dynamic value) => AdGroupSummaryStatusTypeTransformer().decode(value);

  static List<AdGroupSummaryStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupSummaryStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupSummaryStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupSummaryStatus] to String,
/// and [decode] dynamic data back to [AdGroupSummaryStatus].
class AdGroupSummaryStatusTypeTransformer {
  factory AdGroupSummaryStatusTypeTransformer() => _instance ??= const AdGroupSummaryStatusTypeTransformer._();

  const AdGroupSummaryStatusTypeTransformer._();

  String encode(AdGroupSummaryStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupSummaryStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupSummaryStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RUNNING': return AdGroupSummaryStatus.RUNNING;
        case r'PAUSED': return AdGroupSummaryStatus.PAUSED;
        case r'NOT_STARTED': return AdGroupSummaryStatus.NOT_STARTED;
        case r'COMPLETED': return AdGroupSummaryStatus.COMPLETED;
        case r'ADVERTISER_DISABLED': return AdGroupSummaryStatus.ADVERTISER_DISABLED;
        case r'ARCHIVED': return AdGroupSummaryStatus.ARCHIVED;
        case r'DRAFT': return AdGroupSummaryStatus.DRAFT;
        case r'DELETED_DRAFT': return AdGroupSummaryStatus.DELETED_DRAFT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupSummaryStatusTypeTransformer] instance.
  static AdGroupSummaryStatusTypeTransformer? _instance;
}

