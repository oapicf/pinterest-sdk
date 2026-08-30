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
enum MMMReportingColumn {
  SPEND_IN_DOLLAR._(r'SPEND_IN_DOLLAR'),
  SPEND_IN_MICRO_DOLLAR._(r'SPEND_IN_MICRO_DOLLAR'),
  ECPC_IN_DOLLAR._(r'ECPC_IN_DOLLAR'),
  ECTR._(r'ECTR'),
  CAMPAIGN_NAME._(r'CAMPAIGN_NAME'),
  TOTAL_ENGAGEMENT._(r'TOTAL_ENGAGEMENT'),
  EENGAGEMENT_RATE._(r'EENGAGEMENT_RATE'),
  ECPM_IN_DOLLAR._(r'ECPM_IN_DOLLAR'),
  CAMPAIGN_ID._(r'CAMPAIGN_ID'),
  ADVERTISER_ID._(r'ADVERTISER_ID'),
  AD_GROUP_ID._(r'AD_GROUP_ID'),
  AD_GROUP_NAME._(r'AD_GROUP_NAME'),
  CLICKTHROUGH_1._(r'CLICKTHROUGH_1'),
  IMPRESSION_1._(r'IMPRESSION_1'),
  CLICKTHROUGH_2._(r'CLICKTHROUGH_2'),
  IMPRESSION_2._(r'IMPRESSION_2'),
  TOTAL_CLICKTHROUGH._(r'TOTAL_CLICKTHROUGH'),
  TOTAL_IMPRESSION._(r'TOTAL_IMPRESSION'),
  ADVERTISER_NAME._(r'ADVERTISER_NAME'),
  SPEND_ORDER_LINE_PAID_TYPE._(r'SPEND_ORDER_LINE_PAID_TYPE'),
  CAMPAIGN_OBJECTIVE_TYPE._(r'CAMPAIGN_OBJECTIVE_TYPE'),
  PINNER_LIST_NAME._(r'PINNER_LIST_NAME'),
  ADS_CREDIT_SPEND_IN_DOLLAR._(r'ADS_CREDIT_SPEND_IN_DOLLAR'),
  ADVERTISER_PAID_SPEND_IN_DOLLAR._(r'ADVERTISER_PAID_SPEND_IN_DOLLAR'),
  ADVERTISER_PAID_ECPC_IN_DOLLAR._(r'ADVERTISER_PAID_ECPC_IN_DOLLAR'),
  ADVERTISER_PAID_ECPM_IN_DOLLAR._(r'ADVERTISER_PAID_ECPM_IN_DOLLAR'),
  ;

  /// Instantiate a new enum with the provided value.
  const MMMReportingColumn._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MMMReportingColumn] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MMMReportingColumn? fromJson(dynamic value) => MMMReportingColumnTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MMMReportingColumn]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(MMMReportingColumn data) => data._value;

  /// Returns the instance of [MMMReportingColumn] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MMMReportingColumn? decode(dynamic data, {bool allowNull = true}) {
    if (data is MMMReportingColumn) {
      return data;
    }
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
        case r'CLICKTHROUGH_1': return MMMReportingColumn.CLICKTHROUGH_1;
        case r'IMPRESSION_1': return MMMReportingColumn.IMPRESSION_1;
        case r'CLICKTHROUGH_2': return MMMReportingColumn.CLICKTHROUGH_2;
        case r'IMPRESSION_2': return MMMReportingColumn.IMPRESSION_2;
        case r'TOTAL_CLICKTHROUGH': return MMMReportingColumn.TOTAL_CLICKTHROUGH;
        case r'TOTAL_IMPRESSION': return MMMReportingColumn.TOTAL_IMPRESSION;
        case r'ADVERTISER_NAME': return MMMReportingColumn.ADVERTISER_NAME;
        case r'SPEND_ORDER_LINE_PAID_TYPE': return MMMReportingColumn.SPEND_ORDER_LINE_PAID_TYPE;
        case r'CAMPAIGN_OBJECTIVE_TYPE': return MMMReportingColumn.CAMPAIGN_OBJECTIVE_TYPE;
        case r'PINNER_LIST_NAME': return MMMReportingColumn.PINNER_LIST_NAME;
        case r'ADS_CREDIT_SPEND_IN_DOLLAR': return MMMReportingColumn.ADS_CREDIT_SPEND_IN_DOLLAR;
        case r'ADVERTISER_PAID_SPEND_IN_DOLLAR': return MMMReportingColumn.ADVERTISER_PAID_SPEND_IN_DOLLAR;
        case r'ADVERTISER_PAID_ECPC_IN_DOLLAR': return MMMReportingColumn.ADVERTISER_PAID_ECPC_IN_DOLLAR;
        case r'ADVERTISER_PAID_ECPM_IN_DOLLAR': return MMMReportingColumn.ADVERTISER_PAID_ECPM_IN_DOLLAR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MMMReportingColumnTypeTransformer? _instance;
}

