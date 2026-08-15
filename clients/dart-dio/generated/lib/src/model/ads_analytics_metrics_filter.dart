//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ads_analytics_filter_operator.dart';
import 'package:openapi/src/model/ads_analytics_filter_column.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_metrics_filter.g.dart';

/// AdsAnalyticsMetricsFilter
///
/// Properties:
/// * [field] 
/// * [operator_] 
/// * [values] - List of values for filtering
@BuiltValue()
abstract class AdsAnalyticsMetricsFilter implements Built<AdsAnalyticsMetricsFilter, AdsAnalyticsMetricsFilterBuilder> {
  @BuiltValueField(wireName: r'field')
  AdsAnalyticsFilterColumn get field;
  // enum fieldEnum {  SPEND_IN_DOLLAR,  TOTAL_IMPRESSION,  };

  @BuiltValueField(wireName: r'operator')
  AdsAnalyticsFilterOperator get operator_;
  // enum operator_Enum {  LESS_THAN,  GREATER_THAN,  };

  /// List of values for filtering
  @BuiltValueField(wireName: r'values')
  BuiltList<num> get values;

  AdsAnalyticsMetricsFilter._();

  factory AdsAnalyticsMetricsFilter([void updates(AdsAnalyticsMetricsFilterBuilder b)]) = _$AdsAnalyticsMetricsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsAnalyticsMetricsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsAnalyticsMetricsFilter> get serializer => _$AdsAnalyticsMetricsFilterSerializer();
}

class _$AdsAnalyticsMetricsFilterSerializer implements PrimitiveSerializer<AdsAnalyticsMetricsFilter> {
  @override
  final Iterable<Type> types = const [AdsAnalyticsMetricsFilter, _$AdsAnalyticsMetricsFilter];

  @override
  final String wireName = r'AdsAnalyticsMetricsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsAnalyticsMetricsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(AdsAnalyticsFilterColumn),
    );
    yield r'operator';
    yield serializers.serialize(
      object.operator_,
      specifiedType: const FullType(AdsAnalyticsFilterOperator),
    );
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(num)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsAnalyticsMetricsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsAnalyticsMetricsFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdsAnalyticsFilterColumn),
          ) as AdsAnalyticsFilterColumn;
          result.field = valueDes;
          break;
        case r'operator':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdsAnalyticsFilterOperator),
          ) as AdsAnalyticsFilterOperator;
          result.operator_ = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(num)]),
          ) as BuiltList<num>;
          result.values.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdsAnalyticsMetricsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsAnalyticsMetricsFilterBuilder();
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

