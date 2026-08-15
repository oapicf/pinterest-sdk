//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'mmm_reporting_column.g.dart';

class MMMReportingColumn extends EnumClass {

  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'SPEND_IN_DOLLAR')
  static const MMMReportingColumn SPEND_IN_DOLLAR = _$SPEND_IN_DOLLAR;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'SPEND_IN_MICRO_DOLLAR')
  static const MMMReportingColumn SPEND_IN_MICRO_DOLLAR = _$SPEND_IN_MICRO_DOLLAR;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'ECPC_IN_DOLLAR')
  static const MMMReportingColumn ECPC_IN_DOLLAR = _$ECPC_IN_DOLLAR;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'ECTR')
  static const MMMReportingColumn ECTR = _$ECTR;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_NAME')
  static const MMMReportingColumn CAMPAIGN_NAME = _$CAMPAIGN_NAME;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'TOTAL_ENGAGEMENT')
  static const MMMReportingColumn TOTAL_ENGAGEMENT = _$TOTAL_ENGAGEMENT;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'EENGAGEMENT_RATE')
  static const MMMReportingColumn EENGAGEMENT_RATE = _$EENGAGEMENT_RATE;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'ECPM_IN_DOLLAR')
  static const MMMReportingColumn ECPM_IN_DOLLAR = _$ECPM_IN_DOLLAR;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_ID')
  static const MMMReportingColumn CAMPAIGN_ID = _$CAMPAIGN_ID;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'ADVERTISER_ID')
  static const MMMReportingColumn ADVERTISER_ID = _$ADVERTISER_ID;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'AD_GROUP_ID')
  static const MMMReportingColumn AD_GROUP_ID = _$AD_GROUP_ID;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'AD_GROUP_NAME')
  static const MMMReportingColumn AD_GROUP_NAME = _$AD_GROUP_NAME;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'CLICKTHROUGH_1')
  static const MMMReportingColumn cLICKTHROUGH1 = _$cLICKTHROUGH1;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'IMPRESSION_1')
  static const MMMReportingColumn iMPRESSION1 = _$iMPRESSION1;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'CLICKTHROUGH_2')
  static const MMMReportingColumn cLICKTHROUGH2 = _$cLICKTHROUGH2;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'IMPRESSION_2')
  static const MMMReportingColumn iMPRESSION2 = _$iMPRESSION2;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'TOTAL_CLICKTHROUGH')
  static const MMMReportingColumn TOTAL_CLICKTHROUGH = _$TOTAL_CLICKTHROUGH;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'TOTAL_IMPRESSION')
  static const MMMReportingColumn TOTAL_IMPRESSION = _$TOTAL_IMPRESSION;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'ADVERTISER_NAME')
  static const MMMReportingColumn ADVERTISER_NAME = _$ADVERTISER_NAME;
  /// Marketing Mix Modeling (MMM) Reporting Columns
  @BuiltValueEnumConst(wireName: r'SPEND_ORDER_LINE_PAID_TYPE')
  static const MMMReportingColumn SPEND_ORDER_LINE_PAID_TYPE = _$SPEND_ORDER_LINE_PAID_TYPE;

  static Serializer<MMMReportingColumn> get serializer => _$mMMReportingColumnSerializer;

  const MMMReportingColumn._(String name): super(name);

  static BuiltSet<MMMReportingColumn> get values => _$values;
  static MMMReportingColumn valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MMMReportingColumnMixin = Object with _$MMMReportingColumnMixin;

