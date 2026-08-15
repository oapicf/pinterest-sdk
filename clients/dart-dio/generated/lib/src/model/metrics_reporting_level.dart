//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'metrics_reporting_level.g.dart';

class MetricsReportingLevel extends EnumClass {

  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'ADVERTISER')
  static const MetricsReportingLevel ADVERTISER = _$ADVERTISER;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'ADVERTISER_TARGETING')
  static const MetricsReportingLevel ADVERTISER_TARGETING = _$ADVERTISER_TARGETING;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const MetricsReportingLevel CAMPAIGN = _$CAMPAIGN;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_TARGETING')
  static const MetricsReportingLevel CAMPAIGN_TARGETING = _$CAMPAIGN_TARGETING;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const MetricsReportingLevel AD_GROUP = _$AD_GROUP;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'AD_GROUP_TARGETING')
  static const MetricsReportingLevel AD_GROUP_TARGETING = _$AD_GROUP_TARGETING;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'PIN_PROMOTION')
  static const MetricsReportingLevel PIN_PROMOTION = _$PIN_PROMOTION;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'PIN_PROMOTION_TARGETING')
  static const MetricsReportingLevel PIN_PROMOTION_TARGETING = _$PIN_PROMOTION_TARGETING;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const MetricsReportingLevel KEYWORD = _$KEYWORD;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'PRODUCT_GROUP')
  static const MetricsReportingLevel PRODUCT_GROUP = _$PRODUCT_GROUP;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'PRODUCT_GROUP_TARGETING')
  static const MetricsReportingLevel PRODUCT_GROUP_TARGETING = _$PRODUCT_GROUP_TARGETING;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'PRODUCT_ITEM')
  static const MetricsReportingLevel PRODUCT_ITEM = _$PRODUCT_ITEM;
  /// Level of the reporting request
  @BuiltValueEnumConst(wireName: r'PRODUCT_ITEM_TARGETING')
  static const MetricsReportingLevel PRODUCT_ITEM_TARGETING = _$PRODUCT_ITEM_TARGETING;

  static Serializer<MetricsReportingLevel> get serializer => _$metricsReportingLevelSerializer;

  const MetricsReportingLevel._(String name): super(name);

  static BuiltSet<MetricsReportingLevel> get values => _$values;
  static MetricsReportingLevel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MetricsReportingLevelMixin = Object with _$MetricsReportingLevelMixin;

