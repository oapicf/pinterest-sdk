//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'time_series.g.dart';

/// TimeSeries
///
/// Properties:
/// * [date] 
@BuiltValue()
abstract class TimeSeries implements Built<TimeSeries, TimeSeriesBuilder> {
  @BuiltValueField(wireName: r'date')
  Date? get date;

  TimeSeries._();

  factory TimeSeries([void updates(TimeSeriesBuilder b)]) = _$TimeSeries;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TimeSeriesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TimeSeries> get serializer => _$TimeSeriesSerializer();
}

class _$TimeSeriesSerializer implements PrimitiveSerializer<TimeSeries> {
  @override
  final Iterable<Type> types = const [TimeSeries, _$TimeSeries];

  @override
  final String wireName = r'TimeSeries';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TimeSeries object, {
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
    TimeSeries object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TimeSeriesBuilder result,
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
  TimeSeries deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TimeSeriesBuilder();
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

