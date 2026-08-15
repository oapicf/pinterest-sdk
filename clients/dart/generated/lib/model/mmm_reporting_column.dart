//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Marketing Mix Modeling (MMM) Reporting Columns
class MMMReportingColumn {
  /// Instantiate a new enum with the provided [value].
  const MMMReportingColumn._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SPEND_IN_DOLLAR = MMMReportingColumn._(r'SPEND_IN_DOLLAR');
  static const SPEND_IN_MICRO_DOLLAR = MMMReportingColumn._(r'SPEND_IN_MICRO_DOLLAR');
  static const ECPC_IN_DOLLAR = MMMReportingColumn._(r'ECPC_IN_DOLLAR');
  static const ECTR = MMMReportingColumn._(r'ECTR');
  static const CAMPAIGN_NAME = MMMReportingColumn._(r'CAMPAIGN_NAME');
  static const TOTAL_ENGAGEMENT = MMMReportingColumn._(r'TOTAL_ENGAGEMENT');
  static const EENGAGEMENT_RATE = MMMReportingColumn._(r'EENGAGEMENT_RATE');
  static const ECPM_IN_DOLLAR = MMMReportingColumn._(r'ECPM_IN_DOLLAR');
  static const CAMPAIGN_ID = MMMReportingColumn._(r'CAMPAIGN_ID');
  static const ADVERTISER_ID = MMMReportingColumn._(r'ADVERTISER_ID');
  static const AD_GROUP_ID = MMMReportingColumn._(r'AD_GROUP_ID');
  static const AD_GROUP_NAME = MMMReportingColumn._(r'AD_GROUP_NAME');
  static const cLICKTHROUGH1 = MMMReportingColumn._(r'CLICKTHROUGH_1');
  static const iMPRESSION1 = MMMReportingColumn._(r'IMPRESSION_1');
  static const cLICKTHROUGH2 = MMMReportingColumn._(r'CLICKTHROUGH_2');
  static const iMPRESSION2 = MMMReportingColumn._(r'IMPRESSION_2');
  static const TOTAL_CLICKTHROUGH = MMMReportingColumn._(r'TOTAL_CLICKTHROUGH');
  static const TOTAL_IMPRESSION = MMMReportingColumn._(r'TOTAL_IMPRESSION');
  static const ADVERTISER_NAME = MMMReportingColumn._(r'ADVERTISER_NAME');
  static const SPEND_ORDER_LINE_PAID_TYPE = MMMReportingColumn._(r'SPEND_ORDER_LINE_PAID_TYPE');

  /// List of all possible values in this [enum][MMMReportingColumn].
  static const values = <MMMReportingColumn>[
    SPEND_IN_DOLLAR,
    SPEND_IN_MICRO_DOLLAR,
    ECPC_IN_DOLLAR,
    ECTR,
    CAMPAIGN_NAME,
    TOTAL_ENGAGEMENT,
    EENGAGEMENT_RATE,
    ECPM_IN_DOLLAR,
    CAMPAIGN_ID,
    ADVERTISER_ID,
    AD_GROUP_ID,
    AD_GROUP_NAME,
    cLICKTHROUGH1,
    iMPRESSION1,
    cLICKTHROUGH2,
    iMPRESSION2,
    TOTAL_CLICKTHROUGH,
    TOTAL_IMPRESSION,
    ADVERTISER_NAME,
    SPEND_ORDER_LINE_PAID_TYPE,
  ];

  static MMMReportingColumn? fromJson(dynamic value) => MMMReportingColumnTypeTransformer().decode(value);

  static List<MMMReportingColumn> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MMMReportingColumn>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MMMReportingColumn.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MMMReportingColumn] to String,
/// and [decode] dynamic data back to [MMMReportingColumn].
class MMMReportingColumnTypeTransformer {
  factory MMMReportingColumnTypeTransformer() => _instance ??= const MMMReportingColumnTypeTransformer._();

  const MMMReportingColumnTypeTransformer._();

  String encode(MMMReportingColumn data) => data.value;

  /// Decodes a [dynamic value][data] to a MMMReportingColumn.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MMMReportingColumn? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SPEND_IN_DOLLAR': return MMMReportingColumn.SPEND_IN_DOLLAR;
        case r'SPEND_IN_MICRO_DOLLAR': return MMMReportingColumn.SPEND_IN_MICRO_DOLLAR;
        case r'ECPC_IN_DOLLAR': return MMMReportingColumn.ECPC_IN_DOLLAR;
        case r'ECTR': return MMMReportingColumn.ECTR;
        case r'CAMPAIGN_NAME': return MMMReportingColumn.CAMPAIGN_NAME;
        case r'TOTAL_ENGAGEMENT': return MMMReportingColumn.TOTAL_ENGAGEMENT;
        case r'EENGAGEMENT_RATE': return MMMReportingColumn.EENGAGEMENT_RATE;
        case r'ECPM_IN_DOLLAR': return MMMReportingColumn.ECPM_IN_DOLLAR;
        case r'CAMPAIGN_ID': return MMMReportingColumn.CAMPAIGN_ID;
        case r'ADVERTISER_ID': return MMMReportingColumn.ADVERTISER_ID;
        case r'AD_GROUP_ID': return MMMReportingColumn.AD_GROUP_ID;
        case r'AD_GROUP_NAME': return MMMReportingColumn.AD_GROUP_NAME;
        case r'CLICKTHROUGH_1': return MMMReportingColumn.cLICKTHROUGH1;
        case r'IMPRESSION_1': return MMMReportingColumn.iMPRESSION1;
        case r'CLICKTHROUGH_2': return MMMReportingColumn.cLICKTHROUGH2;
        case r'IMPRESSION_2': return MMMReportingColumn.iMPRESSION2;
        case r'TOTAL_CLICKTHROUGH': return MMMReportingColumn.TOTAL_CLICKTHROUGH;
        case r'TOTAL_IMPRESSION': return MMMReportingColumn.TOTAL_IMPRESSION;
        case r'ADVERTISER_NAME': return MMMReportingColumn.ADVERTISER_NAME;
        case r'SPEND_ORDER_LINE_PAID_TYPE': return MMMReportingColumn.SPEND_ORDER_LINE_PAID_TYPE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MMMReportingColumnTypeTransformer] instance.
  static MMMReportingColumnTypeTransformer? _instance;
}

