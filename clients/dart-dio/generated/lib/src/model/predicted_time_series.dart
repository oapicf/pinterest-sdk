//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'predicted_time_series.g.dart';

/// A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.<br /> These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.<br /> **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
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
            specifiedType: const FullType(Date),
          ) as Date;
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

