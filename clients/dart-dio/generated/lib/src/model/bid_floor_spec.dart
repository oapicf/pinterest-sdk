//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/optimization_goal_metadata.dart';
import 'package:openapi/src/model/bid_floor_objective_type.dart';
import 'package:openapi/src/model/creative_type.dart';
import 'package:openapi/src/model/action_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_floor_spec.g.dart';

/// Bid floor specification for a given campaign configuration.
///
/// Properties:
/// * [billableEvent] - Ad group billable event type.
/// * [countries] - List of ISO 3166-1 alpha-2 country codes.
/// * [creativeType] - Creative type for the bid floor request.
/// * [currency] - Currency for the bid floor value.
/// * [objectiveType] - Campaign objective type.
/// * [optimizationGoalMetadata] - Optimization goal metadata.
@BuiltValue()
abstract class BidFloorSpec implements Built<BidFloorSpec, BidFloorSpecBuilder> {
  /// Ad group billable event type.
  @BuiltValueField(wireName: r'billable_event')
  ActionType get billableEvent;
  // enum billableEventEnum {  CLICKTHROUGH,  IMPRESSION,  VIDEO_V_50_MRC,  };

  /// List of ISO 3166-1 alpha-2 country codes.
  @BuiltValueField(wireName: r'countries')
  BuiltList<Country>? get countries;

  /// Creative type for the bid floor request.
  @BuiltValueField(wireName: r'creative_type')
  CreativeType? get creativeType;
  // enum creativeTypeEnum {  REGULAR,  VIDEO,  SHOPPING,  CAROUSEL,  MAX_VIDEO,  SHOP_THE_PIN,  COLLECTION,  IDEA,  SHOWCASE,  QUIZ,  COLLAGE,  MAX_WIDTH_REGULAR_COLLECTION,  MAX_WIDTH_VIDEO_COLLECTION,  APP,  };

  /// Currency for the bid floor value.
  @BuiltValueField(wireName: r'currency')
  Currency get currency;
  // enum currencyEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// Campaign objective type.
  @BuiltValueField(wireName: r'objective_type')
  BidFloorObjectiveType? get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  WEB_CONVERSION,  CATALOG_SALES,  VIDEO_COMPLETION,  SALES,  };

  /// Optimization goal metadata.
  @BuiltValueField(wireName: r'optimization_goal_metadata')
  OptimizationGoalMetadata? get optimizationGoalMetadata;

  BidFloorSpec._();

  factory BidFloorSpec([void updates(BidFloorSpecBuilder b)]) = _$BidFloorSpec;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidFloorSpecBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidFloorSpec> get serializer => _$BidFloorSpecSerializer();
}

class _$BidFloorSpecSerializer implements PrimitiveSerializer<BidFloorSpec> {
  @override
  final Iterable<Type> types = const [BidFloorSpec, _$BidFloorSpec];

  @override
  final String wireName = r'BidFloorSpec';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidFloorSpec object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'billable_event';
    yield serializers.serialize(
      object.billableEvent,
      specifiedType: const FullType(ActionType),
    );
    if (object.countries != null) {
      yield r'countries';
      yield serializers.serialize(
        object.countries,
        specifiedType: const FullType(BuiltList, [FullType(Country)]),
      );
    }
    if (object.creativeType != null) {
      yield r'creative_type';
      yield serializers.serialize(
        object.creativeType,
        specifiedType: const FullType(CreativeType),
      );
    }
    yield r'currency';
    yield serializers.serialize(
      object.currency,
      specifiedType: const FullType(Currency),
    );
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType(BidFloorObjectiveType),
      );
    }
    if (object.optimizationGoalMetadata != null) {
      yield r'optimization_goal_metadata';
      yield serializers.serialize(
        object.optimizationGoalMetadata,
        specifiedType: const FullType(OptimizationGoalMetadata),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidFloorSpec object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidFloorSpecBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'billable_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ActionType),
          ) as ActionType;
          result.billableEvent = valueDes;
          break;
        case r'countries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Country)]),
          ) as BuiltList<Country>?;
          if (valueDes == null) continue;
          result.countries.replace(valueDes);
          break;
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreativeType),
          ) as CreativeType?;
          if (valueDes == null) continue;
          result.creativeType = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
          result.currency = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BidFloorObjectiveType),
          ) as BidFloorObjectiveType?;
          if (valueDes == null) continue;
          result.objectiveType = valueDes;
          break;
        case r'optimization_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OptimizationGoalMetadata),
          ) as OptimizationGoalMetadata?;
          if (valueDes == null) continue;
          result.optimizationGoalMetadata.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidFloorSpec deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidFloorSpecBuilder();
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

