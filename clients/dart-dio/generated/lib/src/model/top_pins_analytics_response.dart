//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/top_pins_sort_by.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/top_pins_analytics_response_date_availability.dart';
import 'package:openapi/src/model/top_pins_analytics_response_pins_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_pins_analytics_response.g.dart';

/// TopPinsAnalyticsResponse
///
/// Properties:
/// * [dateAvailability] 
/// * [pins] 
/// * [sortBy] 
@BuiltValue()
abstract class TopPinsAnalyticsResponse implements Built<TopPinsAnalyticsResponse, TopPinsAnalyticsResponseBuilder> {
  @BuiltValueField(wireName: r'date_availability')
  TopPinsAnalyticsResponseDateAvailability? get dateAvailability;

  @BuiltValueField(wireName: r'pins')
  BuiltList<TopPinsAnalyticsResponsePinsItems>? get pins;

  @BuiltValueField(wireName: r'sort_by')
  TopPinsSortBy? get sortBy;
  // enum sortByEnum {  ENGAGEMENT,  SAVE,  IMPRESSION,  OUTBOUND_CLICK,  PIN_CLICK,  };

  TopPinsAnalyticsResponse._();

  factory TopPinsAnalyticsResponse([void updates(TopPinsAnalyticsResponseBuilder b)]) = _$TopPinsAnalyticsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TopPinsAnalyticsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TopPinsAnalyticsResponse> get serializer => _$TopPinsAnalyticsResponseSerializer();
}

class _$TopPinsAnalyticsResponseSerializer implements PrimitiveSerializer<TopPinsAnalyticsResponse> {
  @override
  final Iterable<Type> types = const [TopPinsAnalyticsResponse, _$TopPinsAnalyticsResponse];

  @override
  final String wireName = r'TopPinsAnalyticsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TopPinsAnalyticsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dateAvailability != null) {
      yield r'date_availability';
      yield serializers.serialize(
        object.dateAvailability,
        specifiedType: const FullType(TopPinsAnalyticsResponseDateAvailability),
      );
    }
    if (object.pins != null) {
      yield r'pins';
      yield serializers.serialize(
        object.pins,
        specifiedType: const FullType(BuiltList, [FullType(TopPinsAnalyticsResponsePinsItems)]),
      );
    }
    if (object.sortBy != null) {
      yield r'sort_by';
      yield serializers.serialize(
        object.sortBy,
        specifiedType: const FullType(TopPinsSortBy),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TopPinsAnalyticsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TopPinsAnalyticsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'date_availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TopPinsAnalyticsResponseDateAvailability),
          ) as TopPinsAnalyticsResponseDateAvailability?;
          if (valueDes == null) continue;
          result.dateAvailability.replace(valueDes);
          break;
        case r'pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TopPinsAnalyticsResponsePinsItems)]),
          ) as BuiltList<TopPinsAnalyticsResponsePinsItems>?;
          if (valueDes == null) continue;
          result.pins.replace(valueDes);
          break;
        case r'sort_by':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TopPinsSortBy),
          ) as TopPinsSortBy?;
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
  TopPinsAnalyticsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TopPinsAnalyticsResponseBuilder();
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

