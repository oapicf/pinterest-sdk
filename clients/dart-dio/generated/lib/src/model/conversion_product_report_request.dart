//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_report_time_type.dart';
import 'package:openapi/src/model/objective_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_product_reporting_column.dart';
import 'package:openapi/src/model/conversion_attribution_window_days.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_report_request.g.dart';

/// Request for a brand, category, SKU report
///
/// Properties:
/// * [adGroupIds] - List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
/// * [campaignIds] - List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
/// * [campaignObjectiveTypes] - List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
/// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
/// * [columns] - Metric and entity columns
/// * [conversionProductAttributionType] 
/// * [conversionProductBreakdown] 
/// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
/// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
/// * [granularity] - TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
/// * [level] - Level of the report
/// * [productSkuIds] - List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
/// * [reportName] - Name of the conversion product report.
/// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
/// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
@BuiltValue()
abstract class ConversionProductReportRequest implements Built<ConversionProductReportRequest, ConversionProductReportRequestBuilder> {
  /// List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
  @BuiltValueField(wireName: r'ad_group_ids')
  BuiltList<String>? get adGroupIds;

  /// List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
  @BuiltValueField(wireName: r'campaign_ids')
  BuiltList<String>? get campaignIds;

  /// List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  @BuiltValueField(wireName: r'campaign_objective_types')
  BuiltList<ObjectiveType>? get campaignObjectiveTypes;

  /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  @BuiltValueField(wireName: r'click_window_days')
  ConversionAttributionWindowDays? get clickWindowDays;
  // enum clickWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  /// Metric and entity columns
  @BuiltValueField(wireName: r'columns')
  BuiltList<ConversionProductReportingColumn> get columns;

  @BuiltValueField(wireName: r'conversion_product_attribution_type')
  ConversionProductReportRequestConversionProductAttributionTypeEnum? get conversionProductAttributionType;
  // enum conversionProductAttributionTypeEnum {  DEFAULT,  BRAND_ATTRIBUTION,  };

  @BuiltValueField(wireName: r'conversion_product_breakdown')
  ConversionProductReportRequestConversionProductBreakdownEnum? get conversionProductBreakdown;
  // enum conversionProductBreakdownEnum {  PRODUCT_BRAND,  PRODUCT_CATEGORY,  PRODUCT_BRAND_AND_CATEGORY,  PRODUCT_SKU,  PRODUCT_SKU_GROUP,  };

  /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  @BuiltValueField(wireName: r'conversion_report_time')
  ConversionReportTimeType? get conversionReportTime;
  // enum conversionReportTimeEnum {  TIME_OF_AD_ACTION,  TIME_OF_CONVERSION,  };

  /// Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  @BuiltValueField(wireName: r'granularity')
  ConversionProductReportRequestGranularityEnum get granularity;
  // enum granularityEnum {  WEEK,  MONTH,  TOTAL,  };

  /// Level of the report
  @BuiltValueField(wireName: r'level')
  ConversionProductReportRequestLevelEnum get level;
  // enum levelEnum {  ADVERTISER,  CAMPAIGN,  AD_GROUP,  };

  /// List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  @BuiltValueField(wireName: r'product_sku_ids')
  BuiltList<String>? get productSkuIds;

  /// Name of the conversion product report.
  @BuiltValueField(wireName: r'report_name')
  String get reportName;

  /// Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
  @BuiltValueField(wireName: r'view_window_days')
  ConversionAttributionWindowDays? get viewWindowDays;
  // enum viewWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  ConversionProductReportRequest._();

  factory ConversionProductReportRequest([void updates(ConversionProductReportRequestBuilder b)]) = _$ConversionProductReportRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionProductReportRequestBuilder b) => b
      ..clickWindowDays = ConversionAttributionWindowDays.number30
      ..conversionReportTime = 'TIME_OF_AD_ACTION'
      ..viewWindowDays = ConversionAttributionWindowDays.number30;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionProductReportRequest> get serializer => _$ConversionProductReportRequestSerializer();
}

class _$ConversionProductReportRequestSerializer implements PrimitiveSerializer<ConversionProductReportRequest> {
  @override
  final Iterable<Type> types = const [ConversionProductReportRequest, _$ConversionProductReportRequest];

  @override
  final String wireName = r'ConversionProductReportRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionProductReportRequest object, {
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
        specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
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
        specifiedType: const FullType(ConversionProductReportRequestConversionProductAttributionTypeEnum),
      );
    }
    if (object.conversionProductBreakdown != null) {
      yield r'conversion_product_breakdown';
      yield serializers.serialize(
        object.conversionProductBreakdown,
        specifiedType: const FullType(ConversionProductReportRequestConversionProductBreakdownEnum),
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
      specifiedType: const FullType(ConversionProductReportRequestGranularityEnum),
    );
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(ConversionProductReportRequestLevelEnum),
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
    ConversionProductReportRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionProductReportRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.adGroupIds.replace(valueDes);
          break;
        case r'campaign_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.campaignIds.replace(valueDes);
          break;
        case r'campaign_objective_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
          ) as BuiltList<ObjectiveType>;
          result.campaignObjectiveTypes.replace(valueDes);
          break;
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays;
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
            specifiedType: const FullType(ConversionProductReportRequestConversionProductAttributionTypeEnum),
          ) as ConversionProductReportRequestConversionProductAttributionTypeEnum;
          result.conversionProductAttributionType = valueDes;
          break;
        case r'conversion_product_breakdown':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionProductReportRequestConversionProductBreakdownEnum),
          ) as ConversionProductReportRequestConversionProductBreakdownEnum;
          result.conversionProductBreakdown = valueDes;
          break;
        case r'conversion_report_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionReportTimeType),
          ) as ConversionReportTimeType;
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
            specifiedType: const FullType(ConversionProductReportRequestGranularityEnum),
          ) as ConversionProductReportRequestGranularityEnum;
          result.granularity = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionProductReportRequestLevelEnum),
          ) as ConversionProductReportRequestLevelEnum;
          result.level = valueDes;
          break;
        case r'product_sku_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
            specifiedType: const FullType(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays;
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
  ConversionProductReportRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionProductReportRequestBuilder();
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

class ConversionProductReportRequestConversionProductAttributionTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DEFAULT')
  static const ConversionProductReportRequestConversionProductAttributionTypeEnum DEFAULT = _$conversionProductReportRequestConversionProductAttributionTypeEnum_DEFAULT;
  @BuiltValueEnumConst(wireName: r'BRAND_ATTRIBUTION')
  static const ConversionProductReportRequestConversionProductAttributionTypeEnum BRAND_ATTRIBUTION = _$conversionProductReportRequestConversionProductAttributionTypeEnum_BRAND_ATTRIBUTION;

  static Serializer<ConversionProductReportRequestConversionProductAttributionTypeEnum> get serializer => _$conversionProductReportRequestConversionProductAttributionTypeEnumSerializer;

  const ConversionProductReportRequestConversionProductAttributionTypeEnum._(String name): super(name);

  static BuiltSet<ConversionProductReportRequestConversionProductAttributionTypeEnum> get values => _$conversionProductReportRequestConversionProductAttributionTypeEnumValues;
  static ConversionProductReportRequestConversionProductAttributionTypeEnum valueOf(String name) => _$conversionProductReportRequestConversionProductAttributionTypeEnumValueOf(name);
}

class ConversionProductReportRequestConversionProductBreakdownEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PRODUCT_BRAND')
  static const ConversionProductReportRequestConversionProductBreakdownEnum PRODUCT_BRAND = _$conversionProductReportRequestConversionProductBreakdownEnum_PRODUCT_BRAND;
  @BuiltValueEnumConst(wireName: r'PRODUCT_CATEGORY')
  static const ConversionProductReportRequestConversionProductBreakdownEnum PRODUCT_CATEGORY = _$conversionProductReportRequestConversionProductBreakdownEnum_PRODUCT_CATEGORY;
  @BuiltValueEnumConst(wireName: r'PRODUCT_BRAND_AND_CATEGORY')
  static const ConversionProductReportRequestConversionProductBreakdownEnum PRODUCT_BRAND_AND_CATEGORY = _$conversionProductReportRequestConversionProductBreakdownEnum_PRODUCT_BRAND_AND_CATEGORY;
  @BuiltValueEnumConst(wireName: r'PRODUCT_SKU')
  static const ConversionProductReportRequestConversionProductBreakdownEnum PRODUCT_SKU = _$conversionProductReportRequestConversionProductBreakdownEnum_PRODUCT_SKU;
  @BuiltValueEnumConst(wireName: r'PRODUCT_SKU_GROUP')
  static const ConversionProductReportRequestConversionProductBreakdownEnum PRODUCT_SKU_GROUP = _$conversionProductReportRequestConversionProductBreakdownEnum_PRODUCT_SKU_GROUP;

  static Serializer<ConversionProductReportRequestConversionProductBreakdownEnum> get serializer => _$conversionProductReportRequestConversionProductBreakdownEnumSerializer;

  const ConversionProductReportRequestConversionProductBreakdownEnum._(String name): super(name);

  static BuiltSet<ConversionProductReportRequestConversionProductBreakdownEnum> get values => _$conversionProductReportRequestConversionProductBreakdownEnumValues;
  static ConversionProductReportRequestConversionProductBreakdownEnum valueOf(String name) => _$conversionProductReportRequestConversionProductBreakdownEnumValueOf(name);
}

class ConversionProductReportRequestGranularityEnum extends EnumClass {

  /// TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  @BuiltValueEnumConst(wireName: r'WEEK')
  static const ConversionProductReportRequestGranularityEnum WEEK = _$conversionProductReportRequestGranularityEnum_WEEK;
  /// TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  @BuiltValueEnumConst(wireName: r'MONTH')
  static const ConversionProductReportRequestGranularityEnum MONTH = _$conversionProductReportRequestGranularityEnum_MONTH;
  /// TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  @BuiltValueEnumConst(wireName: r'TOTAL')
  static const ConversionProductReportRequestGranularityEnum TOTAL = _$conversionProductReportRequestGranularityEnum_TOTAL;

  static Serializer<ConversionProductReportRequestGranularityEnum> get serializer => _$conversionProductReportRequestGranularityEnumSerializer;

  const ConversionProductReportRequestGranularityEnum._(String name): super(name);

  static BuiltSet<ConversionProductReportRequestGranularityEnum> get values => _$conversionProductReportRequestGranularityEnumValues;
  static ConversionProductReportRequestGranularityEnum valueOf(String name) => _$conversionProductReportRequestGranularityEnumValueOf(name);
}

class ConversionProductReportRequestLevelEnum extends EnumClass {

  /// Level of the report
  @BuiltValueEnumConst(wireName: r'ADVERTISER')
  static const ConversionProductReportRequestLevelEnum ADVERTISER = _$conversionProductReportRequestLevelEnum_ADVERTISER;
  /// Level of the report
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const ConversionProductReportRequestLevelEnum CAMPAIGN = _$conversionProductReportRequestLevelEnum_CAMPAIGN;
  /// Level of the report
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const ConversionProductReportRequestLevelEnum AD_GROUP = _$conversionProductReportRequestLevelEnum_AD_GROUP;

  static Serializer<ConversionProductReportRequestLevelEnum> get serializer => _$conversionProductReportRequestLevelEnumSerializer;

  const ConversionProductReportRequestLevelEnum._(String name): super(name);

  static BuiltSet<ConversionProductReportRequestLevelEnum> get values => _$conversionProductReportRequestLevelEnumValues;
  static ConversionProductReportRequestLevelEnum valueOf(String name) => _$conversionProductReportRequestLevelEnumValueOf(name);
}

