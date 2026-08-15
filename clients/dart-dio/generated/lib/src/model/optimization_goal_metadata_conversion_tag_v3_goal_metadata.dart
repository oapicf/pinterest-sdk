//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'optimization_goal_metadata_conversion_tag_v3_goal_metadata.g.dart';

/// OptimizationGoalMetadataConversionTagV3GoalMetadata
///
/// Properties:
/// * [attributionWindows] 
/// * [conversionEvent] 
/// * [conversionTagId] 
/// * [cpaGoalValueInMicroCurrency] 
/// * [isRoasOptimized] - Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
/// * [learningModeType] - Conversion learning model type
/// * [reportingEvent] - Event name for custom or standard events mapped to an oCPM model
@BuiltValue()
abstract class OptimizationGoalMetadataConversionTagV3GoalMetadata implements Built<OptimizationGoalMetadataConversionTagV3GoalMetadata, OptimizationGoalMetadataConversionTagV3GoalMetadataBuilder> {
  @BuiltValueField(wireName: r'attribution_windows')
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows? get attributionWindows;

  @BuiltValueField(wireName: r'conversion_event')
  OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum? get conversionEvent;
  // enum conversionEventEnum {  PAGE_VISIT,  SIGNUP,  CHECKOUT,  CUSTOM,  VIEW_CATEGORY,  SEARCH,  ADD_TO_CART,  WATCH_VIDEO,  LEAD,  APP_INSTALL,  };

  @BuiltValueField(wireName: r'conversion_tag_id')
  String? get conversionTagId;

  @BuiltValueField(wireName: r'cpa_goal_value_in_micro_currency')
  String? get cpaGoalValueInMicroCurrency;

  /// Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
  @BuiltValueField(wireName: r'is_roas_optimized')
  bool? get isRoasOptimized;

  /// Conversion learning model type
  @BuiltValueField(wireName: r'learning_mode_type')
  OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum? get learningModeType;
  // enum learningModeTypeEnum {  NOT_ACTIVE,  ACTIVE,  ,  };

  /// Event name for custom or standard events mapped to an oCPM model
  @BuiltValueField(wireName: r'reporting_event')
  String? get reportingEvent;

  OptimizationGoalMetadataConversionTagV3GoalMetadata._();

  factory OptimizationGoalMetadataConversionTagV3GoalMetadata([void updates(OptimizationGoalMetadataConversionTagV3GoalMetadataBuilder b)]) = _$OptimizationGoalMetadataConversionTagV3GoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OptimizationGoalMetadataConversionTagV3GoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OptimizationGoalMetadataConversionTagV3GoalMetadata> get serializer => _$OptimizationGoalMetadataConversionTagV3GoalMetadataSerializer();
}

class _$OptimizationGoalMetadataConversionTagV3GoalMetadataSerializer implements PrimitiveSerializer<OptimizationGoalMetadataConversionTagV3GoalMetadata> {
  @override
  final Iterable<Type> types = const [OptimizationGoalMetadataConversionTagV3GoalMetadata, _$OptimizationGoalMetadataConversionTagV3GoalMetadata];

  @override
  final String wireName = r'OptimizationGoalMetadataConversionTagV3GoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OptimizationGoalMetadataConversionTagV3GoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributionWindows != null) {
      yield r'attribution_windows';
      yield serializers.serialize(
        object.attributionWindows,
        specifiedType: const FullType(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows),
      );
    }
    if (object.conversionEvent != null) {
      yield r'conversion_event';
      yield serializers.serialize(
        object.conversionEvent,
        specifiedType: const FullType(OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum),
      );
    }
    if (object.conversionTagId != null) {
      yield r'conversion_tag_id';
      yield serializers.serialize(
        object.conversionTagId,
        specifiedType: const FullType(String),
      );
    }
    if (object.cpaGoalValueInMicroCurrency != null) {
      yield r'cpa_goal_value_in_micro_currency';
      yield serializers.serialize(
        object.cpaGoalValueInMicroCurrency,
        specifiedType: const FullType(String),
      );
    }
    if (object.isRoasOptimized != null) {
      yield r'is_roas_optimized';
      yield serializers.serialize(
        object.isRoasOptimized,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.learningModeType != null) {
      yield r'learning_mode_type';
      yield serializers.serialize(
        object.learningModeType,
        specifiedType: const FullType.nullable(OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum),
      );
    }
    if (object.reportingEvent != null) {
      yield r'reporting_event';
      yield serializers.serialize(
        object.reportingEvent,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OptimizationGoalMetadataConversionTagV3GoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OptimizationGoalMetadataConversionTagV3GoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attribution_windows':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows),
          ) as OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;
          result.attributionWindows.replace(valueDes);
          break;
        case r'conversion_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum),
          ) as OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum;
          result.conversionEvent = valueDes;
          break;
        case r'conversion_tag_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.conversionTagId = valueDes;
          break;
        case r'cpa_goal_value_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.cpaGoalValueInMicroCurrency = valueDes;
          break;
        case r'is_roas_optimized':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isRoasOptimized = valueDes;
          break;
        case r'learning_mode_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum),
          ) as OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum?;
          if (valueDes == null) continue;
          result.learningModeType = valueDes;
          break;
        case r'reporting_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.reportingEvent = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OptimizationGoalMetadataConversionTagV3GoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OptimizationGoalMetadataConversionTagV3GoalMetadataBuilder();
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

class OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PAGE_VISIT')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum PAGE_VISIT = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_PAGE_VISIT;
  @BuiltValueEnumConst(wireName: r'SIGNUP')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum SIGNUP = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_SIGNUP;
  @BuiltValueEnumConst(wireName: r'CHECKOUT')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum CHECKOUT = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_CHECKOUT;
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum CUSTOM = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_CUSTOM;
  @BuiltValueEnumConst(wireName: r'VIEW_CATEGORY')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum VIEW_CATEGORY = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_VIEW_CATEGORY;
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum SEARCH = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_SEARCH;
  @BuiltValueEnumConst(wireName: r'ADD_TO_CART')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum ADD_TO_CART = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_ADD_TO_CART;
  @BuiltValueEnumConst(wireName: r'WATCH_VIDEO')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum WATCH_VIDEO = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_WATCH_VIDEO;
  @BuiltValueEnumConst(wireName: r'LEAD')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum LEAD = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_LEAD;
  @BuiltValueEnumConst(wireName: r'APP_INSTALL')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum APP_INSTALL = _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum_APP_INSTALL;

  static Serializer<OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum> get serializer => _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumSerializer;

  const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(String name): super(name);

  static BuiltSet<OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum> get values => _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumValues;
  static OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum valueOf(String name) => _$optimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumValueOf(name);
}

class OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum extends EnumClass {

  /// Conversion learning model type
  @BuiltValueEnumConst(wireName: r'NOT_ACTIVE')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum NOT_ACTIVE = _$optimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum_NOT_ACTIVE;
  /// Conversion learning model type
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum ACTIVE = _$optimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum_ACTIVE;

  static Serializer<OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum> get serializer => _$optimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumSerializer;

  const OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum._(String name): super(name);

  static BuiltSet<OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum> get values => _$optimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumValues;
  static OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum valueOf(String name) => _$optimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumValueOf(name);
}

