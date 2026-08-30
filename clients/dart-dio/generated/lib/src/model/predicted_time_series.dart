//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'predicted_time_series.g.dart';

/// PredictedTimeSeries
///
/// Properties:
/// * [date] 
@BuiltValue()
abstract class PredictedTimeSeries implements Built<PredictedTimeSeries, PredictedTimeSeriesBuilder> {
  @BuiltValueField(wireName: r'date')
  Date? get date;

  PredictedTimeSeries._();

  factory PredictedTimeSeries([void updates(PredictedTimeSeriesBuilder b)]) = _$PredictedTimeSeries;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PredictedTimeSeriesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PredictedTimeSeries> get serializer => _$PredictedTimeSeriesSerializer();
}

class _$PredictedTimeSeriesSerializer implements PrimitiveSerializer<PredictedTimeSeries> {
  @override
  final Iterable<Type> types = const [PredictedTimeSeries, _$PredictedTimeSeries];

  @override
  final String wireName = r'PredictedTimeSeries';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PredictedTimeSeries object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.date != null) {
      yield r'date';
      yield serializers.serialize(
        object.date,
        specifiedType: const FullType(Date),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PredictedTimeSeries object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PredictedTimeSeriesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.date = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PredictedTimeSeries deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PredictedTimeSeriesBuilder();
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

