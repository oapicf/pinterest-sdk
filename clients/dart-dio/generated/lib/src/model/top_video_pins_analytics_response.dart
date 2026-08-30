//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/top_video_pins_analytics_response_date_availability.dart';
import 'package:openapi/src/model/top_video_pins_sort_by.dart';
import 'package:openapi/src/model/top_video_pins_analytics_response_pins_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_video_pins_analytics_response.g.dart';

/// TopVideoPinsAnalyticsResponse
///
/// Properties:
/// * [dateAvailability] 
/// * [pins] 
/// * [sortBy] 
@BuiltValue()
abstract class TopVideoPinsAnalyticsResponse implements Built<TopVideoPinsAnalyticsResponse, TopVideoPinsAnalyticsResponseBuilder> {
  @BuiltValueField(wireName: r'date_availability')
  TopVideoPinsAnalyticsResponseDateAvailability? get dateAvailability;

  @BuiltValueField(wireName: r'pins')
  BuiltList<TopVideoPinsAnalyticsResponsePinsItems>? get pins;

  @BuiltValueField(wireName: r'sort_by')
  TopVideoPinsSortBy? get sortBy;
  // enum sortByEnum {  SAVE,  IMPRESSION,  OUTBOUND_CLICK,  VIDEO_MRC_VIEW,  VIDEO_AVG_WATCH_TIME,  VIDEO_V50_WATCH_TIME,  QUARTILE_95_PERCENT_VIEW,  VIDEO_10S_VIEW,  VIDEO_START,  };

  TopVideoPinsAnalyticsResponse._();

  factory TopVideoPinsAnalyticsResponse([void updates(TopVideoPinsAnalyticsResponseBuilder b)]) = _$TopVideoPinsAnalyticsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopVideoPinsAnalyticsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopVideoPinsAnalyticsResponse> get serializer => _$TopVideoPinsAnalyticsResponseSerializer();
}

class _$TopVideoPinsAnalyticsResponseSerializer implements PrimitiveSerializer<TopVideoPinsAnalyticsResponse> {
  @override
  final Iterable<Type> types = const [TopVideoPinsAnalyticsResponse, _$TopVideoPinsAnalyticsResponse];

  @override
  final String wireName = r'TopVideoPinsAnalyticsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopVideoPinsAnalyticsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dateAvailability != null) {
      yield r'date_availability';
      yield serializers.serialize(
        object.dateAvailability,
        specifiedType: const FullType(TopVideoPinsAnalyticsResponseDateAvailability),
      );
    }
    if (object.pins != null) {
      yield r'pins';
      yield serializers.serialize(
        object.pins,
        specifiedType: const FullType(BuiltList, [FullType(TopVideoPinsAnalyticsResponsePinsItems)]),
      );
    }
    if (object.sortBy != null) {
      yield r'sort_by';
      yield serializers.serialize(
        object.sortBy,
        specifiedType: const FullType(TopVideoPinsSortBy),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TopVideoPinsAnalyticsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopVideoPinsAnalyticsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'date_availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TopVideoPinsAnalyticsResponseDateAvailability),
          ) as TopVideoPinsAnalyticsResponseDateAvailability?;
          if (valueDes == null) continue;
          result.dateAvailability.replace(valueDes);
          break;
        case r'pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TopVideoPinsAnalyticsResponsePinsItems)]),
          ) as BuiltList<TopVideoPinsAnalyticsResponsePinsItems>?;
          if (valueDes == null) continue;
          result.pins.replace(valueDes);
          break;
        case r'sort_by':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TopVideoPinsSortBy),
          ) as TopVideoPinsSortBy?;
          if (valueDes == null) continue;
          result.sortBy = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TopVideoPinsAnalyticsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopVideoPinsAnalyticsResponseBuilder();
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

