//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_report_time_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_product_reporting_column.dart';
import 'package:openapi/src/model/conversion_objective_type.dart';
import 'package:openapi/src/model/conversion_product_report_breakdown_type.dart';
import 'package:openapi/src/model/conversion_product_attribution_type.dart';
import 'package:openapi/src/model/conversion_product_report_granularity.dart';
import 'package:openapi/src/model/conversion_product_report_level.dart';
import 'package:openapi/src/model/conversion_attribution_window_days.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_report_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [adGroupIds] -   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
/// * [campaignIds] -   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
/// * [campaignObjectiveTypes] - List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
/// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
/// * [columns] - Metric and entity columns
/// * [conversionProductAttributionType] -   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
/// * [conversionProductBreakdown] - Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
/// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
/// * [endDate] -   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
/// * [granularity] - Report granularity for time-based metric aggregation
/// * [level] - Level of the report
/// * [productSkuIds] -   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
/// * [reportName] - Name of the conversion product report
/// * [startDate] -   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
/// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
@BuiltValue()
abstract class ConversionProductReportCreate implements Built<ConversionProductReportCreate, ConversionProductReportCreateBuilder> {
  ///   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
  @BuiltValueField(wireName: r'ad_group_ids')
  BuiltList<String>? get adGroupIds;

  ///   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
  @BuiltValueField(wireName: r'campaign_ids')
  BuiltList<String>? get campaignIds;

  /// List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  @BuiltValueField(wireName: r'campaign_objective_types')
  BuiltList<ConversionObjectiveType>? get campaignObjectiveTypes;

  /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  @BuiltValueField(wireName: r'click_window_days')
  ConversionAttributionWindowDays? get clickWindowDays;
  // enum clickWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  /// Metric and entity columns
  @BuiltValueField(wireName: r'columns')
  BuiltList<ConversionProductReportingColumn> get columns;

  ///   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
  @BuiltValueField(wireName: r'conversion_product_attribution_type')
  ConversionProductAttributionType? get conversionProductAttributionType;
  // enum conversionProductAttributionTypeEnum {  DEFAULT,  BRAND_ATTRIBUTION,  };

  /// Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
  @BuiltValueField(wireName: r'conversion_product_breakdown')
  ConversionProductReportBreakdownType? get conversionProductBreakdown;
  // enum conversionProductBreakdownEnum {  PRODUCT_BRAND,  PRODUCT_CATEGORY,  PRODUCT_BRAND_AND_CATEGORY,  PRODUCT_SKU,  PRODUCT_SKU_GROUP,  };

  /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  @BuiltValueField(wireName: r'conversion_report_time')
  ConversionReportTimeType? get conversionReportTime;
  // enum conversionReportTimeEnum {  TIME_OF_AD_ACTION,  TIME_OF_CONVERSION,  };

  ///   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// Report granularity for time-based metric aggregation
  @BuiltValueField(wireName: r'granularity')
  ConversionProductReportGranularity get granularity;
  // enum granularityEnum {  TOTAL,  WEEK,  MONTH,  };

  /// Level of the report
  @BuiltValueField(wireName: r'level')
  ConversionProductReportLevel get level;
  // enum levelEnum {  ADVERTISER,  CAMPAIGN,  AD_GROUP,  };

  ///   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  @BuiltValueField(wireName: r'product_sku_ids')
  BuiltList<String>? get productSkuIds;

  /// Name of the conversion product report
  @BuiltValueField(wireName: r'report_name')
  String get reportName;

  ///   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  @BuiltValueField(wireName: r'view_window_days')
  ConversionAttributionWindowDays? get viewWindowDays;
  // enum viewWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  ConversionProductReportCreate._();

  factory ConversionProductReportCreate([void updates(ConversionProductReportCreateBuilder b)]) = _$ConversionProductReportCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionProductReportCreateBuilder b) => b
      ..clickWindowDays = 30
      ..conversionProductAttributionType = ConversionProductAttributionType.DEFAULT
      ..conversionProductBreakdown = ConversionProductReportBreakdownType.PRODUCT_BRAND
      ..conversionReportTime = ConversionReportTimeType.TIME_OF_AD_ACTION
      ..viewWindowDays = 30;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionProductReportCreate> get serializer => _$ConversionProductReportCreateSerializer();
}

class _$ConversionProductReportCreateSerializer implements PrimitiveSerializer<ConversionProductReportCreate> {
  @override
  final Iterable<Type> types = const [ConversionProductReportCreate, _$ConversionProductReportCreate];

  @override
  final String wireName = r'ConversionProductReportCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionProductReportCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroupIds != null) {
      yield r'ad_group_ids';
      yield serializers.serialize(
        object.adGroupIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.campaignIds != null) {
      yield r'campaign_ids';
      yield serializers.serialize(
        object.campaignIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.campaignObjectiveTypes != null) {
      yield r'campaign_objective_types';
      yield serializers.serialize(
        object.campaignObjectiveTypes,
        specifiedType: const FullType(BuiltList, [FullType(ConversionObjectiveType)]),
      );
    }
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
    yield r'columns';
    yield serializers.serialize(
      object.columns,
      specifiedType: const FullType(BuiltList, [FullType(ConversionProductReportingColumn)]),
    );
    if (object.conversionProductAttributionType != null) {
      yield r'conversion_product_attribution_type';
      yield serializers.serialize(
        object.conversionProductAttributionType,
        specifiedType: const FullType(ConversionProductAttributionType),
      );
    }
    if (object.conversionProductBreakdown != null) {
      yield r'conversion_product_breakdown';
      yield serializers.serialize(
        object.conversionProductBreakdown,
        specifiedType: const FullType(ConversionProductReportBreakdownType),
      );
    }
    if (object.conversionReportTime != null) {
      yield r'conversion_report_time';
      yield serializers.serialize(
        object.conversionReportTime,
        specifiedType: const FullType(ConversionReportTimeType),
      );
    }
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
    yield r'granularity';
    yield serializers.serialize(
      object.granularity,
      specifiedType: const FullType(ConversionProductReportGranularity),
    );
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(ConversionProductReportLevel),
    );
    if (object.productSkuIds != null) {
      yield r'product_sku_ids';
      yield serializers.serialize(
        object.productSkuIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    yield r'report_name';
    yield serializers.serialize(
      object.reportName,
      specifiedType: const FullType(String),
    );
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionProductReportCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionProductReportCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adGroupIds.replace(valueDes);
          break;
        case r'campaign_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.campaignIds.replace(valueDes);
          break;
        case r'campaign_objective_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ConversionObjectiveType)]),
          ) as BuiltList<ConversionObjectiveType>?;
          if (valueDes == null) continue;
          result.campaignObjectiveTypes.replace(valueDes);
          break;
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.clickWindowDays = valueDes;
          break;
        case r'columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionProductReportingColumn)]),
          ) as BuiltList<ConversionProductReportingColumn>;
          result.columns.replace(valueDes);
          break;
        case r'conversion_product_attribution_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionProductAttributionType),
          ) as ConversionProductAttributionType?;
          if (valueDes == null) continue;
          result.conversionProductAttributionType = valueDes;
          break;
        case r'conversion_product_breakdown':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionProductReportBreakdownType),
          ) as ConversionProductReportBreakdownType?;
          if (valueDes == null) continue;
          result.conversionProductBreakdown = valueDes;
          break;
        case r'conversion_report_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionReportTimeType),
          ) as ConversionReportTimeType?;
          if (valueDes == null) continue;
          result.conversionReportTime = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'granularity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionProductReportGranularity),
          ) as ConversionProductReportGranularity;
          result.granularity = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionProductReportLevel),
          ) as ConversionProductReportLevel;
          result.level = valueDes;
          break;
        case r'product_sku_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productSkuIds.replace(valueDes);
          break;
        case r'report_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.reportName = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.viewWindowDays = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionProductReportCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionProductReportCreateBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

